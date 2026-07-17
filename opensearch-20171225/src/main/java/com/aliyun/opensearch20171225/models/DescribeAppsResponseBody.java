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
     * <p>The response parameters.</p>
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
        /**
         * <p>The maximum length of the query clause.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("maxQueryClauseLength")
        public Integer maxQueryClauseLength;

        /**
         * <p>The timeout period for the cluster. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>750</p>
         */
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
        /**
         * <p>The field mappings.</p>
         */
        @NameInMap("fields")
        public java.util.List<java.util.Map<String, ?>> fields;

        /**
         * <p>The primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("keyField")
        public String keyField;

        /**
         * <p>The data source parameters.</p>
         */
        @NameInMap("parameters")
        public java.util.Map<String, ?> parameters;

        /**
         * <p>The data processing plug-ins for fields.</p>
         * <p>Plug-in name (name)</p>
         * <ul>
         * <li><p>JsonKeyValueExtractor</p>
         * </li>
         * <li><p>MultiValueSpliter</p>
         * </li>
         * <li><p>KeyValueExtractor</p>
         * </li>
         * <li><p>StringCatenateExtractor</p>
         * </li>
         * <li><p>HTMLTagRemover</p>
         * </li>
         * </ul>
         * <p>Plug-in parameters (parameters):</p>
         * <ul>
         * <li><p>JsonKeyValueExtractor</p>
         * </li>
         * <li><p>MultiValueSpliter</p>
         * </li>
         * <li><p>KeyValueExtractor</p>
         * </li>
         * <li><p>StringCatenateExtractor</p>
         * </li>
         * <li><p>HTMLTagRemover</p>
         * </li>
         * </ul>
         */
        @NameInMap("plugins")
        public java.util.Map<String, ?> plugins;

        /**
         * <p>The name of the wide table.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("schemaName")
        public String schemaName;

        /**
         * <p>The name of the table in the application.</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("tableName")
        public String tableName;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li><p>rds</p>
         * </li>
         * <li><p>odps</p>
         * </li>
         * <li><p>opensearch</p>
         * </li>
         * <li><p>polardb</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
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
        /**
         * <p>Structure 1</p>
         */
        @NameInMap("algo")
        public java.util.List<String> algo;

        /**
         * <p>The query processing features.</p>
         */
        @NameInMap("qp")
        public java.util.List<String> qp;

        /**
         * <p>The service features.</p>
         */
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
        /**
         * <p>The edition of the application. Valid values: standard (Standard Edition), advance (the legacy Premium Edition, which is not available for new applications), and enhanced (the new Premium Edition).</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The search features.</p>
         */
        @NameInMap("functions")
        public DescribeAppsResponseBodyResultDomainFunctions functions;

        /**
         * <p>The name in English.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
        /**
         * <p>Indicates whether this is the default expression.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("active")
        public Boolean active;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The expression, which can be an array or a string.</p>
         * 
         * <strong>example:</strong>
         * <p>String :&quot;random()*100+now()&quot;；
         * Array: [
         *     {
         *       &quot;attribute&quot;: &quot;static_bm25()&quot;,
         *       &quot;arg&quot;: &quot;&quot;,
         *       &quot;weight&quot;: 10
         *     }
         *   ]</p>
         */
        @NameInMap("meta")
        public Object meta;

        /**
         * <p>The name of the coarse-grained sorting expression.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The expression type. Valid values: STRUCT: a structured expression. STRING (default): a custom formula.</p>
         * <p>STRUCT: The content of the expression is a structure. STRING (default): You can configure a custom formula.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
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
        /**
         * <p>Indicates whether this is the default rule.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("active")
        public Boolean active;

        /**
         * <p>The industry category.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The industry. Valid values:</p>
         * <ul>
         * <li><p>GENERAL</p>
         * </li>
         * <li><p>ECOMMERCE</p>
         * </li>
         * <li><p>IT_CONTENT</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GENERAL</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The indexes.</p>
         */
        @NameInMap("indexes")
        public java.util.List<String> indexes;

        /**
         * <p>The name of the query analysis rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The features.</p>
         */
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
        /**
         * <p>The computing resources. Unit: logical compute unit (LCU).</p>
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
         * <p>The number of queries per second (QPS). This parameter is used in an earlier billing model.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("qps")
        public Integer qps;

        /**
         * <p>The specifications. Valid values:</p>
         * <ul>
         * <li><p>opensearch.share.junior: Basic</p>
         * </li>
         * <li><p>opensearch.share.common: Shared general-purpose</p>
         * </li>
         * <li><p>opensearch.share.compute: Shared compute-optimized</p>
         * </li>
         * <li><p>opensearch.share.storage: Shared storage-optimized</p>
         * </li>
         * <li><p>opensearch.private.common: Dedicated general-purpose</p>
         * </li>
         * <li><p>opensearch.private.compute: Dedicated compute-optimized</p>
         * </li>
         * <li><p>opensearch.private.storage: Dedicated storage-optimized</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>opensearch.share.common</p>
         */
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
        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><p>ASC</p>
         * </li>
         * <li><p>DESC</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        @NameInMap("direction")
        public String direction;

        /**
         * <p>The sort field.</p>
         * 
         * <strong>example:</strong>
         * <p>field1</p>
         */
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
        /**
         * <p>The attribute fields.</p>
         */
        @NameInMap("filterFields")
        public java.util.List<String> filterFields;

        /**
         * <p>The index fields.</p>
         */
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
        /**
         * <p>The document TTL field.</p>
         * 
         * <strong>example:</strong>
         * <p>text1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The time to live (TTL). Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
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
        /**
         * <p>The index sorting settings.</p>
         */
        @NameInMap("indexSortConfig")
        public java.util.List<DescribeAppsResponseBodyResultSchemaIndexSortConfig> indexSortConfig;

        /**
         * <p>The index schema.</p>
         */
        @NameInMap("indexes")
        public DescribeAppsResponseBodyResultSchemaIndexes indexes;

        /**
         * <p>The name of the wide table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The level-1 routing field.</p>
         * 
         * <strong>example:</strong>
         * <p>field1</p>
         */
        @NameInMap("routeField")
        public String routeField;

        /**
         * <p>The hot data values of the level-1 routing field.</p>
         */
        @NameInMap("routeFieldValues")
        public java.util.List<String> routeFieldValues;

        /**
         * <p>The level-2 routing field. This parameter takes effect only if the routeFieldValues parameter is configured. By default, the primary key of the wide table is used as the level-2 routing field.</p>
         * 
         * <strong>example:</strong>
         * <p>field2</p>
         */
        @NameInMap("secondRouteField")
        public String secondRouteField;

        /**
         * <p>The table schema.</p>
         */
        @NameInMap("tables")
        public java.util.Map<String, ?> tables;

        /**
         * <p>The document time-to-live (TTL) settings.</p>
         */
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
        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><p>ASC</p>
         * </li>
         * <li><p>DESC</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        @NameInMap("direction")
        public String direction;

        /**
         * <p>The sort field.</p>
         * 
         * <strong>example:</strong>
         * <p>fIeld1</p>
         */
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
        /**
         * <p>The attribute fields.</p>
         */
        @NameInMap("filterFields")
        public java.util.List<String> filterFields;

        /**
         * <p>The index fields.</p>
         */
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
        /**
         * <p>The document TTL field.</p>
         * 
         * <strong>example:</strong>
         * <p>fIeld1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The time to live (TTL). Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
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
        /**
         * <p>The index sorting settings.</p>
         */
        @NameInMap("indexSortConfig")
        public java.util.List<DescribeAppsResponseBodyResultSchemasIndexSortConfig> indexSortConfig;

        /**
         * <p>The index schema.</p>
         */
        @NameInMap("indexes")
        public DescribeAppsResponseBodyResultSchemasIndexes indexes;

        /**
         * <p>The name of the wide table.</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The level-1 routing field.</p>
         * 
         * <strong>example:</strong>
         * <p>field1</p>
         */
        @NameInMap("routeField")
        public String routeField;

        /**
         * <p>The hot data values of the level-1 routing field.</p>
         */
        @NameInMap("routeFieldValues")
        public java.util.List<String> routeFieldValues;

        /**
         * <p>The level-2 routing field. This parameter takes effect only if the routeFieldValues parameter is configured. By default, the primary key of the wide table is used as the level-2 routing field.</p>
         * 
         * <strong>example:</strong>
         * <p>field2</p>
         */
        @NameInMap("secondRouteField")
        public String secondRouteField;

        /**
         * <p>The table schema.</p>
         */
        @NameInMap("tables")
        public java.util.Map<String, ?> tables;

        /**
         * <p>The document TTL settings.</p>
         */
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
        /**
         * <p>Indicates whether this is the default expression.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("active")
        public Boolean active;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The fine-grained sorting expression. You can define an expression that consists of fields, feature functions, and mathematical functions to implement complex sorting logic.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;cate_id &gt; 0 and cate_id &lt; 1000&quot;</p>
         */
        @NameInMap("meta")
        public Object meta;

        /**
         * <p>The name of the fine-grained sorting expression.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
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
        /**
         * <p>The HTML tag for highlighting.</p>
         * 
         * <strong>example:</strong>
         * <p>em</p>
         */
        @NameInMap("element")
        public String element;

        /**
         * <p>The connector that is used to connect segments.</p>
         * 
         * <strong>example:</strong>
         * <p>...</p>
         */
        @NameInMap("ellipsis")
        public String ellipsis;

        /**
         * <p>The field.</p>
         * 
         * <strong>example:</strong>
         * <p>field1</p>
         */
        @NameInMap("field")
        public String field;

        /**
         * <p>The length of the segment. Valid values: 1 to 300.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("len")
        public Integer len;

        /**
         * <p>The number of segments. Valid values: 1 to 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
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
        /**
         * <p>The summary settings.</p>
         */
        @NameInMap("meta")
        public java.util.List<DescribeAppsResponseBodyResultSummariesMeta> meta;

        /**
         * <p>The name of the summary group.</p>
         * 
         * <strong>example:</strong>
         * <p>fefault</p>
         */
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
        /**
         * <p>Indicates whether automatic switchover is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoSwitch")
        public Boolean autoSwitch;

        /**
         * <p>The cluster settings.</p>
         */
        @NameInMap("cluster")
        public DescribeAppsResponseBodyResultCluster cluster;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc_sh_domain_1</p>
         */
        @NameInMap("clusterName")
        public String clusterName;

        /**
         * <p>The data source settings.</p>
         */
        @NameInMap("dataSources")
        public java.util.List<DescribeAppsResponseBodyResultDataSources> dataSources;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The industry. Valid values:</p>
         * <ul>
         * <li><p>GENERAL</p>
         * </li>
         * <li><p>ECOMMERCE</p>
         * </li>
         * <li><p>IT_CONTENT</p>
         * </li>
         * </ul>
         */
        @NameInMap("domain")
        public DescribeAppsResponseBodyResultDomain domain;

        /**
         * <p>The default display fields.</p>
         */
        @NameInMap("fetchFields")
        public java.util.List<String> fetchFields;

        /**
         * <p>The coarse-grained sorting settings.</p>
         */
        @NameInMap("firstRanks")
        public java.util.List<DescribeAppsResponseBodyResultFirstRanks> firstRanks;

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>100302881</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The Large Language Model (LLM) settings for fields.</p>
         */
        @NameInMap("interpretations")
        public java.util.Map<String, ?> interpretations;

        /**
         * <p>Indicates whether the version is an online version.</p>
         * 
         * <strong>example:</strong>
         * <p>12333</p>
         */
        @NameInMap("isCurrent")
        public Boolean isCurrent;

        /**
         * <p>The progress of data import in percentage. For example, a value of 83 indicates 83%.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("progressPercent")
        public Integer progressPercent;

        /**
         * <p>The prompt settings.</p>
         */
        @NameInMap("prompts")
        public java.util.List<java.util.Map<String, ?>> prompts;

        /**
         * <p>The query analysis settings.</p>
         */
        @NameInMap("queryProcessors")
        public java.util.List<DescribeAppsResponseBodyResultQueryProcessors> queryProcessors;

        /**
         * <p>The quota information.</p>
         */
        @NameInMap("quota")
        public DescribeAppsResponseBodyResultQuota quota;

        @NameInMap("realtimeShared")
        public Boolean realtimeShared;

        /**
         * <p>The application schema.</p>
         */
        @NameInMap("schema")
        public DescribeAppsResponseBodyResultSchema schema;

        /**
         * <p>The schema of a non-partitioned table.</p>
         */
        @NameInMap("schemas")
        public java.util.List<DescribeAppsResponseBodyResultSchemas> schemas;

        /**
         * <p>The fine-grained sorting settings.</p>
         */
        @NameInMap("secondRanks")
        public java.util.List<DescribeAppsResponseBodyResultSecondRanks> secondRanks;

        /**
         * <p>The status of the version. Valid values:</p>
         * <ul>
         * <li><p>ok: The version is normal.</p>
         * </li>
         * <li><p>stopped: The version is paused.</p>
         * </li>
         * <li><p>frozen: The version is frozen.</p>
         * </li>
         * <li><p>initializing: The version is being initialized.</p>
         * </li>
         * <li><p>unavailable: The version is invalid.</p>
         * </li>
         * <li><p>data_waiting: Data is pending initialization.</p>
         * </li>
         * <li><p>data_preparing: Data is being initialized.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The search result summary settings.</p>
         */
        @NameInMap("summaries")
        public java.util.List<DescribeAppsResponseBodyResultSummaries> summaries;

        /**
         * <p>The type of the application. Valid values:</p>
         * <ul>
         * <li><p>standard: a Standard Edition application.</p>
         * </li>
         * <li><p>advance: an Advanced Edition application of an old version. This edition is not supported for new applications.</p>
         * </li>
         * <li><p>enhanced: a new version of Advanced Edition.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enhanced</p>
         */
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

        public DescribeAppsResponseBodyResult setRealtimeShared(Boolean realtimeShared) {
            this.realtimeShared = realtimeShared;
            return this;
        }
        public Boolean getRealtimeShared() {
            return this.realtimeShared;
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
