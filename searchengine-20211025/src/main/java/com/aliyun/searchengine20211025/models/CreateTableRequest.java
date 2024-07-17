// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateTableRequest extends TeaModel {
    /**
     * <p>The configurations about field processing.</p>
     */
    @NameInMap("dataProcessConfig")
    public java.util.List<CreateTableRequestDataProcessConfig> dataProcessConfig;

    /**
     * <p>The number of resources used for data update.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("dataProcessorCount")
    public Integer dataProcessorCount;

    /**
     * <p>The configurations of the data source.</p>
     */
    @NameInMap("dataSource")
    public CreateTableRequestDataSource dataSource;

    /**
     * <p>The fields.</p>
     */
    @NameInMap("fieldSchema")
    public java.util.Map<String, String> fieldSchema;

    /**
     * <p>The index name.</p>
     * 
     * <strong>example:</strong>
     * <p>index_1</p>
     */
    @NameInMap("name")
    public String name;

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
    public java.util.List<CreateTableRequestVectorIndex> vectorIndex;

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

    public static CreateTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTableRequest self = new CreateTableRequest();
        return TeaModel.build(map, self);
    }

    public CreateTableRequest setDataProcessConfig(java.util.List<CreateTableRequestDataProcessConfig> dataProcessConfig) {
        this.dataProcessConfig = dataProcessConfig;
        return this;
    }
    public java.util.List<CreateTableRequestDataProcessConfig> getDataProcessConfig() {
        return this.dataProcessConfig;
    }

    public CreateTableRequest setDataProcessorCount(Integer dataProcessorCount) {
        this.dataProcessorCount = dataProcessorCount;
        return this;
    }
    public Integer getDataProcessorCount() {
        return this.dataProcessorCount;
    }

    public CreateTableRequest setDataSource(CreateTableRequestDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public CreateTableRequestDataSource getDataSource() {
        return this.dataSource;
    }

    public CreateTableRequest setFieldSchema(java.util.Map<String, String> fieldSchema) {
        this.fieldSchema = fieldSchema;
        return this;
    }
    public java.util.Map<String, String> getFieldSchema() {
        return this.fieldSchema;
    }

    public CreateTableRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTableRequest setPartitionCount(Integer partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }
    public Integer getPartitionCount() {
        return this.partitionCount;
    }

    public CreateTableRequest setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }
    public String getPrimaryKey() {
        return this.primaryKey;
    }

    public CreateTableRequest setRawSchema(String rawSchema) {
        this.rawSchema = rawSchema;
        return this;
    }
    public String getRawSchema() {
        return this.rawSchema;
    }

    public CreateTableRequest setVectorIndex(java.util.List<CreateTableRequestVectorIndex> vectorIndex) {
        this.vectorIndex = vectorIndex;
        return this;
    }
    public java.util.List<CreateTableRequestVectorIndex> getVectorIndex() {
        return this.vectorIndex;
    }

    public CreateTableRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static class CreateTableRequestDataProcessConfigParamsSrcFieldConfig extends TeaModel {
        /**
         * <p>The OSS bucket.</p>
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

        public static CreateTableRequestDataProcessConfigParamsSrcFieldConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateTableRequestDataProcessConfigParamsSrcFieldConfig self = new CreateTableRequestDataProcessConfigParamsSrcFieldConfig();
            return TeaModel.build(map, self);
        }

        public CreateTableRequestDataProcessConfigParamsSrcFieldConfig setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public CreateTableRequestDataProcessConfigParamsSrcFieldConfig setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public CreateTableRequestDataProcessConfigParamsSrcFieldConfig setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class CreateTableRequestDataProcessConfigParams extends TeaModel {
        /**
         * <p>The source of the data to be vectorized.</p>
         */
        @NameInMap("srcFieldConfig")
        public CreateTableRequestDataProcessConfigParamsSrcFieldConfig srcFieldConfig;

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

        public static CreateTableRequestDataProcessConfigParams build(java.util.Map<String, ?> map) throws Exception {
            CreateTableRequestDataProcessConfigParams self = new CreateTableRequestDataProcessConfigParams();
            return TeaModel.build(map, self);
        }

        public CreateTableRequestDataProcessConfigParams setSrcFieldConfig(CreateTableRequestDataProcessConfigParamsSrcFieldConfig srcFieldConfig) {
            this.srcFieldConfig = srcFieldConfig;
            return this;
        }
        public CreateTableRequestDataProcessConfigParamsSrcFieldConfig getSrcFieldConfig() {
            return this.srcFieldConfig;
        }

        public CreateTableRequestDataProcessConfigParams setVectorModal(String vectorModal) {
            this.vectorModal = vectorModal;
            return this;
        }
        public String getVectorModal() {
            return this.vectorModal;
        }

        public CreateTableRequestDataProcessConfigParams setVectorModel(String vectorModel) {
            this.vectorModel = vectorModel;
            return this;
        }
        public String getVectorModel() {
            return this.vectorModel;
        }

    }

    public static class CreateTableRequestDataProcessConfig extends TeaModel {
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
        public CreateTableRequestDataProcessConfigParams params;

        /**
         * <p>The source field.</p>
         * 
         * <strong>example:</strong>
         * <p>source_image</p>
         */
        @NameInMap("srcField")
        public String srcField;

        public static CreateTableRequestDataProcessConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateTableRequestDataProcessConfig self = new CreateTableRequestDataProcessConfig();
            return TeaModel.build(map, self);
        }

        public CreateTableRequestDataProcessConfig setDstField(String dstField) {
            this.dstField = dstField;
            return this;
        }
        public String getDstField() {
            return this.dstField;
        }

        public CreateTableRequestDataProcessConfig setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateTableRequestDataProcessConfig setParams(CreateTableRequestDataProcessConfigParams params) {
            this.params = params;
            return this;
        }
        public CreateTableRequestDataProcessConfigParams getParams() {
            return this.params;
        }

        public CreateTableRequestDataProcessConfig setSrcField(String srcField) {
            this.srcField = srcField;
            return this;
        }
        public String getSrcField() {
            return this.srcField;
        }

    }

    public static class CreateTableRequestDataSourceConfig extends TeaModel {
        /**
         * <p>The AccessKey ID of the MaxCompute data source.</p>
         * 
         * <strong>example:</strong>
         * <p>ak</p>
         */
        @NameInMap("accessKey")
        public String accessKey;

        /**
         * <p>The AccessKey secret of the MaxCompute data source.</p>
         * 
         * <strong>example:</strong>
         * <p>as</p>
         */
        @NameInMap("accessSecret")
        public String accessSecret;

        /**
         * <p>The OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>antsys-flytest-ci</p>
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
         * <p>The Object Storage Service (OSS) path.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://opensearch</p>
         */
        @NameInMap("ossPath")
        public String ossPath;

        /**
         * <p>The partition in the MaxCompute table. This parameter is required if type is set to odps.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20220713</p>
         */
        @NameInMap("partition")
        public String partition;

        /**
         * <p>The name of the MaxCompute project that is used as the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>project_20210220122847_3218</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The name of the MaxCompute table that is used as the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>test56</p>
         */
        @NameInMap("table")
        public String table;

        public static CreateTableRequestDataSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateTableRequestDataSourceConfig self = new CreateTableRequestDataSourceConfig();
            return TeaModel.build(map, self);
        }

        public CreateTableRequestDataSourceConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public CreateTableRequestDataSourceConfig setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public CreateTableRequestDataSourceConfig setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public CreateTableRequestDataSourceConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateTableRequestDataSourceConfig setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public CreateTableRequestDataSourceConfig setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

        public CreateTableRequestDataSourceConfig setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public CreateTableRequestDataSourceConfig setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class CreateTableRequestDataSource extends TeaModel {
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
        public CreateTableRequestDataSourceConfig config;

        /**
         * <p>The start timestamp from which incremental data is retrieved.</p>
         * 
         * <strong>example:</strong>
         * <p>1715160176</p>
         */
        @NameInMap("dataTimeSec")
        public Integer dataTimeSec;

        /**
         * <p>The data source type. Valid values: odps, swift, and oss.</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateTableRequestDataSource build(java.util.Map<String, ?> map) throws Exception {
            CreateTableRequestDataSource self = new CreateTableRequestDataSource();
            return TeaModel.build(map, self);
        }

        public CreateTableRequestDataSource setAutoBuildIndex(Boolean autoBuildIndex) {
            this.autoBuildIndex = autoBuildIndex;
            return this;
        }
        public Boolean getAutoBuildIndex() {
            return this.autoBuildIndex;
        }

        public CreateTableRequestDataSource setConfig(CreateTableRequestDataSourceConfig config) {
            this.config = config;
            return this;
        }
        public CreateTableRequestDataSourceConfig getConfig() {
            return this.config;
        }

        public CreateTableRequestDataSource setDataTimeSec(Integer dataTimeSec) {
            this.dataTimeSec = dataTimeSec;
            return this;
        }
        public Integer getDataTimeSec() {
            return this.dataTimeSec;
        }

        public CreateTableRequestDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateTableRequestVectorIndexAdvanceParams extends TeaModel {
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

        public static CreateTableRequestVectorIndexAdvanceParams build(java.util.Map<String, ?> map) throws Exception {
            CreateTableRequestVectorIndexAdvanceParams self = new CreateTableRequestVectorIndexAdvanceParams();
            return TeaModel.build(map, self);
        }

        public CreateTableRequestVectorIndexAdvanceParams setBuildIndexParams(String buildIndexParams) {
            this.buildIndexParams = buildIndexParams;
            return this;
        }
        public String getBuildIndexParams() {
            return this.buildIndexParams;
        }

        public CreateTableRequestVectorIndexAdvanceParams setLinearBuildThreshold(String linearBuildThreshold) {
            this.linearBuildThreshold = linearBuildThreshold;
            return this;
        }
        public String getLinearBuildThreshold() {
            return this.linearBuildThreshold;
        }

        public CreateTableRequestVectorIndexAdvanceParams setMinScanDocCnt(String minScanDocCnt) {
            this.minScanDocCnt = minScanDocCnt;
            return this;
        }
        public String getMinScanDocCnt() {
            return this.minScanDocCnt;
        }

        public CreateTableRequestVectorIndexAdvanceParams setSearchIndexParams(String searchIndexParams) {
            this.searchIndexParams = searchIndexParams;
            return this;
        }
        public String getSearchIndexParams() {
            return this.searchIndexParams;
        }

    }

    public static class CreateTableRequestVectorIndex extends TeaModel {
        /**
         * <p>The configurations of the index schema.</p>
         */
        @NameInMap("advanceParams")
        public CreateTableRequestVectorIndexAdvanceParams advanceParams;

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
         * <p>case_index</p>
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

        public static CreateTableRequestVectorIndex build(java.util.Map<String, ?> map) throws Exception {
            CreateTableRequestVectorIndex self = new CreateTableRequestVectorIndex();
            return TeaModel.build(map, self);
        }

        public CreateTableRequestVectorIndex setAdvanceParams(CreateTableRequestVectorIndexAdvanceParams advanceParams) {
            this.advanceParams = advanceParams;
            return this;
        }
        public CreateTableRequestVectorIndexAdvanceParams getAdvanceParams() {
            return this.advanceParams;
        }

        public CreateTableRequestVectorIndex setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public CreateTableRequestVectorIndex setDistanceType(String distanceType) {
            this.distanceType = distanceType;
            return this;
        }
        public String getDistanceType() {
            return this.distanceType;
        }

        public CreateTableRequestVectorIndex setIndexName(String indexName) {
            this.indexName = indexName;
            return this;
        }
        public String getIndexName() {
            return this.indexName;
        }

        public CreateTableRequestVectorIndex setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateTableRequestVectorIndex setSparseIndexField(String sparseIndexField) {
            this.sparseIndexField = sparseIndexField;
            return this;
        }
        public String getSparseIndexField() {
            return this.sparseIndexField;
        }

        public CreateTableRequestVectorIndex setSparseValueField(String sparseValueField) {
            this.sparseValueField = sparseValueField;
            return this;
        }
        public String getSparseValueField() {
            return this.sparseValueField;
        }

        public CreateTableRequestVectorIndex setVectorField(String vectorField) {
            this.vectorField = vectorField;
            return this;
        }
        public String getVectorField() {
            return this.vectorField;
        }

        public CreateTableRequestVectorIndex setVectorIndexType(String vectorIndexType) {
            this.vectorIndexType = vectorIndexType;
            return this;
        }
        public String getVectorIndexType() {
            return this.vectorIndexType;
        }

    }

}
