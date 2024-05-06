// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateIndexRequest extends TeaModel {
    /**
     * <p>The content of the index.</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>Optional. The data source, which can be MaxCompute, Message Service (MNS), Realtime Compute for Apache Flink, or StreamCompute.</p>
     */
    @NameInMap("dataSource")
    public String dataSource;

    /**
     * <p>The information about the data source, which is required for the new version of OpenSearch Vector Search Edition.</p>
     */
    @NameInMap("dataSourceInfo")
    public CreateIndexRequestDataSourceInfo dataSourceInfo;

    /**
     * <p>The data center in which the data source resides.</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>The extended configurations of the field. Keys such as vector and embedding are included. Vector indicates the vector field. Embedding indicates the field that requires embedding.</p>
     */
    @NameInMap("extend")
    public java.util.Map<String, ?> extend;

    /**
     * <p>The name of the index.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The data partition.</p>
     */
    @NameInMap("partition")
    public Integer partition;

    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIndexRequest self = new CreateIndexRequest();
        return TeaModel.build(map, self);
    }

    public CreateIndexRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateIndexRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public CreateIndexRequest setDataSourceInfo(CreateIndexRequestDataSourceInfo dataSourceInfo) {
        this.dataSourceInfo = dataSourceInfo;
        return this;
    }
    public CreateIndexRequestDataSourceInfo getDataSourceInfo() {
        return this.dataSourceInfo;
    }

    public CreateIndexRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateIndexRequest setExtend(java.util.Map<String, ?> extend) {
        this.extend = extend;
        return this;
    }
    public java.util.Map<String, ?> getExtend() {
        return this.extend;
    }

    public CreateIndexRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateIndexRequest setPartition(Integer partition) {
        this.partition = partition;
        return this;
    }
    public Integer getPartition() {
        return this.partition;
    }

    public CreateIndexRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static class CreateIndexRequestDataSourceInfoConfig extends TeaModel {
        /**
         * <p>The AccessKey ID of the MaxCompute data source.</p>
         */
        @NameInMap("accessKey")
        public String accessKey;

        /**
         * <p>The AccessKey secret of the MaxCompute data source.</p>
         */
        @NameInMap("accessSecret")
        public String accessSecret;

        /**
         * <p>oss bucket</p>
         */
        @NameInMap("bucket")
        public String bucket;

        /**
         * <p>The endpoint of the MaxCompute or Object Storage Service (OSS) data source.</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("ossPath")
        public String ossPath;

        /**
         * <p>The data partition. This parameter is required if type is set to odps.</p>
         */
        @NameInMap("partition")
        public String partition;

        @NameInMap("path")
        public String path;

        /**
         * <p>The name of the MaxCompute project that is used as the data source.</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The name of the table.</p>
         */
        @NameInMap("table")
        public String table;

        public static CreateIndexRequestDataSourceInfoConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateIndexRequestDataSourceInfoConfig self = new CreateIndexRequestDataSourceInfoConfig();
            return TeaModel.build(map, self);
        }

        public CreateIndexRequestDataSourceInfoConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public CreateIndexRequestDataSourceInfoConfig setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public CreateIndexRequestDataSourceInfoConfig setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public CreateIndexRequestDataSourceInfoConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateIndexRequestDataSourceInfoConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateIndexRequestDataSourceInfoConfig setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public CreateIndexRequestDataSourceInfoConfig setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

        public CreateIndexRequestDataSourceInfoConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateIndexRequestDataSourceInfoConfig setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public CreateIndexRequestDataSourceInfoConfig setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class CreateIndexRequestDataSourceInfoSaroConfig extends TeaModel {
        @NameInMap("namespace")
        public String namespace;

        @NameInMap("tableName")
        public String tableName;

        public static CreateIndexRequestDataSourceInfoSaroConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateIndexRequestDataSourceInfoSaroConfig self = new CreateIndexRequestDataSourceInfoSaroConfig();
            return TeaModel.build(map, self);
        }

        public CreateIndexRequestDataSourceInfoSaroConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateIndexRequestDataSourceInfoSaroConfig setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class CreateIndexRequestDataSourceInfo extends TeaModel {
        /**
         * <p>Specifies whether to enable the automatic full indexing feature.</p>
         */
        @NameInMap("autoBuildIndex")
        public Boolean autoBuildIndex;

        /**
         * <p>The information about the MaxCompute data source.</p>
         */
        @NameInMap("config")
        public CreateIndexRequestDataSourceInfoConfig config;

        @NameInMap("dataTimeSec")
        public Integer dataTimeSec;

        /**
         * <p>The data center where the data source is deployed.</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The name of the index.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The number of resources used for data update.</p>
         */
        @NameInMap("processPartitionCount")
        public Integer processPartitionCount;

        @NameInMap("saroConfig")
        public CreateIndexRequestDataSourceInfoSaroConfig saroConfig;

        /**
         * <p>The type of the data source. Valid values: odps, swift, saro, and oss.</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateIndexRequestDataSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateIndexRequestDataSourceInfo self = new CreateIndexRequestDataSourceInfo();
            return TeaModel.build(map, self);
        }

        public CreateIndexRequestDataSourceInfo setAutoBuildIndex(Boolean autoBuildIndex) {
            this.autoBuildIndex = autoBuildIndex;
            return this;
        }
        public Boolean getAutoBuildIndex() {
            return this.autoBuildIndex;
        }

        public CreateIndexRequestDataSourceInfo setConfig(CreateIndexRequestDataSourceInfoConfig config) {
            this.config = config;
            return this;
        }
        public CreateIndexRequestDataSourceInfoConfig getConfig() {
            return this.config;
        }

        public CreateIndexRequestDataSourceInfo setDataTimeSec(Integer dataTimeSec) {
            this.dataTimeSec = dataTimeSec;
            return this;
        }
        public Integer getDataTimeSec() {
            return this.dataTimeSec;
        }

        public CreateIndexRequestDataSourceInfo setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateIndexRequestDataSourceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateIndexRequestDataSourceInfo setProcessPartitionCount(Integer processPartitionCount) {
            this.processPartitionCount = processPartitionCount;
            return this;
        }
        public Integer getProcessPartitionCount() {
            return this.processPartitionCount;
        }

        public CreateIndexRequestDataSourceInfo setSaroConfig(CreateIndexRequestDataSourceInfoSaroConfig saroConfig) {
            this.saroConfig = saroConfig;
            return this;
        }
        public CreateIndexRequestDataSourceInfoSaroConfig getSaroConfig() {
            return this.saroConfig;
        }

        public CreateIndexRequestDataSourceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
