// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class OSSExportConfiguration extends TeaModel {
    /**
     * <p>The beginning of the time range to ship data. The value 1 specifies that the data shipping job ships data from the first log in the Logstore.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("fromTime")
    public Long fromTime;

    /**
     * <p>The name of the Logstore.</p>
     * 
     * <strong>example:</strong>
     * <p>logstore-demo</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the Resource Access Management (RAM) role that is used to read data from Simple Log Service.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789:role/aliyunlogdefaultrole</p>
     */
    @NameInMap("roleArn")
    public String roleArn;

    /**
     * <p>The configurations of the OSS data shipping job.</p>
     */
    @NameInMap("sink")
    public OSSExportConfigurationSink sink;

    @NameInMap("sourceSecureTransport")
    public Boolean sourceSecureTransport;

    /**
     * <p>The end of the time range to ship data. The value 0 specifies that the data shipping job continuously ships data until the job is manually stopped.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("toTime")
    public Long toTime;

    public static OSSExportConfiguration build(java.util.Map<String, ?> map) throws Exception {
        OSSExportConfiguration self = new OSSExportConfiguration();
        return TeaModel.build(map, self);
    }

    public OSSExportConfiguration setFromTime(Long fromTime) {
        this.fromTime = fromTime;
        return this;
    }
    public Long getFromTime() {
        return this.fromTime;
    }

    public OSSExportConfiguration setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public OSSExportConfiguration setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public OSSExportConfiguration setSink(OSSExportConfigurationSink sink) {
        this.sink = sink;
        return this;
    }
    public OSSExportConfigurationSink getSink() {
        return this.sink;
    }

    public OSSExportConfiguration setSourceSecureTransport(Boolean sourceSecureTransport) {
        this.sourceSecureTransport = sourceSecureTransport;
        return this;
    }
    public Boolean getSourceSecureTransport() {
        return this.sourceSecureTransport;
    }

    public OSSExportConfiguration setToTime(Long toTime) {
        this.toTime = toTime;
        return this;
    }
    public Long getToTime() {
        return this.toTime;
    }

    public static class OSSExportConfigurationSink extends TeaModel {
        /**
         * <p>The OSS bucket.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-bucket</p>
         */
        @NameInMap("bucket")
        public String bucket;

        /**
         * <p>The interval between two data shipping operations. Valid values: 300 to 900. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("bufferInterval")
        public Long bufferInterval;

        /**
         * <p>The size of the OSS object to which data is shipped. Valid values: 5 to 256. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        @NameInMap("bufferSize")
        public Long bufferSize;

        /**
         * <p>The compression type. Valid values: snappy, gizp, zstd, and none.</p>
         * 
         * <strong>example:</strong>
         * <p>snappy/gizp/zstd/none</p>
         */
        @NameInMap("compressionType")
        public String compressionType;

        /**
         * <p>The details of the OSS object. Note: The value of this parameter is in the JSON format and varies based on the value of contentType.</p>
         */
        @NameInMap("contentDetail")
        public java.util.Map<String, ?> contentDetail;

        /**
         * <p>The storage format of the OSS object. Valid values: json, parquet, csv, and orc.</p>
         * 
         * <strong>example:</strong>
         * <p>json/parquet/csv/orc</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>The latency of data shipping.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>This parameter is deprecated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("delaySec")
        @Deprecated
        public Long delaySec;

        /**
         * <p>The latency of data shipping. The value of this parameter cannot exceed the data retention period of the source Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("delaySeconds")
        public Long delaySeconds;

        /**
         * <ul>
         * <li>The endpoint that is used to access OSS. You can specify only an internal OSS endpoint for the region where the Simple Log Service project resides. The value is in the <code>http://+OSS endpoint</code> format. For more information, see <a href="https://help.aliyun.com/document_detail/31837.html">OSS regions and endpoints</a>.</li>
         * <li>The endpoint that is used to access OSS-HDFS. You can specify only an internal OSS-HDFS endpoint for the region where the Simple Log Service project resides.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxxxxxx">http://xxxxxxxx</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The partition format. For more information, see <a href="https://help.aliyun.com/document_detail/371934.html">Partition formats</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>%Y_%m_%d/good/bad</p>
         */
        @NameInMap("pathFormat")
        public String pathFormat;

        /**
         * <p>The partition format type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>only support time</p>
         */
        @NameInMap("pathFormatType")
        public String pathFormatType;

        /**
         * <p>The prefix of the OSS object.</p>
         * 
         * <strong>example:</strong>
         * <p>prefixxxx/</p>
         */
        @NameInMap("prefix")
        public String prefix;

        /**
         * <p>The ARN of the RAM role that is used to write data to OSS.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::xxxxxxx</p>
         */
        @NameInMap("roleArn")
        public String roleArn;

        /**
         * <p>The suffix of the OSS object.</p>
         * 
         * <strong>example:</strong>
         * <p>.json</p>
         */
        @NameInMap("suffix")
        public String suffix;

        /**
         * <p>The time zone. For more information, see <a href="https://help.aliyun.com/document_detail/375323.html">Time zones</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>+0800</p>
         */
        @NameInMap("timeZone")
        public String timeZone;

        public static OSSExportConfigurationSink build(java.util.Map<String, ?> map) throws Exception {
            OSSExportConfigurationSink self = new OSSExportConfigurationSink();
            return TeaModel.build(map, self);
        }

        public OSSExportConfigurationSink setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public OSSExportConfigurationSink setBufferInterval(Long bufferInterval) {
            this.bufferInterval = bufferInterval;
            return this;
        }
        public Long getBufferInterval() {
            return this.bufferInterval;
        }

        public OSSExportConfigurationSink setBufferSize(Long bufferSize) {
            this.bufferSize = bufferSize;
            return this;
        }
        public Long getBufferSize() {
            return this.bufferSize;
        }

        public OSSExportConfigurationSink setCompressionType(String compressionType) {
            this.compressionType = compressionType;
            return this;
        }
        public String getCompressionType() {
            return this.compressionType;
        }

        public OSSExportConfigurationSink setContentDetail(java.util.Map<String, ?> contentDetail) {
            this.contentDetail = contentDetail;
            return this;
        }
        public java.util.Map<String, ?> getContentDetail() {
            return this.contentDetail;
        }

        public OSSExportConfigurationSink setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        @Deprecated
        public OSSExportConfigurationSink setDelaySec(Long delaySec) {
            this.delaySec = delaySec;
            return this;
        }
        public Long getDelaySec() {
            return this.delaySec;
        }

        public OSSExportConfigurationSink setDelaySeconds(Long delaySeconds) {
            this.delaySeconds = delaySeconds;
            return this;
        }
        public Long getDelaySeconds() {
            return this.delaySeconds;
        }

        public OSSExportConfigurationSink setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public OSSExportConfigurationSink setPathFormat(String pathFormat) {
            this.pathFormat = pathFormat;
            return this;
        }
        public String getPathFormat() {
            return this.pathFormat;
        }

        public OSSExportConfigurationSink setPathFormatType(String pathFormatType) {
            this.pathFormatType = pathFormatType;
            return this;
        }
        public String getPathFormatType() {
            return this.pathFormatType;
        }

        public OSSExportConfigurationSink setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public OSSExportConfigurationSink setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public OSSExportConfigurationSink setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

        public OSSExportConfigurationSink setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

}
