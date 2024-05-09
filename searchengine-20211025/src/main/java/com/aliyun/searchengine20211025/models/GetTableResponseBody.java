// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetTableResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

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
         */
        @NameInMap("ossBucket")
        public String ossBucket;

        @NameInMap("ossEndpoint")
        public String ossEndpoint;

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
        @NameInMap("srcFieldConfig")
        public GetTableResponseBodyResultDataProcessConfigParamsSrcFieldConfig srcFieldConfig;

        @NameInMap("vectorModal")
        public String vectorModal;

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
        @NameInMap("dstField")
        public String dstField;

        @NameInMap("operator")
        public String operator;

        @NameInMap("params")
        public GetTableResponseBodyResultDataProcessConfigParams params;

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
         */
        @NameInMap("accessKey")
        public String accessKey;

        /**
         * <p>AS</p>
         */
        @NameInMap("accessSecret")
        public String accessSecret;

        @NameInMap("bucket")
        public String bucket;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("ossPath")
        public String ossPath;

        @NameInMap("partition")
        public String partition;

        @NameInMap("path")
        public String path;

        @NameInMap("project")
        public String project;

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
        @NameInMap("autoBuildIndex")
        public Boolean autoBuildIndex;

        @NameInMap("config")
        public GetTableResponseBodyResultDataSourceConfig config;

        @NameInMap("dataTimeSec")
        public Integer dataTimeSec;

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
        @NameInMap("buildIndexParams")
        public String buildIndexParams;

        @NameInMap("linearBuildThreshold")
        public String linearBuildThreshold;

        @NameInMap("minScanDocCnt")
        public String minScanDocCnt;

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
        @NameInMap("advanceParams")
        public GetTableResponseBodyResultVectorIndexAdvanceParams advanceParams;

        @NameInMap("dimension")
        public String dimension;

        @NameInMap("distanceType")
        public String distanceType;

        @NameInMap("indexName")
        public String indexName;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("sparseIndexField")
        public String sparseIndexField;

        @NameInMap("sparseValueField")
        public String sparseValueField;

        @NameInMap("vectorField")
        public String vectorField;

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
        @NameInMap("dataProcessConfig")
        public java.util.List<GetTableResponseBodyResultDataProcessConfig> dataProcessConfig;

        @NameInMap("dataProcessorCount")
        public Integer dataProcessorCount;

        @NameInMap("dataSource")
        public GetTableResponseBodyResultDataSource dataSource;

        @NameInMap("fieldSchema")
        public java.util.Map<String, String> fieldSchema;

        @NameInMap("name")
        public String name;

        @NameInMap("partitionCount")
        public Integer partitionCount;

        @NameInMap("primaryKey")
        public String primaryKey;

        @NameInMap("rawSchema")
        public String rawSchema;

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

        public GetTableResponseBodyResult setVectorIndex(java.util.List<GetTableResponseBodyResultVectorIndex> vectorIndex) {
            this.vectorIndex = vectorIndex;
            return this;
        }
        public java.util.List<GetTableResponseBodyResultVectorIndex> getVectorIndex() {
            return this.vectorIndex;
        }

    }

}
