// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyTableRequest extends TeaModel {
    /**
     * <p>The configurations about field processing.</p>
     */
    @NameInMap("dataProcessConfig")
    public java.util.List<ModifyTableRequestDataProcessConfig> dataProcessConfig;

    /**
     * <p>The configurations of the data source.</p>
     */
    @NameInMap("dataSource")
    public ModifyTableRequestDataSource dataSource;

    /**
     * <p>The fields.</p>
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
     * <p>The instance schema. If this parameter is specified, the parameters about the index are not required.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("rawSchema")
    public String rawSchema;

    /**
     * <p>The index schema.</p>
     */
    @NameInMap("vectorIndex")
    public java.util.List<ModifyTableRequestVectorIndex> vectorIndex;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. The system only checks the validity of the data source. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
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
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ossBucket")
        public String ossBucket;

        /**
         * <p>The OSS endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou-internal.aliyuncs.com</p>
         */
        @NameInMap("ossEndpoint")
        public String ossEndpoint;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>uid</p>
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
         * <p>The source of the data to be vectorized.</p>
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
         * <p>The method used to process the field. Valid values: copy and vectorize. A value of copy specifies that the value of the source field is copied to the destination field. A value of vectorize specifies that the value of the source field is vectorized by a vectorization model and the output vector is stored in the destination field.</p>
         * 
         * <strong>example:</strong>
         * <p>vectorize</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The information about the model.</p>
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
         * <p>The AccessKey ID of the MaxCompute data source.</p>
         * 
         * <strong>example:</strong>
         * <p>AK</p>
         */
        @NameInMap("accessKey")
        public String accessKey;

        /**
         * <p>The AccessKey secret of the MaxCompute data source.</p>
         * 
         * <strong>example:</strong>
         * <p>AS</p>
         */
        @NameInMap("accessSecret")
        public String accessSecret;

        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>antsys-shujiang-osstest</p>
         */
        @NameInMap("bucket")
        public String bucket;

        /**
         * <p>The endpoint of the MaxCompute data source.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api">http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The path of the Object Storage Service (OSS) object.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://opensearch</p>
         */
        @NameInMap("ossPath")
        public String ossPath;

        /**
         * <p>The partition in the MaxCompute table.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20231220</p>
         */
        @NameInMap("partition")
        public String partition;

        /**
         * <p>The name of the MaxCompute project that is used as the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>yw_dw_rpt</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The name of the MaxCompute table that is used as the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>behavior</p>
         */
        @NameInMap("table")
        public String table;

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

        public ModifyTableRequestDataSourceConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
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

    }

    public static class ModifyTableRequestDataSource extends TeaModel {
        /**
         * <p>Specifies whether to automatically rebuild the index.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoBuildIndex")
        public Boolean autoBuildIndex;

        /**
         * <p>The configurations of the data source.</p>
         */
        @NameInMap("config")
        public ModifyTableRequestDataSourceConfig config;

        /**
         * <p>The start timestamp from which incremental data is retrieved.</p>
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
         * <p>The minimum number of retrieved candidate sets.</p>
         * 
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("minScanDocCnt")
        public String minScanDocCnt;

        /**
         * <p>The index retrieval parameters.</p>
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
         * <p>The configurations of the index schema.</p>
         */
        @NameInMap("advanceParams")
        public ModifyTableRequestVectorIndexAdvanceParams advanceParams;

        /**
         * <p>The dimension of the vector.</p>
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
         * <p>The name of the index schema.</p>
         * 
         * <strong>example:</strong>
         * <p>test_api</p>
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
         * <p>The field that stores the indexes of the elements in sparse vectors.</p>
         * 
         * <strong>example:</strong>
         * <p>sparse_indices</p>
         */
        @NameInMap("sparseIndexField")
        public String sparseIndexField;

        /**
         * <p>The field that stores the elements in sparse vectors.</p>
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
         * <p>The vector retrieval algorithm.</p>
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
