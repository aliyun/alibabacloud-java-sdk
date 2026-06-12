// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class KafkaIngestionConfigurationSource extends TeaModel {
    /**
     * <p>A list of bootstrap servers for the Kafka cluster, formatted as <code>host1:port1,host2:port2</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.28:9092</p>
     */
    @NameInMap("bootstrapServers")
    public String bootstrapServers;

    /**
     * <p>The authentication and communication protocol settings in JSON format. For example, you can use this parameter to configure SASL authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;protocol&quot;:&quot;SASL_PLAINTEXT&quot;,      &quot;sasl&quot;:{         &quot;mechanism&quot;:&quot;PLAIN&quot;,         &quot;username&quot;:&quot;用户名&quot;,         &quot;password&quot;:&quot;密码&quot;     } }</p>
     */
    @NameInMap("communication")
    public String communication;

    /**
     * <p>The ID of the Kafka consumer group.</p>
     * 
     * <strong>example:</strong>
     * <p>consumer</p>
     */
    @NameInMap("consumerGroup")
    public String consumerGroup;

    /**
     * <p>The default time source to use if timestamp extraction from the log data fails. Valid values are <code>system</code> (the time of the ingestion server) and <code>kafka</code> (the timestamp from the Kafka message).</p>
     * 
     * <strong>example:</strong>
     * <p>system,kafka</p>
     */
    @NameInMap("defaultTimeSource")
    public String defaultTimeSource;

    /**
     * <p>Specifies whether to add Simple Log Service (SLS) context fields, such as <code>__topic__</code> and <code>__partition__</code>, to each log entry.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableSlsContext")
    public Boolean enableSlsContext;

    /**
     * <p>Specifies whether to enable NAT for VPC connections. Set this to <code>true</code> if your Kafka cluster is in a VPC and requires NAT for access.</p>
     */
    @NameInMap("enableVpcNat")
    public Boolean enableVpcNat;

    /**
     * <p>The character encoding of the message. This parameter applies only when <code>valueType</code> is <code>text</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UTF-8</p>
     */
    @NameInMap("encoding")
    public String encoding;

    /**
     * <p>The data format configuration.</p>
     */
    @NameInMap("format")
    public java.util.Map<String, ?> format;

    /**
     * <p>The starting position for data consumption. Valid values: <code>earliest</code> and <code>latest</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>earliest,latest</p>
     */
    @NameInMap("fromPosition")
    public String fromPosition;

    /**
     * <p>Custom DNS resolutions in JSON format. Use this parameter to map hostnames to IP addresses.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;hostname&quot;: &quot;192.168.1.28&quot;}</p>
     */
    @NameInMap("nameResolutions")
    public String nameResolutions;

    /**
     * <p>Specifies whether to parse a message as a JSON array. If <code>true</code>, each element in the array becomes a separate log entry. This parameter applies only when <code>valueType</code> is <code>json</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("parseArray")
    public Boolean parseArray;

    /**
     * <p>The ID of the ingestion processor.</p>
     * 
     * <strong>example:</strong>
     * <p>ingest-processor-1756802123-953901</p>
     */
    @NameInMap("processorId")
    public String processorId;

    /**
     * <p>The ID of the security group to associate with the ingestion source. This parameter is required when connecting to a Kafka cluster in a VPC. Separate multiple IDs with a comma (<code>,</code>).</p>
     */
    @NameInMap("securityGroups")
    public String securityGroups;

    /**
     * <p>The field that contains the log timestamp. This parameter applies only when <code>valueType</code> is <code>json</code>.</p>
     * 
     * <strong>example:</strong>
     * <p><strong>time</strong></p>
     */
    @NameInMap("timeField")
    public String timeField;

    /**
     * <p>The format of the timestamp. For example, you can set this to <code>epoch</code> for a Unix timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>epoch</p>
     */
    @NameInMap("timeFormat")
    public String timeFormat;

    /**
     * <p>The regular expression for extracting the timestamp from the field specified by <code>timeField</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>\d{4}-\d{2}-\d{2} \d{2}:\d{2}:\d{2}</p>
     */
    @NameInMap("timePattern")
    public String timePattern;

    /**
     * <p>The time zone of the timestamp, such as <code>+0800</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>+0800</p>
     */
    @NameInMap("timeZone")
    public String timeZone;

    /**
     * <p>The Kafka topics to subscribe to. Separate multiple topics with a comma (<code>,</code>).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>topic1,topic2</p>
     */
    @NameInMap("topics")
    public String topics;

    /**
     * <p>The format of the message value. Valid values: <code>text</code> and <code>json</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text,json</p>
     */
    @NameInMap("valueType")
    public String valueType;

    /**
     * <p>The ID of the VPC that contains the Kafka cluster.</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <p>The ID of the VSwitch in the specified VPC. This parameter is required when connecting to a Kafka cluster in a VPC.</p>
     */
    @NameInMap("vswitchId")
    public String vswitchId;

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

    public KafkaIngestionConfigurationSource setEnableVpcNat(Boolean enableVpcNat) {
        this.enableVpcNat = enableVpcNat;
        return this;
    }
    public Boolean getEnableVpcNat() {
        return this.enableVpcNat;
    }

    public KafkaIngestionConfigurationSource setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }
    public String getEncoding() {
        return this.encoding;
    }

    public KafkaIngestionConfigurationSource setFormat(java.util.Map<String, ?> format) {
        this.format = format;
        return this;
    }
    public java.util.Map<String, ?> getFormat() {
        return this.format;
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

    public KafkaIngestionConfigurationSource setSecurityGroups(String securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }
    public String getSecurityGroups() {
        return this.securityGroups;
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

    public KafkaIngestionConfigurationSource setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

}
