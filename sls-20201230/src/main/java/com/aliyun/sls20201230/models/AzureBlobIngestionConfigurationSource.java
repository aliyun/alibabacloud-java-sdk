// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class AzureBlobIngestionConfigurationSource extends TeaModel {
    /**
     * <p>The access key for the Azure Blob Storage account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dGVzdGtleQ==</p>
     */
    @NameInMap("accountKey")
    public String accountKey;

    /**
     * <p>The name of the Azure Blob Storage account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test001</p>
     */
    @NameInMap("accountName")
    public String accountName;

    /**
     * <p>Advanced configuration options.</p>
     */
    @NameInMap("advancedParameters")
    public java.util.Map<String, ?> advancedParameters;

    /**
     * <p>The compression codec for the source data. Valid values are <code>none</code>, <code>snappy</code>, and <code>gzip</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("compressionCodec")
    public String compressionCodec;

    /**
     * <p>The name of the container in Azure Blob Storage.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-container</p>
     */
    @NameInMap("containerName")
    public String containerName;

    /**
     * <p>The character encoding of the source files.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UTF-8</p>
     */
    @NameInMap("encoding")
    public String encoding;

    /**
     * <p>Ingests only files modified before this time, specified as a Unix timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1714360481</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The service endpoint for Azure Blob Storage.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://your-storage.blob.core.windows.net">https://your-storage.blob.core.windows.net</a></p>
     */
    @NameInMap("endpoint")
    public String endpoint;

    /**
     * <p>The format of the source data.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("format")
    public java.util.Map<String, ?> format;

    /**
     * <p>The interval at which to check for new files to ingest.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30m</p>
     */
    @NameInMap("interval")
    public String interval;

    /**
     * <p>A pattern used to filter files by path.</p>
     * 
     * <strong>example:</strong>
     * <p>.*</p>
     */
    @NameInMap("pattern")
    public String pattern;

    /**
     * <p>The file path prefix used to filter files.</p>
     * 
     * <strong>example:</strong>
     * <p>prefix</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <p>The ID of the processor that receives the data.</p>
     * 
     * <strong>example:</strong>
     * <p>ingest-processor-1756802123-953901</p>
     */
    @NameInMap("processorId")
    public String processorId;

    /**
     * <p>Ingests only files modified after this time, specified as a Unix timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1714274081</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>Specifies whether to enable context query.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("tagPackId")
    public Boolean tagPackId;

    /**
     * <p>The source field for the time value.</p>
     * 
     * <strong>example:</strong>
     * <p><strong>time</strong></p>
     */
    @NameInMap("timeField")
    public String timeField;

    /**
     * <p>The format of the time field.</p>
     * 
     * <strong>example:</strong>
     * <p>yyyy-MM-dd HH:mm:ss</p>
     */
    @NameInMap("timeFormat")
    public String timeFormat;

    /**
     * <p>The pattern used to extract the time value.</p>
     * 
     * <strong>example:</strong>
     * <p>[0-9]{0,2}\/[0-9a-zA-Z]+\/[0-9:,]+</p>
     */
    @NameInMap("timePattern")
    public String timePattern;

    /**
     * <p>The time zone of the time field.</p>
     * 
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

    public AzureBlobIngestionConfigurationSource setAdvancedParameters(java.util.Map<String, ?> advancedParameters) {
        this.advancedParameters = advancedParameters;
        return this;
    }
    public java.util.Map<String, ?> getAdvancedParameters() {
        return this.advancedParameters;
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

    public AzureBlobIngestionConfigurationSource setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
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
