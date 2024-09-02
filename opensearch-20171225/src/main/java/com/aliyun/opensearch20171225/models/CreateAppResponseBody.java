// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateAppResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABCDEFG</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("result")
    public CreateAppResponseBodyResult result;

    public static CreateAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppResponseBody self = new CreateAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppResponseBody setResult(CreateAppResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateAppResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateAppResponseBodyResultCluster extends TeaModel {
        @NameInMap("maxQueryClauseLength")
        public Integer maxQueryClauseLength;

        @NameInMap("maxTimeoutMS")
        public Integer maxTimeoutMS;

        public static CreateAppResponseBodyResultCluster build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResultCluster self = new CreateAppResponseBodyResultCluster();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResultCluster setMaxQueryClauseLength(Integer maxQueryClauseLength) {
            this.maxQueryClauseLength = maxQueryClauseLength;
            return this;
        }
        public Integer getMaxQueryClauseLength() {
            return this.maxQueryClauseLength;
        }

        public CreateAppResponseBodyResultCluster setMaxTimeoutMS(Integer maxTimeoutMS) {
            this.maxTimeoutMS = maxTimeoutMS;
            return this;
        }
        public Integer getMaxTimeoutMS() {
            return this.maxTimeoutMS;
        }

    }

    public static class CreateAppResponseBodyResultDataSources extends TeaModel {
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

        public static CreateAppResponseBodyResultDataSources build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResultDataSources self = new CreateAppResponseBodyResultDataSources();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResultDataSources setFields(java.util.List<java.util.Map<String, ?>> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getFields() {
            return this.fields;
        }

        public CreateAppResponseBodyResultDataSources setKeyField(String keyField) {
            this.keyField = keyField;
            return this;
        }
        public String getKeyField() {
            return this.keyField;
        }

        public CreateAppResponseBodyResultDataSources setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public CreateAppResponseBodyResultDataSources setPlugins(java.util.Map<String, ?> plugins) {
            this.plugins = plugins;
            return this;
        }
        public java.util.Map<String, ?> getPlugins() {
            return this.plugins;
        }

        public CreateAppResponseBodyResultDataSources setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public CreateAppResponseBodyResultDataSources setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public CreateAppResponseBodyResultDataSources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAppResponseBodyResultDomainFunctions extends TeaModel {
        @NameInMap("algo")
        public java.util.List<String> algo;

        @NameInMap("qp")
        public java.util.List<String> qp;

        @NameInMap("service")
        public java.util.List<String> service;

        public static CreateAppResponseBodyResultDomainFunctions build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResultDomainFunctions self = new CreateAppResponseBodyResultDomainFunctions();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResultDomainFunctions setAlgo(java.util.List<String> algo) {
            this.algo = algo;
            return this;
        }
        public java.util.List<String> getAlgo() {
            return this.algo;
        }

        public CreateAppResponseBodyResultDomainFunctions setQp(java.util.List<String> qp) {
            this.qp = qp;
            return this;
        }
        public java.util.List<String> getQp() {
            return this.qp;
        }

        public CreateAppResponseBodyResultDomainFunctions setService(java.util.List<String> service) {
            this.service = service;
            return this;
        }
        public java.util.List<String> getService() {
            return this.service;
        }

    }

    public static class CreateAppResponseBodyResultDomain extends TeaModel {
        @NameInMap("category")
        public String category;

        @NameInMap("functions")
        public CreateAppResponseBodyResultDomainFunctions functions;

        @NameInMap("name")
        public String name;

        public static CreateAppResponseBodyResultDomain build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResultDomain self = new CreateAppResponseBodyResultDomain();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResultDomain setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateAppResponseBodyResultDomain setFunctions(CreateAppResponseBodyResultDomainFunctions functions) {
            this.functions = functions;
            return this;
        }
        public CreateAppResponseBodyResultDomainFunctions getFunctions() {
            return this.functions;
        }

        public CreateAppResponseBodyResultDomain setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateAppResponseBodyResultFirstRanks extends TeaModel {
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

        public static CreateAppResponseBodyResultFirstRanks build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResultFirstRanks self = new CreateAppResponseBodyResultFirstRanks();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResultFirstRanks setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public CreateAppResponseBodyResultFirstRanks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAppResponseBodyResultFirstRanks setMeta(Object meta) {
            this.meta = meta;
            return this;
        }
        public Object getMeta() {
            return this.meta;
        }

        public CreateAppResponseBodyResultFirstRanks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppResponseBodyResultFirstRanks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAppResponseBodyResultQueryProcessors extends TeaModel {
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

        public static CreateAppResponseBodyResultQueryProcessors build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResultQueryProcessors self = new CreateAppResponseBodyResultQueryProcessors();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResultQueryProcessors setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public CreateAppResponseBodyResultQueryProcessors setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateAppResponseBodyResultQueryProcessors setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateAppResponseBodyResultQueryProcessors setIndexes(java.util.List<String> indexes) {
            this.indexes = indexes;
            return this;
        }
        public java.util.List<String> getIndexes() {
            return this.indexes;
        }

        public CreateAppResponseBodyResultQueryProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppResponseBodyResultQueryProcessors setProcessors(java.util.List<java.util.Map<String, ?>> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getProcessors() {
            return this.processors;
        }

    }

    public static class CreateAppResponseBodyResultQuota extends TeaModel {
        @NameInMap("computeResource")
        public Integer computeResource;

        @NameInMap("docSize")
        public Integer docSize;

        @NameInMap("qps")
        public Integer qps;

        @NameInMap("spec")
        public String spec;

        public static CreateAppResponseBodyResultQuota build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResultQuota self = new CreateAppResponseBodyResultQuota();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResultQuota setComputeResource(Integer computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public Integer getComputeResource() {
            return this.computeResource;
        }

        public CreateAppResponseBodyResultQuota setDocSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }
        public Integer getDocSize() {
            return this.docSize;
        }

        public CreateAppResponseBodyResultQuota setQps(Integer qps) {
            this.qps = qps;
            return this;
        }
        public Integer getQps() {
            return this.qps;
        }

        public CreateAppResponseBodyResultQuota setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class CreateAppResponseBodyResultSchemaIndexSortConfig extends TeaModel {
        @NameInMap("direction")
        public String direction;

        @NameInMap("field")
        public String field;

        public static CreateAppResponseBodyResultSchemaIndexSortConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResultSchemaIndexSortConfig self = new CreateAppResponseBodyResultSchemaIndexSortConfig();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResultSchemaIndexSortConfig setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public CreateAppResponseBodyResultSchemaIndexSortConfig setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class CreateAppResponseBodyResultSchemaIndexes extends TeaModel {
        @NameInMap("filterFields")
        public java.util.List<String> filterFields;

        @NameInMap("searchFields")
        public java.util.Map<String, ?> searchFields;

        public static CreateAppResponseBodyResultSchemaIndexes build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResultSchemaIndexes self = new CreateAppResponseBodyResultSchemaIndexes();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResultSchemaIndexes setFilterFields(java.util.List<String> filterFields) {
            this.filterFields = filterFields;
            return this;
        }
        public java.util.List<String> getFilterFields() {
            return this.filterFields;
        }

        public CreateAppResponseBodyResultSchemaIndexes setSearchFields(java.util.Map<String, ?> searchFields) {
            this.searchFields = searchFields;
            return this;
        }
        public java.util.Map<String, ?> getSearchFields() {
            return this.searchFields;
        }

    }

    public static class CreateAppResponseBodyResultSchemaTtlField extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("ttl")
        public Long ttl;

        public static CreateAppResponseBodyResultSchemaTtlField build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResultSchemaTtlField self = new CreateAppResponseBodyResultSchemaTtlField();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResultSchemaTtlField setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppResponseBodyResultSchemaTtlField setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

    }

    public static class CreateAppResponseBodyResultSchema extends TeaModel {
        @NameInMap("indexSortConfig")
        public java.util.List<CreateAppResponseBodyResultSchemaIndexSortConfig> indexSortConfig;

        @NameInMap("indexes")
        public CreateAppResponseBodyResultSchemaIndexes indexes;

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
        public CreateAppResponseBodyResultSchemaTtlField ttlField;

        public static CreateAppResponseBodyResultSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResultSchema self = new CreateAppResponseBodyResultSchema();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResultSchema setIndexSortConfig(java.util.List<CreateAppResponseBodyResultSchemaIndexSortConfig> indexSortConfig) {
            this.indexSortConfig = indexSortConfig;
            return this;
        }
        public java.util.List<CreateAppResponseBodyResultSchemaIndexSortConfig> getIndexSortConfig() {
            return this.indexSortConfig;
        }

        public CreateAppResponseBodyResultSchema setIndexes(CreateAppResponseBodyResultSchemaIndexes indexes) {
            this.indexes = indexes;
            return this;
        }
        public CreateAppResponseBodyResultSchemaIndexes getIndexes() {
            return this.indexes;
        }

        public CreateAppResponseBodyResultSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppResponseBodyResultSchema setRouteField(String routeField) {
            this.routeField = routeField;
            return this;
        }
        public String getRouteField() {
            return this.routeField;
        }

        public CreateAppResponseBodyResultSchema setRouteFieldValues(java.util.List<String> routeFieldValues) {
            this.routeFieldValues = routeFieldValues;
            return this;
        }
        public java.util.List<String> getRouteFieldValues() {
            return this.routeFieldValues;
        }

        public CreateAppResponseBodyResultSchema setSecondRouteField(String secondRouteField) {
            this.secondRouteField = secondRouteField;
            return this;
        }
        public String getSecondRouteField() {
            return this.secondRouteField;
        }

        public CreateAppResponseBodyResultSchema setTables(java.util.Map<String, ?> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.Map<String, ?> getTables() {
            return this.tables;
        }

        public CreateAppResponseBodyResultSchema setTtlField(CreateAppResponseBodyResultSchemaTtlField ttlField) {
            this.ttlField = ttlField;
            return this;
        }
        public CreateAppResponseBodyResultSchemaTtlField getTtlField() {
            return this.ttlField;
        }

    }

    public static class CreateAppResponseBodyResultSchemasIndexSortConfig extends TeaModel {
        @NameInMap("direction")
        public String direction;

        @NameInMap("field")
        public String field;

        public static CreateAppResponseBodyResultSchemasIndexSortConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResultSchemasIndexSortConfig self = new CreateAppResponseBodyResultSchemasIndexSortConfig();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResultSchemasIndexSortConfig setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public CreateAppResponseBodyResultSchemasIndexSortConfig setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class CreateAppResponseBodyResultSchemasIndexes extends TeaModel {
        @NameInMap("filterFields")
        public java.util.List<String> filterFields;

        @NameInMap("searchFields")
        public java.util.Map<String, ?> searchFields;

        public static CreateAppResponseBodyResultSchemasIndexes build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResultSchemasIndexes self = new CreateAppResponseBodyResultSchemasIndexes();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResultSchemasIndexes setFilterFields(java.util.List<String> filterFields) {
            this.filterFields = filterFields;
            return this;
        }
        public java.util.List<String> getFilterFields() {
            return this.filterFields;
        }

        public CreateAppResponseBodyResultSchemasIndexes setSearchFields(java.util.Map<String, ?> searchFields) {
            this.searchFields = searchFields;
            return this;
        }
        public java.util.Map<String, ?> getSearchFields() {
            return this.searchFields;
        }

    }

    public static class CreateAppResponseBodyResultSchemasTtlField extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("ttl")
        public Long ttl;

        public static CreateAppResponseBodyResultSchemasTtlField build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResultSchemasTtlField self = new CreateAppResponseBodyResultSchemasTtlField();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResultSchemasTtlField setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppResponseBodyResultSchemasTtlField setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

    }

    public static class CreateAppResponseBodyResultSchemas extends TeaModel {
        @NameInMap("indexSortConfig")
        public java.util.List<CreateAppResponseBodyResultSchemasIndexSortConfig> indexSortConfig;

        @NameInMap("indexes")
        public CreateAppResponseBodyResultSchemasIndexes indexes;

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
        public CreateAppResponseBodyResultSchemasTtlField ttlField;

        public static CreateAppResponseBodyResultSchemas build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResultSchemas self = new CreateAppResponseBodyResultSchemas();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResultSchemas setIndexSortConfig(java.util.List<CreateAppResponseBodyResultSchemasIndexSortConfig> indexSortConfig) {
            this.indexSortConfig = indexSortConfig;
            return this;
        }
        public java.util.List<CreateAppResponseBodyResultSchemasIndexSortConfig> getIndexSortConfig() {
            return this.indexSortConfig;
        }

        public CreateAppResponseBodyResultSchemas setIndexes(CreateAppResponseBodyResultSchemasIndexes indexes) {
            this.indexes = indexes;
            return this;
        }
        public CreateAppResponseBodyResultSchemasIndexes getIndexes() {
            return this.indexes;
        }

        public CreateAppResponseBodyResultSchemas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppResponseBodyResultSchemas setRouteField(String routeField) {
            this.routeField = routeField;
            return this;
        }
        public String getRouteField() {
            return this.routeField;
        }

        public CreateAppResponseBodyResultSchemas setRouteFieldValues(java.util.List<String> routeFieldValues) {
            this.routeFieldValues = routeFieldValues;
            return this;
        }
        public java.util.List<String> getRouteFieldValues() {
            return this.routeFieldValues;
        }

        public CreateAppResponseBodyResultSchemas setSecondRouteField(String secondRouteField) {
            this.secondRouteField = secondRouteField;
            return this;
        }
        public String getSecondRouteField() {
            return this.secondRouteField;
        }

        public CreateAppResponseBodyResultSchemas setTables(java.util.Map<String, ?> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.Map<String, ?> getTables() {
            return this.tables;
        }

        public CreateAppResponseBodyResultSchemas setTtlField(CreateAppResponseBodyResultSchemasTtlField ttlField) {
            this.ttlField = ttlField;
            return this;
        }
        public CreateAppResponseBodyResultSchemasTtlField getTtlField() {
            return this.ttlField;
        }

    }

    public static class CreateAppResponseBodyResultSecondRanks extends TeaModel {
        @NameInMap("active")
        public Boolean active;

        @NameInMap("description")
        public String description;

        @NameInMap("meta")
        public Object meta;

        @NameInMap("name")
        public String name;

        public static CreateAppResponseBodyResultSecondRanks build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResultSecondRanks self = new CreateAppResponseBodyResultSecondRanks();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResultSecondRanks setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public CreateAppResponseBodyResultSecondRanks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAppResponseBodyResultSecondRanks setMeta(Object meta) {
            this.meta = meta;
            return this;
        }
        public Object getMeta() {
            return this.meta;
        }

        public CreateAppResponseBodyResultSecondRanks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateAppResponseBodyResultSummariesMeta extends TeaModel {
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

        public static CreateAppResponseBodyResultSummariesMeta build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResultSummariesMeta self = new CreateAppResponseBodyResultSummariesMeta();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResultSummariesMeta setElement(String element) {
            this.element = element;
            return this;
        }
        public String getElement() {
            return this.element;
        }

        public CreateAppResponseBodyResultSummariesMeta setEllipsis(String ellipsis) {
            this.ellipsis = ellipsis;
            return this;
        }
        public String getEllipsis() {
            return this.ellipsis;
        }

        public CreateAppResponseBodyResultSummariesMeta setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public CreateAppResponseBodyResultSummariesMeta setLen(Integer len) {
            this.len = len;
            return this;
        }
        public Integer getLen() {
            return this.len;
        }

        public CreateAppResponseBodyResultSummariesMeta setSnippet(String snippet) {
            this.snippet = snippet;
            return this;
        }
        public String getSnippet() {
            return this.snippet;
        }

    }

    public static class CreateAppResponseBodyResultSummaries extends TeaModel {
        @NameInMap("meta")
        public java.util.List<CreateAppResponseBodyResultSummariesMeta> meta;

        @NameInMap("name")
        public String name;

        public static CreateAppResponseBodyResultSummaries build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResultSummaries self = new CreateAppResponseBodyResultSummaries();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResultSummaries setMeta(java.util.List<CreateAppResponseBodyResultSummariesMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<CreateAppResponseBodyResultSummariesMeta> getMeta() {
            return this.meta;
        }

        public CreateAppResponseBodyResultSummaries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateAppResponseBodyResult extends TeaModel {
        @NameInMap("autoSwitch")
        public Boolean autoSwitch;

        @NameInMap("cluster")
        public CreateAppResponseBodyResultCluster cluster;

        @NameInMap("clusterName")
        public String clusterName;

        @NameInMap("dataSources")
        public java.util.List<CreateAppResponseBodyResultDataSources> dataSources;

        @NameInMap("description")
        public String description;

        @NameInMap("domain")
        public CreateAppResponseBodyResultDomain domain;

        @NameInMap("fetchFields")
        public java.util.List<String> fetchFields;

        @NameInMap("firstRanks")
        public java.util.List<CreateAppResponseBodyResultFirstRanks> firstRanks;

        @NameInMap("id")
        public String id;

        @NameInMap("interpretations")
        public java.util.Map<String, ?> interpretations;

        @NameInMap("isCurrent")
        public Boolean isCurrent;

        @NameInMap("progressPercent")
        public Integer progressPercent;

        @NameInMap("prompts")
        public java.util.List<java.util.Map<String, ?>> prompts;

        @NameInMap("queryProcessors")
        public java.util.List<CreateAppResponseBodyResultQueryProcessors> queryProcessors;

        @NameInMap("quota")
        public CreateAppResponseBodyResultQuota quota;

        @NameInMap("schema")
        public CreateAppResponseBodyResultSchema schema;

        @NameInMap("schemas")
        public java.util.List<CreateAppResponseBodyResultSchemas> schemas;

        @NameInMap("secondRanks")
        public java.util.List<CreateAppResponseBodyResultSecondRanks> secondRanks;

        @NameInMap("status")
        public String status;

        @NameInMap("summaries")
        public java.util.List<CreateAppResponseBodyResultSummaries> summaries;

        @NameInMap("type")
        public String type;

        public static CreateAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResult self = new CreateAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResult setAutoSwitch(Boolean autoSwitch) {
            this.autoSwitch = autoSwitch;
            return this;
        }
        public Boolean getAutoSwitch() {
            return this.autoSwitch;
        }

        public CreateAppResponseBodyResult setCluster(CreateAppResponseBodyResultCluster cluster) {
            this.cluster = cluster;
            return this;
        }
        public CreateAppResponseBodyResultCluster getCluster() {
            return this.cluster;
        }

        public CreateAppResponseBodyResult setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public CreateAppResponseBodyResult setDataSources(java.util.List<CreateAppResponseBodyResultDataSources> dataSources) {
            this.dataSources = dataSources;
            return this;
        }
        public java.util.List<CreateAppResponseBodyResultDataSources> getDataSources() {
            return this.dataSources;
        }

        public CreateAppResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAppResponseBodyResult setDomain(CreateAppResponseBodyResultDomain domain) {
            this.domain = domain;
            return this;
        }
        public CreateAppResponseBodyResultDomain getDomain() {
            return this.domain;
        }

        public CreateAppResponseBodyResult setFetchFields(java.util.List<String> fetchFields) {
            this.fetchFields = fetchFields;
            return this;
        }
        public java.util.List<String> getFetchFields() {
            return this.fetchFields;
        }

        public CreateAppResponseBodyResult setFirstRanks(java.util.List<CreateAppResponseBodyResultFirstRanks> firstRanks) {
            this.firstRanks = firstRanks;
            return this;
        }
        public java.util.List<CreateAppResponseBodyResultFirstRanks> getFirstRanks() {
            return this.firstRanks;
        }

        public CreateAppResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateAppResponseBodyResult setInterpretations(java.util.Map<String, ?> interpretations) {
            this.interpretations = interpretations;
            return this;
        }
        public java.util.Map<String, ?> getInterpretations() {
            return this.interpretations;
        }

        public CreateAppResponseBodyResult setIsCurrent(Boolean isCurrent) {
            this.isCurrent = isCurrent;
            return this;
        }
        public Boolean getIsCurrent() {
            return this.isCurrent;
        }

        public CreateAppResponseBodyResult setProgressPercent(Integer progressPercent) {
            this.progressPercent = progressPercent;
            return this;
        }
        public Integer getProgressPercent() {
            return this.progressPercent;
        }

        public CreateAppResponseBodyResult setPrompts(java.util.List<java.util.Map<String, ?>> prompts) {
            this.prompts = prompts;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getPrompts() {
            return this.prompts;
        }

        public CreateAppResponseBodyResult setQueryProcessors(java.util.List<CreateAppResponseBodyResultQueryProcessors> queryProcessors) {
            this.queryProcessors = queryProcessors;
            return this;
        }
        public java.util.List<CreateAppResponseBodyResultQueryProcessors> getQueryProcessors() {
            return this.queryProcessors;
        }

        public CreateAppResponseBodyResult setQuota(CreateAppResponseBodyResultQuota quota) {
            this.quota = quota;
            return this;
        }
        public CreateAppResponseBodyResultQuota getQuota() {
            return this.quota;
        }

        public CreateAppResponseBodyResult setSchema(CreateAppResponseBodyResultSchema schema) {
            this.schema = schema;
            return this;
        }
        public CreateAppResponseBodyResultSchema getSchema() {
            return this.schema;
        }

        public CreateAppResponseBodyResult setSchemas(java.util.List<CreateAppResponseBodyResultSchemas> schemas) {
            this.schemas = schemas;
            return this;
        }
        public java.util.List<CreateAppResponseBodyResultSchemas> getSchemas() {
            return this.schemas;
        }

        public CreateAppResponseBodyResult setSecondRanks(java.util.List<CreateAppResponseBodyResultSecondRanks> secondRanks) {
            this.secondRanks = secondRanks;
            return this;
        }
        public java.util.List<CreateAppResponseBodyResultSecondRanks> getSecondRanks() {
            return this.secondRanks;
        }

        public CreateAppResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateAppResponseBodyResult setSummaries(java.util.List<CreateAppResponseBodyResultSummaries> summaries) {
            this.summaries = summaries;
            return this;
        }
        public java.util.List<CreateAppResponseBodyResultSummaries> getSummaries() {
            return this.summaries;
        }

        public CreateAppResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
