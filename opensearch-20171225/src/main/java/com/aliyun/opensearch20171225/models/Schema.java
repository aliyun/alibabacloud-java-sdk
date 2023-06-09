// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class Schema extends TeaModel {
    @NameInMap("indexSortConfig")
    public java.util.List<SchemaIndexSortConfig> indexSortConfig;

    @NameInMap("indexes")
    public SchemaIndexes indexes;

    @NameInMap("name")
    public String name;

    @NameInMap("routeField")
    public String routeField;

    @NameInMap("routeFieldValues")
    public java.util.List<String> routeFieldValues;

    @NameInMap("secondRouteField")
    public String secondRouteField;

    @NameInMap("tables")
    public java.util.Map<String, SchemaTablesValue> tables;

    @NameInMap("ttlField")
    public SchemaTtlField ttlField;

    public static Schema build(java.util.Map<String, ?> map) throws Exception {
        Schema self = new Schema();
        return TeaModel.build(map, self);
    }

    public Schema setIndexSortConfig(java.util.List<SchemaIndexSortConfig> indexSortConfig) {
        this.indexSortConfig = indexSortConfig;
        return this;
    }
    public java.util.List<SchemaIndexSortConfig> getIndexSortConfig() {
        return this.indexSortConfig;
    }

    public Schema setIndexes(SchemaIndexes indexes) {
        this.indexes = indexes;
        return this;
    }
    public SchemaIndexes getIndexes() {
        return this.indexes;
    }

    public Schema setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Schema setRouteField(String routeField) {
        this.routeField = routeField;
        return this;
    }
    public String getRouteField() {
        return this.routeField;
    }

    public Schema setRouteFieldValues(java.util.List<String> routeFieldValues) {
        this.routeFieldValues = routeFieldValues;
        return this;
    }
    public java.util.List<String> getRouteFieldValues() {
        return this.routeFieldValues;
    }

    public Schema setSecondRouteField(String secondRouteField) {
        this.secondRouteField = secondRouteField;
        return this;
    }
    public String getSecondRouteField() {
        return this.secondRouteField;
    }

    public Schema setTables(java.util.Map<String, SchemaTablesValue> tables) {
        this.tables = tables;
        return this;
    }
    public java.util.Map<String, SchemaTablesValue> getTables() {
        return this.tables;
    }

    public Schema setTtlField(SchemaTtlField ttlField) {
        this.ttlField = ttlField;
        return this;
    }
    public SchemaTtlField getTtlField() {
        return this.ttlField;
    }

    public static class SchemaIndexSortConfig extends TeaModel {
        @NameInMap("direction")
        public String direction;

        @NameInMap("field")
        public String field;

        public static SchemaIndexSortConfig build(java.util.Map<String, ?> map) throws Exception {
            SchemaIndexSortConfig self = new SchemaIndexSortConfig();
            return TeaModel.build(map, self);
        }

        public SchemaIndexSortConfig setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public SchemaIndexSortConfig setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class SchemaIndexes extends TeaModel {
        @NameInMap("filterFields")
        public java.util.List<String> filterFields;

        @NameInMap("searchFields")
        public java.util.Map<String, SchemaIndexesSearchFieldsValue> searchFields;

        public static SchemaIndexes build(java.util.Map<String, ?> map) throws Exception {
            SchemaIndexes self = new SchemaIndexes();
            return TeaModel.build(map, self);
        }

        public SchemaIndexes setFilterFields(java.util.List<String> filterFields) {
            this.filterFields = filterFields;
            return this;
        }
        public java.util.List<String> getFilterFields() {
            return this.filterFields;
        }

        public SchemaIndexes setSearchFields(java.util.Map<String, SchemaIndexesSearchFieldsValue> searchFields) {
            this.searchFields = searchFields;
            return this;
        }
        public java.util.Map<String, SchemaIndexesSearchFieldsValue> getSearchFields() {
            return this.searchFields;
        }

    }

    public static class SchemaTtlField extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("ttl")
        public Long ttl;

        public static SchemaTtlField build(java.util.Map<String, ?> map) throws Exception {
            SchemaTtlField self = new SchemaTtlField();
            return TeaModel.build(map, self);
        }

        public SchemaTtlField setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SchemaTtlField setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

    }

}
