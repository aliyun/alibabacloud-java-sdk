// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GCSIngestionConfigurationSource extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("accessKeyId")
    public String accessKeyId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("accessKeySecret")
    public String accessKeySecret;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gcsbucket</p>
     */
    @NameInMap("bucket")
    public String bucket;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("compressionCodec")
    public String compressionCodec;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UTF-8</p>
     */
    @NameInMap("encoding")
    public String encoding;

    /**
     * <strong>example:</strong>
     * <p>1714360481</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>oss-cn-hangzhou.aliyuncs.com</p>
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
     * 
     * <strong>example:</strong>
     * <p>never</p>
     */
    @NameInMap("interval")
    public String interval;

    /**
     * <strong>example:</strong>
     * <p>.*</p>
     */
    @NameInMap("pattern")
    public String pattern;

    /**
     * <strong>example:</strong>
     * <p>prefix</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <strong>example:</strong>
     * <p>ingest-processor-1756802123-953901</p>
     */
    @NameInMap("processorId")
    public String processorId;

    @NameInMap("restoreObjectEnabled")
    public Boolean restoreObjectEnabled;

    /**
     * <strong>example:</strong>
     * <p>1714274081</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    @NameInMap("tagPackId")
    public Boolean tagPackId;

    /**
     * <strong>example:</strong>
     * <p><strong>time</strong></p>
     */
    @NameInMap("timeField")
    public String timeField;

    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd HH:mm:ss</p>
     */
    @NameInMap("timeFormat")
    public String timeFormat;

    /**
     * <strong>example:</strong>
     * <p>[0-9]{0,2}\/[0-9a-zA-Z]+\/[0-9:,]+</p>
     */
    @NameInMap("timePattern")
    public String timePattern;

    /**
     * <strong>example:</strong>
     * <p>GMT+08:00</p>
     */
    @NameInMap("timeZone")
    public String timeZone;

    public static GCSIngestionConfigurationSource build(java.util.Map<String, ?> map) throws Exception {
        GCSIngestionConfigurationSource self = new GCSIngestionConfigurationSource();
        return TeaModel.build(map, self);
    }

    public GCSIngestionConfigurationSource setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public GCSIngestionConfigurationSource setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
        return this;
    }
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public GCSIngestionConfigurationSource setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public GCSIngestionConfigurationSource setCompressionCodec(String compressionCodec) {
        this.compressionCodec = compressionCodec;
        return this;
    }
    public String getCompressionCodec() {
        return this.compressionCodec;
    }

    public GCSIngestionConfigurationSource setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }
    public String getEncoding() {
        return this.encoding;
    }

    public GCSIngestionConfigurationSource setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GCSIngestionConfigurationSource setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public GCSIngestionConfigurationSource setFormat(java.util.Map<String, ?> format) {
        this.format = format;
        return this;
    }
    public java.util.Map<String, ?> getFormat() {
        return this.format;
    }

    public GCSIngestionConfigurationSource setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public GCSIngestionConfigurationSource setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public String getPattern() {
        return this.pattern;
    }

    public GCSIngestionConfigurationSource setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public GCSIngestionConfigurationSource setProcessorId(String processorId) {
        this.processorId = processorId;
        return this;
    }
    public String getProcessorId() {
        return this.processorId;
    }

    public GCSIngestionConfigurationSource setRestoreObjectEnabled(Boolean restoreObjectEnabled) {
        this.restoreObjectEnabled = restoreObjectEnabled;
        return this;
    }
    public Boolean getRestoreObjectEnabled() {
        return this.restoreObjectEnabled;
    }

    public GCSIngestionConfigurationSource setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GCSIngestionConfigurationSource setTagPackId(Boolean tagPackId) {
        this.tagPackId = tagPackId;
        return this;
    }
    public Boolean getTagPackId() {
        return this.tagPackId;
    }

    public GCSIngestionConfigurationSource setTimeField(String timeField) {
        this.timeField = timeField;
        return this;
    }
    public String getTimeField() {
        return this.timeField;
    }

    public GCSIngestionConfigurationSource setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }
    public String getTimeFormat() {
        return this.timeFormat;
    }

    public GCSIngestionConfigurationSource setTimePattern(String timePattern) {
        this.timePattern = timePattern;
        return this;
    }
    public String getTimePattern() {
        return this.timePattern;
    }

    public GCSIngestionConfigurationSource setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
