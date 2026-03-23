// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateDownloadJobRequest extends TeaModel {
    /**
     * <p>The download configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public CreateDownloadJobRequestConfiguration configuration;

    /**
     * <p>The description of the log download task.</p>
     * 
     * <strong>example:</strong>
     * <p>Log download task</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>download-123456789</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The name of the job. The name must meet the following requirements:</p>
     * <p>The job name must be unique within a project.</p>
     * <ul>
     * <li><p>It can contain only lowercase letters, digits, hyphens (-), and underscores (_).</p>
     * </li>
     * <li><p>It must start and end with a lowercase letter or a digit.</p>
     * </li>
     * <li><p>The name must be 2 to 64 characters in length.</p>
     * </li>
     * </ul>
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
         * <p>The destination Object Storage Service (OSS) bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-test-bucket</p>
         */
        @NameInMap("bucket")
        public String bucket;

        /**
         * <p>The compression format of the file. Valid values: \<code>zstd\\</code>, \<code>lz4\\</code>, \<code>gzip\\</code>, and \<code>none\\</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("compressionType")
        public String compressionType;

        /**
         * <p>The format of the downloaded file. Valid values: \<code>csv\\</code> and \<code>json\\</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>csv</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>The prefix of the path in the destination OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>download/</p>
         */
        @NameInMap("prefix")
        public String prefix;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role to use for the download.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::0123456789:role/aliyunlogdefaultrole</p>
         */
        @NameInMap("roleArn")
        public String roleArn;

        /**
         * <p>The type of the destination. Set the value to \<code>AliyunOSS\\</code>.</p>
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
         * <p>Specifies whether to allow the download of incomplete results. Valid values: \<code>true\\</code> and \<code>false\\</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("allowInComplete")
        public Boolean allowInComplete;

        /**
         * <p>The start time. This is a UNIX timestamp that is accurate to the second.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1722406260</p>
         */
        @NameInMap("fromTime")
        public Long fromTime;

        /**
         * <p>The source Logstore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-logstore</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>Specifies whether to enable PowerSQL. Valid values: \<code>true\\</code> and \<code>false\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("powerSql")
        public Boolean powerSql;

        /**
         * <p>The search statement.</p>
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
         * <p>The export configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("sink")
        public CreateDownloadJobRequestConfigurationSink sink;

        /**
         * <p>The end time. This is a UNIX timestamp that is accurate to the second.</p>
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
