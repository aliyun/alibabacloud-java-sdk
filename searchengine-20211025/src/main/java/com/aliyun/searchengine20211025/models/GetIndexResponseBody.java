// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetIndexResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4FB0325E-8C37-5525-96AC-0333523170A3</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the index.</p>
     */
    @NameInMap("result")
    public GetIndexResponseBodyResult result;

    public static GetIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIndexResponseBody self = new GetIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIndexResponseBody setResult(GetIndexResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetIndexResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetIndexResponseBodyResultDataSourceInfoConfig extends TeaModel {
        @NameInMap("accessKey")
        public String accessKey;

        @NameInMap("accessSecret")
        public String accessSecret;

        @NameInMap("bucket")
        public String bucket;

        /**
         * <p>A parameter related to MaxCompute.</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>A parameter related to SARO.</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>A parameter related to OSS.</p>
         */
        @NameInMap("ossPath")
        public String ossPath;

        @NameInMap("partition")
        public String partition;

        /**
         * <p>A parameter related to Apsara File Storage for HDFS.</p>
         */
        @NameInMap("path")
        public String path;

        @NameInMap("project")
        public String project;

        /**
         * <p>A parameter related to SARO and MaxCompute.</p>
         */
        @NameInMap("table")
        public String table;

        public static GetIndexResponseBodyResultDataSourceInfoConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIndexResponseBodyResultDataSourceInfoConfig self = new GetIndexResponseBodyResultDataSourceInfoConfig();
            return TeaModel.build(map, self);
        }

        public GetIndexResponseBodyResultDataSourceInfoConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public GetIndexResponseBodyResultDataSourceInfoConfig setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public GetIndexResponseBodyResultDataSourceInfoConfig setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetIndexResponseBodyResultDataSourceInfoConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetIndexResponseBodyResultDataSourceInfoConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetIndexResponseBodyResultDataSourceInfoConfig setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public GetIndexResponseBodyResultDataSourceInfoConfig setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

        public GetIndexResponseBodyResultDataSourceInfoConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetIndexResponseBodyResultDataSourceInfoConfig setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public GetIndexResponseBodyResultDataSourceInfoConfig setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class GetIndexResponseBodyResultDataSourceInfoSaroConfig extends TeaModel {
        @NameInMap("namespace")
        public String namespace;

        @NameInMap("tableName")
        public String tableName;

        public static GetIndexResponseBodyResultDataSourceInfoSaroConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIndexResponseBodyResultDataSourceInfoSaroConfig self = new GetIndexResponseBodyResultDataSourceInfoSaroConfig();
            return TeaModel.build(map, self);
        }

        public GetIndexResponseBodyResultDataSourceInfoSaroConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetIndexResponseBodyResultDataSourceInfoSaroConfig setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class GetIndexResponseBodyResultDataSourceInfo extends TeaModel {
        /**
         * <p>Indicates whether the automatic full indexing feature is enabled.</p>
         */
        @NameInMap("autoBuildIndex")
        public Boolean autoBuildIndex;

        /**
         * <p>The configuration of MaxCompute data sources.</p>
         */
        @NameInMap("config")
        public GetIndexResponseBodyResultDataSourceInfoConfig config;

        /**
         * <p>The offline deployment name of the data source.</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The name of the data source.</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("processParallelNum")
        public Integer processParallelNum;

        /**
         * <p>The number of resources used for data update.</p>
         */
        @NameInMap("processPartitionCount")
        public Integer processPartitionCount;

        /**
         * <p>The configuration of SARO data sources.</p>
         */
        @NameInMap("saroConfig")
        public GetIndexResponseBodyResultDataSourceInfoSaroConfig saroConfig;

        /**
         * <p>The type of the data source. Valid values: odps, swift, saro, oss, and unKnow.</p>
         */
        @NameInMap("type")
        public String type;

        public static GetIndexResponseBodyResultDataSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetIndexResponseBodyResultDataSourceInfo self = new GetIndexResponseBodyResultDataSourceInfo();
            return TeaModel.build(map, self);
        }

        public GetIndexResponseBodyResultDataSourceInfo setAutoBuildIndex(Boolean autoBuildIndex) {
            this.autoBuildIndex = autoBuildIndex;
            return this;
        }
        public Boolean getAutoBuildIndex() {
            return this.autoBuildIndex;
        }

        public GetIndexResponseBodyResultDataSourceInfo setConfig(GetIndexResponseBodyResultDataSourceInfoConfig config) {
            this.config = config;
            return this;
        }
        public GetIndexResponseBodyResultDataSourceInfoConfig getConfig() {
            return this.config;
        }

        public GetIndexResponseBodyResultDataSourceInfo setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetIndexResponseBodyResultDataSourceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetIndexResponseBodyResultDataSourceInfo setProcessParallelNum(Integer processParallelNum) {
            this.processParallelNum = processParallelNum;
            return this;
        }
        public Integer getProcessParallelNum() {
            return this.processParallelNum;
        }

        public GetIndexResponseBodyResultDataSourceInfo setProcessPartitionCount(Integer processPartitionCount) {
            this.processPartitionCount = processPartitionCount;
            return this;
        }
        public Integer getProcessPartitionCount() {
            return this.processPartitionCount;
        }

        public GetIndexResponseBodyResultDataSourceInfo setSaroConfig(GetIndexResponseBodyResultDataSourceInfoSaroConfig saroConfig) {
            this.saroConfig = saroConfig;
            return this;
        }
        public GetIndexResponseBodyResultDataSourceInfoSaroConfig getSaroConfig() {
            return this.saroConfig;
        }

        public GetIndexResponseBodyResultDataSourceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetIndexResponseBodyResultVersionsFiles extends TeaModel {
        /**
         * <p>The full path of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot; &quot;</p>
         */
        @NameInMap("fullPathName")
        public String fullPathName;

        /**
         * <p>Indicates whether the file is a directory.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("isDir")
        public Boolean isDir;

        /**
         * <p>Indicates whether the file is a template.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("isTemplate")
        public Boolean isTemplate;

        @NameInMap("name")
        public String name;

        public static GetIndexResponseBodyResultVersionsFiles build(java.util.Map<String, ?> map) throws Exception {
            GetIndexResponseBodyResultVersionsFiles self = new GetIndexResponseBodyResultVersionsFiles();
            return TeaModel.build(map, self);
        }

        public GetIndexResponseBodyResultVersionsFiles setFullPathName(String fullPathName) {
            this.fullPathName = fullPathName;
            return this;
        }
        public String getFullPathName() {
            return this.fullPathName;
        }

        public GetIndexResponseBodyResultVersionsFiles setIsDir(Boolean isDir) {
            this.isDir = isDir;
            return this;
        }
        public Boolean getIsDir() {
            return this.isDir;
        }

        public GetIndexResponseBodyResultVersionsFiles setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public GetIndexResponseBodyResultVersionsFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetIndexResponseBodyResultVersions extends TeaModel {
        /**
         * <p>The description of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>close alarm, by 3.9.2 hotfix workflow</p>
         */
        @NameInMap("desc")
        public String desc;

        /**
         * <p>The information about the files.</p>
         */
        @NameInMap("files")
        public java.util.List<GetIndexResponseBodyResultVersionsFiles> files;

        /**
         * <p>The name of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-7pp2ngv4s02_qrs</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The status of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The last time when the version was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot; &quot;</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        /**
         * <p>The ID of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("versionId")
        public Integer versionId;

        public static GetIndexResponseBodyResultVersions build(java.util.Map<String, ?> map) throws Exception {
            GetIndexResponseBodyResultVersions self = new GetIndexResponseBodyResultVersions();
            return TeaModel.build(map, self);
        }

        public GetIndexResponseBodyResultVersions setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetIndexResponseBodyResultVersions setFiles(java.util.List<GetIndexResponseBodyResultVersionsFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<GetIndexResponseBodyResultVersionsFiles> getFiles() {
            return this.files;
        }

        public GetIndexResponseBodyResultVersions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetIndexResponseBodyResultVersions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetIndexResponseBodyResultVersions setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetIndexResponseBodyResultVersions setVersionId(Integer versionId) {
            this.versionId = versionId;
            return this;
        }
        public Integer getVersionId() {
            return this.versionId;
        }

    }

    public static class GetIndexResponseBodyResult extends TeaModel {
        @NameInMap("cluster")
        public java.util.Map<String, ResultClusterValue> cluster;

        @NameInMap("config")
        public java.util.Map<String, java.util.Map<String, ?>> config;

        @NameInMap("configWhenBuild")
        public java.util.Map<String, java.util.Map<String, ?>> configWhenBuild;

        /**
         * <p>The content of the index.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>ha-cn-tl32nd2nq01_00</p>
         */
        @NameInMap("dataSource")
        public String dataSource;

        /**
         * <p>The information about the data source.</p>
         */
        @NameInMap("dataSourceInfo")
        public GetIndexResponseBodyResultDataSourceInfo dataSourceInfo;

        /**
         * <p>The remarks.</p>
         */
        @NameInMap("description")
        public String description;

        @NameInMap("domain")
        public String domain;

        /**
         * <p>The last time when full data in the index was updated.</p>
         */
        @NameInMap("fullUpdateTime")
        public String fullUpdateTime;

        /**
         * <p>The version of the data.</p>
         */
        @NameInMap("fullVersion")
        public Long fullVersion;

        /**
         * <p>The last time when incremental data in the index was updated.</p>
         */
        @NameInMap("incUpdateTime")
        public String incUpdateTime;

        /**
         * <p>The index size.</p>
         */
        @NameInMap("indexSize")
        public Long indexSize;

        /**
         * <p>The status of the index. Valid values: NEW, PUBLISH, IN_USE, NOT_USE, STOP_USE, and RESTORE_USE. After a Retrieval Engine Edition instance is created, it enters the IN_USE state.</p>
         */
        @NameInMap("indexStatus")
        public String indexStatus;

        /**
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The number of shards.</p>
         */
        @NameInMap("partition")
        public Integer partition;

        /**
         * <p>The information about the versions.</p>
         */
        @NameInMap("versions")
        public java.util.List<GetIndexResponseBodyResultVersions> versions;

        public static GetIndexResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetIndexResponseBodyResult self = new GetIndexResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetIndexResponseBodyResult setCluster(java.util.Map<String, ResultClusterValue> cluster) {
            this.cluster = cluster;
            return this;
        }
        public java.util.Map<String, ResultClusterValue> getCluster() {
            return this.cluster;
        }

        public GetIndexResponseBodyResult setConfig(java.util.Map<String, java.util.Map<String, ?>> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getConfig() {
            return this.config;
        }

        public GetIndexResponseBodyResult setConfigWhenBuild(java.util.Map<String, java.util.Map<String, ?>> configWhenBuild) {
            this.configWhenBuild = configWhenBuild;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getConfigWhenBuild() {
            return this.configWhenBuild;
        }

        public GetIndexResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetIndexResponseBodyResult setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public GetIndexResponseBodyResult setDataSourceInfo(GetIndexResponseBodyResultDataSourceInfo dataSourceInfo) {
            this.dataSourceInfo = dataSourceInfo;
            return this;
        }
        public GetIndexResponseBodyResultDataSourceInfo getDataSourceInfo() {
            return this.dataSourceInfo;
        }

        public GetIndexResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetIndexResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetIndexResponseBodyResult setFullUpdateTime(String fullUpdateTime) {
            this.fullUpdateTime = fullUpdateTime;
            return this;
        }
        public String getFullUpdateTime() {
            return this.fullUpdateTime;
        }

        public GetIndexResponseBodyResult setFullVersion(Long fullVersion) {
            this.fullVersion = fullVersion;
            return this;
        }
        public Long getFullVersion() {
            return this.fullVersion;
        }

        public GetIndexResponseBodyResult setIncUpdateTime(String incUpdateTime) {
            this.incUpdateTime = incUpdateTime;
            return this;
        }
        public String getIncUpdateTime() {
            return this.incUpdateTime;
        }

        public GetIndexResponseBodyResult setIndexSize(Long indexSize) {
            this.indexSize = indexSize;
            return this;
        }
        public Long getIndexSize() {
            return this.indexSize;
        }

        public GetIndexResponseBodyResult setIndexStatus(String indexStatus) {
            this.indexStatus = indexStatus;
            return this;
        }
        public String getIndexStatus() {
            return this.indexStatus;
        }

        public GetIndexResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetIndexResponseBodyResult setPartition(Integer partition) {
            this.partition = partition;
            return this;
        }
        public Integer getPartition() {
            return this.partition;
        }

        public GetIndexResponseBodyResult setVersions(java.util.List<GetIndexResponseBodyResultVersions> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<GetIndexResponseBodyResultVersions> getVersions() {
            return this.versions;
        }

    }

}
