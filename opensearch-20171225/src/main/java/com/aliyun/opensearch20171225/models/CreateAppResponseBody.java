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
     * <p>The response parameters.</p>
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
        @NameInMap("chunkModels")
        public java.util.List<java.util.Map<String, ?>> chunkModels;

        @NameInMap("graphRag")
        public java.util.Map<String, ?> graphRag;

        @NameInMap("imageContentRecognizerModels")
        public java.util.List<java.util.Map<String, ?>> imageContentRecognizerModels;

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

        @NameInMap("textEmbeddingModel")
        public String textEmbeddingModel;

        @NameInMap("textSparseEmbeddingModel")
        public String textSparseEmbeddingModel;

        @NameInMap("vectorIndexConfigs")
        public java.util.List<java.util.Map<String, ?>> vectorIndexConfigs;

        public static CreateAppResponseBodyResultCluster build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResultCluster self = new CreateAppResponseBodyResultCluster();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResultCluster setChunkModels(java.util.List<java.util.Map<String, ?>> chunkModels) {
            this.chunkModels = chunkModels;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getChunkModels() {
            return this.chunkModels;
        }

        public CreateAppResponseBodyResultCluster setGraphRag(java.util.Map<String, ?> graphRag) {
            this.graphRag = graphRag;
            return this;
        }
        public java.util.Map<String, ?> getGraphRag() {
            return this.graphRag;
        }

        public CreateAppResponseBodyResultCluster setImageContentRecognizerModels(java.util.List<java.util.Map<String, ?>> imageContentRecognizerModels) {
            this.imageContentRecognizerModels = imageContentRecognizerModels;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getImageContentRecognizerModels() {
            return this.imageContentRecognizerModels;
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

        public CreateAppResponseBodyResultCluster setTextEmbeddingModel(String textEmbeddingModel) {
            this.textEmbeddingModel = textEmbeddingModel;
            return this;
        }
        public String getTextEmbeddingModel() {
            return this.textEmbeddingModel;
        }

        public CreateAppResponseBodyResultCluster setTextSparseEmbeddingModel(String textSparseEmbeddingModel) {
            this.textSparseEmbeddingModel = textSparseEmbeddingModel;
            return this;
        }
        public String getTextSparseEmbeddingModel() {
            return this.textSparseEmbeddingModel;
        }

        public CreateAppResponseBodyResultCluster setVectorIndexConfigs(java.util.List<java.util.Map<String, ?>> vectorIndexConfigs) {
            this.vectorIndexConfigs = vectorIndexConfigs;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getVectorIndexConfigs() {
            return this.vectorIndexConfigs;
        }

    }

    public static class CreateAppResponseBodyResultDataSources extends TeaModel {
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
         * <p>table_name</p>
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
        /**
         * <p>The features of the sort policy category.</p>
         */
        @NameInMap("algo")
        public java.util.List<String> algo;

        /**
         * <p>The features of the query analysis category.</p>
         */
        @NameInMap("qp")
        public java.util.List<String> qp;

        /**
         * <p>The features of the service category.</p>
         */
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
        /**
         * <p>The industry category.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The selected features.</p>
         */
        @NameInMap("functions")
        public CreateAppResponseBodyResultDomainFunctions functions;

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
         * <p>STRUCT: The content of the expression is a structure. STRING (default): You can configure a custom formula.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
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
         * <p>The index range.</p>
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
        /**
         * <p>The computing resources.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("computeResource")
        public Integer computeResource;

        /**
         * <p>The storage capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("docSize")
        public Integer docSize;

        /**
         * <p>The search request.</p>
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

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("usedComputeResource")
        public Integer usedComputeResource;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("usedDocSize")
        public Double usedDocSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("usedQps")
        public Integer usedQps;

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

        public CreateAppResponseBodyResultQuota setUsedComputeResource(Integer usedComputeResource) {
            this.usedComputeResource = usedComputeResource;
            return this;
        }
        public Integer getUsedComputeResource() {
            return this.usedComputeResource;
        }

        public CreateAppResponseBodyResultQuota setUsedDocSize(Double usedDocSize) {
            this.usedDocSize = usedDocSize;
            return this;
        }
        public Double getUsedDocSize() {
            return this.usedDocSize;
        }

        public CreateAppResponseBodyResultQuota setUsedQps(Integer usedQps) {
            this.usedQps = usedQps;
            return this;
        }
        public Integer getUsedQps() {
            return this.usedQps;
        }

    }

    public static class CreateAppResponseBodyResultSchemaIndexSortConfig extends TeaModel {
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
        /**
         * <p>The name of the document time field.</p>
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
        /**
         * <p>The sort configurations.</p>
         */
        @NameInMap("indexSortConfig")
        public java.util.List<CreateAppResponseBodyResultSchemaIndexSortConfig> indexSortConfig;

        /**
         * <p>The index schema.</p>
         */
        @NameInMap("indexes")
        public CreateAppResponseBodyResultSchemaIndexes indexes;

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
         * <p>The name of the level-2 routing field. This parameter takes effect only when the routeFieldValues parameter is configured. By default, the wide-table primary key field is used as the level-2 routing field.</p>
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
        /**
         * <p>The name of the document time field.</p>
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
        /**
         * <p>The sort configurations.</p>
         */
        @NameInMap("indexSortConfig")
        public java.util.List<CreateAppResponseBodyResultSchemasIndexSortConfig> indexSortConfig;

        /**
         * <p>The index schema.</p>
         */
        @NameInMap("indexes")
        public CreateAppResponseBodyResultSchemasIndexes indexes;

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
         * <p>The hot values of the level-1 routing field. After you configure this parameter, level-2 routing is enabled.</p>
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
         * <p>default</p>
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
        /**
         * <p>The collection of summary configurations.</p>
         */
        @NameInMap("meta")
        public java.util.List<CreateAppResponseBodyResultSummariesMeta> meta;

        /**
         * <p>The group name.</p>
         * 
         * <strong>example:</strong>
         * <p>fefault</p>
         */
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
        /**
         * <p>The capability opening configurations.</p>
         */
        @NameInMap("cluster")
        public CreateAppResponseBodyResultCluster cluster;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc_sh_domain_1</p>
         */
        @NameInMap("clusterName")
        @Deprecated
        public String clusterName;

        @NameInMap("configItems")
        public java.util.List<java.util.Map<String, ?>> configItems;

        @NameInMap("created")
        public Long created;

        /**
         * <p>The configurations of the data sources.</p>
         */
        @NameInMap("dataSources")
        public java.util.List<CreateAppResponseBodyResultDataSources> dataSources;

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>My application</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The industry model module.</p>
         */
        @NameInMap("domain")
        public CreateAppResponseBodyResultDomain domain;

        /**
         * <p>The default display fields.</p>
         */
        @NameInMap("fetchFields")
        public java.util.List<String> fetchFields;

        /**
         * <p>The configurations of rough sort.</p>
         */
        @NameInMap("firstRanks")
        public java.util.List<CreateAppResponseBodyResultFirstRanks> firstRanks;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12888</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The descriptions of the LLM table fields.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;name&quot;: &quot;longyu_llm_1&quot;, &quot;schemas&quot;: [], &quot;interpretations&quot;: [ { &quot;table&quot;: &quot;table1&quot;, &quot;fields&quot;: [ { &quot;name&quot;: &quot;field1&quot;, &quot;interpretation&quot;: &quot;Title&quot; }, { &quot;name&quot;: &quot;field2&quot;, &quot;interpretation&quot;: &quot;Number&quot; } ] } ] }</p>
         */
        @NameInMap("interpretations")
        public java.util.List<java.util.Map<String, ?>> interpretations;

        /**
         * <p>Indicates whether the version is an online version.</p>
         * 
         * <strong>example:</strong>
         * <p>12333</p>
         */
        @NameInMap("isCurrent")
        public Boolean isCurrent;

        /**
         * <p>The percentage for the data import progress.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("progressPercent")
        public Integer progressPercent;

        /**
         * <p>The prompt configurations</p>
         */
        @NameInMap("prompts")
        public java.util.List<java.util.Map<String, ?>> prompts;

        /**
         * <p>The query intent understanding configurations.</p>
         */
        @NameInMap("queryProcessors")
        public java.util.List<CreateAppResponseBodyResultQueryProcessors> queryProcessors;

        /**
         * <p>The quota.</p>
         */
        @NameInMap("quota")
        public CreateAppResponseBodyResultQuota quota;

        /**
         * <p>The single-table schema.</p>
         */
        @NameInMap("schema")
        public CreateAppResponseBodyResultSchema schema;

        /**
         * <p>The multi-table schema.</p>
         */
        @NameInMap("schemas")
        public java.util.List<CreateAppResponseBodyResultSchemas> schemas;

        /**
         * <p>The configurations of fine sort.</p>
         */
        @NameInMap("secondRanks")
        public java.util.List<CreateAppResponseBodyResultSecondRanks> secondRanks;

        /**
         * <p>The status of the application. Valid values:</p>
         * <ul>
         * <li>OK</li>
         * <li>STOPPED</li>
         * <li>FROZEN</li>
         * <li>INITIALIZING</li>
         * <li>UNAVAILABLE</li>
         * <li>DATA_WAITING</li>
         * <li>DATA_PREPARING</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The summary configurations of search results.</p>
         */
        @NameInMap("summaries")
        public java.util.List<CreateAppResponseBodyResultSummaries> summaries;

        @NameInMap("switchTime")
        public Long switchTime;

        /**
         * <p>The type of the application. Valid values:</p>
         * <ul>
         * <li>standard</li>
         * <li>enhanced</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("type")
        public String type;

        @NameInMap("updated")
        public Long updated;

        public static CreateAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResult self = new CreateAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResult setCluster(CreateAppResponseBodyResultCluster cluster) {
            this.cluster = cluster;
            return this;
        }
        public CreateAppResponseBodyResultCluster getCluster() {
            return this.cluster;
        }

        @Deprecated
        public CreateAppResponseBodyResult setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public CreateAppResponseBodyResult setConfigItems(java.util.List<java.util.Map<String, ?>> configItems) {
            this.configItems = configItems;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getConfigItems() {
            return this.configItems;
        }

        public CreateAppResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
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

        public CreateAppResponseBodyResult setInterpretations(java.util.List<java.util.Map<String, ?>> interpretations) {
            this.interpretations = interpretations;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getInterpretations() {
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

        public CreateAppResponseBodyResult setSwitchTime(Long switchTime) {
            this.switchTime = switchTime;
            return this;
        }
        public Long getSwitchTime() {
            return this.switchTime;
        }

        public CreateAppResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateAppResponseBodyResult setUpdated(Long updated) {
            this.updated = updated;
            return this;
        }
        public Long getUpdated() {
            return this.updated;
        }

    }

}
