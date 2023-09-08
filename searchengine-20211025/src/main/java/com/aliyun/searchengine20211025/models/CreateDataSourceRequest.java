// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateDataSourceRequest extends TeaModel {
    @NameInMap("autoBuildIndex")
    public Boolean autoBuildIndex;

    @NameInMap("config")
    public CreateDataSourceRequestConfig config;

    @NameInMap("domain")
    public String domain;

    @NameInMap("name")
    public String name;

    @NameInMap("saroConfig")
    public CreateDataSourceRequestSaroConfig saroConfig;

    @NameInMap("type")
    public String type;

    /**
     * <p>Specifies whether to perform a dry run. This parameter is only used to check whether the data source is valid. Valid values: true and false.</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceRequest self = new CreateDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceRequest setAutoBuildIndex(Boolean autoBuildIndex) {
        this.autoBuildIndex = autoBuildIndex;
        return this;
    }
    public Boolean getAutoBuildIndex() {
        return this.autoBuildIndex;
    }

    public CreateDataSourceRequest setConfig(CreateDataSourceRequestConfig config) {
        this.config = config;
        return this;
    }
    public CreateDataSourceRequestConfig getConfig() {
        return this.config;
    }

    public CreateDataSourceRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateDataSourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataSourceRequest setSaroConfig(CreateDataSourceRequestSaroConfig saroConfig) {
        this.saroConfig = saroConfig;
        return this;
    }
    public CreateDataSourceRequestSaroConfig getSaroConfig() {
        return this.saroConfig;
    }

    public CreateDataSourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateDataSourceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static class CreateDataSourceRequestConfig extends TeaModel {
        @NameInMap("accessKey")
        public String accessKey;

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

        public static CreateDataSourceRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDataSourceRequestConfig self = new CreateDataSourceRequestConfig();
            return TeaModel.build(map, self);
        }

        public CreateDataSourceRequestConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public CreateDataSourceRequestConfig setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public CreateDataSourceRequestConfig setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public CreateDataSourceRequestConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateDataSourceRequestConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateDataSourceRequestConfig setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public CreateDataSourceRequestConfig setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

        public CreateDataSourceRequestConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateDataSourceRequestConfig setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public CreateDataSourceRequestConfig setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class CreateDataSourceRequestSaroConfig extends TeaModel {
        @NameInMap("namespace")
        public String namespace;

        @NameInMap("tableName")
        public String tableName;

        public static CreateDataSourceRequestSaroConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDataSourceRequestSaroConfig self = new CreateDataSourceRequestSaroConfig();
            return TeaModel.build(map, self);
        }

        public CreateDataSourceRequestSaroConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateDataSourceRequestSaroConfig setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
