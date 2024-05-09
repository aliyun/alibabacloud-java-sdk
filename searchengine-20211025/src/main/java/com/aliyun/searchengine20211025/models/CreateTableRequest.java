// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateTableRequest extends TeaModel {
    @NameInMap("dataProcessConfig")
    public java.util.List<CreateTableRequestDataProcessConfig> dataProcessConfig;

    @NameInMap("dataProcessorCount")
    public Integer dataProcessorCount;

    @NameInMap("dataSource")
    public CreateTableRequestDataSource dataSource;

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
    public java.util.List<CreateTableRequestVectorIndex> vectorIndex;

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
         * <p>OSSBucket</p>
         */
        @NameInMap("ossBucket")
        public String ossBucket;

        @NameInMap("ossEndpoint")
        public String ossEndpoint;

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
        @NameInMap("srcFieldConfig")
        public CreateTableRequestDataProcessConfigParamsSrcFieldConfig srcFieldConfig;

        @NameInMap("vectorModal")
        public String vectorModal;

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
        @NameInMap("dstField")
        public String dstField;

        @NameInMap("operator")
        public String operator;

        @NameInMap("params")
        public CreateTableRequestDataProcessConfigParams params;

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
        @NameInMap("accessKey")
        public String accessKey;

        @NameInMap("accessSecret")
        public String accessSecret;

        /**
         * <p>oss bucket</p>
         */
        @NameInMap("bucket")
        public String bucket;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("ossPath")
        public String ossPath;

        @NameInMap("partition")
        public String partition;

        @NameInMap("project")
        public String project;

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
        @NameInMap("autoBuildIndex")
        public Boolean autoBuildIndex;

        @NameInMap("config")
        public CreateTableRequestDataSourceConfig config;

        @NameInMap("dataTimeSec")
        public Integer dataTimeSec;

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
        @NameInMap("buildIndexParams")
        public String buildIndexParams;

        @NameInMap("linearBuildThreshold")
        public String linearBuildThreshold;

        @NameInMap("minScanDocCnt")
        public String minScanDocCnt;

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
        @NameInMap("advanceParams")
        public CreateTableRequestVectorIndexAdvanceParams advanceParams;

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
