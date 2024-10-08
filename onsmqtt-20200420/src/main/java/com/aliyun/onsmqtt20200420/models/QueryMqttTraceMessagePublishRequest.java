// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryMqttTraceMessagePublishRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query. The value of this parameter is a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1618646400000</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The end of the time range to query. The value of this parameter is a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1621591200000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the ApsaraMQ for MQTT instance. The ID must be consistent with the ID of the instance that the ApsaraMQ for MQTT client uses. You can view the instance ID in the <strong>Basic Information</strong> section on the <strong>Instance Details</strong> page that corresponds to the instance in the ApsaraMQ for MQTT console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mqtt-cn-i7m26mf****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region where the ApsaraMQ for MQTT instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/181438.html">Endpoints</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("MqttRegionId")
    public String mqttRegionId;

    /**
     * <p>The message ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AC1EC0030EAB78308DB16A3EC773****</p>
     */
    @NameInMap("MsgId")
    public String msgId;

    public static QueryMqttTraceMessagePublishRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMqttTraceMessagePublishRequest self = new QueryMqttTraceMessagePublishRequest();
        return TeaModel.build(map, self);
    }

    public QueryMqttTraceMessagePublishRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public QueryMqttTraceMessagePublishRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryMqttTraceMessagePublishRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMqttTraceMessagePublishRequest setMqttRegionId(String mqttRegionId) {
        this.mqttRegionId = mqttRegionId;
        return this;
    }
    public String getMqttRegionId() {
        return this.mqttRegionId;
    }

    public QueryMqttTraceMessagePublishRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

}
