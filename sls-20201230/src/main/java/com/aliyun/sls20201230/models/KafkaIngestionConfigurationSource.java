// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class KafkaIngestionConfigurationSource extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.28:9092</p>
     */
    @NameInMap("bootstrapServers")
    public String bootstrapServers;

    /**
     * <strong>example:</strong>
     * <p>{     &quot;protocol&quot;:&quot;SASL_PLAINTEXT&quot;,      &quot;sasl&quot;:{         &quot;mechanism&quot;:&quot;PLAIN&quot;,         &quot;username&quot;:&quot;用户名&quot;,         &quot;password&quot;:&quot;密码&quot;     } }</p>
     */
    @NameInMap("communication")
    public String communication;

    /**
     * <strong>example:</strong>
     * <p>consumer</p>
     */
    @NameInMap("consumerGroup")
    public String consumerGroup;

    /**
     * <strong>example:</strong>
     * <p>system,kafka</p>
     */
    @NameInMap("defaultTimeSource")
    public String defaultTimeSource;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableSlsContext")
    public Boolean enableSlsContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UTF-8</p>
     */
    @NameInMap("encoding")
    public String encoding;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>earliest,latest</p>
     */
    @NameInMap("fromPosition")
    public String fromPosition;

    /**
     * <strong>example:</strong>
     * <p>{&quot;hostname&quot;: &quot;192.168.1.28&quot;}</p>
     */
    @NameInMap("nameResolutions")
    public String nameResolutions;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("parseArray")
    public Boolean parseArray;

    /**
     * <strong>example:</strong>
     * <p>ingest-processor-1756802123-953901</p>
     */
    @NameInMap("processorId")
    public String processorId;

    /**
     * <strong>example:</strong>
     * <p><strong>time</strong></p>
     */
    @NameInMap("timeField")
    public String timeField;

    /**
     * <strong>example:</strong>
     * <p>epoch</p>
     */
    @NameInMap("timeFormat")
    public String timeFormat;

    /**
     * <strong>example:</strong>
     * <p>\d{4}-\d{2}-\d{2} \d{2}:\d{2}:\d{2}</p>
     */
    @NameInMap("timePattern")
    public String timePattern;

    /**
     * <strong>example:</strong>
     * <p>+0800</p>
     */
    @NameInMap("timeZone")
    public String timeZone;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>topic1,topic2</p>
     */
    @NameInMap("topics")
    public String topics;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text,json</p>
     */
    @NameInMap("valueType")
    public String valueType;

    @NameInMap("vpcId")
    public String vpcId;

    public static KafkaIngestionConfigurationSource build(java.util.Map<String, ?> map) throws Exception {
        KafkaIngestionConfigurationSource self = new KafkaIngestionConfigurationSource();
        return TeaModel.build(map, self);
    }

    public KafkaIngestionConfigurationSource setBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
        return this;
    }
    public String getBootstrapServers() {
        return this.bootstrapServers;
    }

    public KafkaIngestionConfigurationSource setCommunication(String communication) {
        this.communication = communication;
        return this;
    }
    public String getCommunication() {
        return this.communication;
    }

    public KafkaIngestionConfigurationSource setConsumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
        return this;
    }
    public String getConsumerGroup() {
        return this.consumerGroup;
    }

    public KafkaIngestionConfigurationSource setDefaultTimeSource(String defaultTimeSource) {
        this.defaultTimeSource = defaultTimeSource;
        return this;
    }
    public String getDefaultTimeSource() {
        return this.defaultTimeSource;
    }

    public KafkaIngestionConfigurationSource setEnableSlsContext(Boolean enableSlsContext) {
        this.enableSlsContext = enableSlsContext;
        return this;
    }
    public Boolean getEnableSlsContext() {
        return this.enableSlsContext;
    }

    public KafkaIngestionConfigurationSource setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }
    public String getEncoding() {
        return this.encoding;
    }

    public KafkaIngestionConfigurationSource setFromPosition(String fromPosition) {
        this.fromPosition = fromPosition;
        return this;
    }
    public String getFromPosition() {
        return this.fromPosition;
    }

    public KafkaIngestionConfigurationSource setNameResolutions(String nameResolutions) {
        this.nameResolutions = nameResolutions;
        return this;
    }
    public String getNameResolutions() {
        return this.nameResolutions;
    }

    public KafkaIngestionConfigurationSource setParseArray(Boolean parseArray) {
        this.parseArray = parseArray;
        return this;
    }
    public Boolean getParseArray() {
        return this.parseArray;
    }

    public KafkaIngestionConfigurationSource setProcessorId(String processorId) {
        this.processorId = processorId;
        return this;
    }
    public String getProcessorId() {
        return this.processorId;
    }

    public KafkaIngestionConfigurationSource setTimeField(String timeField) {
        this.timeField = timeField;
        return this;
    }
    public String getTimeField() {
        return this.timeField;
    }

    public KafkaIngestionConfigurationSource setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }
    public String getTimeFormat() {
        return this.timeFormat;
    }

    public KafkaIngestionConfigurationSource setTimePattern(String timePattern) {
        this.timePattern = timePattern;
        return this;
    }
    public String getTimePattern() {
        return this.timePattern;
    }

    public KafkaIngestionConfigurationSource setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public KafkaIngestionConfigurationSource setTopics(String topics) {
        this.topics = topics;
        return this;
    }
    public String getTopics() {
        return this.topics;
    }

    public KafkaIngestionConfigurationSource setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

    public KafkaIngestionConfigurationSource setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
