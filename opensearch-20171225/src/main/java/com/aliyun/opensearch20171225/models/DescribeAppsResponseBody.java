// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeAppsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>77CAA411-0010-4DB9-82E2-1C384E590AFF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about each version.</p>
     */
    @NameInMap("result")
    public java.util.List<DescribeAppsResponseBodyResult> result;

    public static DescribeAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsResponseBody self = new DescribeAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppsResponseBody setResult(java.util.List<DescribeAppsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeAppsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeAppsResponseBodyResultCluster extends TeaModel {
        @NameInMap("maxQueryClauseLength")
        public Integer maxQueryClauseLength;

        @NameInMap("maxTimeoutMS")
        public Integer maxTimeoutMS;

        public static DescribeAppsResponseBodyResultCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyResultCluster self = new DescribeAppsResponseBodyResultCluster();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyResultCluster setMaxQueryClauseLength(Integer maxQueryClauseLength) {
            this.maxQueryClauseLength = maxQueryClauseLength;
            return this;
        }
        public Integer getMaxQueryClauseLength() {
            return this.maxQueryClauseLength;
        }

        public DescribeAppsResponseBodyResultCluster setMaxTimeoutMS(Integer maxTimeoutMS) {
            this.maxTimeoutMS = maxTimeoutMS;
            return this;
        }
        public Integer getMaxTimeoutMS() {
            return this.maxTimeoutMS;
        }

    }

    public static class DescribeAppsResponseBodyResultDataSources extends TeaModel {
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

        public static DescribeAppsResponseBodyResultDataSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyResultDataSources self = new DescribeAppsResponseBodyResultDataSources();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyResultDataSources setFields(java.util.List<java.util.Map<String, ?>> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getFields() {
            return this.fields;
        }

        public DescribeAppsResponseBodyResultDataSources setKeyField(String keyField) {
            this.keyField = keyField;
            return this;
        }
        public String getKeyField() {
            return this.keyField;
        }

        public DescribeAppsResponseBodyResultDataSources setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public DescribeAppsResponseBodyResultDataSources setPlugins(java.util.Map<String, ?> plugins) {
            this.plugins = plugins;
            return this;
        }
        public java.util.Map<String, ?> getPlugins() {
            return this.plugins;
        }

        public DescribeAppsResponseBodyResultDataSources setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeAppsResponseBodyResultDataSources setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeAppsResponseBodyResultDataSources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeAppsResponseBodyResultDomainFunctions extends TeaModel {
        @NameInMap("algo")
        public java.util.List<String> algo;

        @NameInMap("qp")
        public java.util.List<String> qp;

        @NameInMap("service")
        public java.util.List<String> service;

        public static DescribeAppsResponseBodyResultDomainFunctions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyResultDomainFunctions self = new DescribeAppsResponseBodyResultDomainFunctions();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyResultDomainFunctions setAlgo(java.util.List<String> algo) {
            this.algo = algo;
            return this;
        }
        public java.util.List<String> getAlgo() {
            return this.algo;
        }

        public DescribeAppsResponseBodyResultDomainFunctions setQp(java.util.List<String> qp) {
            this.qp = qp;
            return this;
        }
        public java.util.List<String> getQp() {
            return this.qp;
        }

        public DescribeAppsResponseBodyResultDomainFunctions setService(java.util.List<String> service) {
            this.service = service;
            return this;
        }
        public java.util.List<String> getService() {
            return this.service;
        }

    }

    public static class DescribeAppsResponseBodyResultDomain extends TeaModel {
        @NameInMap("category")
        public String category;

        @NameInMap("functions")
        public DescribeAppsResponseBodyResultDomainFunctions functions;

        @NameInMap("name")
        public String name;

        public static DescribeAppsResponseBodyResultDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyResultDomain self = new DescribeAppsResponseBodyResultDomain();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyResultDomain setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeAppsResponseBodyResultDomain setFunctions(DescribeAppsResponseBodyResultDomainFunctions functions) {
            this.functions = functions;
            return this;
        }
        public DescribeAppsResponseBodyResultDomainFunctions getFunctions() {
            return this.functions;
        }

        public DescribeAppsResponseBodyResultDomain setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeAppsResponseBodyResultFirstRanks extends TeaModel {
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

        public static DescribeAppsResponseBodyResultFirstRanks build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyResultFirstRanks self = new DescribeAppsResponseBodyResultFirstRanks();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyResultFirstRanks setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public DescribeAppsResponseBodyResultFirstRanks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAppsResponseBodyResultFirstRanks setMeta(Object meta) {
            this.meta = meta;
            return this;
        }
        public Object getMeta() {
            return this.meta;
        }

        public DescribeAppsResponseBodyResultFirstRanks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppsResponseBodyResultFirstRanks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeAppsResponseBodyResultQueryProcessors extends TeaModel {
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

        public static DescribeAppsResponseBodyResultQueryProcessors build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyResultQueryProcessors self = new DescribeAppsResponseBodyResultQueryProcessors();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyResultQueryProcessors setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public DescribeAppsResponseBodyResultQueryProcessors setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeAppsResponseBodyResultQueryProcessors setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeAppsResponseBodyResultQueryProcessors setIndexes(java.util.List<String> indexes) {
            this.indexes = indexes;
            return this;
        }
        public java.util.List<String> getIndexes() {
            return this.indexes;
        }

        public DescribeAppsResponseBodyResultQueryProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppsResponseBodyResultQueryProcessors setProcessors(java.util.List<java.util.Map<String, ?>> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getProcessors() {
            return this.processors;
        }

    }

    public static class DescribeAppsResponseBodyResultQuota extends TeaModel {
        @NameInMap("computeResource")
        public Integer computeResource;

        @NameInMap("docSize")
        public Integer docSize;

        @NameInMap("qps")
        public Integer qps;

        @NameInMap("spec")
        public String spec;

        public static DescribeAppsResponseBodyResultQuota build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyResultQuota self = new DescribeAppsResponseBodyResultQuota();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyResultQuota setComputeResource(Integer computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public Integer getComputeResource() {
            return this.computeResource;
        }

        public DescribeAppsResponseBodyResultQuota setDocSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }
        public Integer getDocSize() {
            return this.docSize;
        }

        public DescribeAppsResponseBodyResultQuota setQps(Integer qps) {
            this.qps = qps;
            return this;
        }
        public Integer getQps() {
            return this.qps;
        }

        public DescribeAppsResponseBodyResultQuota setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class DescribeAppsResponseBodyResultSchemaIndexSortConfig extends TeaModel {
        @NameInMap("direction")
        public String direction;

        @NameInMap("field")
        public String field;

        public static DescribeAppsResponseBodyResultSchemaIndexSortConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyResultSchemaIndexSortConfig self = new DescribeAppsResponseBodyResultSchemaIndexSortConfig();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyResultSchemaIndexSortConfig setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DescribeAppsResponseBodyResultSchemaIndexSortConfig setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class DescribeAppsResponseBodyResultSchemaIndexes extends TeaModel {
        @NameInMap("filterFields")
        public java.util.List<String> filterFields;

        @NameInMap("searchFields")
        public java.util.Map<String, ?> searchFields;

        public static DescribeAppsResponseBodyResultSchemaIndexes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyResultSchemaIndexes self = new DescribeAppsResponseBodyResultSchemaIndexes();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyResultSchemaIndexes setFilterFields(java.util.List<String> filterFields) {
            this.filterFields = filterFields;
            return this;
        }
        public java.util.List<String> getFilterFields() {
            return this.filterFields;
        }

        public DescribeAppsResponseBodyResultSchemaIndexes setSearchFields(java.util.Map<String, ?> searchFields) {
            this.searchFields = searchFields;
            return this;
        }
        public java.util.Map<String, ?> getSearchFields() {
            return this.searchFields;
        }

    }

    public static class DescribeAppsResponseBodyResultSchemaTtlField extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("ttl")
        public Long ttl;

        public static DescribeAppsResponseBodyResultSchemaTtlField build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyResultSchemaTtlField self = new DescribeAppsResponseBodyResultSchemaTtlField();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyResultSchemaTtlField setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppsResponseBodyResultSchemaTtlField setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

    }

    public static class DescribeAppsResponseBodyResultSchema extends TeaModel {
        @NameInMap("indexSortConfig")
        public java.util.List<DescribeAppsResponseBodyResultSchemaIndexSortConfig> indexSortConfig;

        @NameInMap("indexes")
        public DescribeAppsResponseBodyResultSchemaIndexes indexes;

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
        public DescribeAppsResponseBodyResultSchemaTtlField ttlField;

        public static DescribeAppsResponseBodyResultSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyResultSchema self = new DescribeAppsResponseBodyResultSchema();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyResultSchema setIndexSortConfig(java.util.List<DescribeAppsResponseBodyResultSchemaIndexSortConfig> indexSortConfig) {
            this.indexSortConfig = indexSortConfig;
            return this;
        }
        public java.util.List<DescribeAppsResponseBodyResultSchemaIndexSortConfig> getIndexSortConfig() {
            return this.indexSortConfig;
        }

        public DescribeAppsResponseBodyResultSchema setIndexes(DescribeAppsResponseBodyResultSchemaIndexes indexes) {
            this.indexes = indexes;
            return this;
        }
        public DescribeAppsResponseBodyResultSchemaIndexes getIndexes() {
            return this.indexes;
        }

        public DescribeAppsResponseBodyResultSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppsResponseBodyResultSchema setRouteField(String routeField) {
            this.routeField = routeField;
            return this;
        }
        public String getRouteField() {
            return this.routeField;
        }

        public DescribeAppsResponseBodyResultSchema setRouteFieldValues(java.util.List<String> routeFieldValues) {
            this.routeFieldValues = routeFieldValues;
            return this;
        }
        public java.util.List<String> getRouteFieldValues() {
            return this.routeFieldValues;
        }

        public DescribeAppsResponseBodyResultSchema setSecondRouteField(String secondRouteField) {
            this.secondRouteField = secondRouteField;
            return this;
        }
        public String getSecondRouteField() {
            return this.secondRouteField;
        }

        public DescribeAppsResponseBodyResultSchema setTables(java.util.Map<String, ?> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.Map<String, ?> getTables() {
            return this.tables;
        }

        public DescribeAppsResponseBodyResultSchema setTtlField(DescribeAppsResponseBodyResultSchemaTtlField ttlField) {
            this.ttlField = ttlField;
            return this;
        }
        public DescribeAppsResponseBodyResultSchemaTtlField getTtlField() {
            return this.ttlField;
        }

    }

    public static class DescribeAppsResponseBodyResultSchemasIndexSortConfig extends TeaModel {
        @NameInMap("direction")
        public String direction;

        @NameInMap("field")
        public String field;

        public static DescribeAppsResponseBodyResultSchemasIndexSortConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyResultSchemasIndexSortConfig self = new DescribeAppsResponseBodyResultSchemasIndexSortConfig();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyResultSchemasIndexSortConfig setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DescribeAppsResponseBodyResultSchemasIndexSortConfig setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class DescribeAppsResponseBodyResultSchemasIndexes extends TeaModel {
        @NameInMap("filterFields")
        public java.util.List<String> filterFields;

        @NameInMap("searchFields")
        public java.util.Map<String, ?> searchFields;

        public static DescribeAppsResponseBodyResultSchemasIndexes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyResultSchemasIndexes self = new DescribeAppsResponseBodyResultSchemasIndexes();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyResultSchemasIndexes setFilterFields(java.util.List<String> filterFields) {
            this.filterFields = filterFields;
            return this;
        }
        public java.util.List<String> getFilterFields() {
            return this.filterFields;
        }

        public DescribeAppsResponseBodyResultSchemasIndexes setSearchFields(java.util.Map<String, ?> searchFields) {
            this.searchFields = searchFields;
            return this;
        }
        public java.util.Map<String, ?> getSearchFields() {
            return this.searchFields;
        }

    }

    public static class DescribeAppsResponseBodyResultSchemasTtlField extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("ttl")
        public Long ttl;

        public static DescribeAppsResponseBodyResultSchemasTtlField build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyResultSchemasTtlField self = new DescribeAppsResponseBodyResultSchemasTtlField();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyResultSchemasTtlField setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppsResponseBodyResultSchemasTtlField setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

    }

    public static class DescribeAppsResponseBodyResultSchemas extends TeaModel {
        @NameInMap("indexSortConfig")
        public java.util.List<DescribeAppsResponseBodyResultSchemasIndexSortConfig> indexSortConfig;

        @NameInMap("indexes")
        public DescribeAppsResponseBodyResultSchemasIndexes indexes;

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
        public DescribeAppsResponseBodyResultSchemasTtlField ttlField;

        public static DescribeAppsResponseBodyResultSchemas build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyResultSchemas self = new DescribeAppsResponseBodyResultSchemas();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyResultSchemas setIndexSortConfig(java.util.List<DescribeAppsResponseBodyResultSchemasIndexSortConfig> indexSortConfig) {
            this.indexSortConfig = indexSortConfig;
            return this;
        }
        public java.util.List<DescribeAppsResponseBodyResultSchemasIndexSortConfig> getIndexSortConfig() {
            return this.indexSortConfig;
        }

        public DescribeAppsResponseBodyResultSchemas setIndexes(DescribeAppsResponseBodyResultSchemasIndexes indexes) {
            this.indexes = indexes;
            return this;
        }
        public DescribeAppsResponseBodyResultSchemasIndexes getIndexes() {
            return this.indexes;
        }

        public DescribeAppsResponseBodyResultSchemas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppsResponseBodyResultSchemas setRouteField(String routeField) {
            this.routeField = routeField;
            return this;
        }
        public String getRouteField() {
            return this.routeField;
        }

        public DescribeAppsResponseBodyResultSchemas setRouteFieldValues(java.util.List<String> routeFieldValues) {
            this.routeFieldValues = routeFieldValues;
            return this;
        }
        public java.util.List<String> getRouteFieldValues() {
            return this.routeFieldValues;
        }

        public DescribeAppsResponseBodyResultSchemas setSecondRouteField(String secondRouteField) {
            this.secondRouteField = secondRouteField;
            return this;
        }
        public String getSecondRouteField() {
            return this.secondRouteField;
        }

        public DescribeAppsResponseBodyResultSchemas setTables(java.util.Map<String, ?> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.Map<String, ?> getTables() {
            return this.tables;
        }

        public DescribeAppsResponseBodyResultSchemas setTtlField(DescribeAppsResponseBodyResultSchemasTtlField ttlField) {
            this.ttlField = ttlField;
            return this;
        }
        public DescribeAppsResponseBodyResultSchemasTtlField getTtlField() {
            return this.ttlField;
        }

    }

    public static class DescribeAppsResponseBodyResultSecondRanks extends TeaModel {
        @NameInMap("active")
        public Boolean active;

        @NameInMap("description")
        public String description;

        @NameInMap("meta")
        public Object meta;

        @NameInMap("name")
        public String name;

        public static DescribeAppsResponseBodyResultSecondRanks build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyResultSecondRanks self = new DescribeAppsResponseBodyResultSecondRanks();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyResultSecondRanks setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public DescribeAppsResponseBodyResultSecondRanks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAppsResponseBodyResultSecondRanks setMeta(Object meta) {
            this.meta = meta;
            return this;
        }
        public Object getMeta() {
            return this.meta;
        }

        public DescribeAppsResponseBodyResultSecondRanks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeAppsResponseBodyResultSummariesMeta extends TeaModel {
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

        public static DescribeAppsResponseBodyResultSummariesMeta build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyResultSummariesMeta self = new DescribeAppsResponseBodyResultSummariesMeta();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyResultSummariesMeta setElement(String element) {
            this.element = element;
            return this;
        }
        public String getElement() {
            return this.element;
        }

        public DescribeAppsResponseBodyResultSummariesMeta setEllipsis(String ellipsis) {
            this.ellipsis = ellipsis;
            return this;
        }
        public String getEllipsis() {
            return this.ellipsis;
        }

        public DescribeAppsResponseBodyResultSummariesMeta setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public DescribeAppsResponseBodyResultSummariesMeta setLen(Integer len) {
            this.len = len;
            return this;
        }
        public Integer getLen() {
            return this.len;
        }

        public DescribeAppsResponseBodyResultSummariesMeta setSnippet(String snippet) {
            this.snippet = snippet;
            return this;
        }
        public String getSnippet() {
            return this.snippet;
        }

    }

    public static class DescribeAppsResponseBodyResultSummaries extends TeaModel {
        @NameInMap("meta")
        public java.util.List<DescribeAppsResponseBodyResultSummariesMeta> meta;

        @NameInMap("name")
        public String name;

        public static DescribeAppsResponseBodyResultSummaries build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyResultSummaries self = new DescribeAppsResponseBodyResultSummaries();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyResultSummaries setMeta(java.util.List<DescribeAppsResponseBodyResultSummariesMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<DescribeAppsResponseBodyResultSummariesMeta> getMeta() {
            return this.meta;
        }

        public DescribeAppsResponseBodyResultSummaries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeAppsResponseBodyResult extends TeaModel {
        @NameInMap("autoSwitch")
        public Boolean autoSwitch;

        @NameInMap("cluster")
        public DescribeAppsResponseBodyResultCluster cluster;

        @NameInMap("clusterName")
        public String clusterName;

        @NameInMap("dataSources")
        public java.util.List<DescribeAppsResponseBodyResultDataSources> dataSources;

        @NameInMap("description")
        public String description;

        @NameInMap("domain")
        public DescribeAppsResponseBodyResultDomain domain;

        @NameInMap("fetchFields")
        public java.util.List<String> fetchFields;

        @NameInMap("firstRanks")
        public java.util.List<DescribeAppsResponseBodyResultFirstRanks> firstRanks;

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
        public java.util.List<DescribeAppsResponseBodyResultQueryProcessors> queryProcessors;

        @NameInMap("quota")
        public DescribeAppsResponseBodyResultQuota quota;

        @NameInMap("schema")
        public DescribeAppsResponseBodyResultSchema schema;

        @NameInMap("schemas")
        public java.util.List<DescribeAppsResponseBodyResultSchemas> schemas;

        @NameInMap("secondRanks")
        public java.util.List<DescribeAppsResponseBodyResultSecondRanks> secondRanks;

        @NameInMap("status")
        public String status;

        @NameInMap("summaries")
        public java.util.List<DescribeAppsResponseBodyResultSummaries> summaries;

        @NameInMap("type")
        public String type;

        public static DescribeAppsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyResult self = new DescribeAppsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyResult setAutoSwitch(Boolean autoSwitch) {
            this.autoSwitch = autoSwitch;
            return this;
        }
        public Boolean getAutoSwitch() {
            return this.autoSwitch;
        }

        public DescribeAppsResponseBodyResult setCluster(DescribeAppsResponseBodyResultCluster cluster) {
            this.cluster = cluster;
            return this;
        }
        public DescribeAppsResponseBodyResultCluster getCluster() {
            return this.cluster;
        }

        public DescribeAppsResponseBodyResult setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeAppsResponseBodyResult setDataSources(java.util.List<DescribeAppsResponseBodyResultDataSources> dataSources) {
            this.dataSources = dataSources;
            return this;
        }
        public java.util.List<DescribeAppsResponseBodyResultDataSources> getDataSources() {
            return this.dataSources;
        }

        public DescribeAppsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAppsResponseBodyResult setDomain(DescribeAppsResponseBodyResultDomain domain) {
            this.domain = domain;
            return this;
        }
        public DescribeAppsResponseBodyResultDomain getDomain() {
            return this.domain;
        }

        public DescribeAppsResponseBodyResult setFetchFields(java.util.List<String> fetchFields) {
            this.fetchFields = fetchFields;
            return this;
        }
        public java.util.List<String> getFetchFields() {
            return this.fetchFields;
        }

        public DescribeAppsResponseBodyResult setFirstRanks(java.util.List<DescribeAppsResponseBodyResultFirstRanks> firstRanks) {
            this.firstRanks = firstRanks;
            return this;
        }
        public java.util.List<DescribeAppsResponseBodyResultFirstRanks> getFirstRanks() {
            return this.firstRanks;
        }

        public DescribeAppsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeAppsResponseBodyResult setInterpretations(java.util.Map<String, ?> interpretations) {
            this.interpretations = interpretations;
            return this;
        }
        public java.util.Map<String, ?> getInterpretations() {
            return this.interpretations;
        }

        public DescribeAppsResponseBodyResult setIsCurrent(Boolean isCurrent) {
            this.isCurrent = isCurrent;
            return this;
        }
        public Boolean getIsCurrent() {
            return this.isCurrent;
        }

        public DescribeAppsResponseBodyResult setProgressPercent(Integer progressPercent) {
            this.progressPercent = progressPercent;
            return this;
        }
        public Integer getProgressPercent() {
            return this.progressPercent;
        }

        public DescribeAppsResponseBodyResult setPrompts(java.util.List<java.util.Map<String, ?>> prompts) {
            this.prompts = prompts;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getPrompts() {
            return this.prompts;
        }

        public DescribeAppsResponseBodyResult setQueryProcessors(java.util.List<DescribeAppsResponseBodyResultQueryProcessors> queryProcessors) {
            this.queryProcessors = queryProcessors;
            return this;
        }
        public java.util.List<DescribeAppsResponseBodyResultQueryProcessors> getQueryProcessors() {
            return this.queryProcessors;
        }

        public DescribeAppsResponseBodyResult setQuota(DescribeAppsResponseBodyResultQuota quota) {
            this.quota = quota;
            return this;
        }
        public DescribeAppsResponseBodyResultQuota getQuota() {
            return this.quota;
        }

        public DescribeAppsResponseBodyResult setSchema(DescribeAppsResponseBodyResultSchema schema) {
            this.schema = schema;
            return this;
        }
        public DescribeAppsResponseBodyResultSchema getSchema() {
            return this.schema;
        }

        public DescribeAppsResponseBodyResult setSchemas(java.util.List<DescribeAppsResponseBodyResultSchemas> schemas) {
            this.schemas = schemas;
            return this;
        }
        public java.util.List<DescribeAppsResponseBodyResultSchemas> getSchemas() {
            return this.schemas;
        }

        public DescribeAppsResponseBodyResult setSecondRanks(java.util.List<DescribeAppsResponseBodyResultSecondRanks> secondRanks) {
            this.secondRanks = secondRanks;
            return this;
        }
        public java.util.List<DescribeAppsResponseBodyResultSecondRanks> getSecondRanks() {
            return this.secondRanks;
        }

        public DescribeAppsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAppsResponseBodyResult setSummaries(java.util.List<DescribeAppsResponseBodyResultSummaries> summaries) {
            this.summaries = summaries;
            return this;
        }
        public java.util.List<DescribeAppsResponseBodyResultSummaries> getSummaries() {
            return this.summaries;
        }

        public DescribeAppsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
