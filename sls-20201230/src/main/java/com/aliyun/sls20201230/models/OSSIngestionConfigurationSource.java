// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class OSSIngestionConfigurationSource extends TeaModel {
    /**
     * <p>oss bucket</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ossbucket</p>
     */
    @NameInMap("bucket")
    public String bucket;

    /**
     * <p>压缩类型</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("compressionCodec")
    public String compressionCodec;

    /**
     * <p>编码类型</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UTF-8</p>
     */
    @NameInMap("encoding")
    public String encoding;

    /**
     * <p>某个时间点前修改过的文件</p>
     * 
     * <strong>example:</strong>
     * <p>1714360481</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>oss endpoint</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-hangzhou.aliyuncs.com</p>
     */
    @NameInMap("endpoint")
    public String endpoint;

    /**
     * <p>格式</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("format")
    public java.util.Map<String, ?> format;

    /**
     * <p>检查新文件周期</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>never</p>
     */
    @NameInMap("interval")
    public String interval;

    /**
     * <p>文件路径正则过滤</p>
     * 
     * <strong>example:</strong>
     * <p>.*</p>
     */
    @NameInMap("pattern")
    public String pattern;

    /**
     * <p>文件路径前缀过滤</p>
     * 
     * <strong>example:</strong>
     * <p>prefix</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <p>写入处理器id</p>
     * 
     * <strong>example:</strong>
     * <p>ingest-processor-1756802123-953901</p>
     */
    @NameInMap("processorId")
    public String processorId;

    /**
     * <p>导入归档文件</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("restoreObjectEnabled")
    public Boolean restoreObjectEnabled;

    /**
     * <p>roleArn</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::12345:role/aliyunlogdefaultrole</p>
     */
    @NameInMap("roleARN")
    public String roleARN;

    /**
     * <p>某个时间点后修改过的文件</p>
     * 
     * <strong>example:</strong>
     * <p>1714274081</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>启动上下文检索</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("tagPackId")
    public Boolean tagPackId;

    /**
     * <p>提取时间字段</p>
     * 
     * <strong>example:</strong>
     * <p><strong>time</strong></p>
     */
    @NameInMap("timeField")
    public String timeField;

    /**
     * <p>时间字段格式</p>
     * 
     * <strong>example:</strong>
     * <p>yyyy-MM-dd HH:mm:ss</p>
     */
    @NameInMap("timeFormat")
    public String timeFormat;

    /**
     * <p>提取时间正则</p>
     * 
     * <strong>example:</strong>
     * <p>[0-9]{0,2}\/[0-9a-zA-Z]+\/[0-9:,]+</p>
     */
    @NameInMap("timePattern")
    public String timePattern;

    /**
     * <p>时间字段分区</p>
     * 
     * <strong>example:</strong>
     * <p>GMT+08:00</p>
     */
    @NameInMap("timeZone")
    public String timeZone;

    /**
     * <p>使用OSS元数据索引</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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

    public OSSIngestionConfigurationSource setProcessorId(String processorId) {
        this.processorId = processorId;
        return this;
    }
    public String getProcessorId() {
        return this.processorId;
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

    public OSSIngestionConfigurationSource setTagPackId(Boolean tagPackId) {
        this.tagPackId = tagPackId;
        return this;
    }
    public Boolean getTagPackId() {
        return this.tagPackId;
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
