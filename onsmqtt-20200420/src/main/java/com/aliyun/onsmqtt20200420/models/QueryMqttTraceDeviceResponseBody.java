// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryMqttTraceDeviceResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The details of the action on the device.</p>
     */
    @NameInMap("DeviceInfoList")
    public java.util.List<QueryMqttTraceDeviceResponseBodyDeviceInfoList> deviceInfoList;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID. You can use the ID to troubleshoot issues. This parameter is a common parameter.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned actions on the device.</p>
     */
    @NameInMap("Total")
    public Long total;

    public static QueryMqttTraceDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMqttTraceDeviceResponseBody self = new QueryMqttTraceDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMqttTraceDeviceResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryMqttTraceDeviceResponseBody setDeviceInfoList(java.util.List<QueryMqttTraceDeviceResponseBodyDeviceInfoList> deviceInfoList) {
        this.deviceInfoList = deviceInfoList;
        return this;
    }
    public java.util.List<QueryMqttTraceDeviceResponseBodyDeviceInfoList> getDeviceInfoList() {
        return this.deviceInfoList;
    }

    public QueryMqttTraceDeviceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMqttTraceDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMqttTraceDeviceResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QueryMqttTraceDeviceResponseBodyDeviceInfoList extends TeaModel {
        /**
         * <p>The action on the device. Valid values:</p>
         * <br>
         * <p>*   **connect**: The ApsaraMQ for MQTT client requests a connection to the ApsaraMQ for MQTT broker.</p>
         * <p>*   **close**: The TCP connection is closed.</p>
         * <p>*   **disconnect**: The ApsaraMQ for MQTT client requests a disconnection from the ApsaraMQ for MQTT broker.</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The returned code for the action on the device. Valid values:</p>
         * <br>
         * <p>*   **mqtt.trace.action.connect**: This value is returned if the value of Action is **connect**.</p>
         * <p>*   **mqtt.trace.action.close**: This value is returned if the value of Action is **close**.</p>
         * <p>*   **mqtt.trace.action.disconnect**: This value is returned if the value of Action is **disconnect**.</p>
         */
        @NameInMap("ActionCode")
        public String actionCode;

        /**
         * <p>The returned information for the action on the device. Valid values:</p>
         * <br>
         * <p>*   **accepted**: The ApsaraMQ for MQTT broker accepts the connection request from the ApsaraMQ for MQTT client.</p>
         * <p>*   **not authorized**: The TCP connection is closed because the permission verification of the client to access the instance fails.</p>
         * <p>*   **clientId conflict**: The TCP connection is closed due to a conflict in the ID of the ApsaraMQ for MQTT client.</p>
         * <p>*   **resource auth failed**: The TCP connection is closed because the permission verification for the ApsaraMQ for MQTT client to access the topic or group fails.</p>
         * <p>*   **no heart**: The TCP connection is closed because no heartbeat is detected on the client.</p>
         * <p>*   **closed by client**: The TCP connection is closed because an exception occurs on the client.</p>
         * <p>*   **disconnected by client**: The client requests a disconnection.</p>
         * <p>*   **invalid param**: The TCP connection is closed due to invalid request parameters.</p>
         * <p>*   **Socket IOException**: The TCP connection is closed due to network jitter or packet loss.</p>
         */
        @NameInMap("ActionInfo")
        public String actionInfo;

        /**
         * <p>The connection ID.</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The time when the action occurred on the device.</p>
         */
        @NameInMap("Time")
        public String time;

        public static QueryMqttTraceDeviceResponseBodyDeviceInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryMqttTraceDeviceResponseBodyDeviceInfoList self = new QueryMqttTraceDeviceResponseBodyDeviceInfoList();
            return TeaModel.build(map, self);
        }

        public QueryMqttTraceDeviceResponseBodyDeviceInfoList setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public QueryMqttTraceDeviceResponseBodyDeviceInfoList setActionCode(String actionCode) {
            this.actionCode = actionCode;
            return this;
        }
        public String getActionCode() {
            return this.actionCode;
        }

        public QueryMqttTraceDeviceResponseBodyDeviceInfoList setActionInfo(String actionInfo) {
            this.actionInfo = actionInfo;
            return this;
        }
        public String getActionInfo() {
            return this.actionInfo;
        }

        public QueryMqttTraceDeviceResponseBodyDeviceInfoList setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public QueryMqttTraceDeviceResponseBodyDeviceInfoList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
