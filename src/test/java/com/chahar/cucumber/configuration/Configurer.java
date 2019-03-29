package com.chahar.cucumber.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.datatable.TableCellByTypeTransformer;
import io.cucumber.datatable.TableEntryByTypeTransformer;

import java.util.Locale;
import java.util.Map;

public class Configurer implements TypeRegistryConfigurer {

    @Override
    public void configureTypeRegistry(final TypeRegistry typeRegistry) {
        /*typeRegistry.setDefaultDataTableCellTransformer(CustomJacksonTableTransformer.INSTANCE);
        typeRegistry.setDefaultDataTableEntryTransformer(CustomJacksonTableTransformer.INSTANCE);*/

        /*typeRegistry.defineParameterType(new ParameterType<>(
                "digit",
                "[0-9]",
                Integer.class,
                (String s) -> Integer.parseInt(s))
        );*/

    }

    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    /** DataTable transformer that uses Jackson to autmatically deserialise the Datatable into
        a target Java POJO.
     */
    private static final class CustomJacksonTableTransformer implements
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

       /* @Override
        public Object transform(String s, Type type) throws Throwable {
            return objectMapper.convertValue(s, objectMapper.constructType(type));
        }*/
    }
}
