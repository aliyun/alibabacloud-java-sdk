// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyTableRequest extends TeaModel {
    /**
     * <p>The field processing configuration.</p>
     */
    @NameInMap("dataProcessConfig")
    public java.util.List<ModifyTableRequestDataProcessConfig> dataProcessConfig;

    /**
     * <p>The datasource config.</p>
     */
    @NameInMap("dataSource")
    public ModifyTableRequestDataSource dataSource;

    /**
     * <p>The field map collection.</p>
     */
    @NameInMap("fieldSchema")
    public java.util.Map<String, String> fieldSchema;

    /**
     * <p>The number of data shards.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("partitionCount")
    public Integer partitionCount;

    /**
     * <p>The primary key field.</p>
     * 
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("primaryKey")
    public String primaryKey;

    /**
     * <p>If rawSchema is provided, it is used directly as the HA3 schema structure without manual assembly.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("rawSchema")
    public String rawSchema;

    /**
     * <p>The index structure.</p>
     */
    @NameInMap("vectorIndex")
    public java.util.List<ModifyTableRequestVectorIndex> vectorIndex;

    /**
     * <p>Specifies whether to perform a dry run (only validates whether the data source is valid). Valid values:</p>
     * <ul>
     * <li>true: performs a dry run.</li>
     * <li>false: does not perform a dry run.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static ModifyTableRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTableRequest self = new ModifyTableRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTableRequest setDataProcessConfig(java.util.List<ModifyTableRequestDataProcessConfig> dataProcessConfig) {
        this.dataProcessConfig = dataProcessConfig;
        return this;
    }
    public java.util.List<ModifyTableRequestDataProcessConfig> getDataProcessConfig() {
        return this.dataProcessConfig;
    }

    public ModifyTableRequest setDataSource(ModifyTableRequestDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public ModifyTableRequestDataSource getDataSource() {
        return this.dataSource;
    }

    public ModifyTableRequest setFieldSchema(java.util.Map<String, String> fieldSchema) {
        this.fieldSchema = fieldSchema;
        return this;
    }
    public java.util.Map<String, String> getFieldSchema() {
        return this.fieldSchema;
    }

    public ModifyTableRequest setPartitionCount(Integer partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }
    public Integer getPartitionCount() {
        return this.partitionCount;
    }

    public ModifyTableRequest setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }
    public String getPrimaryKey() {
        return this.primaryKey;
    }

    public ModifyTableRequest setRawSchema(String rawSchema) {
        this.rawSchema = rawSchema;
        return this;
    }
    public String getRawSchema() {
        return this.rawSchema;
    }

    public ModifyTableRequest setVectorIndex(java.util.List<ModifyTableRequestVectorIndex> vectorIndex) {
        this.vectorIndex = vectorIndex;
        return this;
    }
    public java.util.List<ModifyTableRequestVectorIndex> getVectorIndex() {
        return this.vectorIndex;
    }

    public ModifyTableRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static class ModifyTableRequestDataProcessConfigParamsSrcFieldConfig extends TeaModel {
        /**
         * <p>The OSS bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-bucket</p>
         */
        @NameInMap("ossBucket")
        public String ossBucket;

        /**
         * <p>The OSS region endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou-internal.aliyuncs.com</p>
         */
        @NameInMap("ossEndpoint")
        public String ossEndpoint;

        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1062017779051424</p>
         */
        @NameInMap("uid")
        public String uid;

        public static ModifyTableRequestDataProcessConfigParamsSrcFieldConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyTableRequestDataProcessConfigParamsSrcFieldConfig self = new ModifyTableRequestDataProcessConfigParamsSrcFieldConfig();
            return TeaModel.build(map, self);
        }

        public ModifyTableRequestDataProcessConfigParamsSrcFieldConfig setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public ModifyTableRequestDataProcessConfigParamsSrcFieldConfig setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public ModifyTableRequestDataProcessConfigParamsSrcFieldConfig setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class ModifyTableRequestDataProcessConfigParams extends TeaModel {
        /**
         * <p>The vectorization information source.</p>
         */
        @NameInMap("srcFieldConfig")
        public ModifyTableRequestDataProcessConfigParamsSrcFieldConfig srcFieldConfig;

        /**
         * <p>The data type.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("vectorModal")
        public String vectorModal;

        /**
         * <p>The vectorization model.</p>
         * 
         * <strong>example:</strong>
         * <p>clip</p>
         */
        @NameInMap("vectorModel")
        public String vectorModel;

        public static ModifyTableRequestDataProcessConfigParams build(java.util.Map<String, ?> map) throws Exception {
            ModifyTableRequestDataProcessConfigParams self = new ModifyTableRequestDataProcessConfigParams();
            return TeaModel.build(map, self);
        }

        public ModifyTableRequestDataProcessConfigParams setSrcFieldConfig(ModifyTableRequestDataProcessConfigParamsSrcFieldConfig srcFieldConfig) {
            this.srcFieldConfig = srcFieldConfig;
            return this;
        }
        public ModifyTableRequestDataProcessConfigParamsSrcFieldConfig getSrcFieldConfig() {
            return this.srcFieldConfig;
        }

        public ModifyTableRequestDataProcessConfigParams setVectorModal(String vectorModal) {
            this.vectorModal = vectorModal;
            return this;
        }
        public String getVectorModal() {
            return this.vectorModal;
        }

        public ModifyTableRequestDataProcessConfigParams setVectorModel(String vectorModel) {
            this.vectorModel = vectorModel;
            return this;
        }
        public String getVectorModel() {
            return this.vectorModel;
        }

    }

    public static class ModifyTableRequestDataProcessConfig extends TeaModel {
        /**
         * <p>The destination field.</p>
         * 
         * <strong>example:</strong>
         * <p>source_image_vector</p>
         */
        @NameInMap("dstField")
        public String dstField;

        /**
         * <p>The field processing method. Valid values:</p>
         * <ul>
         * <li>copy: copies the source field to the destination field.</li>
         * <li>vectorize: vectorizes the source field by using a model and stores the vector in the destination field.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vectorize</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The model configuration information.</p>
         */
        @NameInMap("params")
        public ModifyTableRequestDataProcessConfigParams params;

        /**
         * <p>The source field.</p>
         * 
         * <strong>example:</strong>
         * <p>source_image</p>
         */
        @NameInMap("srcField")
        public String srcField;

        public static ModifyTableRequestDataProcessConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyTableRequestDataProcessConfig self = new ModifyTableRequestDataProcessConfig();
            return TeaModel.build(map, self);
        }

        public ModifyTableRequestDataProcessConfig setDstField(String dstField) {
            this.dstField = dstField;
            return this;
        }
        public String getDstField() {
            return this.dstField;
        }

        public ModifyTableRequestDataProcessConfig setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ModifyTableRequestDataProcessConfig setParams(ModifyTableRequestDataProcessConfigParams params) {
            this.params = params;
            return this;
        }
        public ModifyTableRequestDataProcessConfigParams getParams() {
            return this.params;
        }

        public ModifyTableRequestDataProcessConfig setSrcField(String srcField) {
            this.srcField = srcField;
            return this;
        }
        public String getSrcField() {
            return this.srcField;
        }

    }

    public static class ModifyTableRequestDataSourceConfig extends TeaModel {
        /**
         * <p>The AccessKey ID of the ODPS data source.</p>
         * 
         * <strong>example:</strong>
         * <p>L***p</p>
         */
        @NameInMap("accessKey")
        public String accessKey;

        /**
         * <p>The AccessKey secret of the ODPS data source.</p>
         * 
         * <strong>example:</strong>
         * <p>5**9a6</p>
         */
        @NameInMap("accessSecret")
        public String accessSecret;

        /**
         * <p>oss bucket</p>
         * 
         * <strong>example:</strong>
         * <p>test_bucket</p>
         */
        @NameInMap("bucket")
        public String bucket;

        /**
         * <p>The catalog name of the DLF data source.</p>
         * 
         * <strong>example:</strong>
         * <p>test_catalog</p>
         */
        @NameInMap("catalog")
        public String catalog;

        /**
         * <p>The database of the DLF data source.</p>
         * 
         * <strong>example:</strong>
         * <p>opensearch_db</p>
         */
        @NameInMap("database")
        public String database;

        /**
         * <p>The access endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api">http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The file format type.</p>
         * 
         * <strong>example:</strong>
         * <p>ha3
         * json</p>
         */
        @NameInMap("format")
        public String format;

        /**
         * <p>The OSS file path.</p>
         * 
         * <strong>example:</strong>
         * <p>/opensearch/test.txt</p>
         */
        @NameInMap("ossPath")
        public String ossPath;

        /**
         * <p>The partition information.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20231220</p>
         */
        @NameInMap("partition")
        public String partition;

        /**
         * <p>The relative path.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The project name of the ODPS data source.</p>
         * 
         * <strong>example:</strong>
         * <p>test_project</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The table name of the ODPS or DLF data source.</p>
         * 
         * <strong>example:</strong>
         * <p>behavior</p>
         */
        @NameInMap("table")
        public String table;

        /**
         * <p>The table format of the DLF data source.</p>
         * 
         * <strong>example:</strong>
         * <p>paimon
         * lance
         * object</p>
         */
        @NameInMap("tableFormat")
        public String tableFormat;

        /**
         * <p>The tag of the DLF data source.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("tag")
        public String tag;

        public static ModifyTableRequestDataSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyTableRequestDataSourceConfig self = new ModifyTableRequestDataSourceConfig();
            return TeaModel.build(map, self);
        }

        public ModifyTableRequestDataSourceConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ModifyTableRequestDataSourceConfig setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public ModifyTableRequestDataSourceConfig setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public ModifyTableRequestDataSourceConfig setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public ModifyTableRequestDataSourceConfig setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public ModifyTableRequestDataSourceConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ModifyTableRequestDataSourceConfig setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ModifyTableRequestDataSourceConfig setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public ModifyTableRequestDataSourceConfig setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

        public ModifyTableRequestDataSourceConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ModifyTableRequestDataSourceConfig setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ModifyTableRequestDataSourceConfig setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public ModifyTableRequestDataSourceConfig setTableFormat(String tableFormat) {
            this.tableFormat = tableFormat;
            return this;
        }
        public String getTableFormat() {
            return this.tableFormat;
        }

        public ModifyTableRequestDataSourceConfig setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class ModifyTableRequestDataSource extends TeaModel {
        /**
         * <p>Indicates whether auto index rebuilding is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoBuildIndex")
        public Boolean autoBuildIndex;

        /**
         * <p>The datasource config.</p>
         */
        @NameInMap("config")
        public ModifyTableRequestDataSourceConfig config;

        /**
         * <p>The timestamp for incremental data tracking.</p>
         * 
         * <strong>example:</strong>
         * <p>1715160176</p>
         */
        @NameInMap("dataTimeSec")
        public Integer dataTimeSec;

        public static ModifyTableRequestDataSource build(java.util.Map<String, ?> map) throws Exception {
            ModifyTableRequestDataSource self = new ModifyTableRequestDataSource();
            return TeaModel.build(map, self);
        }

        public ModifyTableRequestDataSource setAutoBuildIndex(Boolean autoBuildIndex) {
            this.autoBuildIndex = autoBuildIndex;
            return this;
        }
        public Boolean getAutoBuildIndex() {
            return this.autoBuildIndex;
        }

        public ModifyTableRequestDataSource setConfig(ModifyTableRequestDataSourceConfig config) {
            this.config = config;
            return this;
        }
        public ModifyTableRequestDataSourceConfig getConfig() {
            return this.config;
        }

        public ModifyTableRequestDataSource setDataTimeSec(Integer dataTimeSec) {
            this.dataTimeSec = dataTimeSec;
            return this;
        }
        public Integer getDataTimeSec() {
            return this.dataTimeSec;
        }

    }

    public static class ModifyTableRequestVectorIndexAdvanceParams extends TeaModel {
        /**
         * <p>The index building parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("buildIndexParams")
        public String buildIndexParams;

        /**
         * <p>The threshold for linear building.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("linearBuildThreshold")
        public String linearBuildThreshold;

        /**
         * <p>The minimum number of candidate documents for recall.</p>
         * 
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("minScanDocCnt")
        public String minScanDocCnt;

        /**
         * <p>The index search parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("searchIndexParams")
        public String searchIndexParams;

        public static ModifyTableRequestVectorIndexAdvanceParams build(java.util.Map<String, ?> map) throws Exception {
            ModifyTableRequestVectorIndexAdvanceParams self = new ModifyTableRequestVectorIndexAdvanceParams();
            return TeaModel.build(map, self);
        }

        public ModifyTableRequestVectorIndexAdvanceParams setBuildIndexParams(String buildIndexParams) {
            this.buildIndexParams = buildIndexParams;
            return this;
        }
        public String getBuildIndexParams() {
            return this.buildIndexParams;
        }

        public ModifyTableRequestVectorIndexAdvanceParams setLinearBuildThreshold(String linearBuildThreshold) {
            this.linearBuildThreshold = linearBuildThreshold;
            return this;
        }
        public String getLinearBuildThreshold() {
            return this.linearBuildThreshold;
        }

        public ModifyTableRequestVectorIndexAdvanceParams setMinScanDocCnt(String minScanDocCnt) {
            this.minScanDocCnt = minScanDocCnt;
            return this;
        }
        public String getMinScanDocCnt() {
            return this.minScanDocCnt;
        }

        public ModifyTableRequestVectorIndexAdvanceParams setSearchIndexParams(String searchIndexParams) {
            this.searchIndexParams = searchIndexParams;
            return this;
        }
        public String getSearchIndexParams() {
            return this.searchIndexParams;
        }

    }

    public static class ModifyTableRequestVectorIndex extends TeaModel {
        /**
         * <p>The index structure configuration.</p>
         */
        @NameInMap("advanceParams")
        public ModifyTableRequestVectorIndexAdvanceParams advanceParams;

        /**
         * <p>The vector dimensions.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("dimension")
        public String dimension;

        /**
         * <p>The distance type.</p>
         * 
         * <strong>example:</strong>
         * <p>SquaredEuclidean</p>
         */
        @NameInMap("distanceType")
        public String distanceType;

        /**
         * <p>The name of the index structure.</p>
         * 
         * <strong>example:</strong>
         * <p>test_index</p>
         */
        @NameInMap("indexName")
        public String indexName;

        /**
         * <p>The namespace field.</p>
         * 
         * <strong>example:</strong>
         * <p>namespace</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The sparse vector index field.</p>
         * 
         * <strong>example:</strong>
         * <p>sparse_indices</p>
         */
        @NameInMap("sparseIndexField")
        public String sparseIndexField;

        /**
         * <p>The sparse vector value field.</p>
         * 
         * <strong>example:</strong>
         * <p>sparse_values</p>
         */
        @NameInMap("sparseValueField")
        public String sparseValueField;

        /**
         * <p>The vector field.</p>
         * 
         * <strong>example:</strong>
         * <p>source_image_vector</p>
         */
        @NameInMap("vectorField")
        public String vectorField;

        /**
         * <p>The vector index algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>Qc</p>
         */
        @NameInMap("vectorIndexType")
        public String vectorIndexType;

        public static ModifyTableRequestVectorIndex build(java.util.Map<String, ?> map) throws Exception {
            ModifyTableRequestVectorIndex self = new ModifyTableRequestVectorIndex();
            return TeaModel.build(map, self);
        }

        public ModifyTableRequestVectorIndex setAdvanceParams(ModifyTableRequestVectorIndexAdvanceParams advanceParams) {
            this.advanceParams = advanceParams;
            return this;
        }
        public ModifyTableRequestVectorIndexAdvanceParams getAdvanceParams() {
            return this.advanceParams;
        }

        public ModifyTableRequestVectorIndex setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public ModifyTableRequestVectorIndex setDistanceType(String distanceType) {
            this.distanceType = distanceType;
            return this;
        }
        public String getDistanceType() {
            return this.distanceType;
        }

        public ModifyTableRequestVectorIndex setIndexName(String indexName) {
            this.indexName = indexName;
            return this;
        }
        public String getIndexName() {
            return this.indexName;
        }

        public ModifyTableRequestVectorIndex setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ModifyTableRequestVectorIndex setSparseIndexField(String sparseIndexField) {
            this.sparseIndexField = sparseIndexField;
            return this;
        }
        public String getSparseIndexField() {
            return this.sparseIndexField;
        }

        public ModifyTableRequestVectorIndex setSparseValueField(String sparseValueField) {
            this.sparseValueField = sparseValueField;
            return this;
        }
        public String getSparseValueField() {
            return this.sparseValueField;
        }

        public ModifyTableRequestVectorIndex setVectorField(String vectorField) {
            this.vectorField = vectorField;
            return this;
        }
        public String getVectorField() {
            return this.vectorField;
        }

        public ModifyTableRequestVectorIndex setVectorIndexType(String vectorIndexType) {
            this.vectorIndexType = vectorIndexType;
            return this;
        }
        public String getVectorIndexType() {
            return this.vectorIndexType;
        }

    }

}
