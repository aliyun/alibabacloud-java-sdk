// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class OSSIngestionConfigurationSource extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("bucket")
    public String bucket;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("compressionCodec")
    public String compressionCodec;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("encoding")
    public String encoding;

    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("endpoint")
    public String endpoint;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("format")
    public java.util.Map<String, ?> format;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("interval")
    public String interval;

    @NameInMap("pattern")
    public String pattern;

    @NameInMap("prefix")
    public String prefix;

    @NameInMap("restoreObjectEnabled")
    public Boolean restoreObjectEnabled;

    @NameInMap("roleARN")
    public String roleARN;

    @NameInMap("startTime")
    public Long startTime;

    @NameInMap("timeField")
    public String timeField;

    @NameInMap("timeFormat")
    public String timeFormat;

    @NameInMap("timePattern")
    public String timePattern;

    @NameInMap("timeZone")
    public String timeZone;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("useMetaIndex")
    public Boolean useMetaIndex;

    public static OSSIngestionConfigurationSource build(java.util.Map<String, ?> map) throws Exception {
        OSSIngestionConfigurationSource self = new OSSIngestionConfigurationSource();
        return TeaModel.build(map, self);
    }

    public OSSIngestionConfigurationSource setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public OSSIngestionConfigurationSource setCompressionCodec(String compressionCodec) {
        this.compressionCodec = compressionCodec;
        return this;
    }
    public String getCompressionCodec() {
        return this.compressionCodec;
    }

    public OSSIngestionConfigurationSource setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }
    public String getEncoding() {
        return this.encoding;
    }

    public OSSIngestionConfigurationSource setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public OSSIngestionConfigurationSource setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public OSSIngestionConfigurationSource setFormat(java.util.Map<String, ?> format) {
        this.format = format;
        return this;
    }
    public java.util.Map<String, ?> getFormat() {
        return this.format;
    }

    public OSSIngestionConfigurationSource setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public OSSIngestionConfigurationSource setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public String getPattern() {
        return this.pattern;
    }

    public OSSIngestionConfigurationSource setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public OSSIngestionConfigurationSource setRestoreObjectEnabled(Boolean restoreObjectEnabled) {
        this.restoreObjectEnabled = restoreObjectEnabled;
        return this;
    }
    public Boolean getRestoreObjectEnabled() {
        return this.restoreObjectEnabled;
    }

    public OSSIngestionConfigurationSource setRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }
    public String getRoleARN() {
        return this.roleARN;
    }

    public OSSIngestionConfigurationSource setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public OSSIngestionConfigurationSource setTimeField(String timeField) {
        this.timeField = timeField;
        return this;
    }
    public String getTimeField() {
        return this.timeField;
    }

    public OSSIngestionConfigurationSource setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }
    public String getTimeFormat() {
        return this.timeFormat;
    }

    public OSSIngestionConfigurationSource setTimePattern(String timePattern) {
        this.timePattern = timePattern;
        return this;
    }
    public String getTimePattern() {
        return this.timePattern;
    }

    public OSSIngestionConfigurationSource setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public OSSIngestionConfigurationSource setUseMetaIndex(Boolean useMetaIndex) {
        this.useMetaIndex = useMetaIndex;
        return this;
    }
    public Boolean getUseMetaIndex() {
        return this.useMetaIndex;
    }

}
