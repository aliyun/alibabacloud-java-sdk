// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class AzureBlobIngestionConfigurationSource extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dGVzdGtleQ==</p>
     */
    @NameInMap("accountKey")
    public String accountKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test001</p>
     */
    @NameInMap("accountName")
    public String accountName;

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
     * <p>test-container</p>
     */
    @NameInMap("containerName")
    public String containerName;

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
     * <p>This parameter is required.</p>
     */
    @NameInMap("format")
    public java.util.Map<String, ?> format;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30m</p>
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

    /**
     * <strong>example:</strong>
     * <p>1714274081</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
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
     * <p>[0-9]{0,2}/[0-9a-zA-Z]+/[0-9:,]+</p>
     */
    @NameInMap("timePattern")
    public String timePattern;

    /**
     * <strong>example:</strong>
     * <p>GMT+08:00</p>
     */
    @NameInMap("timeZone")
    public String timeZone;

    public static AzureBlobIngestionConfigurationSource build(java.util.Map<String, ?> map) throws Exception {
        AzureBlobIngestionConfigurationSource self = new AzureBlobIngestionConfigurationSource();
        return TeaModel.build(map, self);
    }

    public AzureBlobIngestionConfigurationSource setAccountKey(String accountKey) {
        this.accountKey = accountKey;
        return this;
    }
    public String getAccountKey() {
        return this.accountKey;
    }

    public AzureBlobIngestionConfigurationSource setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public AzureBlobIngestionConfigurationSource setCompressionCodec(String compressionCodec) {
        this.compressionCodec = compressionCodec;
        return this;
    }
    public String getCompressionCodec() {
        return this.compressionCodec;
    }

    public AzureBlobIngestionConfigurationSource setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public AzureBlobIngestionConfigurationSource setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }
    public String getEncoding() {
        return this.encoding;
    }

    public AzureBlobIngestionConfigurationSource setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public AzureBlobIngestionConfigurationSource setFormat(java.util.Map<String, ?> format) {
        this.format = format;
        return this;
    }
    public java.util.Map<String, ?> getFormat() {
        return this.format;
    }

    public AzureBlobIngestionConfigurationSource setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public AzureBlobIngestionConfigurationSource setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public String getPattern() {
        return this.pattern;
    }

    public AzureBlobIngestionConfigurationSource setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public AzureBlobIngestionConfigurationSource setProcessorId(String processorId) {
        this.processorId = processorId;
        return this;
    }
    public String getProcessorId() {
        return this.processorId;
    }

    public AzureBlobIngestionConfigurationSource setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public AzureBlobIngestionConfigurationSource setTagPackId(Boolean tagPackId) {
        this.tagPackId = tagPackId;
        return this;
    }
    public Boolean getTagPackId() {
        return this.tagPackId;
    }

    public AzureBlobIngestionConfigurationSource setTimeField(String timeField) {
        this.timeField = timeField;
        return this;
    }
    public String getTimeField() {
        return this.timeField;
    }

    public AzureBlobIngestionConfigurationSource setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }
    public String getTimeFormat() {
        return this.timeFormat;
    }

    public AzureBlobIngestionConfigurationSource setTimePattern(String timePattern) {
        this.timePattern = timePattern;
        return this;
    }
    public String getTimePattern() {
        return this.timePattern;
    }

    public AzureBlobIngestionConfigurationSource setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
