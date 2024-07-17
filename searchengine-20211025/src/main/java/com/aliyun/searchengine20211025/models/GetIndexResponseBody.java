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
     * <p>The index information.</p>
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
        /**
         * <p>The AccessKey ID of the MaxCompute data source.</p>
         * 
         * <strong>example:</strong>
         * <p>L***p</p>
         */
        @NameInMap("accessKey")
        public String accessKey;

        /**
         * <p>The AccessKey secret of the MaxCompute data source.</p>
         * 
         * <strong>example:</strong>
         * <p>5**9a6</p>
         */
        @NameInMap("accessSecret")
        public String accessSecret;

        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>ha3test-oss</p>
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
         * <p>The namespace. This parameter is applicable to the SARO data source used in the intranet of Alibaba Group.</p>
         * 
         * <strong>example:</strong>
         * <p>TEST_dump_demo_sj_na61hunbu2_share_holo</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The Object Storage Service (OSS) path.</p>
         * 
         * <strong>example:</strong>
         * <p>/test_opensearch/sift_oss_test.data</p>
         */
        @NameInMap("ossPath")
        public String ossPath;

        /**
         * <p>The partition in the MaxCompute table. Example: ds=20180102.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20220713</p>
         */
        @NameInMap("partition")
        public String partition;

        /**
         * <p>The file path in the Apsara File Storage for HDFS file system.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://test_opensearch/sift_oss_test.data">http://test_opensearch/sift_oss_test.data</a></p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The name of the MaxCompute project that is used as the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>tisplus_dev</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The name of the MaxCompute table that is used as the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>dump_odps_demo</p>
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
        /**
         * <p>The namespace of the SARO data source.</p>
         * 
         * <strong>example:</strong>
         * <p>TEST_dump_demo_sj_na61hunbu2_share_holo</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The name of the SARO table.</p>
         * 
         * <strong>example:</strong>
         * <p>llm</p>
         */
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
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoBuildIndex")
        public Boolean autoBuildIndex;

        /**
         * <p>The configuration of MaxCompute data sources.</p>
         */
        @NameInMap("config")
        public GetIndexResponseBodyResultDataSourceInfoConfig config;

        /**
         * <p>The data center in which the data source is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc_hz_domain_1</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-pl32rf0****_test_api</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The maximum number of full indexes that can be concurrently processed.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("processParallelNum")
        public Integer processParallelNum;

        /**
         * <p>The number of resources used for data update.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("processPartitionCount")
        public Integer processPartitionCount;

        /**
         * <p>The configurations of the SARO data source.</p>
         */
        @NameInMap("saroConfig")
        public GetIndexResponseBodyResultDataSourceInfoSaroConfig saroConfig;

        /**
         * <p>The type of the data source. Valid values: odps, swift, saro, oss, and unKnow.</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
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

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>qrs.json</p>
         */
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
         * <p>The version name.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-7pp2ngv4s02_qrs</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The status of the index version. Valid values:</p>
         * <ul>
         * <li>NEW: The index version is created.</li>
         * <li>PUBLISH: The index version is normal.</li>
         * <li>IN_USE: The index version is in use.</li>
         * <li>NOT_USE: The index version is not used.</li>
         * <li>STOP_USE: The index version is being stopped.</li>
         * <li>RESTORE_USE: The index version is being restored.</li>
         * <li>FAIL: The index version failed to be created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The time when the index version was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot; &quot;</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        /**
         * <p>The version ID.</p>
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
        /**
         * <p>The cluster information.</p>
         */
        @NameInMap("cluster")
        public java.util.Map<String, ResultClusterValue> cluster;

        /**
         * <p>The configuration information.</p>
         */
        @NameInMap("config")
        public java.util.Map<String, java.util.Map<String, ?>> config;

        /**
         * <p>The configuration that takes effect next time.</p>
         */
        @NameInMap("configWhenBuild")
        public java.util.Map<String, java.util.Map<String, ?>> configWhenBuild;

        /**
         * <p>The file content.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;summarys&quot;:{&quot;parameter&quot;:{&quot;file_compressor&quot;:&quot;zstd&quot;},&quot;summary_fields&quot;:[&quot;id&quot;]},&quot;file_compress&quot;:[{&quot;name&quot;:&quot;file_compressor&quot;,&quot;type&quot;:&quot;zstd&quot;},{&quot;name&quot;:&quot;no_compressor&quot;,&quot;type&quot;:&quot;&quot;}],&quot;indexs&quot;:[{&quot;index_fields&quot;:&quot;name&quot;,&quot;index_name&quot;:&quot;ids&quot;,&quot;index_type&quot;:&quot;STRING&quot;},{&quot;has_primary_key_attribute&quot;:true,&quot;index_fields&quot;:&quot;id&quot;,&quot;is_primary_key_sorted&quot;:false,&quot;index_name&quot;:&quot;id&quot;,&quot;index_type&quot;:&quot;PRIMARYKEY64&quot;}],&quot;attributes&quot;:[{&quot;file_compress&quot;:&quot;no_compressor&quot;,&quot;field_name&quot;:&quot;id&quot;}],&quot;fields&quot;:[{&quot;user_defined_param&quot;:{},&quot;compress_type&quot;:&quot;uniq&quot;,&quot;field_type&quot;:&quot;STRING&quot;,&quot;field_name&quot;:&quot;id&quot;},{&quot;compress_type&quot;:&quot;uniq&quot;,&quot;field_type&quot;:&quot;STRING&quot;,&quot;field_name&quot;:&quot;name&quot;}],&quot;table_name&quot;:&quot;api&quot;}</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The name of the data source.</p>
         * 
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
         * <p>The description of the index version.</p>
         * 
         * <strong>example:</strong>
         * <p>test index</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The deployment name of the index.</p>
         * 
         * <strong>example:</strong>
         * <p>sz_vpc_domain_1</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The time when full data in the index was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-20 08:52:54</p>
         */
        @NameInMap("fullUpdateTime")
        public String fullUpdateTime;

        /**
         * <p>The data version.</p>
         * 
         * <strong>example:</strong>
         * <p>1688523414</p>
         */
        @NameInMap("fullVersion")
        public Long fullVersion;

        /**
         * <p>The time when incremental data in the index was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-20 08:52:54</p>
         */
        @NameInMap("incUpdateTime")
        public String incUpdateTime;

        /**
         * <p>The index size.</p>
         * 
         * <strong>example:</strong>
         * <p>4689</p>
         */
        @NameInMap("indexSize")
        public Long indexSize;

        /**
         * <p>The status of the index version. Valid values:</p>
         * <ul>
         * <li>NEW: The index version is created.</li>
         * <li>PUBLISH: The index version is normal.</li>
         * <li>IN_USE: The index version is in use.</li>
         * <li>NOT_USE: The index version is not used.</li>
         * <li>STOP_USE: The index version is being stopped.</li>
         * <li>RESTORE_USE: The index version is being restored.</li>
         * <li>FAIL: The index version failed to be created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IN_USE</p>
         */
        @NameInMap("indexStatus")
        public String indexStatus;

        /**
         * <p>The index name.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The number of shards.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
