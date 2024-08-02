// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateDownloadJobRequest extends TeaModel {
    /**
     * <p>下载配置</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public CreateDownloadJobRequestConfiguration configuration;

    /**
     * <p>任务描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>任务显示名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>download-123456789</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>代表资源名称的资源属性字段</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>download-123</p>
     */
    @NameInMap("name")
    public String name;

    public static CreateDownloadJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDownloadJobRequest self = new CreateDownloadJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateDownloadJobRequest setConfiguration(CreateDownloadJobRequestConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public CreateDownloadJobRequestConfiguration getConfiguration() {
        return this.configuration;
    }

    public CreateDownloadJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDownloadJobRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateDownloadJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class CreateDownloadJobRequestConfigurationSink extends TeaModel {
        /**
         * <p>对象存储桶</p>
         * 
         * <strong>example:</strong>
         * <p>oss-test-bucket</p>
         */
        @NameInMap("bucket")
        public String bucket;

        /**
         * <p>压缩格式</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("compressionType")
        public String compressionType;

        /**
         * <p>下载文件格式</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>csv</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <strong>example:</strong>
         * <p>download/</p>
         */
        @NameInMap("prefix")
        public String prefix;

        /**
         * <p>下载使用roleArn</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::0123456789:role/aliyunlogdefaultrole</p>
         */
        @NameInMap("roleArn")
        public String roleArn;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunOSS</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateDownloadJobRequestConfigurationSink build(java.util.Map<String, ?> map) throws Exception {
            CreateDownloadJobRequestConfigurationSink self = new CreateDownloadJobRequestConfigurationSink();
            return TeaModel.build(map, self);
        }

        public CreateDownloadJobRequestConfigurationSink setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public CreateDownloadJobRequestConfigurationSink setCompressionType(String compressionType) {
            this.compressionType = compressionType;
            return this;
        }
        public String getCompressionType() {
            return this.compressionType;
        }

        public CreateDownloadJobRequestConfigurationSink setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CreateDownloadJobRequestConfigurationSink setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public CreateDownloadJobRequestConfigurationSink setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public CreateDownloadJobRequestConfigurationSink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDownloadJobRequestConfiguration extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("allowInComplete")
        public Boolean allowInComplete;

        /**
         * <p>起点时间戳（精确到秒）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1722406260</p>
         */
        @NameInMap("fromTime")
        public Long fromTime;

        /**
         * <p>源logstore</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-logstore</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>是否启用powerSql</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("powerSql")
        public Boolean powerSql;

        /**
         * <p>查询语句</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>| select *</li>
         * </ul>
         */
        @NameInMap("query")
        public String query;

        /**
         * <p>导出配置</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("sink")
        public CreateDownloadJobRequestConfigurationSink sink;

        /**
         * <p>结束时间戳（精确到秒）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1722409860</p>
         */
        @NameInMap("toTime")
        public Long toTime;

        public static CreateDownloadJobRequestConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateDownloadJobRequestConfiguration self = new CreateDownloadJobRequestConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateDownloadJobRequestConfiguration setAllowInComplete(Boolean allowInComplete) {
            this.allowInComplete = allowInComplete;
            return this;
        }
        public Boolean getAllowInComplete() {
            return this.allowInComplete;
        }

        public CreateDownloadJobRequestConfiguration setFromTime(Long fromTime) {
            this.fromTime = fromTime;
            return this;
        }
        public Long getFromTime() {
            return this.fromTime;
        }

        public CreateDownloadJobRequestConfiguration setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public CreateDownloadJobRequestConfiguration setPowerSql(Boolean powerSql) {
            this.powerSql = powerSql;
            return this;
        }
        public Boolean getPowerSql() {
            return this.powerSql;
        }

        public CreateDownloadJobRequestConfiguration setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public CreateDownloadJobRequestConfiguration setSink(CreateDownloadJobRequestConfigurationSink sink) {
            this.sink = sink;
            return this;
        }
        public CreateDownloadJobRequestConfigurationSink getSink() {
            return this.sink;
        }

        public CreateDownloadJobRequestConfiguration setToTime(Long toTime) {
            this.toTime = toTime;
            return this;
        }
        public Long getToTime() {
            return this.toTime;
        }

    }

}
