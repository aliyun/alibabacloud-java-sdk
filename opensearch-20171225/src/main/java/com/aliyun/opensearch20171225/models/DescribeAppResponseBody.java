// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeAppResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>33477D76-C380-1D84-A4AD-043F52876CB1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The version information.</p>
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
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;instanceId&quot;: &quot;rds-instance-id&quot;,
         *   &quot;dbName&quot;: &quot;my_db&quot;,
         *   &quot;dbTableName&quot;: &quot;my_table&quot;,
         *   &quot;dbUser&quot;: &quot;my&quot;,
         *   &quot;dbPassword&quot;: &quot;my_passwd&quot;,
         *   &quot;filter&quot;:&quot;&quot;,
         *   &quot;autoSync&quot;: true
         * }</p>
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
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;name&quot;: &quot;JsonKeyValueExtractor&quot;,
         *   &quot;parameters&quot;: {
         *   &quot;key&quot;: &quot;my_field&quot;
         * }
         * }</p>
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
         * <p>The structure of the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("algo")
        public java.util.List<String> algo;

        /**
         * <p>The information about the layout.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("qp")
        public java.util.List<String> qp;

        /**
         * <p>The description of each feature.</p>
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
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("functions")
        public DescribeAppResponseBodyResultDomainFunctions functions;

        /**
         * <p>The name (in English).</p>
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
         * <p>abc</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The information about the expression. The information can be of the array or string type.</p>
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
         * <p>STRUCT: The content of the expression is a structure. STRING (default): custom formula.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
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
         * <p>The industry type. Valid values:</p>
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
         * <p>Then index range.</p>
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
        /**
         * <p>The attribute fields.</p>
         */
        @NameInMap("filterFields")
        public java.util.List<String> filterFields;

        /**
         * <p>The index fields.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;fields&quot;: [&quot;title&quot;],
         *   &quot;analyzer&quot;: &quot;chn_standard&quot;
         * }</p>
         */
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
        /**
         * <p>The document time field.</p>
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
        /**
         * <p>The sort configurations.</p>
         */
        @NameInMap("indexSortConfig")
        public java.util.List<DescribeAppResponseBodyResultSchemaIndexSortConfig> indexSortConfig;

        /**
         * <p>The index schema.</p>
         */
        @NameInMap("indexes")
        public DescribeAppResponseBodyResultSchemaIndexes indexes;

        /**
         * <p>The name of the wide table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The name of the level-1 routing field.</p>
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
         * <p>The name of the level-2 routing field. This parameter takes effect only when the routeFieldValues parameter is configured. By default, the wide-table primary key field is used as the level-2 routing field.</p>
         * 
         * <strong>example:</strong>
         * <p>field2</p>
         */
        @NameInMap("secondRouteField")
        public String secondRouteField;

        /**
         * <p>The table schema.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;primaryTable&quot;: true,
         *     &quot;name&quot;: &quot;main&quot;,
         *     &quot;fields&quot;: {
         *         &quot;id&quot;: {
         *             &quot;name&quot;: &quot;id&quot;,
         *             &quot;type&quot;: &quot;LITERAL&quot;,
         *             &quot;primaryKey&quot;: true
         *         },
         *         &quot;title&quot;: {
         *             &quot;name&quot;: &quot;title&quot;,
         *             &quot;type&quot;: &quot;TEXT&quot;,
         *             &quot;primaryKey&quot;: false
         *         },
         *         &quot;buy&quot;: {
         *             &quot;name&quot;: &quot;buy&quot;,
         *             &quot;type&quot;: &quot;INT&quot;,
         *             &quot;primaryKey&quot;: false
         *         },
         *         &quot;cate_id&quot;: {
         *             &quot;name&quot;: &quot;cate_id&quot;,
         *             &quot;type&quot;: &quot;INT&quot;,
         *             &quot;primaryKey&quot;: false
         *         },
         *         &quot;cate_name&quot;: {
         *             &quot;name&quot;: &quot;cate_name&quot;,
         *             &quot;type&quot;: &quot;LITERAL&quot;,
         *             &quot;primaryKey&quot;: false
         *         }
         *     }
         * }</p>
         */
        @NameInMap("tables")
        public java.util.Map<String, ?> tables;

        /**
         * <p>The document clearing configurations.</p>
         */
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
        /**
         * <p>The attribute fields.</p>
         */
        @NameInMap("filterFields")
        public java.util.List<String> filterFields;

        /**
         * <p>The index fields.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;fields&quot;: [&quot;title&quot;],
         *   &quot;analyzer&quot;: &quot;chn_standard&quot;
         * }</p>
         */
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
        /**
         * <p>The sort configurations.</p>
         */
        @NameInMap("indexSortConfig")
        public java.util.List<DescribeAppResponseBodyResultSchemasIndexSortConfig> indexSortConfig;

        /**
         * <p>The index schema.</p>
         */
        @NameInMap("indexes")
        public DescribeAppResponseBodyResultSchemasIndexes indexes;

        /**
         * <p>The name of the wide table.</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The name of the level-1 routing field.</p>
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
         * <p>The name of the level-2 routing field. This parameter takes effect only when the routeFieldValues parameter is configured. By default, the wide-table primary key field is used as the level-2 routing field.</p>
         * 
         * <strong>example:</strong>
         * <p>field2</p>
         */
        @NameInMap("secondRouteField")
        public String secondRouteField;

        /**
         * <p>The table schema.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;primaryTable&quot;: true,
         *     &quot;name&quot;: &quot;main&quot;,
         *     &quot;fields&quot;: {
         *         &quot;id&quot;: {
         *             &quot;name&quot;: &quot;id&quot;,
         *             &quot;type&quot;: &quot;LITERAL&quot;,
         *             &quot;primaryKey&quot;: true
         *         },
         *         &quot;title&quot;: {
         *             &quot;name&quot;: &quot;title&quot;,
         *             &quot;type&quot;: &quot;TEXT&quot;,
         *             &quot;primaryKey&quot;: false
         *         },
         *         &quot;buy&quot;: {
         *             &quot;name&quot;: &quot;buy&quot;,
         *             &quot;type&quot;: &quot;INT&quot;,
         *             &quot;primaryKey&quot;: false
         *         },
         *         &quot;cate_id&quot;: {
         *             &quot;name&quot;: &quot;cate_id&quot;,
         *             &quot;type&quot;: &quot;INT&quot;,
         *             &quot;primaryKey&quot;: false
         *         },
         *         &quot;cate_name&quot;: {
         *             &quot;name&quot;: &quot;cate_name&quot;,
         *             &quot;type&quot;: &quot;LITERAL&quot;,
         *             &quot;primaryKey&quot;: false
         *         }
         *     }
         * }</p>
         */
        @NameInMap("tables")
        public java.util.Map<String, ?> tables;

        /**
         * <p>The document clearing configurations.</p>
         */
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
         * <p>The fine sort expression. You can define an expression that contains fields, feature functions, and mathematical functions to implement complex sort logic.</p>
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
        /**
         * <p>The summary configurations.</p>
         */
        @NameInMap("meta")
        public java.util.List<DescribeAppResponseBodyResultSummariesMeta> meta;

        /**
         * <p>The group name.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
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
        public DescribeAppResponseBodyResultCluster cluster;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("clusterName")
        public String clusterName;

        /**
         * <p>The configurations of the data sources.</p>
         */
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
         * <p>The industry type. Valid values:</p>
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

        /**
         * <p>The configurations of rough sort.</p>
         */
        @NameInMap("firstRanks")
        public java.util.List<DescribeAppResponseBodyResultFirstRanks> firstRanks;

        /**
         * <p>The version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100303063</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The industry model module.</p>
         * 
         * <strong>example:</strong>
         * <p>[ { &quot;table&quot;: &quot;table1&quot;, &quot;fields&quot;: [ { &quot;name&quot;: &quot;field1&quot;, &quot;interpretation&quot;: &quot;Title&quot; }, { &quot;name&quot;: &quot;field2&quot;, &quot;interpretation&quot;: &quot;Number&quot; } ] } ]</p>
         */
        @NameInMap("interpretations")
        public java.util.Map<String, ?> interpretations;

        /**
         * <p>Indices whether the version is an online version.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
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
        public java.util.List<DescribeAppResponseBodyResultQueryProcessors> queryProcessors;

        /**
         * <p>The quota information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("quota")
        public DescribeAppResponseBodyResultQuota quota;

        /**
         * <p>The schema of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("schema")
        public DescribeAppResponseBodyResultSchema schema;

        /**
         * <p>The multi-table schema.</p>
         */
        @NameInMap("schemas")
        public java.util.List<DescribeAppResponseBodyResultSchemas> schemas;

        /**
         * <p>The configurations of fine sort.</p>
         */
        @NameInMap("secondRanks")
        public java.util.List<DescribeAppResponseBodyResultSecondRanks> secondRanks;

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
         * <p>ok</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The summary configurations of search results.</p>
         */
        @NameInMap("summaries")
        public java.util.List<DescribeAppResponseBodyResultSummaries> summaries;

        /**
         * <p>The edition type. Valid values:</p>
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
