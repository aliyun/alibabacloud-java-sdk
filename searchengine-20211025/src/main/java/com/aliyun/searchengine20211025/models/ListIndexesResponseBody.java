// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListIndexesResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The index list.</p>
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
         * <p>odps数据源ak</p>
         */
        @NameInMap("accessKey")
        public String accessKey;

        /**
         * <p>odps数据源ak secret</p>
         */
        @NameInMap("accessSecret")
        public String accessSecret;

        /**
         * <p>oss命名空间</p>
         */
        @NameInMap("bucket")
        public String bucket;

        /**
         * <p>odps相关</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>saro相关</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>oss数据源相关</p>
         */
        @NameInMap("ossPath")
        public String ossPath;

        /**
         * <p>数据分片</p>
         */
        @NameInMap("partition")
        public String partition;

        /**
         * <p>hdfs相关</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>odps数据源项目名称</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>saro、odps相关</p>
         */
        @NameInMap("table")
        public String table;

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

        public ListIndexesResponseBodyResultDataSourceInfoConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
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

    }

    public static class ListIndexesResponseBodyResultDataSourceInfoSaroConfig extends TeaModel {
        /**
         * <p>saro数据源的namespace</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>saro数据表名称</p>
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
         * <p>是否开启自动全量</p>
         */
        @NameInMap("autoBuildIndex")
        public Boolean autoBuildIndex;

        /**
         * <p>odps 数据源配置</p>
         */
        @NameInMap("config")
        public ListIndexesResponseBodyResultDataSourceInfoConfig config;

        /**
         * <p>离线部署</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>数据源名</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>数据更新资源数</p>
         */
        @NameInMap("processPartitionCount")
        public Integer processPartitionCount;

        /**
         * <p>saro数据源配置</p>
         */
        @NameInMap("saroConfig")
        public ListIndexesResponseBodyResultDataSourceInfoSaroConfig saroConfig;

        /**
         * <p>数据源类型 (odps, swift, saro, oss, unKnow)</p>
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
         * <p>The name of the directory for the index.</p>
         */
        @NameInMap("fullPathName")
        public String fullPathName;

        /**
         * <p>Indicates whether a directory exists.</p>
         */
        @NameInMap("isDir")
        public Boolean isDir;

        /**
         * <p>Indicates whether it is a template.</p>
         */
        @NameInMap("isTemplate")
        public Boolean isTemplate;

        /**
         * <p>The name of the file.</p>
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
         */
        @NameInMap("desc")
        public String desc;

        /**
         * <p>The list of file names.</p>
         */
        @NameInMap("files")
        public java.util.List<ListIndexesResponseBodyResultVersionsFiles> files;

        /**
         * <p>The name of the version.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The state of the version. Valid values: drafting, used, unused and trash. drafting indicates that the version is a draft, used indicates that the version is used online, unused indicates that the version is not used, and trash indicates that the version is being deleted.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The time when the version was updated.</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        /**
         * <p>The ID of the version. The value of this parameter is null for the edit version.</p>
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
         * <p>schema JSON</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The data source.</p>
         */
        @NameInMap("dataSource")
        public String dataSource;

        /**
         * <p>数据源相关信息</p>
         */
        @NameInMap("dataSourceInfo")
        public ListIndexesResponseBodyResultDataSourceInfo dataSourceInfo;

        /**
         * <p>备注</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The name of the data center where the data source is deployed.</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>全量切换时间</p>
         */
        @NameInMap("fullUpdateTime")
        public String fullUpdateTime;

        /**
         * <p>全量版本  即：索引版本</p>
         */
        @NameInMap("fullVersion")
        public Long fullVersion;

        /**
         * <p>增量更新时间</p>
         */
        @NameInMap("incUpdateTime")
        public String incUpdateTime;

        /**
         * <p>索引大小</p>
         */
        @NameInMap("indexSize")
        public Long indexSize;

        /**
         * <p>NEW, PUBLISH</p>
         */
        @NameInMap("indexStatus")
        public String indexStatus;

        /**
         * <p>The name of the index.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>数据分片</p>
         */
        @NameInMap("partition")
        public Integer partition;

        /**
         * <p>The list of version information.</p>
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

        public ListIndexesResponseBodyResult setVersions(java.util.List<ListIndexesResponseBodyResultVersions> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<ListIndexesResponseBodyResultVersions> getVersions() {
            return this.versions;
        }

    }

}
