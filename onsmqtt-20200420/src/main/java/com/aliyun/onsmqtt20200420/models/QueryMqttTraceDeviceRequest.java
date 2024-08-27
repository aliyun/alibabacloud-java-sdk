// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryMqttTraceDeviceRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query. The value of this parameter is a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1621580400000</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The client ID of the device whose trace you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GID_test@@@producer</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The number of the page to return. Pages start from page 1. If the input parameter value is greater than the total number of pages, the returned result is empty.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end of the time range to query. The value of this parameter is a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1621584000000</p>
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
     * <p>The number of entries to return on each page. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether the returned results are displayed in reverse chronological order. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The returned results are displayed in reverse time order of actions on the device. This means that the information about the latest action on the device is displayed as the first entry and the information about the earliest action on the device is displayed as the last entry.</li>
     * <li><strong>false</strong>: The returned results are displayed in time order of actions on the device. This means that the information about the earliest action on the device is displayed as the first entry and the information about the latest action on the device is displayed as the last entry.</li>
     * </ul>
     * <p>If you do not specify this parameter, the returned results are displayed in time order of actions on the device by default.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    public static QueryMqttTraceDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMqttTraceDeviceRequest self = new QueryMqttTraceDeviceRequest();
        return TeaModel.build(map, self);
    }

    public QueryMqttTraceDeviceRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public QueryMqttTraceDeviceRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public QueryMqttTraceDeviceRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryMqttTraceDeviceRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryMqttTraceDeviceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMqttTraceDeviceRequest setMqttRegionId(String mqttRegionId) {
        this.mqttRegionId = mqttRegionId;
        return this;
    }
    public String getMqttRegionId() {
        return this.mqttRegionId;
    }

    public QueryMqttTraceDeviceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMqttTraceDeviceRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

}
