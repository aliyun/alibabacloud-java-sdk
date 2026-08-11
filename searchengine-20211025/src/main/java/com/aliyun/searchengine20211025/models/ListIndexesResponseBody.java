// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListIndexesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4FB0325E-8C37-5525-96AC-0333523170A3</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of index details.</p>
     */
    @NameInMap("result")
    public java.util.List<ListIndexesResponseBodyResult> result;

    public static ListIndexesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIndexesResponseBody self = new ListIndexesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIndexesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIndexesResponseBody setResult(java.util.List<ListIndexesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListIndexesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListIndexesResponseBodyResultDataSourceInfoConfig extends TeaModel {
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
         * <p>The OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>ha3test-oss</p>
         */
        @NameInMap("bucket")
        public String bucket;

        /**
         * <p>The ID of the data catalog for the DLF data source.</p>
         * 
         * <strong>example:</strong>
         * <p>clg-paimon-21cc136237a6457f8618f5f82d116d7e</p>
         */
        @NameInMap("catalog")
        public String catalog;

        /**
         * <p>The database name of the DLF data source.</p>
         * 
         * <strong>example:</strong>
         * <p>dlf_test</p>
         */
        @NameInMap("database")
        public String database;

        /**
         * <p>Information about the MaxCompute data source.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api">http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The file format for OSS.</p>
         * <ul>
         * <li><p>ha3</p>
         * </li>
         * <li><p>json</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ha3</p>
         */
        @NameInMap("format")
        public String format;

        /**
         * <p>Information about the saro data source.</p>
         * 
         * <strong>example:</strong>
         * <p>TEST_dump_demo_sj_na61hunbu2_share_holo</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>Information about the OSS data source.</p>
         * 
         * <strong>example:</strong>
         * <p>/test_opensearch/sift_oss_test.data</p>
         */
        @NameInMap("ossPath")
        public String ossPath;

        /**
         * <p>The data partition.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20231220</p>
         */
        @NameInMap("partition")
        public String partition;

        /**
         * <p>Information about the Hadoop Distributed File System (HDFS) data source.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://test_opensearch/sift_oss_test.data">http://test_opensearch/sift_oss_test.data</a></p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The name of the MaxCompute project.</p>
         * 
         * <strong>example:</strong>
         * <p>tisplus_dev</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>Information about the saro or MaxCompute data source.</p>
         * 
         * <strong>example:</strong>
         * <p>dump_odps_demo</p>
         */
        @NameInMap("table")
        public String table;

        /**
         * <p>The tag of the DLF data source.</p>
         * 
         * <strong>example:</strong>
         * <p>test_tag</p>
         */
        @NameInMap("tag")
        public String tag;

        public static ListIndexesResponseBodyResultDataSourceInfoConfig build(java.util.Map<String, ?> map) throws Exception {
            ListIndexesResponseBodyResultDataSourceInfoConfig self = new ListIndexesResponseBodyResultDataSourceInfoConfig();
            return TeaModel.build(map, self);
        }

        public ListIndexesResponseBodyResultDataSourceInfoConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListIndexesResponseBodyResultDataSourceInfoConfig setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public ListIndexesResponseBodyResultDataSourceInfoConfig setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public ListIndexesResponseBodyResultDataSourceInfoConfig setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public ListIndexesResponseBodyResultDataSourceInfoConfig setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public ListIndexesResponseBodyResultDataSourceInfoConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListIndexesResponseBodyResultDataSourceInfoConfig setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ListIndexesResponseBodyResultDataSourceInfoConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListIndexesResponseBodyResultDataSourceInfoConfig setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public ListIndexesResponseBodyResultDataSourceInfoConfig setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

        public ListIndexesResponseBodyResultDataSourceInfoConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListIndexesResponseBodyResultDataSourceInfoConfig setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListIndexesResponseBodyResultDataSourceInfoConfig setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public ListIndexesResponseBodyResultDataSourceInfoConfig setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class ListIndexesResponseBodyResultDataSourceInfoSaroConfig extends TeaModel {
        /**
         * <p>The namespace of the saro data source.</p>
         * 
         * <strong>example:</strong>
         * <p>TEST_dump_demo_sj_na61hunbu2_share_holo</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The name of the saro data table.</p>
         * 
         * <strong>example:</strong>
         * <p>dump_odps_demo</p>
         */
        @NameInMap("tableName")
        public String tableName;

        public static ListIndexesResponseBodyResultDataSourceInfoSaroConfig build(java.util.Map<String, ?> map) throws Exception {
            ListIndexesResponseBodyResultDataSourceInfoSaroConfig self = new ListIndexesResponseBodyResultDataSourceInfoSaroConfig();
            return TeaModel.build(map, self);
        }

        public ListIndexesResponseBodyResultDataSourceInfoSaroConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListIndexesResponseBodyResultDataSourceInfoSaroConfig setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListIndexesResponseBodyResultDataSourceInfo extends TeaModel {
        /**
         * <p>Indicates whether to automatically build a full index.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoBuildIndex")
        public Boolean autoBuildIndex;

        /**
         * <p>The configurations of the MaxCompute data source.</p>
         */
        @NameInMap("config")
        public ListIndexesResponseBodyResultDataSourceInfoConfig config;

        /**
         * <p>The offline deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc_hz_domain_2</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-pl32rf0****_test_api</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The number of resources for data updates.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("processPartitionCount")
        public Integer processPartitionCount;

        /**
         * <p>The configurations of the saro data source.</p>
         */
        @NameInMap("saroConfig")
        public ListIndexesResponseBodyResultDataSourceInfoSaroConfig saroConfig;

        /**
         * <p>The type of the data source. Valid values: odps (MaxCompute), swift, saro, oss (Object Storage Service), and unKnow.</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
         */
        @NameInMap("type")
        public String type;

        public static ListIndexesResponseBodyResultDataSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListIndexesResponseBodyResultDataSourceInfo self = new ListIndexesResponseBodyResultDataSourceInfo();
            return TeaModel.build(map, self);
        }

        public ListIndexesResponseBodyResultDataSourceInfo setAutoBuildIndex(Boolean autoBuildIndex) {
            this.autoBuildIndex = autoBuildIndex;
            return this;
        }
        public Boolean getAutoBuildIndex() {
            return this.autoBuildIndex;
        }

        public ListIndexesResponseBodyResultDataSourceInfo setConfig(ListIndexesResponseBodyResultDataSourceInfoConfig config) {
            this.config = config;
            return this;
        }
        public ListIndexesResponseBodyResultDataSourceInfoConfig getConfig() {
            return this.config;
        }

        public ListIndexesResponseBodyResultDataSourceInfo setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListIndexesResponseBodyResultDataSourceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIndexesResponseBodyResultDataSourceInfo setProcessPartitionCount(Integer processPartitionCount) {
            this.processPartitionCount = processPartitionCount;
            return this;
        }
        public Integer getProcessPartitionCount() {
            return this.processPartitionCount;
        }

        public ListIndexesResponseBodyResultDataSourceInfo setSaroConfig(ListIndexesResponseBodyResultDataSourceInfoSaroConfig saroConfig) {
            this.saroConfig = saroConfig;
            return this;
        }
        public ListIndexesResponseBodyResultDataSourceInfoSaroConfig getSaroConfig() {
            return this.saroConfig;
        }

        public ListIndexesResponseBodyResultDataSourceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListIndexesResponseBodyResultVersionsFiles extends TeaModel {
        /**
         * <p>The name of the folder after a full-text index is created.</p>
         * 
         * <strong>example:</strong>
         * <p>/qrs.json</p>
         */
        @NameInMap("fullPathName")
        public String fullPathName;

        /**
         * <p>Indicates whether a folder exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isDir")
        public Boolean isDir;

        /**
         * <p>Indicates whether the file is a template.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

        public static ListIndexesResponseBodyResultVersionsFiles build(java.util.Map<String, ?> map) throws Exception {
            ListIndexesResponseBodyResultVersionsFiles self = new ListIndexesResponseBodyResultVersionsFiles();
            return TeaModel.build(map, self);
        }

        public ListIndexesResponseBodyResultVersionsFiles setFullPathName(String fullPathName) {
            this.fullPathName = fullPathName;
            return this;
        }
        public String getFullPathName() {
            return this.fullPathName;
        }

        public ListIndexesResponseBodyResultVersionsFiles setIsDir(Boolean isDir) {
            this.isDir = isDir;
            return this;
        }
        public Boolean getIsDir() {
            return this.isDir;
        }

        public ListIndexesResponseBodyResultVersionsFiles setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public ListIndexesResponseBodyResultVersionsFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListIndexesResponseBodyResultVersions extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Index Note</p>
         */
        @NameInMap("desc")
        public String desc;

        /**
         * <p>The list of file names.</p>
         */
        @NameInMap("files")
        public java.util.List<ListIndexesResponseBodyResultVersionsFiles> files;

        /**
         * <p>The version name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The status.</p>
         * <ul>
         * <li><p>NEW: The index is being created.</p>
         * </li>
         * <li><p>PUBLISH: The index is in the Normal state.</p>
         * </li>
         * <li><p>IN_USE: The index is in use.</p>
         * </li>
         * <li><p>NOT_USE: The index is not in use.</p>
         * </li>
         * <li><p>STOP_USE: The index is being stopped.</p>
         * </li>
         * <li><p>RESTORE_USE: The index is being resumed.</p>
         * </li>
         * <li><p>FAIL: The index failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLISH</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-20 08:52:54</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        /**
         * <p>The version ID. This parameter is null for an edit version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("versionId")
        public Integer versionId;

        public static ListIndexesResponseBodyResultVersions build(java.util.Map<String, ?> map) throws Exception {
            ListIndexesResponseBodyResultVersions self = new ListIndexesResponseBodyResultVersions();
            return TeaModel.build(map, self);
        }

        public ListIndexesResponseBodyResultVersions setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListIndexesResponseBodyResultVersions setFiles(java.util.List<ListIndexesResponseBodyResultVersionsFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<ListIndexesResponseBodyResultVersionsFiles> getFiles() {
            return this.files;
        }

        public ListIndexesResponseBodyResultVersions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIndexesResponseBodyResultVersions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListIndexesResponseBodyResultVersions setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListIndexesResponseBodyResultVersions setVersionId(Integer versionId) {
            this.versionId = versionId;
            return this;
        }
        public Integer getVersionId() {
            return this.versionId;
        }

    }

    public static class ListIndexesResponseBodyResult extends TeaModel {
        /**
         * <p>The schema in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;summarys&quot;:{&quot;parameter&quot;:{&quot;file_compressor&quot;:&quot;zstd&quot;},&quot;summary_fields&quot;:[&quot;id&quot;]},&quot;file_compress&quot;:[{&quot;name&quot;:&quot;file_compressor&quot;,&quot;type&quot;:&quot;zstd&quot;},{&quot;name&quot;:&quot;no_compressor&quot;,&quot;type&quot;:&quot;&quot;}],&quot;indexs&quot;:[{&quot;index_fields&quot;:&quot;name&quot;,&quot;index_name&quot;:&quot;ids&quot;,&quot;index_type&quot;:&quot;STRING&quot;},{&quot;has_primary_key_attribute&quot;:true,&quot;index_fields&quot;:&quot;id&quot;,&quot;is_primary_key_sorted&quot;:false,&quot;index_name&quot;:&quot;id&quot;,&quot;index_type&quot;:&quot;PRIMARYKEY64&quot;}],&quot;attributes&quot;:[{&quot;file_compress&quot;:&quot;no_compressor&quot;,&quot;field_name&quot;:&quot;id&quot;}],&quot;fields&quot;:[{&quot;user_defined_param&quot;:{},&quot;compress_type&quot;:&quot;uniq&quot;,&quot;field_type&quot;:&quot;STRING&quot;,&quot;field_name&quot;:&quot;id&quot;},{&quot;compress_type&quot;:&quot;uniq&quot;,&quot;field_type&quot;:&quot;STRING&quot;,&quot;field_name&quot;:&quot;name&quot;}],&quot;table_name&quot;:&quot;api&quot;}</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-21 16:05:26</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The data source.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-pl32rf0****_test_api</p>
         */
        @NameInMap("dataSource")
        public String dataSource;

        /**
         * <p>The information about the data source.</p>
         */
        @NameInMap("dataSourceInfo")
        public ListIndexesResponseBodyResultDataSourceInfo dataSourceInfo;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>note</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The deployment name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc_hz_domain_1</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The time when the full index was switched.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-05 10:40:38</p>
         */
        @NameInMap("fullUpdateTime")
        public String fullUpdateTime;

        /**
         * <p>The full version, which is the index version.</p>
         * 
         * <strong>example:</strong>
         * <p>1688523414</p>
         */
        @NameInMap("fullVersion")
        public Long fullVersion;

        /**
         * <p>The time of the incremental update.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-05 10:58:33</p>
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
         * <p>NEW, PUBLISH</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLISH</p>
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
         * <p>The number of data shards.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("partition")
        public Integer partition;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-21 16:05:26</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>The list of versions.</p>
         */
        @NameInMap("versions")
        public java.util.List<ListIndexesResponseBodyResultVersions> versions;

        public static ListIndexesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListIndexesResponseBodyResult self = new ListIndexesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListIndexesResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListIndexesResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIndexesResponseBodyResult setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public ListIndexesResponseBodyResult setDataSourceInfo(ListIndexesResponseBodyResultDataSourceInfo dataSourceInfo) {
            this.dataSourceInfo = dataSourceInfo;
            return this;
        }
        public ListIndexesResponseBodyResultDataSourceInfo getDataSourceInfo() {
            return this.dataSourceInfo;
        }

        public ListIndexesResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIndexesResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListIndexesResponseBodyResult setFullUpdateTime(String fullUpdateTime) {
            this.fullUpdateTime = fullUpdateTime;
            return this;
        }
        public String getFullUpdateTime() {
            return this.fullUpdateTime;
        }

        public ListIndexesResponseBodyResult setFullVersion(Long fullVersion) {
            this.fullVersion = fullVersion;
            return this;
        }
        public Long getFullVersion() {
            return this.fullVersion;
        }

        public ListIndexesResponseBodyResult setIncUpdateTime(String incUpdateTime) {
            this.incUpdateTime = incUpdateTime;
            return this;
        }
        public String getIncUpdateTime() {
            return this.incUpdateTime;
        }

        public ListIndexesResponseBodyResult setIndexSize(Long indexSize) {
            this.indexSize = indexSize;
            return this;
        }
        public Long getIndexSize() {
            return this.indexSize;
        }

        public ListIndexesResponseBodyResult setIndexStatus(String indexStatus) {
            this.indexStatus = indexStatus;
            return this;
        }
        public String getIndexStatus() {
            return this.indexStatus;
        }

        public ListIndexesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIndexesResponseBodyResult setPartition(Integer partition) {
            this.partition = partition;
            return this;
        }
        public Integer getPartition() {
            return this.partition;
        }

        public ListIndexesResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListIndexesResponseBodyResult setVersions(java.util.List<ListIndexesResponseBodyResultVersions> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<ListIndexesResponseBodyResultVersions> getVersions() {
            return this.versions;
        }

    }

}
