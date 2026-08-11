// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetTableResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2AE63638-5420-56DC-BF59-37D8174039A0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Response result</p>
     */
    @NameInMap("result")
    public GetTableResponseBodyResult result;

    public static GetTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableResponseBody self = new GetTableResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableResponseBody setResult(GetTableResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetTableResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetTableResponseBodyResultDataProcessConfigParamsSrcFieldConfig extends TeaModel {
        /**
         * <p>OSS Bucket</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ossBucket")
        public String ossBucket;

        /**
         * <p>OSS region endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou-internal.aliyuncs.com</p>
         */
        @NameInMap("ossEndpoint")
        public String ossEndpoint;

        /**
         * <p>Cloud account ID</p>
         * 
         * <strong>example:</strong>
         * <p>uid</p>
         */
        @NameInMap("uid")
        public String uid;

        public static GetTableResponseBodyResultDataProcessConfigParamsSrcFieldConfig build(java.util.Map<String, ?> map) throws Exception {
            GetTableResponseBodyResultDataProcessConfigParamsSrcFieldConfig self = new GetTableResponseBodyResultDataProcessConfigParamsSrcFieldConfig();
            return TeaModel.build(map, self);
        }

        public GetTableResponseBodyResultDataProcessConfigParamsSrcFieldConfig setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public GetTableResponseBodyResultDataProcessConfigParamsSrcFieldConfig setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public GetTableResponseBodyResultDataProcessConfigParamsSrcFieldConfig setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class GetTableResponseBodyResultDataProcessConfigParams extends TeaModel {
        /**
         * <p>Vectorization information source</p>
         */
        @NameInMap("srcFieldConfig")
        public GetTableResponseBodyResultDataProcessConfigParamsSrcFieldConfig srcFieldConfig;

        /**
         * <p>Data type</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("vectorModal")
        public String vectorModal;

        /**
         * <p>Vectorization model</p>
         * 
         * <strong>example:</strong>
         * <p>clip</p>
         */
        @NameInMap("vectorModel")
        public String vectorModel;

        public static GetTableResponseBodyResultDataProcessConfigParams build(java.util.Map<String, ?> map) throws Exception {
            GetTableResponseBodyResultDataProcessConfigParams self = new GetTableResponseBodyResultDataProcessConfigParams();
            return TeaModel.build(map, self);
        }

        public GetTableResponseBodyResultDataProcessConfigParams setSrcFieldConfig(GetTableResponseBodyResultDataProcessConfigParamsSrcFieldConfig srcFieldConfig) {
            this.srcFieldConfig = srcFieldConfig;
            return this;
        }
        public GetTableResponseBodyResultDataProcessConfigParamsSrcFieldConfig getSrcFieldConfig() {
            return this.srcFieldConfig;
        }

        public GetTableResponseBodyResultDataProcessConfigParams setVectorModal(String vectorModal) {
            this.vectorModal = vectorModal;
            return this;
        }
        public String getVectorModal() {
            return this.vectorModal;
        }

        public GetTableResponseBodyResultDataProcessConfigParams setVectorModel(String vectorModel) {
            this.vectorModel = vectorModel;
            return this;
        }
        public String getVectorModel() {
            return this.vectorModel;
        }

    }

    public static class GetTableResponseBodyResultDataProcessConfig extends TeaModel {
        /**
         * <p>Target field</p>
         * 
         * <strong>example:</strong>
         * <p>source_image_vector</p>
         */
        @NameInMap("dstField")
        public String dstField;

        /**
         * <p>Field processing method (copy: copies the source field to the target field, vectorize: vectorizes the source field using a model and stores the vector in the target field)</p>
         * 
         * <strong>example:</strong>
         * <p>vectorize</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>Model configuration information</p>
         */
        @NameInMap("params")
        public GetTableResponseBodyResultDataProcessConfigParams params;

        /**
         * <p>Source field</p>
         * 
         * <strong>example:</strong>
         * <p>source_image</p>
         */
        @NameInMap("srcField")
        public String srcField;

        public static GetTableResponseBodyResultDataProcessConfig build(java.util.Map<String, ?> map) throws Exception {
            GetTableResponseBodyResultDataProcessConfig self = new GetTableResponseBodyResultDataProcessConfig();
            return TeaModel.build(map, self);
        }

        public GetTableResponseBodyResultDataProcessConfig setDstField(String dstField) {
            this.dstField = dstField;
            return this;
        }
        public String getDstField() {
            return this.dstField;
        }

        public GetTableResponseBodyResultDataProcessConfig setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetTableResponseBodyResultDataProcessConfig setParams(GetTableResponseBodyResultDataProcessConfigParams params) {
            this.params = params;
            return this;
        }
        public GetTableResponseBodyResultDataProcessConfigParams getParams() {
            return this.params;
        }

        public GetTableResponseBodyResultDataProcessConfig setSrcField(String srcField) {
            this.srcField = srcField;
            return this;
        }
        public String getSrcField() {
            return this.srcField;
        }

    }

    public static class GetTableResponseBodyResultDataSourceConfig extends TeaModel {
        /**
         * <p>AK</p>
         * 
         * <strong>example:</strong>
         * <p>ak</p>
         */
        @NameInMap("accessKey")
        public String accessKey;

        /**
         * <p>AS</p>
         * 
         * <strong>example:</strong>
         * <p>as</p>
         */
        @NameInMap("accessSecret")
        public String accessSecret;

        /**
         * <p>OSS namespace</p>
         * 
         * <strong>example:</strong>
         * <p>heytea-ops-oss</p>
         */
        @NameInMap("bucket")
        public String bucket;

        /**
         * <p>ODPS-related</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api">http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>saro-related</p>
         * 
         * <strong>example:</strong>
         * <p>namespace</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>OSS file path</p>
         * 
         * <strong>example:</strong>
         * <p>/opensearch_index_data/sift_oss_test.data</p>
         */
        @NameInMap("ossPath")
        public String ossPath;

        /**
         * <p>Partition information</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20220808</p>
         */
        @NameInMap("partition")
        public String partition;

        /**
         * <p>HDFS-related</p>
         * 
         * <strong>example:</strong>
         * <p>vendor/sebastian/comparator/src/exceptions</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>ODPS data source project name</p>
         * 
         * <strong>example:</strong>
         * <p>dp_pdm_marketing_prod</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>saro/ODPS data source table name</p>
         * 
         * <strong>example:</strong>
         * <p>test_add</p>
         */
        @NameInMap("table")
        public String table;

        public static GetTableResponseBodyResultDataSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            GetTableResponseBodyResultDataSourceConfig self = new GetTableResponseBodyResultDataSourceConfig();
            return TeaModel.build(map, self);
        }

        public GetTableResponseBodyResultDataSourceConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public GetTableResponseBodyResultDataSourceConfig setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public GetTableResponseBodyResultDataSourceConfig setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetTableResponseBodyResultDataSourceConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetTableResponseBodyResultDataSourceConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetTableResponseBodyResultDataSourceConfig setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public GetTableResponseBodyResultDataSourceConfig setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

        public GetTableResponseBodyResultDataSourceConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetTableResponseBodyResultDataSourceConfig setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public GetTableResponseBodyResultDataSourceConfig setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class GetTableResponseBodyResultDataSource extends TeaModel {
        /**
         * <p>Whether to automatically rebuild the index</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoBuildIndex")
        public Boolean autoBuildIndex;

        /**
         * <p>Data source configuration</p>
         */
        @NameInMap("config")
        public GetTableResponseBodyResultDataSourceConfig config;

        /**
         * <p>Incremental data timestamp</p>
         * 
         * <strong>example:</strong>
         * <p>1715160176</p>
         */
        @NameInMap("dataTimeSec")
        public Integer dataTimeSec;

        /**
         * <p>Data source type: only supports three types: odps, swift, and oss (odps, swift, saro, oss, unKnow)</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
         */
        @NameInMap("type")
        public String type;

        public static GetTableResponseBodyResultDataSource build(java.util.Map<String, ?> map) throws Exception {
            GetTableResponseBodyResultDataSource self = new GetTableResponseBodyResultDataSource();
            return TeaModel.build(map, self);
        }

        public GetTableResponseBodyResultDataSource setAutoBuildIndex(Boolean autoBuildIndex) {
            this.autoBuildIndex = autoBuildIndex;
            return this;
        }
        public Boolean getAutoBuildIndex() {
            return this.autoBuildIndex;
        }

        public GetTableResponseBodyResultDataSource setConfig(GetTableResponseBodyResultDataSourceConfig config) {
            this.config = config;
            return this;
        }
        public GetTableResponseBodyResultDataSourceConfig getConfig() {
            return this.config;
        }

        public GetTableResponseBodyResultDataSource setDataTimeSec(Integer dataTimeSec) {
            this.dataTimeSec = dataTimeSec;
            return this;
        }
        public Integer getDataTimeSec() {
            return this.dataTimeSec;
        }

        public GetTableResponseBodyResultDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTableResponseBodyResultVectorIndexAdvanceParams extends TeaModel {
        /**
         * <p>Index building parameters</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;proxima.qc.builder.quantizer_class&quot;: &quot;Int8QuantizerConverter&quot;,
         *   &quot;proxima.qc.builder.quantize_by_centroid&quot;: true,
         *   &quot;proxima.qc.builder.optimizer_class&quot;: &quot;BruteForceBuilder&quot;,
         *   &quot;proxima.qc.builder.thread_count&quot;: 10,
         *   &quot;proxima.qc.builder.optimizer_params&quot;: {
         *     &quot;proxima.linear.builder.column_major_order&quot;: true
         *   },
         *   &quot;proxima.qc.builder.store_original_features&quot;: false,
         *   &quot;proxima.qc.builder.train_sample_count&quot;: 3000000,
         *   &quot;proxima.qc.builder.train_sample_ratio&quot;: 0.5
         * }</p>
         */
        @NameInMap("buildIndexParams")
        public String buildIndexParams;

        /**
         * <p>Linear build threshold</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("linearBuildThreshold")
        public String linearBuildThreshold;

        /**
         * <p>Minimum number of recall candidates</p>
         * 
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("minScanDocCnt")
        public String minScanDocCnt;

        /**
         * <p>Index search parameters</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;proxima.qc.searcher.scan_ratio&quot;:0.01}</p>
         */
        @NameInMap("searchIndexParams")
        public String searchIndexParams;

        public static GetTableResponseBodyResultVectorIndexAdvanceParams build(java.util.Map<String, ?> map) throws Exception {
            GetTableResponseBodyResultVectorIndexAdvanceParams self = new GetTableResponseBodyResultVectorIndexAdvanceParams();
            return TeaModel.build(map, self);
        }

        public GetTableResponseBodyResultVectorIndexAdvanceParams setBuildIndexParams(String buildIndexParams) {
            this.buildIndexParams = buildIndexParams;
            return this;
        }
        public String getBuildIndexParams() {
            return this.buildIndexParams;
        }

        public GetTableResponseBodyResultVectorIndexAdvanceParams setLinearBuildThreshold(String linearBuildThreshold) {
            this.linearBuildThreshold = linearBuildThreshold;
            return this;
        }
        public String getLinearBuildThreshold() {
            return this.linearBuildThreshold;
        }

        public GetTableResponseBodyResultVectorIndexAdvanceParams setMinScanDocCnt(String minScanDocCnt) {
            this.minScanDocCnt = minScanDocCnt;
            return this;
        }
        public String getMinScanDocCnt() {
            return this.minScanDocCnt;
        }

        public GetTableResponseBodyResultVectorIndexAdvanceParams setSearchIndexParams(String searchIndexParams) {
            this.searchIndexParams = searchIndexParams;
            return this;
        }
        public String getSearchIndexParams() {
            return this.searchIndexParams;
        }

    }

    public static class GetTableResponseBodyResultVectorIndex extends TeaModel {
        /**
         * <p>Index structure configuration</p>
         */
        @NameInMap("advanceParams")
        public GetTableResponseBodyResultVectorIndexAdvanceParams advanceParams;

        /**
         * <p>Vector dimension</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("dimension")
        public String dimension;

        /**
         * <p>Distance type</p>
         * 
         * <strong>example:</strong>
         * <p>SquaredEuclidean</p>
         */
        @NameInMap("distanceType")
        public String distanceType;

        /**
         * <p>Index structure name</p>
         * 
         * <strong>example:</strong>
         * <p>test_odps</p>
         */
        @NameInMap("indexName")
        public String indexName;

        /**
         * <p>Namespace field</p>
         * 
         * <strong>example:</strong>
         * <p>namespace</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>Sparse vector index field</p>
         * 
         * <strong>example:</strong>
         * <p>sparse_indices</p>
         */
        @NameInMap("sparseIndexField")
        public String sparseIndexField;

        /**
         * <p>Sparse vector value field</p>
         * 
         * <strong>example:</strong>
         * <p>sparse_values</p>
         */
        @NameInMap("sparseValueField")
        public String sparseValueField;

        /**
         * <p>Vector field</p>
         * 
         * <strong>example:</strong>
         * <p>source_image_vector</p>
         */
        @NameInMap("vectorField")
        public String vectorField;

        /**
         * <p>Vector index algorithm</p>
         * 
         * <strong>example:</strong>
         * <p>Qc</p>
         */
        @NameInMap("vectorIndexType")
        public String vectorIndexType;

        public static GetTableResponseBodyResultVectorIndex build(java.util.Map<String, ?> map) throws Exception {
            GetTableResponseBodyResultVectorIndex self = new GetTableResponseBodyResultVectorIndex();
            return TeaModel.build(map, self);
        }

        public GetTableResponseBodyResultVectorIndex setAdvanceParams(GetTableResponseBodyResultVectorIndexAdvanceParams advanceParams) {
            this.advanceParams = advanceParams;
            return this;
        }
        public GetTableResponseBodyResultVectorIndexAdvanceParams getAdvanceParams() {
            return this.advanceParams;
        }

        public GetTableResponseBodyResultVectorIndex setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public GetTableResponseBodyResultVectorIndex setDistanceType(String distanceType) {
            this.distanceType = distanceType;
            return this;
        }
        public String getDistanceType() {
            return this.distanceType;
        }

        public GetTableResponseBodyResultVectorIndex setIndexName(String indexName) {
            this.indexName = indexName;
            return this;
        }
        public String getIndexName() {
            return this.indexName;
        }

        public GetTableResponseBodyResultVectorIndex setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetTableResponseBodyResultVectorIndex setSparseIndexField(String sparseIndexField) {
            this.sparseIndexField = sparseIndexField;
            return this;
        }
        public String getSparseIndexField() {
            return this.sparseIndexField;
        }

        public GetTableResponseBodyResultVectorIndex setSparseValueField(String sparseValueField) {
            this.sparseValueField = sparseValueField;
            return this;
        }
        public String getSparseValueField() {
            return this.sparseValueField;
        }

        public GetTableResponseBodyResultVectorIndex setVectorField(String vectorField) {
            this.vectorField = vectorField;
            return this;
        }
        public String getVectorField() {
            return this.vectorField;
        }

        public GetTableResponseBodyResultVectorIndex setVectorIndexType(String vectorIndexType) {
            this.vectorIndexType = vectorIndexType;
            return this;
        }
        public String getVectorIndexType() {
            return this.vectorIndexType;
        }

    }

    public static class GetTableResponseBodyResult extends TeaModel {
        /**
         * <p>Field processing configuration</p>
         */
        @NameInMap("dataProcessConfig")
        public java.util.List<GetTableResponseBodyResultDataProcessConfig> dataProcessConfig;

        /**
         * <p>Number of data update resources</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("dataProcessorCount")
        public Integer dataProcessorCount;

        /**
         * <p>Data source configuration</p>
         */
        @NameInMap("dataSource")
        public GetTableResponseBodyResultDataSource dataSource;

        /**
         * <p>Field map collection, key: field name, value: field type</p>
         */
        @NameInMap("fieldSchema")
        public java.util.Map<String, String> fieldSchema;

        /**
         * <p>Index name</p>
         * 
         * <strong>example:</strong>
         * <p>test_oss</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Number of data shards</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("partitionCount")
        public Integer partitionCount;

        /**
         * <p>Primary key field</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("primaryKey")
        public String primaryKey;

        /**
         * <p>If the user provides rawSchema, it is used directly as the HA3 schema structure without manual assembly</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("rawSchema")
        public String rawSchema;

        /**
         * <p>Index table status (NEW, PUBLISH, IN_USE: normal status after the recall engine version is created successfully, NOT_USE, STOP_USE, RESTORE_USE, FAIL: status when a new version of the vector retrieval version fails to create an index for the first time)</p>
         * 
         * <strong>example:</strong>
         * <p>IN_USE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Index structure</p>
         */
        @NameInMap("vectorIndex")
        public java.util.List<GetTableResponseBodyResultVectorIndex> vectorIndex;

        public static GetTableResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetTableResponseBodyResult self = new GetTableResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetTableResponseBodyResult setDataProcessConfig(java.util.List<GetTableResponseBodyResultDataProcessConfig> dataProcessConfig) {
            this.dataProcessConfig = dataProcessConfig;
            return this;
        }
        public java.util.List<GetTableResponseBodyResultDataProcessConfig> getDataProcessConfig() {
            return this.dataProcessConfig;
        }

        public GetTableResponseBodyResult setDataProcessorCount(Integer dataProcessorCount) {
            this.dataProcessorCount = dataProcessorCount;
            return this;
        }
        public Integer getDataProcessorCount() {
            return this.dataProcessorCount;
        }

        public GetTableResponseBodyResult setDataSource(GetTableResponseBodyResultDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public GetTableResponseBodyResultDataSource getDataSource() {
            return this.dataSource;
        }

        public GetTableResponseBodyResult setFieldSchema(java.util.Map<String, String> fieldSchema) {
            this.fieldSchema = fieldSchema;
            return this;
        }
        public java.util.Map<String, String> getFieldSchema() {
            return this.fieldSchema;
        }

        public GetTableResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTableResponseBodyResult setPartitionCount(Integer partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }
        public Integer getPartitionCount() {
            return this.partitionCount;
        }

        public GetTableResponseBodyResult setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public GetTableResponseBodyResult setRawSchema(String rawSchema) {
            this.rawSchema = rawSchema;
            return this;
        }
        public String getRawSchema() {
            return this.rawSchema;
        }

        public GetTableResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTableResponseBodyResult setVectorIndex(java.util.List<GetTableResponseBodyResultVectorIndex> vectorIndex) {
            this.vectorIndex = vectorIndex;
            return this;
        }
        public java.util.List<GetTableResponseBodyResultVectorIndex> getVectorIndex() {
            return this.vectorIndex;
        }

    }

}
