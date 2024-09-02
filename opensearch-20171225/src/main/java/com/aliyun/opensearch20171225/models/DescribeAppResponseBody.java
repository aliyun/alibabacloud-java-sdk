// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeAppResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>33477D76-C380-1D84-A4AD-043F52876CB1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the version.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("result")
    public DescribeAppResponseBodyResult result;

    public static DescribeAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppResponseBody self = new DescribeAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppResponseBody setResult(DescribeAppResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAppResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAppResponseBodyResultCluster extends TeaModel {
        @NameInMap("maxQueryClauseLength")
        public Integer maxQueryClauseLength;

        @NameInMap("maxTimeoutMS")
        public Integer maxTimeoutMS;

        public static DescribeAppResponseBodyResultCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultCluster self = new DescribeAppResponseBodyResultCluster();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultCluster setMaxQueryClauseLength(Integer maxQueryClauseLength) {
            this.maxQueryClauseLength = maxQueryClauseLength;
            return this;
        }
        public Integer getMaxQueryClauseLength() {
            return this.maxQueryClauseLength;
        }

        public DescribeAppResponseBodyResultCluster setMaxTimeoutMS(Integer maxTimeoutMS) {
            this.maxTimeoutMS = maxTimeoutMS;
            return this;
        }
        public Integer getMaxTimeoutMS() {
            return this.maxTimeoutMS;
        }

    }

    public static class DescribeAppResponseBodyResultDataSources extends TeaModel {
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

        public static DescribeAppResponseBodyResultDataSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultDataSources self = new DescribeAppResponseBodyResultDataSources();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultDataSources setFields(java.util.List<java.util.Map<String, ?>> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getFields() {
            return this.fields;
        }

        public DescribeAppResponseBodyResultDataSources setKeyField(String keyField) {
            this.keyField = keyField;
            return this;
        }
        public String getKeyField() {
            return this.keyField;
        }

        public DescribeAppResponseBodyResultDataSources setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public DescribeAppResponseBodyResultDataSources setPlugins(java.util.Map<String, ?> plugins) {
            this.plugins = plugins;
            return this;
        }
        public java.util.Map<String, ?> getPlugins() {
            return this.plugins;
        }

        public DescribeAppResponseBodyResultDataSources setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeAppResponseBodyResultDataSources setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeAppResponseBodyResultDataSources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeAppResponseBodyResultDomainFunctions extends TeaModel {
        /**
         * <p>Algorithm structure</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("algo")
        public java.util.List<String> algo;

        /**
         * <p>Queryprocessor description</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("qp")
        public java.util.List<String> qp;

        /**
         * <p>Function description</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("service")
        public java.util.List<String> service;

        public static DescribeAppResponseBodyResultDomainFunctions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultDomainFunctions self = new DescribeAppResponseBodyResultDomainFunctions();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultDomainFunctions setAlgo(java.util.List<String> algo) {
            this.algo = algo;
            return this;
        }
        public java.util.List<String> getAlgo() {
            return this.algo;
        }

        public DescribeAppResponseBodyResultDomainFunctions setQp(java.util.List<String> qp) {
            this.qp = qp;
            return this;
        }
        public java.util.List<String> getQp() {
            return this.qp;
        }

        public DescribeAppResponseBodyResultDomainFunctions setService(java.util.List<String> service) {
            this.service = service;
            return this;
        }
        public java.util.List<String> getService() {
            return this.service;
        }

    }

    public static class DescribeAppResponseBodyResultDomain extends TeaModel {
        /**
         * <p>The category. By default, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>search functions</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("functions")
        public DescribeAppResponseBodyResultDomainFunctions functions;

        /**
         * <p>The name</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        public static DescribeAppResponseBodyResultDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultDomain self = new DescribeAppResponseBodyResultDomain();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultDomain setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeAppResponseBodyResultDomain setFunctions(DescribeAppResponseBodyResultDomainFunctions functions) {
            this.functions = functions;
            return this;
        }
        public DescribeAppResponseBodyResultDomainFunctions getFunctions() {
            return this.functions;
        }

        public DescribeAppResponseBodyResultDomain setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeAppResponseBodyResultFirstRanks extends TeaModel {
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

        public static DescribeAppResponseBodyResultFirstRanks build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultFirstRanks self = new DescribeAppResponseBodyResultFirstRanks();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultFirstRanks setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public DescribeAppResponseBodyResultFirstRanks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAppResponseBodyResultFirstRanks setMeta(Object meta) {
            this.meta = meta;
            return this;
        }
        public Object getMeta() {
            return this.meta;
        }

        public DescribeAppResponseBodyResultFirstRanks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppResponseBodyResultFirstRanks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeAppResponseBodyResultQueryProcessors extends TeaModel {
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

        public static DescribeAppResponseBodyResultQueryProcessors build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultQueryProcessors self = new DescribeAppResponseBodyResultQueryProcessors();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultQueryProcessors setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public DescribeAppResponseBodyResultQueryProcessors setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeAppResponseBodyResultQueryProcessors setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeAppResponseBodyResultQueryProcessors setIndexes(java.util.List<String> indexes) {
            this.indexes = indexes;
            return this;
        }
        public java.util.List<String> getIndexes() {
            return this.indexes;
        }

        public DescribeAppResponseBodyResultQueryProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppResponseBodyResultQueryProcessors setProcessors(java.util.List<java.util.Map<String, ?>> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getProcessors() {
            return this.processors;
        }

    }

    public static class DescribeAppResponseBodyResultQuota extends TeaModel {
        /**
         * <p>The computing resources. Unit: logical computing units (LCUs).</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("computeResource")
        public Integer computeResource;

        /**
         * <p>The storage capacity. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("docSize")
        public Integer docSize;

        /**
         * <p>The number of search requests per second. You are charged based on the number of search requests per second in the earlier billing model.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("qps")
        public Integer qps;

        /**
         * <p>The specifications of the application. Valid values:</p>
         * <ul>
         * <li>opensearch.share.junior: basic</li>
         * <li>opensearch.share.common: shared general-purpose</li>
         * <li>opensearch.share.compute: shared computing</li>
         * <li>opensearch.share.storage: shared storage</li>
         * <li>opensearch.private.common: exclusive general-purpose</li>
         * <li>opensearch.private.compute: exclusive computing</li>
         * <li>opensearch.private.storage: exclusive storage</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>opensearch.share.common</p>
         */
        @NameInMap("spec")
        public String spec;

        public static DescribeAppResponseBodyResultQuota build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultQuota self = new DescribeAppResponseBodyResultQuota();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultQuota setComputeResource(Integer computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public Integer getComputeResource() {
            return this.computeResource;
        }

        public DescribeAppResponseBodyResultQuota setDocSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }
        public Integer getDocSize() {
            return this.docSize;
        }

        public DescribeAppResponseBodyResultQuota setQps(Integer qps) {
            this.qps = qps;
            return this;
        }
        public Integer getQps() {
            return this.qps;
        }

        public DescribeAppResponseBodyResultQuota setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class DescribeAppResponseBodyResultSchemaIndexSortConfig extends TeaModel {
        @NameInMap("direction")
        public String direction;

        @NameInMap("field")
        public String field;

        public static DescribeAppResponseBodyResultSchemaIndexSortConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultSchemaIndexSortConfig self = new DescribeAppResponseBodyResultSchemaIndexSortConfig();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultSchemaIndexSortConfig setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DescribeAppResponseBodyResultSchemaIndexSortConfig setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class DescribeAppResponseBodyResultSchemaIndexes extends TeaModel {
        @NameInMap("filterFields")
        public java.util.List<String> filterFields;

        @NameInMap("searchFields")
        public java.util.Map<String, ?> searchFields;

        public static DescribeAppResponseBodyResultSchemaIndexes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultSchemaIndexes self = new DescribeAppResponseBodyResultSchemaIndexes();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultSchemaIndexes setFilterFields(java.util.List<String> filterFields) {
            this.filterFields = filterFields;
            return this;
        }
        public java.util.List<String> getFilterFields() {
            return this.filterFields;
        }

        public DescribeAppResponseBodyResultSchemaIndexes setSearchFields(java.util.Map<String, ?> searchFields) {
            this.searchFields = searchFields;
            return this;
        }
        public java.util.Map<String, ?> getSearchFields() {
            return this.searchFields;
        }

    }

    public static class DescribeAppResponseBodyResultSchemaTtlField extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("ttl")
        public Long ttl;

        public static DescribeAppResponseBodyResultSchemaTtlField build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultSchemaTtlField self = new DescribeAppResponseBodyResultSchemaTtlField();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultSchemaTtlField setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppResponseBodyResultSchemaTtlField setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

    }

    public static class DescribeAppResponseBodyResultSchema extends TeaModel {
        @NameInMap("indexSortConfig")
        public java.util.List<DescribeAppResponseBodyResultSchemaIndexSortConfig> indexSortConfig;

        @NameInMap("indexes")
        public DescribeAppResponseBodyResultSchemaIndexes indexes;

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
        public DescribeAppResponseBodyResultSchemaTtlField ttlField;

        public static DescribeAppResponseBodyResultSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultSchema self = new DescribeAppResponseBodyResultSchema();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultSchema setIndexSortConfig(java.util.List<DescribeAppResponseBodyResultSchemaIndexSortConfig> indexSortConfig) {
            this.indexSortConfig = indexSortConfig;
            return this;
        }
        public java.util.List<DescribeAppResponseBodyResultSchemaIndexSortConfig> getIndexSortConfig() {
            return this.indexSortConfig;
        }

        public DescribeAppResponseBodyResultSchema setIndexes(DescribeAppResponseBodyResultSchemaIndexes indexes) {
            this.indexes = indexes;
            return this;
        }
        public DescribeAppResponseBodyResultSchemaIndexes getIndexes() {
            return this.indexes;
        }

        public DescribeAppResponseBodyResultSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppResponseBodyResultSchema setRouteField(String routeField) {
            this.routeField = routeField;
            return this;
        }
        public String getRouteField() {
            return this.routeField;
        }

        public DescribeAppResponseBodyResultSchema setRouteFieldValues(java.util.List<String> routeFieldValues) {
            this.routeFieldValues = routeFieldValues;
            return this;
        }
        public java.util.List<String> getRouteFieldValues() {
            return this.routeFieldValues;
        }

        public DescribeAppResponseBodyResultSchema setSecondRouteField(String secondRouteField) {
            this.secondRouteField = secondRouteField;
            return this;
        }
        public String getSecondRouteField() {
            return this.secondRouteField;
        }

        public DescribeAppResponseBodyResultSchema setTables(java.util.Map<String, ?> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.Map<String, ?> getTables() {
            return this.tables;
        }

        public DescribeAppResponseBodyResultSchema setTtlField(DescribeAppResponseBodyResultSchemaTtlField ttlField) {
            this.ttlField = ttlField;
            return this;
        }
        public DescribeAppResponseBodyResultSchemaTtlField getTtlField() {
            return this.ttlField;
        }

    }

    public static class DescribeAppResponseBodyResultSchemasIndexSortConfig extends TeaModel {
        @NameInMap("direction")
        public String direction;

        @NameInMap("field")
        public String field;

        public static DescribeAppResponseBodyResultSchemasIndexSortConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultSchemasIndexSortConfig self = new DescribeAppResponseBodyResultSchemasIndexSortConfig();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultSchemasIndexSortConfig setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DescribeAppResponseBodyResultSchemasIndexSortConfig setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class DescribeAppResponseBodyResultSchemasIndexes extends TeaModel {
        @NameInMap("filterFields")
        public java.util.List<String> filterFields;

        @NameInMap("searchFields")
        public java.util.Map<String, ?> searchFields;

        public static DescribeAppResponseBodyResultSchemasIndexes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultSchemasIndexes self = new DescribeAppResponseBodyResultSchemasIndexes();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultSchemasIndexes setFilterFields(java.util.List<String> filterFields) {
            this.filterFields = filterFields;
            return this;
        }
        public java.util.List<String> getFilterFields() {
            return this.filterFields;
        }

        public DescribeAppResponseBodyResultSchemasIndexes setSearchFields(java.util.Map<String, ?> searchFields) {
            this.searchFields = searchFields;
            return this;
        }
        public java.util.Map<String, ?> getSearchFields() {
            return this.searchFields;
        }

    }

    public static class DescribeAppResponseBodyResultSchemasTtlField extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("ttl")
        public Long ttl;

        public static DescribeAppResponseBodyResultSchemasTtlField build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultSchemasTtlField self = new DescribeAppResponseBodyResultSchemasTtlField();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultSchemasTtlField setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppResponseBodyResultSchemasTtlField setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

    }

    public static class DescribeAppResponseBodyResultSchemas extends TeaModel {
        @NameInMap("indexSortConfig")
        public java.util.List<DescribeAppResponseBodyResultSchemasIndexSortConfig> indexSortConfig;

        @NameInMap("indexes")
        public DescribeAppResponseBodyResultSchemasIndexes indexes;

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
        public DescribeAppResponseBodyResultSchemasTtlField ttlField;

        public static DescribeAppResponseBodyResultSchemas build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultSchemas self = new DescribeAppResponseBodyResultSchemas();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultSchemas setIndexSortConfig(java.util.List<DescribeAppResponseBodyResultSchemasIndexSortConfig> indexSortConfig) {
            this.indexSortConfig = indexSortConfig;
            return this;
        }
        public java.util.List<DescribeAppResponseBodyResultSchemasIndexSortConfig> getIndexSortConfig() {
            return this.indexSortConfig;
        }

        public DescribeAppResponseBodyResultSchemas setIndexes(DescribeAppResponseBodyResultSchemasIndexes indexes) {
            this.indexes = indexes;
            return this;
        }
        public DescribeAppResponseBodyResultSchemasIndexes getIndexes() {
            return this.indexes;
        }

        public DescribeAppResponseBodyResultSchemas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppResponseBodyResultSchemas setRouteField(String routeField) {
            this.routeField = routeField;
            return this;
        }
        public String getRouteField() {
            return this.routeField;
        }

        public DescribeAppResponseBodyResultSchemas setRouteFieldValues(java.util.List<String> routeFieldValues) {
            this.routeFieldValues = routeFieldValues;
            return this;
        }
        public java.util.List<String> getRouteFieldValues() {
            return this.routeFieldValues;
        }

        public DescribeAppResponseBodyResultSchemas setSecondRouteField(String secondRouteField) {
            this.secondRouteField = secondRouteField;
            return this;
        }
        public String getSecondRouteField() {
            return this.secondRouteField;
        }

        public DescribeAppResponseBodyResultSchemas setTables(java.util.Map<String, ?> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.Map<String, ?> getTables() {
            return this.tables;
        }

        public DescribeAppResponseBodyResultSchemas setTtlField(DescribeAppResponseBodyResultSchemasTtlField ttlField) {
            this.ttlField = ttlField;
            return this;
        }
        public DescribeAppResponseBodyResultSchemasTtlField getTtlField() {
            return this.ttlField;
        }

    }

    public static class DescribeAppResponseBodyResultSecondRanks extends TeaModel {
        @NameInMap("active")
        public Boolean active;

        @NameInMap("description")
        public String description;

        @NameInMap("meta")
        public Object meta;

        @NameInMap("name")
        public String name;

        public static DescribeAppResponseBodyResultSecondRanks build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultSecondRanks self = new DescribeAppResponseBodyResultSecondRanks();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultSecondRanks setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public DescribeAppResponseBodyResultSecondRanks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAppResponseBodyResultSecondRanks setMeta(Object meta) {
            this.meta = meta;
            return this;
        }
        public Object getMeta() {
            return this.meta;
        }

        public DescribeAppResponseBodyResultSecondRanks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeAppResponseBodyResultSummariesMeta extends TeaModel {
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

        public static DescribeAppResponseBodyResultSummariesMeta build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultSummariesMeta self = new DescribeAppResponseBodyResultSummariesMeta();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultSummariesMeta setElement(String element) {
            this.element = element;
            return this;
        }
        public String getElement() {
            return this.element;
        }

        public DescribeAppResponseBodyResultSummariesMeta setEllipsis(String ellipsis) {
            this.ellipsis = ellipsis;
            return this;
        }
        public String getEllipsis() {
            return this.ellipsis;
        }

        public DescribeAppResponseBodyResultSummariesMeta setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public DescribeAppResponseBodyResultSummariesMeta setLen(Integer len) {
            this.len = len;
            return this;
        }
        public Integer getLen() {
            return this.len;
        }

        public DescribeAppResponseBodyResultSummariesMeta setSnippet(String snippet) {
            this.snippet = snippet;
            return this;
        }
        public String getSnippet() {
            return this.snippet;
        }

    }

    public static class DescribeAppResponseBodyResultSummaries extends TeaModel {
        @NameInMap("meta")
        public java.util.List<DescribeAppResponseBodyResultSummariesMeta> meta;

        @NameInMap("name")
        public String name;

        public static DescribeAppResponseBodyResultSummaries build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultSummaries self = new DescribeAppResponseBodyResultSummaries();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResultSummaries setMeta(java.util.List<DescribeAppResponseBodyResultSummariesMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<DescribeAppResponseBodyResultSummariesMeta> getMeta() {
            return this.meta;
        }

        public DescribeAppResponseBodyResultSummaries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeAppResponseBodyResult extends TeaModel {
        /**
         * <p>Indicates whether the version is automatically published to the online environment.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoSwitch")
        public Boolean autoSwitch;

        @NameInMap("cluster")
        public DescribeAppResponseBodyResultCluster cluster;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("clusterName")
        public String clusterName;

        @NameInMap("dataSources")
        public java.util.List<DescribeAppResponseBodyResultDataSources> dataSources;

        /**
         * <p>The description of the version.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The type of the industry. Valid values:</p>
         * <ul>
         * <li>GENERAL</li>
         * <li>ECOMMERCE</li>
         * <li>IT_CONTENT</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GENERAL</p>
         */
        @NameInMap("domain")
        public DescribeAppResponseBodyResultDomain domain;

        /**
         * <p>The default display fields.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("fetchFields")
        public java.util.List<String> fetchFields;

        @NameInMap("firstRanks")
        public java.util.List<DescribeAppResponseBodyResultFirstRanks> firstRanks;

        /**
         * <p>The ID of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>100303063</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("interpretations")
        public java.util.Map<String, ?> interpretations;

        @NameInMap("isCurrent")
        public Boolean isCurrent;

        /**
         * <p>The progress of data import, in percentage. For example, a value of 83 indicates 83%.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("progressPercent")
        public Integer progressPercent;

        @NameInMap("prompts")
        public java.util.List<java.util.Map<String, ?>> prompts;

        @NameInMap("queryProcessors")
        public java.util.List<DescribeAppResponseBodyResultQueryProcessors> queryProcessors;

        /**
         * <p>The quota information about the version.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("quota")
        public DescribeAppResponseBodyResultQuota quota;

        /**
         * <p>The application schema.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("schema")
        public DescribeAppResponseBodyResultSchema schema;

        @NameInMap("schemas")
        public java.util.List<DescribeAppResponseBodyResultSchemas> schemas;

        @NameInMap("secondRanks")
        public java.util.List<DescribeAppResponseBodyResultSecondRanks> secondRanks;

        /**
         * <p>The status of the version. Valid values:</p>
         * <ul>
         * <li>ok</li>
         * <li>stopped</li>
         * <li>frozen</li>
         * <li>initializing</li>
         * <li>unavailable</li>
         * <li>data_waiting</li>
         * <li>data_preparing</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("summaries")
        public java.util.List<DescribeAppResponseBodyResultSummaries> summaries;

        /**
         * <p>The type of the application. Valid values:</p>
         * <ul>
         * <li>standard: a standard application.</li>
         * <li>advance: an advanced application which is of an old application type. New applications cannot be of this type.</li>
         * <li>enhanced: an advanced application which is of a new application type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enhanced</p>
         */
        @NameInMap("type")
        public String type;

        public static DescribeAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResult self = new DescribeAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyResult setAutoSwitch(Boolean autoSwitch) {
            this.autoSwitch = autoSwitch;
            return this;
        }
        public Boolean getAutoSwitch() {
            return this.autoSwitch;
        }

        public DescribeAppResponseBodyResult setCluster(DescribeAppResponseBodyResultCluster cluster) {
            this.cluster = cluster;
            return this;
        }
        public DescribeAppResponseBodyResultCluster getCluster() {
            return this.cluster;
        }

        public DescribeAppResponseBodyResult setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeAppResponseBodyResult setDataSources(java.util.List<DescribeAppResponseBodyResultDataSources> dataSources) {
            this.dataSources = dataSources;
            return this;
        }
        public java.util.List<DescribeAppResponseBodyResultDataSources> getDataSources() {
            return this.dataSources;
        }

        public DescribeAppResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAppResponseBodyResult setDomain(DescribeAppResponseBodyResultDomain domain) {
            this.domain = domain;
            return this;
        }
        public DescribeAppResponseBodyResultDomain getDomain() {
            return this.domain;
        }

        public DescribeAppResponseBodyResult setFetchFields(java.util.List<String> fetchFields) {
            this.fetchFields = fetchFields;
            return this;
        }
        public java.util.List<String> getFetchFields() {
            return this.fetchFields;
        }

        public DescribeAppResponseBodyResult setFirstRanks(java.util.List<DescribeAppResponseBodyResultFirstRanks> firstRanks) {
            this.firstRanks = firstRanks;
            return this;
        }
        public java.util.List<DescribeAppResponseBodyResultFirstRanks> getFirstRanks() {
            return this.firstRanks;
        }

        public DescribeAppResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeAppResponseBodyResult setInterpretations(java.util.Map<String, ?> interpretations) {
            this.interpretations = interpretations;
            return this;
        }
        public java.util.Map<String, ?> getInterpretations() {
            return this.interpretations;
        }

        public DescribeAppResponseBodyResult setIsCurrent(Boolean isCurrent) {
            this.isCurrent = isCurrent;
            return this;
        }
        public Boolean getIsCurrent() {
            return this.isCurrent;
        }

        public DescribeAppResponseBodyResult setProgressPercent(Integer progressPercent) {
            this.progressPercent = progressPercent;
            return this;
        }
        public Integer getProgressPercent() {
            return this.progressPercent;
        }

        public DescribeAppResponseBodyResult setPrompts(java.util.List<java.util.Map<String, ?>> prompts) {
            this.prompts = prompts;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getPrompts() {
            return this.prompts;
        }

        public DescribeAppResponseBodyResult setQueryProcessors(java.util.List<DescribeAppResponseBodyResultQueryProcessors> queryProcessors) {
            this.queryProcessors = queryProcessors;
            return this;
        }
        public java.util.List<DescribeAppResponseBodyResultQueryProcessors> getQueryProcessors() {
            return this.queryProcessors;
        }

        public DescribeAppResponseBodyResult setQuota(DescribeAppResponseBodyResultQuota quota) {
            this.quota = quota;
            return this;
        }
        public DescribeAppResponseBodyResultQuota getQuota() {
            return this.quota;
        }

        public DescribeAppResponseBodyResult setSchema(DescribeAppResponseBodyResultSchema schema) {
            this.schema = schema;
            return this;
        }
        public DescribeAppResponseBodyResultSchema getSchema() {
            return this.schema;
        }

        public DescribeAppResponseBodyResult setSchemas(java.util.List<DescribeAppResponseBodyResultSchemas> schemas) {
            this.schemas = schemas;
            return this;
        }
        public java.util.List<DescribeAppResponseBodyResultSchemas> getSchemas() {
            return this.schemas;
        }

        public DescribeAppResponseBodyResult setSecondRanks(java.util.List<DescribeAppResponseBodyResultSecondRanks> secondRanks) {
            this.secondRanks = secondRanks;
            return this;
        }
        public java.util.List<DescribeAppResponseBodyResultSecondRanks> getSecondRanks() {
            return this.secondRanks;
        }

        public DescribeAppResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAppResponseBodyResult setSummaries(java.util.List<DescribeAppResponseBodyResultSummaries> summaries) {
            this.summaries = summaries;
            return this;
        }
        public java.util.List<DescribeAppResponseBodyResultSummaries> getSummaries() {
            return this.summaries;
        }

        public DescribeAppResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
