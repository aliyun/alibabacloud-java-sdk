// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class OSSExportConfiguration extends TeaModel {
    /**
     * <p>时间范围开始，值设为1则表示将从日志库中第一条数据开始</p>
     * 
     * <strong>example:</strong>
     * <p>1718380800</p>
     */
    @NameInMap("fromTime")
    public Long fromTime;

    /**
     * <p>Logstore名称</p>
     * 
     * <strong>example:</strong>
     * <p>my-logstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>读SLS RAM角色roleArn，请填写您自己的角色roleArn</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1234567890:role/aliyunlogdefaultrole</p>
     */
    @NameInMap("roleArn")
    public String roleArn;

    /**
     * <p>投递OSS配置</p>
     */
    @NameInMap("sink")
    public OSSExportConfigurationSink sink;

    /**
     * <p>时间范围结束，值设为0则表示任务会一直运行，除非任务被手动停止。</p>
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

    public OSSExportConfiguration setToTime(Long toTime) {
        this.toTime = toTime;
        return this;
    }
    public Long getToTime() {
        return this.toTime;
    }

    public static class OSSExportConfigurationSink extends TeaModel {
        /**
         * <p>OSS Bucket</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-bucket</p>
         */
        @NameInMap("bucket")
        public String bucket;

        /**
         * <p>投递时间，取值范围为300~900，单位为秒。</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("bufferInterval")
        public Long bufferInterval;

        /**
         * <p>投递的文件大小，取值范围为5~256，单位为MB。</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        @NameInMap("bufferSize")
        public Long bufferSize;

        /**
         * <p>支持4种压缩类型，如：snappy、gzip、zstd、none</p>
         * 
         * <strong>example:</strong>
         * <p>snappy</p>
         */
        @NameInMap("compressionType")
        public String compressionType;

        /**
         * <p>OSS文件内容详情，注意：该参数值为JSON格式并且应受contentType参数值的不同进行更新。</p>
         */
        @NameInMap("contentDetail")
        public java.util.Map<String, ?> contentDetail;

        /**
         * <p>OSS文件存储支持4种格式，如：json、parquet、csv、orc</p>
         * 
         * <strong>example:</strong>
         * <p>csv</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>延迟投递时间</p>
         * <blockquote>
         * <ul>
         * <li>该字段废弃使用。</li>
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
         * <p>延迟投递时间，设置的时间不能超过目标Logstore的数据保存时间。</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("delaySeconds")
        public Long delaySeconds;

        /**
         * <ul>
         * <li>OSS Endpoint，只能是OSS内网Endpoint，仅支持同地域。详情请参见<a href="https://help.aliyun.com/document_detail/31837.html">OSS访问域名和数据中心</a>，值为<code>http://+OSS Endpoint</code>。</li>
         * <li>OSS-HDFS Endpoint，只能是OSS-HDFS内网Endpoint，仅支持同地域。</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss-cn-hangzhou-internal.aliyuncs.com">https://oss-cn-hangzhou-internal.aliyuncs.com</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>分区格式，详情参见<a href="https://help.aliyun.com/document_detail/371934.html">分区格式</a>。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>%Y/%m/%d/%H/%M</p>
         */
        @NameInMap("pathFormat")
        public String pathFormat;

        /**
         * <p>分区格式类型</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>time</p>
         */
        @NameInMap("pathFormatType")
        public String pathFormatType;

        /**
         * <p>OSS文件前缀</p>
         * 
         * <strong>example:</strong>
         * <p>prefix-demo/</p>
         */
        @NameInMap("prefix")
        public String prefix;

        /**
         * <p>写OSS RAM角色roleArn，请填写您自己的角色roleArn</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1234567890:role/aliyunlogdefaultrole</p>
         */
        @NameInMap("roleArn")
        public String roleArn;

        /**
         * <p>OSS文件后缀</p>
         * 
         * <strong>example:</strong>
         * <p>.json</p>
         */
        @NameInMap("suffix")
        public String suffix;

        /**
         * <p>时区，详情参见<a href="https://help.aliyun.com/document_detail/375323.html">时区列表</a>。</p>
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
