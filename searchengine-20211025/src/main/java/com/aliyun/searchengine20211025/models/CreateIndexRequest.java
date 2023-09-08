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

    @NameInMap("dataSourceInfo")
    public CreateIndexRequestDataSourceInfo dataSourceInfo;

    /**
     * <p>The data center in which the data source resides.</p>
     */
    @NameInMap("domain")
    public String domain;

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
        @NameInMap("accessKey")
        public String accessKey;

        @NameInMap("accessSecret")
        public String accessSecret;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("partition")
        public String partition;

        @NameInMap("project")
        public String project;

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

        public CreateIndexRequestDataSourceInfoConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateIndexRequestDataSourceInfoConfig setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
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

    public static class CreateIndexRequestDataSourceInfo extends TeaModel {
        @NameInMap("autoBuildIndex")
        public Boolean autoBuildIndex;

        @NameInMap("config")
        public CreateIndexRequestDataSourceInfoConfig config;

        @NameInMap("processPartitionCount")
        public Integer processPartitionCount;

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

        public CreateIndexRequestDataSourceInfo setProcessPartitionCount(Integer processPartitionCount) {
            this.processPartitionCount = processPartitionCount;
            return this;
        }
        public Integer getProcessPartitionCount() {
            return this.processPartitionCount;
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
