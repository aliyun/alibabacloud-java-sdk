// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateAppRequest extends TeaModel {
    @NameInMap("autoSwitch")
    public Boolean autoSwitch;

    @NameInMap("cluster")
    public CreateAppRequestCluster cluster;

    @NameInMap("dataSources")
    public java.util.List<CreateAppRequestDataSources> dataSources;

    @NameInMap("description")
    public String description;

    @NameInMap("domain")
    public CreateAppRequestDomain domain;

    @NameInMap("fetchFields")
    public java.util.List<String> fetchFields;

    @NameInMap("firstRanks")
    public java.util.List<CreateAppRequestFirstRanks> firstRanks;

    @NameInMap("networkType")
    public String networkType;

    @NameInMap("queryProcessors")
    public java.util.List<CreateAppRequestQueryProcessors> queryProcessors;

    @NameInMap("schema")
    public CreateAppRequestSchema schema;

    @NameInMap("schemas")
    public java.util.List<CreateAppRequestSchemas> schemas;

    @NameInMap("secondRanks")
    public java.util.List<CreateAppRequestSecondRanks> secondRanks;

    @NameInMap("summaries")
    public java.util.List<CreateAppRequestSummaries> summaries;

    /**
     * <p>Specifies whether to perform a dry run. This parameter is only used to check whether the data source is valid. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppRequest self = new CreateAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppRequest setAutoSwitch(Boolean autoSwitch) {
        this.autoSwitch = autoSwitch;
        return this;
    }
    public Boolean getAutoSwitch() {
        return this.autoSwitch;
    }

    public CreateAppRequest setCluster(CreateAppRequestCluster cluster) {
        this.cluster = cluster;
        return this;
    }
    public CreateAppRequestCluster getCluster() {
        return this.cluster;
    }

    public CreateAppRequest setDataSources(java.util.List<CreateAppRequestDataSources> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<CreateAppRequestDataSources> getDataSources() {
        return this.dataSources;
    }

    public CreateAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAppRequest setDomain(CreateAppRequestDomain domain) {
        this.domain = domain;
        return this;
    }
    public CreateAppRequestDomain getDomain() {
        return this.domain;
    }

    public CreateAppRequest setFetchFields(java.util.List<String> fetchFields) {
        this.fetchFields = fetchFields;
        return this;
    }
    public java.util.List<String> getFetchFields() {
        return this.fetchFields;
    }

    public CreateAppRequest setFirstRanks(java.util.List<CreateAppRequestFirstRanks> firstRanks) {
        this.firstRanks = firstRanks;
        return this;
    }
    public java.util.List<CreateAppRequestFirstRanks> getFirstRanks() {
        return this.firstRanks;
    }

    public CreateAppRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateAppRequest setQueryProcessors(java.util.List<CreateAppRequestQueryProcessors> queryProcessors) {
        this.queryProcessors = queryProcessors;
        return this;
    }
    public java.util.List<CreateAppRequestQueryProcessors> getQueryProcessors() {
        return this.queryProcessors;
    }

    public CreateAppRequest setSchema(CreateAppRequestSchema schema) {
        this.schema = schema;
        return this;
    }
    public CreateAppRequestSchema getSchema() {
        return this.schema;
    }

    public CreateAppRequest setSchemas(java.util.List<CreateAppRequestSchemas> schemas) {
        this.schemas = schemas;
        return this;
    }
    public java.util.List<CreateAppRequestSchemas> getSchemas() {
        return this.schemas;
    }

    public CreateAppRequest setSecondRanks(java.util.List<CreateAppRequestSecondRanks> secondRanks) {
        this.secondRanks = secondRanks;
        return this;
    }
    public java.util.List<CreateAppRequestSecondRanks> getSecondRanks() {
        return this.secondRanks;
    }

    public CreateAppRequest setSummaries(java.util.List<CreateAppRequestSummaries> summaries) {
        this.summaries = summaries;
        return this;
    }
    public java.util.List<CreateAppRequestSummaries> getSummaries() {
        return this.summaries;
    }

    public CreateAppRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static class CreateAppRequestCluster extends TeaModel {
        @NameInMap("maxQueryClauseLength")
        public Integer maxQueryClauseLength;

        @NameInMap("maxTimeoutMS")
        public Integer maxTimeoutMS;

        public static CreateAppRequestCluster build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestCluster self = new CreateAppRequestCluster();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestCluster setMaxQueryClauseLength(Integer maxQueryClauseLength) {
            this.maxQueryClauseLength = maxQueryClauseLength;
            return this;
        }
        public Integer getMaxQueryClauseLength() {
            return this.maxQueryClauseLength;
        }

        public CreateAppRequestCluster setMaxTimeoutMS(Integer maxTimeoutMS) {
            this.maxTimeoutMS = maxTimeoutMS;
            return this;
        }
        public Integer getMaxTimeoutMS() {
            return this.maxTimeoutMS;
        }

    }

    public static class CreateAppRequestDataSources extends TeaModel {
        @NameInMap("fields")
        public java.util.List<java.util.Map<String, ?>> fields;

        @NameInMap("keyField")
        public String keyField;

        @NameInMap("parameters")
        public java.util.Map<String, ?> parameters;

        @NameInMap("plugins")
        public java.util.Map<String, ?> plugins;

        @NameInMap("schemaName")
        public String schemaName;

        @NameInMap("tableName")
        public String tableName;

        @NameInMap("type")
        public String type;

        public static CreateAppRequestDataSources build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestDataSources self = new CreateAppRequestDataSources();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestDataSources setFields(java.util.List<java.util.Map<String, ?>> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getFields() {
            return this.fields;
        }

        public CreateAppRequestDataSources setKeyField(String keyField) {
            this.keyField = keyField;
            return this;
        }
        public String getKeyField() {
            return this.keyField;
        }

        public CreateAppRequestDataSources setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public CreateAppRequestDataSources setPlugins(java.util.Map<String, ?> plugins) {
            this.plugins = plugins;
            return this;
        }
        public java.util.Map<String, ?> getPlugins() {
            return this.plugins;
        }

        public CreateAppRequestDataSources setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public CreateAppRequestDataSources setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public CreateAppRequestDataSources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAppRequestDomain extends TeaModel {
        @NameInMap("category")
        public String category;

        @NameInMap("functions")
        public java.util.Map<String, ?> functions;

        @NameInMap("name")
        public String name;

        public static CreateAppRequestDomain build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestDomain self = new CreateAppRequestDomain();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestDomain setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateAppRequestDomain setFunctions(java.util.Map<String, ?> functions) {
            this.functions = functions;
            return this;
        }
        public java.util.Map<String, ?> getFunctions() {
            return this.functions;
        }

        public CreateAppRequestDomain setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateAppRequestFirstRanks extends TeaModel {
        @NameInMap("active")
        public Boolean active;

        @NameInMap("description")
        public String description;

        @NameInMap("meta")
        public Object meta;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        public static CreateAppRequestFirstRanks build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestFirstRanks self = new CreateAppRequestFirstRanks();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestFirstRanks setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public CreateAppRequestFirstRanks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAppRequestFirstRanks setMeta(Object meta) {
            this.meta = meta;
            return this;
        }
        public Object getMeta() {
            return this.meta;
        }

        public CreateAppRequestFirstRanks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppRequestFirstRanks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAppRequestQueryProcessors extends TeaModel {
        @NameInMap("active")
        public Boolean active;

        @NameInMap("category")
        public String category;

        @NameInMap("domain")
        public String domain;

        @NameInMap("indexes")
        public java.util.List<String> indexes;

        @NameInMap("name")
        public String name;

        @NameInMap("processors")
        public java.util.List<java.util.Map<String, ?>> processors;

        public static CreateAppRequestQueryProcessors build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestQueryProcessors self = new CreateAppRequestQueryProcessors();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestQueryProcessors setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public CreateAppRequestQueryProcessors setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateAppRequestQueryProcessors setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateAppRequestQueryProcessors setIndexes(java.util.List<String> indexes) {
            this.indexes = indexes;
            return this;
        }
        public java.util.List<String> getIndexes() {
            return this.indexes;
        }

        public CreateAppRequestQueryProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppRequestQueryProcessors setProcessors(java.util.List<java.util.Map<String, ?>> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getProcessors() {
            return this.processors;
        }

    }

    public static class CreateAppRequestSchemaIndexSortConfig extends TeaModel {
        @NameInMap("direction")
        public String direction;

        @NameInMap("field")
        public String field;

        public static CreateAppRequestSchemaIndexSortConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestSchemaIndexSortConfig self = new CreateAppRequestSchemaIndexSortConfig();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestSchemaIndexSortConfig setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public CreateAppRequestSchemaIndexSortConfig setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class CreateAppRequestSchemaIndexes extends TeaModel {
        @NameInMap("filterFields")
        public java.util.List<String> filterFields;

        @NameInMap("searchFields")
        public java.util.Map<String, ?> searchFields;

        public static CreateAppRequestSchemaIndexes build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestSchemaIndexes self = new CreateAppRequestSchemaIndexes();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestSchemaIndexes setFilterFields(java.util.List<String> filterFields) {
            this.filterFields = filterFields;
            return this;
        }
        public java.util.List<String> getFilterFields() {
            return this.filterFields;
        }

        public CreateAppRequestSchemaIndexes setSearchFields(java.util.Map<String, ?> searchFields) {
            this.searchFields = searchFields;
            return this;
        }
        public java.util.Map<String, ?> getSearchFields() {
            return this.searchFields;
        }

    }

    public static class CreateAppRequestSchemaTtlField extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("ttl")
        public Long ttl;

        public static CreateAppRequestSchemaTtlField build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestSchemaTtlField self = new CreateAppRequestSchemaTtlField();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestSchemaTtlField setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppRequestSchemaTtlField setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

    }

    public static class CreateAppRequestSchema extends TeaModel {
        @NameInMap("indexSortConfig")
        public java.util.List<CreateAppRequestSchemaIndexSortConfig> indexSortConfig;

        @NameInMap("indexes")
        public CreateAppRequestSchemaIndexes indexes;

        @NameInMap("name")
        public String name;

        @NameInMap("routeField")
        public String routeField;

        @NameInMap("routeFieldValues")
        public java.util.List<String> routeFieldValues;

        @NameInMap("secondRouteField")
        public String secondRouteField;

        @NameInMap("tables")
        public java.util.Map<String, ?> tables;

        @NameInMap("ttlField")
        public CreateAppRequestSchemaTtlField ttlField;

        public static CreateAppRequestSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestSchema self = new CreateAppRequestSchema();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestSchema setIndexSortConfig(java.util.List<CreateAppRequestSchemaIndexSortConfig> indexSortConfig) {
            this.indexSortConfig = indexSortConfig;
            return this;
        }
        public java.util.List<CreateAppRequestSchemaIndexSortConfig> getIndexSortConfig() {
            return this.indexSortConfig;
        }

        public CreateAppRequestSchema setIndexes(CreateAppRequestSchemaIndexes indexes) {
            this.indexes = indexes;
            return this;
        }
        public CreateAppRequestSchemaIndexes getIndexes() {
            return this.indexes;
        }

        public CreateAppRequestSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppRequestSchema setRouteField(String routeField) {
            this.routeField = routeField;
            return this;
        }
        public String getRouteField() {
            return this.routeField;
        }

        public CreateAppRequestSchema setRouteFieldValues(java.util.List<String> routeFieldValues) {
            this.routeFieldValues = routeFieldValues;
            return this;
        }
        public java.util.List<String> getRouteFieldValues() {
            return this.routeFieldValues;
        }

        public CreateAppRequestSchema setSecondRouteField(String secondRouteField) {
            this.secondRouteField = secondRouteField;
            return this;
        }
        public String getSecondRouteField() {
            return this.secondRouteField;
        }

        public CreateAppRequestSchema setTables(java.util.Map<String, ?> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.Map<String, ?> getTables() {
            return this.tables;
        }

        public CreateAppRequestSchema setTtlField(CreateAppRequestSchemaTtlField ttlField) {
            this.ttlField = ttlField;
            return this;
        }
        public CreateAppRequestSchemaTtlField getTtlField() {
            return this.ttlField;
        }

    }

    public static class CreateAppRequestSchemasIndexSortConfig extends TeaModel {
        @NameInMap("direction")
        public String direction;

        @NameInMap("field")
        public String field;

        public static CreateAppRequestSchemasIndexSortConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestSchemasIndexSortConfig self = new CreateAppRequestSchemasIndexSortConfig();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestSchemasIndexSortConfig setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public CreateAppRequestSchemasIndexSortConfig setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class CreateAppRequestSchemasIndexes extends TeaModel {
        @NameInMap("filterFields")
        public java.util.List<String> filterFields;

        @NameInMap("searchFields")
        public java.util.Map<String, ?> searchFields;

        public static CreateAppRequestSchemasIndexes build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestSchemasIndexes self = new CreateAppRequestSchemasIndexes();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestSchemasIndexes setFilterFields(java.util.List<String> filterFields) {
            this.filterFields = filterFields;
            return this;
        }
        public java.util.List<String> getFilterFields() {
            return this.filterFields;
        }

        public CreateAppRequestSchemasIndexes setSearchFields(java.util.Map<String, ?> searchFields) {
            this.searchFields = searchFields;
            return this;
        }
        public java.util.Map<String, ?> getSearchFields() {
            return this.searchFields;
        }

    }

    public static class CreateAppRequestSchemasTtlField extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("ttl")
        public Long ttl;

        public static CreateAppRequestSchemasTtlField build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestSchemasTtlField self = new CreateAppRequestSchemasTtlField();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestSchemasTtlField setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppRequestSchemasTtlField setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

    }

    public static class CreateAppRequestSchemas extends TeaModel {
        @NameInMap("indexSortConfig")
        public java.util.List<CreateAppRequestSchemasIndexSortConfig> indexSortConfig;

        @NameInMap("indexes")
        public CreateAppRequestSchemasIndexes indexes;

        @NameInMap("name")
        public String name;

        @NameInMap("routeField")
        public String routeField;

        @NameInMap("routeFieldValues")
        public java.util.List<String> routeFieldValues;

        @NameInMap("secondRouteField")
        public String secondRouteField;

        @NameInMap("tables")
        public java.util.Map<String, ?> tables;

        @NameInMap("ttlField")
        public CreateAppRequestSchemasTtlField ttlField;

        public static CreateAppRequestSchemas build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestSchemas self = new CreateAppRequestSchemas();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestSchemas setIndexSortConfig(java.util.List<CreateAppRequestSchemasIndexSortConfig> indexSortConfig) {
            this.indexSortConfig = indexSortConfig;
            return this;
        }
        public java.util.List<CreateAppRequestSchemasIndexSortConfig> getIndexSortConfig() {
            return this.indexSortConfig;
        }

        public CreateAppRequestSchemas setIndexes(CreateAppRequestSchemasIndexes indexes) {
            this.indexes = indexes;
            return this;
        }
        public CreateAppRequestSchemasIndexes getIndexes() {
            return this.indexes;
        }

        public CreateAppRequestSchemas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppRequestSchemas setRouteField(String routeField) {
            this.routeField = routeField;
            return this;
        }
        public String getRouteField() {
            return this.routeField;
        }

        public CreateAppRequestSchemas setRouteFieldValues(java.util.List<String> routeFieldValues) {
            this.routeFieldValues = routeFieldValues;
            return this;
        }
        public java.util.List<String> getRouteFieldValues() {
            return this.routeFieldValues;
        }

        public CreateAppRequestSchemas setSecondRouteField(String secondRouteField) {
            this.secondRouteField = secondRouteField;
            return this;
        }
        public String getSecondRouteField() {
            return this.secondRouteField;
        }

        public CreateAppRequestSchemas setTables(java.util.Map<String, ?> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.Map<String, ?> getTables() {
            return this.tables;
        }

        public CreateAppRequestSchemas setTtlField(CreateAppRequestSchemasTtlField ttlField) {
            this.ttlField = ttlField;
            return this;
        }
        public CreateAppRequestSchemasTtlField getTtlField() {
            return this.ttlField;
        }

    }

    public static class CreateAppRequestSecondRanks extends TeaModel {
        @NameInMap("active")
        public Boolean active;

        @NameInMap("description")
        public String description;

        @NameInMap("meta")
        public Object meta;

        @NameInMap("name")
        public String name;

        public static CreateAppRequestSecondRanks build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestSecondRanks self = new CreateAppRequestSecondRanks();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestSecondRanks setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public CreateAppRequestSecondRanks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAppRequestSecondRanks setMeta(Object meta) {
            this.meta = meta;
            return this;
        }
        public Object getMeta() {
            return this.meta;
        }

        public CreateAppRequestSecondRanks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateAppRequestSummariesMeta extends TeaModel {
        @NameInMap("element")
        public String element;

        @NameInMap("ellipsis")
        public String ellipsis;

        @NameInMap("field")
        public String field;

        @NameInMap("len")
        public Integer len;

        @NameInMap("snippet")
        public String snippet;

        public static CreateAppRequestSummariesMeta build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestSummariesMeta self = new CreateAppRequestSummariesMeta();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestSummariesMeta setElement(String element) {
            this.element = element;
            return this;
        }
        public String getElement() {
            return this.element;
        }

        public CreateAppRequestSummariesMeta setEllipsis(String ellipsis) {
            this.ellipsis = ellipsis;
            return this;
        }
        public String getEllipsis() {
            return this.ellipsis;
        }

        public CreateAppRequestSummariesMeta setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public CreateAppRequestSummariesMeta setLen(Integer len) {
            this.len = len;
            return this;
        }
        public Integer getLen() {
            return this.len;
        }

        public CreateAppRequestSummariesMeta setSnippet(String snippet) {
            this.snippet = snippet;
            return this;
        }
        public String getSnippet() {
            return this.snippet;
        }

    }

    public static class CreateAppRequestSummaries extends TeaModel {
        @NameInMap("meta")
        public java.util.List<CreateAppRequestSummariesMeta> meta;

        @NameInMap("name")
        public String name;

        public static CreateAppRequestSummaries build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestSummaries self = new CreateAppRequestSummaries();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestSummaries setMeta(java.util.List<CreateAppRequestSummariesMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<CreateAppRequestSummariesMeta> getMeta() {
            return this.meta;
        }

        public CreateAppRequestSummaries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
