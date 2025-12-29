// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateAppRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically switch the created version to an online version. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("autoSwitch")
    public Boolean autoSwitch;

    /**
     * <p>The capability opening configurations.</p>
     */
    @NameInMap("cluster")
    public CreateAppRequestCluster cluster;

    @NameInMap("configItems")
    public java.util.List<java.util.Map<String, ?>> configItems;

    /**
     * <p>The configurations of data sources.</p>
     */
    @NameInMap("dataSources")
    public java.util.List<CreateAppRequestDataSources> dataSources;

    /**
     * <p>The version description.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Version description&quot;</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The industry model module.</p>
     */
    @NameInMap("domain")
    public CreateAppRequestDomain domain;

    /**
     * <p>The default display fields.</p>
     */
    @NameInMap("fetchFields")
    public java.util.List<String> fetchFields;

    /**
     * <p>The configurations of rough sort.</p>
     */
    @NameInMap("firstRanks")
    public java.util.List<CreateAppRequestFirstRanks> firstRanks;

    @NameInMap("interpretations")
    public java.util.List<java.util.Map<String, ?>> interpretations;

    /**
     * <p>The zone identifier. Valid values:</p>
     * <ul>
     * <li>vpc</li>
     * <li>oxs</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("networkType")
    public String networkType;

    @NameInMap("prompts")
    public java.util.List<java.util.Map<String, ?>> prompts;

    /**
     * <p>The query intent understanding configurations.</p>
     */
    @NameInMap("queryProcessors")
    public java.util.List<CreateAppRequestQueryProcessors> queryProcessors;

    @NameInMap("realtimeShared")
    public Boolean realtimeShared;

    /**
     * <p>The single-table schema.</p>
     */
    @NameInMap("schema")
    public CreateAppRequestSchema schema;

    /**
     * <p>The multi-table schema.</p>
     */
    @NameInMap("schemas")
    public java.util.List<CreateAppRequestSchemas> schemas;

    /**
     * <p>The configurations of fine sort.</p>
     */
    @NameInMap("secondRanks")
    public java.util.List<CreateAppRequestSecondRanks> secondRanks;

    /**
     * <p>The summary configurations of search results.</p>
     */
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

    public CreateAppRequest setConfigItems(java.util.List<java.util.Map<String, ?>> configItems) {
        this.configItems = configItems;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getConfigItems() {
        return this.configItems;
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

    public CreateAppRequest setInterpretations(java.util.List<java.util.Map<String, ?>> interpretations) {
        this.interpretations = interpretations;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getInterpretations() {
        return this.interpretations;
    }

    public CreateAppRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateAppRequest setPrompts(java.util.List<java.util.Map<String, ?>> prompts) {
        this.prompts = prompts;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getPrompts() {
        return this.prompts;
    }

    public CreateAppRequest setQueryProcessors(java.util.List<CreateAppRequestQueryProcessors> queryProcessors) {
        this.queryProcessors = queryProcessors;
        return this;
    }
    public java.util.List<CreateAppRequestQueryProcessors> getQueryProcessors() {
        return this.queryProcessors;
    }

    public CreateAppRequest setRealtimeShared(Boolean realtimeShared) {
        this.realtimeShared = realtimeShared;
        return this;
    }
    public Boolean getRealtimeShared() {
        return this.realtimeShared;
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

        /**
         * <strong>example:</strong>
         * <p>ops-text-embedding-002</p>
         */
        @NameInMap("textEmbeddingModel")
        public String textEmbeddingModel;

        /**
         * <strong>example:</strong>
         * <p>ops-text-sparse-embedding-001</p>
         */
        @NameInMap("textSparseEmbeddingModel")
        public String textSparseEmbeddingModel;

        @NameInMap("vectorIndexConfigs")
        public java.util.List<java.util.Map<String, ?>> vectorIndexConfigs;

        public static CreateAppRequestCluster build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestCluster self = new CreateAppRequestCluster();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestCluster setChunkModels(java.util.List<java.util.Map<String, ?>> chunkModels) {
            this.chunkModels = chunkModels;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getChunkModels() {
            return this.chunkModels;
        }

        public CreateAppRequestCluster setGraphRag(java.util.Map<String, ?> graphRag) {
            this.graphRag = graphRag;
            return this;
        }
        public java.util.Map<String, ?> getGraphRag() {
            return this.graphRag;
        }

        public CreateAppRequestCluster setImageContentRecognizerModels(java.util.List<java.util.Map<String, ?>> imageContentRecognizerModels) {
            this.imageContentRecognizerModels = imageContentRecognizerModels;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getImageContentRecognizerModels() {
            return this.imageContentRecognizerModels;
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

        public CreateAppRequestCluster setTextEmbeddingModel(String textEmbeddingModel) {
            this.textEmbeddingModel = textEmbeddingModel;
            return this;
        }
        public String getTextEmbeddingModel() {
            return this.textEmbeddingModel;
        }

        public CreateAppRequestCluster setTextSparseEmbeddingModel(String textSparseEmbeddingModel) {
            this.textSparseEmbeddingModel = textSparseEmbeddingModel;
            return this;
        }
        public String getTextSparseEmbeddingModel() {
            return this.textSparseEmbeddingModel;
        }

        public CreateAppRequestCluster setVectorIndexConfigs(java.util.List<java.util.Map<String, ?>> vectorIndexConfigs) {
            this.vectorIndexConfigs = vectorIndexConfigs;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getVectorIndexConfigs() {
            return this.vectorIndexConfigs;
        }

    }

    public static class CreateAppRequestDataSources extends TeaModel {
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
        /**
         * <p>The industry category.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The selected feature category. Valid values:</p>
         * <ul>
         * <li>qp: query analysis</li>
         * <li>algo: sort policy</li>
         * <li>service: service</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;qp&quot;:[&quot;spellcheck&quot;],&quot;algo&quot;:[&quot;pop&quot;],&quot;service&quot;:[&quot;suggest&quot;]}</p>
         */
        @NameInMap("functions")
        public java.util.Map<String, ?> functions;

        /**
         * <p>The industry type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecommerce</p>
         */
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
        /**
         * <p>Specifies whether the expression is the default one.</p>
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
         * <ul>
         * <li>STRUCT: The content of the expression is a structure.</li>
         * <li>STRING (default): You can configure a custom formula.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
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
        /**
         * <p>Specifies whether the rule is the default one.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
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
         * <p>ECOMMERCE</p>
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
         * <p>name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The features.</p>
         */
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
        /**
         * <p>The sort method.</p>
         * 
         * <strong>example:</strong>
         * <p>ASC;
         * DESC;</p>
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
        /**
         * <p>The sort configurations.</p>
         */
        @NameInMap("indexSortConfig")
        public java.util.List<CreateAppRequestSchemaIndexSortConfig> indexSortConfig;

        /**
         * <p>The index schema.</p>
         */
        @NameInMap("indexes")
        public CreateAppRequestSchemaIndexes indexes;

        /**
         * <p>The name of the wide table.</p>
         * 
         * <strong>example:</strong>
         * <p>table_name</p>
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
         * <p>The name of the level-2 routing field. This parameter takes effect only when the <code>routeFieldValues</code> parameter is configured. By default, the wide-table primary key field is used as the level-2 routing field.</p>
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
        /**
         * <p>The sort method.</p>
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
        /**
         * <p>The sort configurations.</p>
         */
        @NameInMap("indexSortConfig")
        public java.util.List<CreateAppRequestSchemasIndexSortConfig> indexSortConfig;

        /**
         * <p>The index schema.</p>
         */
        @NameInMap("indexes")
        public CreateAppRequestSchemasIndexes indexes;

        /**
         * <p>The name of the wide table.</p>
         * 
         * <strong>example:</strong>
         * <p>table_name</p>
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
        /**
         * <p>Specifies whether the expression is the default one.</p>
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
         * <p>1</p>
         */
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
        /**
         * <p>The collection of summary configurations.</p>
         */
        @NameInMap("meta")
        public java.util.List<CreateAppRequestSummariesMeta> meta;

        /**
         * <p>The group name.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
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
