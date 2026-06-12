// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GCSIngestionConfigurationSource extends TeaModel {
    /**
     * <p>The access key ID for authenticating with the GCS service. This parameter is required.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("accessKeyId")
    public String accessKeyId;

    /**
     * <p>The secret access key corresponding to the <code>accessKeyId</code>. This value is sensitive and must be managed securely.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("accessKeySecret")
    public String accessKeySecret;

    /**
     * <p>A nested object for specifying advanced configuration options as key-value pairs.</p>
     */
    @NameInMap("advancedParameters")
    public java.util.Map<String, ?> advancedParameters;

    /**
     * <p>The name of the GCS bucket that contains the source data files.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gcsbucket</p>
     */
    @NameInMap("bucket")
    public String bucket;

    /**
     * <p>The compression format of the source files. Supported values are <code>none</code>, <code>gzip</code>, and <code>zstd</code>. If not specified, the system infers the format from the file extension.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("compressionCodec")
    public String compressionCodec;

    /**
     * <p>The character encoding of the source files. The default value is <code>UTF-8</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UTF-8</p>
     */
    @NameInMap("encoding")
    public String encoding;

    /**
     * <p>The end of the time range for data ingestion, specified as a Unix timestamp (in seconds). Only objects modified before this time are ingested.</p>
     * 
     * <strong>example:</strong>
     * <p>1714360481</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The service endpoint for GCS. You can use a custom endpoint for private or accelerated connections.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-hangzhou.aliyuncs.com</p>
     */
    @NameInMap("endpoint")
    public String endpoint;

    /**
     * <p>A nested object that defines the format of the source data, such as CSV, JSON, or Parquet.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("format")
    public java.util.Map<String, ?> format;

    /**
     * <p>The interval for checking for new data. Specify the value in a duration format, such as <code>15m</code> for 15 minutes. Set to <code>never</code> to perform a one-time ingestion.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>never</p>
     */
    @NameInMap("interval")
    public String interval;

    /**
     * <p>A regular expression that specifies which files to ingest. The pattern is matched against the full object key within the specified prefix.</p>
     * 
     * <strong>example:</strong>
     * <p>.*</p>
     */
    @NameInMap("pattern")
    public String pattern;

    /**
     * <p>The object key prefix used to discover files. This limits the scope of ingestion to a specific &quot;folder&quot; within the bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>prefix</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <p>The unique ID of the processor or pipeline that handles the ingested data.</p>
     * 
     * <strong>example:</strong>
     * <p>ingest-processor-1756802123-953901</p>
     */
    @NameInMap("processorId")
    public String processorId;

    /**
     * <p>Specifies whether to automatically restore objects from archival storage classes before ingestion. Set to <code>true</code> to enable this feature. The default is <code>false</code>.</p>
     */
    @NameInMap("restoreObjectEnabled")
    public Boolean restoreObjectEnabled;

    /**
     * <p>The start of the time range for data ingestion, specified as a Unix timestamp (in seconds). Only objects modified at or after this time are ingested.</p>
     * 
     * <strong>example:</strong>
     * <p>1714274081</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>The ID of a predefined tag pack to apply to the ingested data. Tag packs contain rules for data enrichment and categorization.</p>
     */
    @NameInMap("tagPackId")
    public Boolean tagPackId;

    /**
     * <p>The name of the field in your data that contains the timestamp. This timestamp is used as the event time for the ingested records.</p>
     * 
     * <strong>example:</strong>
     * <p><strong>time</strong></p>
     */
    @NameInMap("timeField")
    public String timeField;

    /**
     * <p>The format of the timestamp in the <code>timeField</code>, specified using the Java <code>SimpleDateFormat</code> pattern. For example: <code>yyyy-MM-dd\\&quot;T\\&quot;HH:mm:ss.SSSZ</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>yyyy-MM-dd HH:mm:ss</p>
     */
    @NameInMap("timeFormat")
    public String timeFormat;

    /**
     * <p>A regular expression used to extract a timestamp from unstructured data, such as a log entry or filename, if a structured <code>timeField</code> is not available.</p>
     * 
     * <strong>example:</strong>
     * <p>[0-9]{0,2}\/[0-9a-zA-Z]+\/[0-9:,]+</p>
     */
    @NameInMap("timePattern")
    public String timePattern;

    /**
     * <p>The time zone for parsing timestamps that lack explicit time zone information. Specify a valid time zone identifier, such as <code>UTC</code> or <code>America/Los_Angeles</code>.</p>
     * 
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

    public GCSIngestionConfigurationSource setAdvancedParameters(java.util.Map<String, ?> advancedParameters) {
        this.advancedParameters = advancedParameters;
        return this;
    }
    public java.util.Map<String, ?> getAdvancedParameters() {
        return this.advancedParameters;
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
