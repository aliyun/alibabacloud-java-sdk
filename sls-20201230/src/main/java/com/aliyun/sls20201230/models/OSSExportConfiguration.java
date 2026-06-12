// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class OSSExportConfiguration extends TeaModel {
    /**
     * <p>The start time for the export, specified as a Unix timestamp. Set to 1 to export from the earliest available data in the Logstore.</p>
     * 
     * <strong>example:</strong>
     * <p>1718380800</p>
     */
    @NameInMap("fromTime")
    public Long fromTime;

    /**
     * <p>The name of the source Logstore.</p>
     * 
     * <strong>example:</strong>
     * <p>my-logstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The ARN of the Resource Access Management (RAM) role that Log Service assumes to read data from the Logstore. You must specify the ARN of your role.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1234567890:role/aliyunlogdefaultrole</p>
     */
    @NameInMap("roleArn")
    public String roleArn;

    /**
     * <p>The configuration of the destination OSS sink.</p>
     */
    @NameInMap("sink")
    public OSSExportConfigurationSink sink;

    @NameInMap("sourceSecureTransport")
    public Boolean sourceSecureTransport;

    /**
     * <p>The end time for the export, specified as a Unix timestamp. Set to 0 to run the task continuously until it is stopped.</p>
     * 
     * <strong>example:</strong>
     * <p>1718380800</p>
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
         * <p>The name of the destination OSS bucket.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-bucket</p>
         */
        @NameInMap("bucket")
        public String bucket;

        /**
         * <p>The time in seconds to buffer data before exporting. The value must be an integer from 300 to 900.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("bufferInterval")
        public Long bufferInterval;

        /**
         * <p>The amount of data in MB to buffer before exporting. The value must be an integer from 5 to 256.</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        @NameInMap("bufferSize")
        public Long bufferSize;

        /**
         * <p>The compression type for the exported files. Valid values: <code>snappy</code>, <code>gzip</code>, <code>zstd</code>, and <code>none</code> (no compression).</p>
         * 
         * <strong>example:</strong>
         * <p>snappy</p>
         */
        @NameInMap("compressionType")
        public String compressionType;

        /**
         * <p>Format-specific settings. The structure of this JSON object depends on the <code>contentType</code> value.</p>
         */
        @NameInMap("contentDetail")
        public java.util.Map<String, ?> contentDetail;

        /**
         * <p>The format of the files stored in OSS. Valid values: <code>json</code>, <code>parquet</code>, <code>csv</code>, and <code>orc</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>csv</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>The delivery delay.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is deprecated.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("delaySec")
        @Deprecated
        public Long delaySec;

        /**
         * <p>The delivery delay, in seconds. This value cannot exceed the data retention period of the source Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("delaySeconds")
        public Long delaySeconds;

        /**
         * <ul>
         * <li><p>For Object Storage Service (OSS): The OSS internal endpoint. You must use an endpoint in the same region as the Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/31837.html">OSS access domains and data centers</a>. The endpoint must use the HTTPS protocol.</p>
         * </li>
         * <li><p>For OSS-HDFS: The OSS-HDFS internal endpoint. You must use an endpoint in the same region as the Logstore.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss-cn-hangzhou-internal.aliyuncs.com">https://oss-cn-hangzhou-internal.aliyuncs.com</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The path format for exported files. For more information, see <a href="https://help.aliyun.com/document_detail/371934.html">Path format</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>%Y/%m/%d/%H/%M</p>
         */
        @NameInMap("pathFormat")
        public String pathFormat;

        /**
         * <p>The type of the path format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>time</p>
         */
        @NameInMap("pathFormatType")
        public String pathFormatType;

        /**
         * <p>The prefix for files exported to the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>prefix-demo/</p>
         */
        @NameInMap("prefix")
        public String prefix;

        /**
         * <p>The ARN of the RAM role that Log Service assumes to write data to the OSS bucket. You must specify the ARN of your role.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1234567890:role/aliyunlogdefaultrole</p>
         */
        @NameInMap("roleArn")
        public String roleArn;

        /**
         * <p>The suffix for the exported files.</p>
         * 
         * <strong>example:</strong>
         * <p>.json</p>
         */
        @NameInMap("suffix")
        public String suffix;

        /**
         * <p>The time zone used for the path format. For more information, see <a href="https://help.aliyun.com/document_detail/375323.html">Time zones</a>.</p>
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
