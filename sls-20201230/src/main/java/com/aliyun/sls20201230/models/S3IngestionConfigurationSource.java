// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class S3IngestionConfigurationSource extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AKIxxxxxxxxxxYJE</p>
     */
    @NameInMap("awsAccessKey")
    public String awsAccessKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123xxxxxxxxxxfjf</p>
     */
    @NameInMap("awsAccessKeySecret")
    public String awsAccessKeySecret;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-northeast-1</p>
     */
    @NameInMap("awsRegion")
    public String awsRegion;

    /**
     * <strong>example:</strong>
     * <p><a href="https://sqs.ap-northeast-1.amazonaws.com/123456788/chifan">https://sqs.ap-northeast-1.amazonaws.com/123456788/chifan</a></p>
     */
    @NameInMap("awsSQSQueueUrl")
    public String awsSQSQueueUrl;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("awsUseSQS")
    public Boolean awsUseSQS;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s3bucket</p>
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

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("useAwsSQSOnly")
    public Boolean useAwsSQSOnly;

    public static S3IngestionConfigurationSource build(java.util.Map<String, ?> map) throws Exception {
        S3IngestionConfigurationSource self = new S3IngestionConfigurationSource();
        return TeaModel.build(map, self);
    }

    public S3IngestionConfigurationSource setAwsAccessKey(String awsAccessKey) {
        this.awsAccessKey = awsAccessKey;
        return this;
    }
    public String getAwsAccessKey() {
        return this.awsAccessKey;
    }

    public S3IngestionConfigurationSource setAwsAccessKeySecret(String awsAccessKeySecret) {
        this.awsAccessKeySecret = awsAccessKeySecret;
        return this;
    }
    public String getAwsAccessKeySecret() {
        return this.awsAccessKeySecret;
    }

    public S3IngestionConfigurationSource setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
        return this;
    }
    public String getAwsRegion() {
        return this.awsRegion;
    }

    public S3IngestionConfigurationSource setAwsSQSQueueUrl(String awsSQSQueueUrl) {
        this.awsSQSQueueUrl = awsSQSQueueUrl;
        return this;
    }
    public String getAwsSQSQueueUrl() {
        return this.awsSQSQueueUrl;
    }

    public S3IngestionConfigurationSource setAwsUseSQS(Boolean awsUseSQS) {
        this.awsUseSQS = awsUseSQS;
        return this;
    }
    public Boolean getAwsUseSQS() {
        return this.awsUseSQS;
    }

    public S3IngestionConfigurationSource setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public S3IngestionConfigurationSource setCompressionCodec(String compressionCodec) {
        this.compressionCodec = compressionCodec;
        return this;
    }
    public String getCompressionCodec() {
        return this.compressionCodec;
    }

    public S3IngestionConfigurationSource setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }
    public String getEncoding() {
        return this.encoding;
    }

    public S3IngestionConfigurationSource setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public S3IngestionConfigurationSource setFormat(java.util.Map<String, ?> format) {
        this.format = format;
        return this;
    }
    public java.util.Map<String, ?> getFormat() {
        return this.format;
    }

    public S3IngestionConfigurationSource setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public S3IngestionConfigurationSource setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public String getPattern() {
        return this.pattern;
    }

    public S3IngestionConfigurationSource setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public S3IngestionConfigurationSource setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public S3IngestionConfigurationSource setTagPackId(Boolean tagPackId) {
        this.tagPackId = tagPackId;
        return this;
    }
    public Boolean getTagPackId() {
        return this.tagPackId;
    }

    public S3IngestionConfigurationSource setTimeField(String timeField) {
        this.timeField = timeField;
        return this;
    }
    public String getTimeField() {
        return this.timeField;
    }

    public S3IngestionConfigurationSource setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }
    public String getTimeFormat() {
        return this.timeFormat;
    }

    public S3IngestionConfigurationSource setTimePattern(String timePattern) {
        this.timePattern = timePattern;
        return this;
    }
    public String getTimePattern() {
        return this.timePattern;
    }

    public S3IngestionConfigurationSource setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public S3IngestionConfigurationSource setUseAwsSQSOnly(Boolean useAwsSQSOnly) {
        this.useAwsSQSOnly = useAwsSQSOnly;
        return this;
    }
    public Boolean getUseAwsSQSOnly() {
        return this.useAwsSQSOnly;
    }

}
