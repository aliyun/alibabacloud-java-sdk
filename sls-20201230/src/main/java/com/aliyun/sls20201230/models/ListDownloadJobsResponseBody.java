// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListDownloadJobsResponseBody extends TeaModel {
    /**
     * <p>The number of log download jobs returned in the current response.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>An array that contains the list of log download jobs.</p>
     */
    @NameInMap("results")
    public java.util.List<ListDownloadJobsResponseBodyResults> results;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListDownloadJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDownloadJobsResponseBody self = new ListDownloadJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDownloadJobsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListDownloadJobsResponseBody setResults(java.util.List<ListDownloadJobsResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ListDownloadJobsResponseBodyResults> getResults() {
        return this.results;
    }

    public ListDownloadJobsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListDownloadJobsResponseBodyResultsConfigurationSink extends TeaModel {
        /**
         * <p>The destination OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-oss-bucket</p>
         */
        @NameInMap("bucket")
        public String bucket;

        /**
         * <p>The compression format.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("compressionType")
        public String compressionType;

        /**
         * <p>The file format of the downloaded file.</p>
         * 
         * <strong>example:</strong>
         * <p>csv</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>The prefix of the object that is downloaded to the destination OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>download/</p>
         */
        @NameInMap("prefix")
        public String prefix;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role that is used for the download.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456:role/aliyunlogimportossrole</p>
         */
        @NameInMap("roleArn")
        public String roleArn;

        /**
         * <p>The type of the sink. The value is fixed as AliyunOSS.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunOSS</p>
         */
        @NameInMap("type")
        public String type;

        public static ListDownloadJobsResponseBodyResultsConfigurationSink build(java.util.Map<String, ?> map) throws Exception {
            ListDownloadJobsResponseBodyResultsConfigurationSink self = new ListDownloadJobsResponseBodyResultsConfigurationSink();
            return TeaModel.build(map, self);
        }

        public ListDownloadJobsResponseBodyResultsConfigurationSink setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public ListDownloadJobsResponseBodyResultsConfigurationSink setCompressionType(String compressionType) {
            this.compressionType = compressionType;
            return this;
        }
        public String getCompressionType() {
            return this.compressionType;
        }

        public ListDownloadJobsResponseBodyResultsConfigurationSink setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListDownloadJobsResponseBodyResultsConfigurationSink setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ListDownloadJobsResponseBodyResultsConfigurationSink setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public ListDownloadJobsResponseBodyResultsConfigurationSink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDownloadJobsResponseBodyResultsConfiguration extends TeaModel {
        /**
         * <p>Specifies whether to allow the download of incomplete results.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("allowInComplete")
        public String allowInComplete;

        /**
         * <p>The start time of the query. This is a UNIX timestamp that is accurate to the second.</p>
         * 
         * <strong>example:</strong>
         * <p>1722409260</p>
         */
        @NameInMap("fromTime")
        public Long fromTime;

        /**
         * <p>The source Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-logstore</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>Specifies whether to enable PowerSQL.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("powerSql")
        public Boolean powerSql;

        /**
         * <p>The query statement.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>| select *</li>
         * </ul>
         */
        @NameInMap("query")
        public String query;

        /**
         * <p>The sink configuration.</p>
         */
        @NameInMap("sink")
        public ListDownloadJobsResponseBodyResultsConfigurationSink sink;

        /**
         * <p>The end time of the query. This is a UNIX timestamp that is accurate to the second.</p>
         * 
         * <strong>example:</strong>
         * <p>1722411060</p>
         */
        @NameInMap("toTime")
        public Long toTime;

        public static ListDownloadJobsResponseBodyResultsConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListDownloadJobsResponseBodyResultsConfiguration self = new ListDownloadJobsResponseBodyResultsConfiguration();
            return TeaModel.build(map, self);
        }

        public ListDownloadJobsResponseBodyResultsConfiguration setAllowInComplete(String allowInComplete) {
            this.allowInComplete = allowInComplete;
            return this;
        }
        public String getAllowInComplete() {
            return this.allowInComplete;
        }

        public ListDownloadJobsResponseBodyResultsConfiguration setFromTime(Long fromTime) {
            this.fromTime = fromTime;
            return this;
        }
        public Long getFromTime() {
            return this.fromTime;
        }

        public ListDownloadJobsResponseBodyResultsConfiguration setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public ListDownloadJobsResponseBodyResultsConfiguration setPowerSql(Boolean powerSql) {
            this.powerSql = powerSql;
            return this;
        }
        public Boolean getPowerSql() {
            return this.powerSql;
        }

        public ListDownloadJobsResponseBodyResultsConfiguration setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public ListDownloadJobsResponseBodyResultsConfiguration setSink(ListDownloadJobsResponseBodyResultsConfigurationSink sink) {
            this.sink = sink;
            return this;
        }
        public ListDownloadJobsResponseBodyResultsConfigurationSink getSink() {
            return this.sink;
        }

        public ListDownloadJobsResponseBodyResultsConfiguration setToTime(Long toTime) {
            this.toTime = toTime;
            return this;
        }
        public Long getToTime() {
            return this.toTime;
        }

    }

    public static class ListDownloadJobsResponseBodyResultsExecutionDetails extends TeaModel {
        /**
         * <p>The ETag of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>ETASFGASDASQWDasd</p>
         */
        @NameInMap("checkSum")
        public String checkSum;

        /**
         * <p>The error message that is returned if the job fails.</p>
         * 
         * <strong>example:</strong>
         * <p>timeout</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The running time of the download.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("executeTime")
        public Long executeTime;

        /**
         * <p>The URL of the downloaded file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://sls-downloaded-xxxx.csv.gzip?Expiresxxx">https://sls-downloaded-xxxx.csv.gzip?Expiresxxx</a></p>
         */
        @NameInMap("filePath")
        public String filePath;

        /**
         * <p>The size of the downloaded file in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("fileSize")
        public Long fileSize;

        /**
         * <p>The number of downloaded log entries.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("logCount")
        public Long logCount;

        /**
         * <p>The notification message.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("notice")
        public String notice;

        /**
         * <p>The download progress as a percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("progress")
        public Long progress;

        public static ListDownloadJobsResponseBodyResultsExecutionDetails build(java.util.Map<String, ?> map) throws Exception {
            ListDownloadJobsResponseBodyResultsExecutionDetails self = new ListDownloadJobsResponseBodyResultsExecutionDetails();
            return TeaModel.build(map, self);
        }

        public ListDownloadJobsResponseBodyResultsExecutionDetails setCheckSum(String checkSum) {
            this.checkSum = checkSum;
            return this;
        }
        public String getCheckSum() {
            return this.checkSum;
        }

        public ListDownloadJobsResponseBodyResultsExecutionDetails setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListDownloadJobsResponseBodyResultsExecutionDetails setExecuteTime(Long executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Long getExecuteTime() {
            return this.executeTime;
        }

        public ListDownloadJobsResponseBodyResultsExecutionDetails setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListDownloadJobsResponseBodyResultsExecutionDetails setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public ListDownloadJobsResponseBodyResultsExecutionDetails setLogCount(Long logCount) {
            this.logCount = logCount;
            return this;
        }
        public Long getLogCount() {
            return this.logCount;
        }

        public ListDownloadJobsResponseBodyResultsExecutionDetails setNotice(String notice) {
            this.notice = notice;
            return this;
        }
        public String getNotice() {
            return this.notice;
        }

        public ListDownloadJobsResponseBodyResultsExecutionDetails setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

    }

    public static class ListDownloadJobsResponseBodyResults extends TeaModel {
        /**
         * <p>The download configuration.</p>
         */
        @NameInMap("configuration")
        public ListDownloadJobsResponseBodyResultsConfiguration configuration;

        /**
         * <p>The time when the log download job was created. This is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1722411060</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The description of the log download job.</p>
         * 
         * <strong>example:</strong>
         * <p>a download job</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Display name</p>
         * 
         * <strong>example:</strong>
         * <p>download-123</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The execution details of the job.</p>
         */
        @NameInMap("executionDetails")
        public ListDownloadJobsResponseBodyResultsExecutionDetails executionDetails;

        /**
         * <p>The name of the log download job.</p>
         * 
         * <strong>example:</strong>
         * <p>download-123</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The status of the Job.</p>
         * 
         * <strong>example:</strong>
         * <p>STARTING、RUNNING、SUCCEEDED、ERROR</p>
         */
        @NameInMap("status")
        public String status;

        public static ListDownloadJobsResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            ListDownloadJobsResponseBodyResults self = new ListDownloadJobsResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public ListDownloadJobsResponseBodyResults setConfiguration(ListDownloadJobsResponseBodyResultsConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public ListDownloadJobsResponseBodyResultsConfiguration getConfiguration() {
            return this.configuration;
        }

        public ListDownloadJobsResponseBodyResults setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDownloadJobsResponseBodyResults setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDownloadJobsResponseBodyResults setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListDownloadJobsResponseBodyResults setExecutionDetails(ListDownloadJobsResponseBodyResultsExecutionDetails executionDetails) {
            this.executionDetails = executionDetails;
            return this;
        }
        public ListDownloadJobsResponseBodyResultsExecutionDetails getExecutionDetails() {
            return this.executionDetails;
        }

        public ListDownloadJobsResponseBodyResults setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDownloadJobsResponseBodyResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
