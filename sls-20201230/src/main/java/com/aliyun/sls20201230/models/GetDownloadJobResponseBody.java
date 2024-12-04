// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetDownloadJobResponseBody extends TeaModel {
    /**
     * <p>下载配置</p>
     */
    @NameInMap("configuration")
    public GetDownloadJobResponseBodyConfiguration configuration;

    /**
     * <p>代表创建时间的资源属性字段</p>
     * 
     * <strong>example:</strong>
     * <p>1722411060</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>任务描述</p>
     * 
     * <strong>example:</strong>
     * <p>a download job</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>任务显示名称</p>
     * 
     * <strong>example:</strong>
     * <p>download-123456</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>任务执行细节</p>
     */
    @NameInMap("executionDetails")
    public GetDownloadJobResponseBodyExecutionDetails executionDetails;

    /**
     * <p>代表资源名称的资源属性字段</p>
     * 
     * <strong>example:</strong>
     * <p>download-123</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>代表资源状态的资源属性字段</p>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("status")
    public String status;

    public static GetDownloadJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDownloadJobResponseBody self = new GetDownloadJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDownloadJobResponseBody setConfiguration(GetDownloadJobResponseBodyConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public GetDownloadJobResponseBodyConfiguration getConfiguration() {
        return this.configuration;
    }

    public GetDownloadJobResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetDownloadJobResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetDownloadJobResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetDownloadJobResponseBody setExecutionDetails(GetDownloadJobResponseBodyExecutionDetails executionDetails) {
        this.executionDetails = executionDetails;
        return this;
    }
    public GetDownloadJobResponseBodyExecutionDetails getExecutionDetails() {
        return this.executionDetails;
    }

    public GetDownloadJobResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetDownloadJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetDownloadJobResponseBodyConfigurationSink extends TeaModel {
        /**
         * <p>对象存储桶</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-oss-bucket</p>
         */
        @NameInMap("bucket")
        public String bucket;

        /**
         * <p>压缩格式</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("compressionType")
        public String compressionType;

        /**
         * <p>下载文件格式</p>
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
         * <strong>example:</strong>
         * <p>AliyunOSS</p>
         */
        @NameInMap("type")
        public String type;

        public static GetDownloadJobResponseBodyConfigurationSink build(java.util.Map<String, ?> map) throws Exception {
            GetDownloadJobResponseBodyConfigurationSink self = new GetDownloadJobResponseBodyConfigurationSink();
            return TeaModel.build(map, self);
        }

        public GetDownloadJobResponseBodyConfigurationSink setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetDownloadJobResponseBodyConfigurationSink setCompressionType(String compressionType) {
            this.compressionType = compressionType;
            return this;
        }
        public String getCompressionType() {
            return this.compressionType;
        }

        public GetDownloadJobResponseBodyConfigurationSink setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public GetDownloadJobResponseBodyConfigurationSink setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public GetDownloadJobResponseBodyConfigurationSink setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public GetDownloadJobResponseBodyConfigurationSink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDownloadJobResponseBodyConfiguration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("allowInComplete")
        public Boolean allowInComplete;

        /**
         * <p>起点时间戳（精确到秒）</p>
         * 
         * <strong>example:</strong>
         * <p>1722409860</p>
         */
        @NameInMap("fromTime")
        public Long fromTime;

        /**
         * <p>源logstore</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-logstore</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>是否启用powerSql</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("powerSql")
        public Boolean powerSql;

        /**
         * <p>查询语句</p>
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
         */
        @NameInMap("sink")
        public GetDownloadJobResponseBodyConfigurationSink sink;

        /**
         * <p>结束时间戳（精确到秒）</p>
         * 
         * <strong>example:</strong>
         * <p>1722411060</p>
         */
        @NameInMap("toTime")
        public Long toTime;

        public static GetDownloadJobResponseBodyConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetDownloadJobResponseBodyConfiguration self = new GetDownloadJobResponseBodyConfiguration();
            return TeaModel.build(map, self);
        }

        public GetDownloadJobResponseBodyConfiguration setAllowInComplete(Boolean allowInComplete) {
            this.allowInComplete = allowInComplete;
            return this;
        }
        public Boolean getAllowInComplete() {
            return this.allowInComplete;
        }

        public GetDownloadJobResponseBodyConfiguration setFromTime(Long fromTime) {
            this.fromTime = fromTime;
            return this;
        }
        public Long getFromTime() {
            return this.fromTime;
        }

        public GetDownloadJobResponseBodyConfiguration setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public GetDownloadJobResponseBodyConfiguration setPowerSql(Boolean powerSql) {
            this.powerSql = powerSql;
            return this;
        }
        public Boolean getPowerSql() {
            return this.powerSql;
        }

        public GetDownloadJobResponseBodyConfiguration setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public GetDownloadJobResponseBodyConfiguration setSink(GetDownloadJobResponseBodyConfigurationSink sink) {
            this.sink = sink;
            return this;
        }
        public GetDownloadJobResponseBodyConfigurationSink getSink() {
            return this.sink;
        }

        public GetDownloadJobResponseBodyConfiguration setToTime(Long toTime) {
            this.toTime = toTime;
            return this;
        }
        public Long getToTime() {
            return this.toTime;
        }

    }

    public static class GetDownloadJobResponseBodyExecutionDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>EXSFGSDASDASDG123ASD</p>
         */
        @NameInMap("checkSum")
        public String checkSum;

        /**
         * <p>下载错误信息</p>
         * 
         * <strong>example:</strong>
         * <p>timeout</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>下载执行时间</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("executeTime")
        public Long executeTime;

        /**
         * <p>下载结果链接</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.csv.zst?xxx">https://xxx.csv.zst?xxx</a></p>
         */
        @NameInMap("filePath")
        public String filePath;

        /**
         * <p>下载文件大小</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("fileSize")
        public Long fileSize;

        /**
         * <p>下载日志条数</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("logCount")
        public Long logCount;

        @NameInMap("notice")
        public String notice;

        /**
         * <p>下载进度</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("progress")
        public Long progress;

        public static GetDownloadJobResponseBodyExecutionDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDownloadJobResponseBodyExecutionDetails self = new GetDownloadJobResponseBodyExecutionDetails();
            return TeaModel.build(map, self);
        }

        public GetDownloadJobResponseBodyExecutionDetails setCheckSum(String checkSum) {
            this.checkSum = checkSum;
            return this;
        }
        public String getCheckSum() {
            return this.checkSum;
        }

        public GetDownloadJobResponseBodyExecutionDetails setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetDownloadJobResponseBodyExecutionDetails setExecuteTime(Long executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Long getExecuteTime() {
            return this.executeTime;
        }

        public GetDownloadJobResponseBodyExecutionDetails setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetDownloadJobResponseBodyExecutionDetails setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public GetDownloadJobResponseBodyExecutionDetails setLogCount(Long logCount) {
            this.logCount = logCount;
            return this;
        }
        public Long getLogCount() {
            return this.logCount;
        }

        public GetDownloadJobResponseBodyExecutionDetails setNotice(String notice) {
            this.notice = notice;
            return this;
        }
        public String getNotice() {
            return this.notice;
        }

        public GetDownloadJobResponseBodyExecutionDetails setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

    }

}
