// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class OSSExportConfiguration extends TeaModel {
    @NameInMap("fromTime")
    public Long fromTime;

    @NameInMap("logstore")
    public String logstore;

    @NameInMap("roleArn")
    public String roleArn;

    @NameInMap("sink")
    public OSSExportConfigurationSink sink;

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
        @NameInMap("bucket")
        public String bucket;

        @NameInMap("bufferInterval")
        public Long bufferInterval;

        @NameInMap("bufferSize")
        public Long bufferSize;

        @NameInMap("compressionType")
        public String compressionType;

        @NameInMap("contentDetail")
        public String contentDetail;

        @NameInMap("contentType")
        public String contentType;

        @NameInMap("delaySec")
        public Long delaySec;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("pathFormat")
        public String pathFormat;

        @NameInMap("pathFormatType")
        public String pathFormatType;

        @NameInMap("prefix")
        public String prefix;

        @NameInMap("roleArn")
        public String roleArn;

        @NameInMap("suffix")
        public String suffix;

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

        public OSSExportConfigurationSink setContentDetail(String contentDetail) {
            this.contentDetail = contentDetail;
            return this;
        }
        public String getContentDetail() {
            return this.contentDetail;
        }

        public OSSExportConfigurationSink setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public OSSExportConfigurationSink setDelaySec(Long delaySec) {
            this.delaySec = delaySec;
            return this;
        }
        public Long getDelaySec() {
            return this.delaySec;
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
