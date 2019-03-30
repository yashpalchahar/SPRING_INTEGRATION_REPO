package com.chahar.cucumber.conf;

import com.chahar.cucumber.dto.CartDto;
import com.chahar.cucumber.dto.CustomerDto;
import com.chahar.cucumber.dto.InfoDto;
import com.chahar.cucumber.dto.StockFeedDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;

import java.util.Locale;
import java.util.Map;

public class BeanConfigurer implements TypeRegistryConfigurer {

    @Override
    public void configureTypeRegistry(final TypeRegistry typeRegistry) {

       typeRegistry.defineDataTableType(new DataTableType(StockFeedDto.class, new TableEntryTransformer<StockFeedDto>() {
            @Override
            public StockFeedDto transform(Map<String, String> map) throws Throwable {
                final StockFeedDto result = new StockFeedDto();
                result.setWarehouse(map.get("warehouse"));
                result.setUpdationType(map.get("updationType"));
                result.setComment(map.get("comment"));

                System.out.println("Converted <StockFeedDto> dto: " + result + " by TableEntryTransformer ");

                return result ;
            }
        }));
        /*typeRegistry.defineDataTableType(new DataTableType(CartDto.class, new TableEntryTransformer<CartDto>() {
            @Override
            public CartDto transform(Map<String, String> map) throws Throwable {
                final CartDto result = new CartDto();
                result.setProduct(map.get("product"));
                result.setQuantity(map.get("quantity") != null ? Integer.valueOf(map.get("quantity")) : null);
                result.setUserId(map.get("userId"));

                System.out.println("Converted <CartDto> dto: " + result + " by TableEntryTransformer ");

                return result ;
            }
        }));*/

        final ObjectMapper jacksonObjectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
        typeRegistry.defineDataTableType(new DataTableType(CartDto.class,new TableEntryTransformer<CartDto>(){
            @Override
            public CartDto transform(Map<String, String> row) throws Throwable {
                return jacksonObjectMapper.convertValue(row,CartDto.class);
            }
        }) );
        /* Java 8 lamda expression for registering bean via Jackson object mapper */
        typeRegistry.defineDataTableType(new DataTableType(InfoDto.class,
                (Map<String, String> row )-> jacksonObjectMapper.convertValue(row,InfoDto.class)));

        typeRegistry.defineDataTableType(new DataTableType(CustomerDto.class,
                (Map<String, String> row )-> jacksonObjectMapper.convertValue(row,CustomerDto.class)));
      /*List<Class> dtoClassList = new ArrayList<>();
        dtoClassList.add(CartDto.class);*/

        /*Transformer transformer = new Transformer();
        typeRegistry.setDefaultDataTableCellTransformer(transformer);
        typeRegistry.setDefaultDataTableEntryTransformer(transformer);*/
        //typeRegistry.setDefaultParameterTransformer(transformer);
       /* final ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
        for(Class dto: dtoClassList) {
            typeRegistry.defineDataTableType(new DataTableType(dto, new TableEntryTransformer<Class<dto>>() {

            }));
        }*/


        /* typeRegistry.defineDataTableType(new DataTableType(T, new TableEntryTransformer<T>(){
            private final ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
            @Override
            public T transform(final Map<String, String> map) throws Throwable {

            }
        }));*/

        /*typeRegistry.setDefaultDataTableCellTransformer(CustomJacksonTableTransformer.INSTANCE);
        typeRegistry.setDefaultDataTableEntryTransformer(CustomJacksonTableTransformer.INSTANCE);*/

    }

    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }
    /*private class Transformer implements TableEntryByTypeTransformer, TableCellByTypeTransformer, ParameterByTypeTransformer {
        ObjectMapper objectMapper = new ObjectMapper();
        @Override
        public <T> T transform(String s, Class<T> aClass) throws Throwable {
            return objectMapper.convertValue(s, aClass);
        }

        @Override
        public <T> T transform(Map<String, String> map, Class<T> aClass, TableCellByTypeTransformer tableCellByTypeTransformer) throws Throwable {
            return objectMapper.convertValue(map, aClass);
        }

        @Override
        public Object transform(String s, Type type) {
            return objectMapper.convertValue(s, objectMapper.constructType(type));
        }
    }*/

    /** DataTable transformer that uses Jackson to autmatically deserialise the Datatable into
        a target Java POJO.
     */
   /* private static final class CustomJacksonTableTransformer<T> implements
            TableEntryByTypeTransformer, TableCellByTypeTransformer {
        public static final CustomJacksonTableTransformer INSTANCE = new CustomJacksonTableTransformer();

        private final ObjectMapper objectMapper;
        public CustomJacksonTableTransformer(){
            objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
        }

        @Override
        public <T> T transform(Map<String, String> entry, Class<T> type, TableCellByTypeTransformer cellTransformer) {
            return objectMapper.convertValue(entry, type);
        }
        @Override
        public <T> T transform(String value, Class<T> cellType) {
            return objectMapper.convertValue(value, cellType);
        }

    }*/
}
