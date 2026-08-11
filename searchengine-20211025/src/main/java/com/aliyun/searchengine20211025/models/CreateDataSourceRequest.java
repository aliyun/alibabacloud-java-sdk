// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateDataSourceRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically rebuild indexes.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoBuildIndex")
    public Boolean autoBuildIndex;

    /**
     * <p>The configuration information.</p>
     */
    @NameInMap("config")
    public CreateDataSourceRequestConfig config;

    /**
     * <p>The data center where the data source resides.</p>
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
     * <p>The Saro datasource config.</p>
     */
    @NameInMap("saroConfig")
    public CreateDataSourceRequestSaroConfig saroConfig;

    /**
     * <p>The type of the data source. Valid values: odps, oss, and swift.</p>
     * 
     * <strong>example:</strong>
     * <p>odps</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>Specifies whether to perform a dry run (only validates whether the data source is valid). Valid values:</p>
     * <ul>
     * <li>true: performs a dry run.</li>
     * <li>false: does not perform a dry run.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
        /**
         * <p>The AccessKey ID of the ODPS data source.</p>
         * 
         * <strong>example:</strong>
         * <p>L***p</p>
         */
        @NameInMap("accessKey")
        public String accessKey;

        /**
         * <p>The AccessKey secret of the ODPS data source.</p>
         * 
         * <strong>example:</strong>
         * <p>5**9a6</p>
         */
        @NameInMap("accessSecret")
        public String accessSecret;

        /**
         * <p>oss bucket</p>
         * 
         * <strong>example:</strong>
         * <p>opensearch</p>
         */
        @NameInMap("bucket")
        public String bucket;

        @NameInMap("catalog")
        public String catalog;

        @NameInMap("database")
        public String database;

        /**
         * <p>The endpoint of the ODPS data source or the OSS data source.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api">http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>aegis-ops</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The OSS file path.</p>
         * 
         * <strong>example:</strong>
         * <p>/opensearch/search</p>
         */
        @NameInMap("ossPath")
        public String ossPath;

        /**
         * <p>The ODPS partition.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20220713</p>
         */
        @NameInMap("partition")
        public String partition;

        /**
         * <p>The HDFS file path.</p>
         * 
         * <strong>example:</strong>
         * <p>test-hdfs-path</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The project name of the ODPS data source.</p>
         * 
         * <strong>example:</strong>
         * <p>kubenest</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The ODPS table name.</p>
         * 
         * <strong>example:</strong>
         * <p>item</p>
         */
        @NameInMap("table")
        public String table;

        @NameInMap("tag")
        public String tag;

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

        public CreateDataSourceRequestConfig setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public CreateDataSourceRequestConfig setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
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

        public CreateDataSourceRequestConfig setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class CreateDataSourceRequestSaroConfig extends TeaModel {
        /**
         * <p>The namespace of the Saro data source.</p>
         * 
         * <strong>example:</strong>
         * <p>igraph-cn-x0r3e3abe02</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The Saro data table name.</p>
         * 
         * <strong>example:</strong>
         * <p>index_hdfs</p>
         */
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
