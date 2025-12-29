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
         * <p>The timeout period. Unit: milliseconds.</p>
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
         * <p>The information about field mappings.</p>
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
         * <p>The information about the data source.</p>
         */
        @NameInMap("parameters")
        public java.util.Map<String, ?> parameters;

        /**
         * <p>The plug-ins that are used for data processing.</p>
         * <p>name:</p>
         * <ul>
         * <li>JsonKeyValueExtractor</li>
         * <li>MultiValueSpliter</li>
         * <li>KeyValueExtractor</li>
         * <li>StringCatenateExtractor</li>
         * <li>HTMLTagRemover</li>
         * </ul>
         * <p>parameters:</p>
         * <ul>
         * <li>JsonKeyValueExtractor</li>
         * <li>MultiValueSpliter</li>
         * <li>KeyValueExtractor</li>
         * <li>StringCatenateExtractor</li>
         * <li>HTMLTagRemover</li>
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
         * <li>rds</li>
         * <li>odps</li>
         * <li>opensearch</li>
         * <li>polardb</li>
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
         * <p>Structure 1.</p>
         */
        @NameInMap("algo")
        public java.util.List<String> algo;

        /**
         * <p>Information 1.</p>
         */
        @NameInMap("qp")
        public java.util.List<String> qp;

        /**
         * <p>Feature 1.</p>
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
         * <p>The type of the edition. Valid values: standard, advance, and enhanced. A value of standard indicates a standard edition. A value of advance indicates an advanced edition which is of an old version. New version is not supported for this edition. A value of enhanced indicates an advanced edition which is of a new version.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The search results.</p>
         */
        @NameInMap("functions")
        public DescribeAppsResponseBodyResultDomainFunctions functions;

        /**
         * <p>The name (in English).</p>
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
         * <p>Indicates whether the expression is the default one.</p>
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
         * <p>The information about the expression. The information is displayed in the array or string format.</p>
         * 
         * <strong>example:</strong>
         * <p>String :&quot;random()*100+now()&quot;;
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
         * <p>The name of the rough sort expression.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The expression type. Valid values:</p>
         * <p>STRUCT: The content of the expression is a structure. STRING (default): a custom formula.</p>
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
         * <p>Indicates whether the rule is the default one.</p>
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
        public String domain;

        /**
         * <p>The indexes.</p>
         */
        @NameInMap("indexes")
        public java.util.List<String> indexes;

        /**
         * <p>The rule name.</p>
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
         * <p>The computing resources. Unit: logical computing unit (LCU).</p>
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
         * <p>The specifications. Valid values:</p>
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
         * <p>The sort method. Valid values:</p>
         * <ul>
         * <li>ASC</li>
         * <li>DESC</li>
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
         * <p>The document clearing field.</p>
         * 
         * <strong>example:</strong>
         * <p>text1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The TTL. Unit: milliseconds.</p>
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
         * <p>The sort configurations.</p>
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
         * <p>The hot values of the level-1 routing field.</p>
         */
        @NameInMap("routeFieldValues")
        public java.util.List<String> routeFieldValues;

        /**
         * <p>The level-2 routing field. This parameter is returned if the routeFieldValues parameter is returned. By default, the wide-table primary key field is used as the level-2 routing field.</p>
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
         * <p>The document clearing configurations.</p>
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
         * <p>The sort method. Valid values:</p>
         * <ul>
         * <li>ASC</li>
         * <li>DESC</li>
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
         * <p>The document time field.</p>
         * 
         * <strong>example:</strong>
         * <p>fIeld1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The TTL. Unit: milliseconds.</p>
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
         * <p>The sort configurations.</p>
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
         * <p>The hot values of the level-1 routing field.</p>
         */
        @NameInMap("routeFieldValues")
        public java.util.List<String> routeFieldValues;

        /**
         * <p>The level-2 routing field. This parameter is returned if the routeFieldValues parameter is returned. By default, the wide-table primary key field is used as the level-2 routing field.</p>
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
         * <p>The document clearing configurations.</p>
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
         * <p>Indicates whether the expression is the default one.</p>
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
         * <p>The fine sort expression. You can define an expression that consists of fields, feature functions, and mathematical functions to implement complex sort logic.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;cate_id &gt; 0 and cate_id &lt; 1000&quot;</p>
         */
        @NameInMap("meta")
        public Object meta;

        /**
         * <p>The name of the fine sort expression.</p>
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
         * <p>The element that is used for highlighting.</p>
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
         * <p>The summary configurations.</p>
         */
        @NameInMap("meta")
        public java.util.List<DescribeAppsResponseBodyResultSummariesMeta> meta;

        /**
         * <p>The group name.</p>
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
         * <p>Indicates whether the version is automatically switched to an online version.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoSwitch")
        public Boolean autoSwitch;

        /**
         * <p>The capability opening configurations.</p>
         */
        @NameInMap("cluster")
        public DescribeAppsResponseBodyResultCluster cluster;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc_sh_domain_1</p>
         */
        @NameInMap("clusterName")
        public String clusterName;

        /**
         * <p>The configurations of data sources.</p>
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
         * <p>The type of the industry. Valid values:</p>
         * <ul>
         * <li>GENERAL</li>
         * <li>ECOMMERCE</li>
         * <li>IT_CONTENT</li>
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
         * <p>The configurations of rough sort.</p>
         */
        @NameInMap("firstRanks")
        public java.util.List<DescribeAppsResponseBodyResultFirstRanks> firstRanks;

        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100302881</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The field model.</p>
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
         * <p>The progress of data import, in percentage. For example, a value of 83 indicates 83%.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("progressPercent")
        public Integer progressPercent;

        /**
         * <p>The prompt configurations.</p>
         */
        @NameInMap("prompts")
        public java.util.List<java.util.Map<String, ?>> prompts;

        /**
         * <p>The query intent understanding configurations.</p>
         */
        @NameInMap("queryProcessors")
        public java.util.List<DescribeAppsResponseBodyResultQueryProcessors> queryProcessors;

        /**
         * <p>The quota information.</p>
         */
        @NameInMap("quota")
        public DescribeAppsResponseBodyResultQuota quota;

        /**
         * <p>The application schema.</p>
         */
        @NameInMap("schema")
        public DescribeAppsResponseBodyResultSchema schema;

        /**
         * <p>The single-table schema.</p>
         */
        @NameInMap("schemas")
        public java.util.List<DescribeAppsResponseBodyResultSchemas> schemas;

        /**
         * <p>The configurations of fine sort.</p>
         */
        @NameInMap("secondRanks")
        public java.util.List<DescribeAppsResponseBodyResultSecondRanks> secondRanks;

        /**
         * <p>The status of the version. Valid values:</p>
         * <ul>
         * <li>ok: The version is normal.</li>
         * <li>stopped: The version is suspended.</li>
         * <li>frozen: The version is frozen.</li>
         * <li>initializing: The version is being initialized.</li>
         * <li>unavailable: The version is invalid.</li>
         * <li>data_waiting: Data is to be initialized.</li>
         * <li>data_preparing: Data is being initialized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The search result summary configurations.</p>
         */
        @NameInMap("summaries")
        public java.util.List<DescribeAppsResponseBodyResultSummaries> summaries;

        /**
         * <p>The type of the application. Valid values:</p>
         * <ul>
         * <li>standard: a standard edition application.</li>
         * <li>advance: an advanced edition application of an old version. New versions are not supported for this edition.</li>
         * <li>enhanced: an advanced edition application of a new version.</li>
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
