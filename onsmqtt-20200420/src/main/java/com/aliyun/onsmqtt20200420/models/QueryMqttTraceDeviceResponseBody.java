// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryMqttTraceDeviceResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID. You can use the ID to troubleshoot issues. This parameter is a common parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>317076B7-F946-46BC-A98F-4CF9777C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned actions on the device.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
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
         * <ul>
         * <li><strong>connect</strong>: The ApsaraMQ for MQTT client requests a connection to the ApsaraMQ for MQTT broker.</li>
         * <li><strong>close</strong>: The TCP connection is closed.</li>
         * <li><strong>disconnect</strong>: The ApsaraMQ for MQTT client requests a disconnection from the ApsaraMQ for MQTT broker.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>connect</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The returned code for the action on the device. Valid values:</p>
         * <ul>
         * <li><strong>mqtt.trace.action.connect</strong>: This value is returned if the value of Action is <strong>connect</strong>.</li>
         * <li><strong>mqtt.trace.action.close</strong>: This value is returned if the value of Action is <strong>close</strong>.</li>
         * <li><strong>mqtt.trace.action.disconnect</strong>: This value is returned if the value of Action is <strong>disconnect</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mqtt.trace.action.connect</p>
         */
        @NameInMap("ActionCode")
        public String actionCode;

        /**
         * <p>The returned information for the action on the device. Valid values:</p>
         * <ul>
         * <li><strong>accepted</strong>: The ApsaraMQ for MQTT broker accepts the connection request from the ApsaraMQ for MQTT client.</li>
         * <li><strong>not authorized</strong>: The TCP connection is closed because the permission verification of the client to access the instance fails.</li>
         * <li><strong>clientId conflict</strong>: The TCP connection is closed due to a conflict in the ID of the ApsaraMQ for MQTT client.</li>
         * <li><strong>resource auth failed</strong>: The TCP connection is closed because the permission verification for the ApsaraMQ for MQTT client to access the topic or group fails.</li>
         * <li><strong>no heart</strong>: The TCP connection is closed because no heartbeat is detected on the client.</li>
         * <li><strong>closed by client</strong>: The TCP connection is closed because an exception occurs on the client.</li>
         * <li><strong>disconnected by client</strong>: The client requests a disconnection.</li>
         * <li><strong>invalid param</strong>: The TCP connection is closed due to invalid request parameters.</li>
         * <li><strong>Socket IOException</strong>: The TCP connection is closed due to network jitter or packet loss.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("ActionInfo")
        public String actionInfo;

        /**
         * <p>The connection ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c69fe839209547fa9d073781b9cd****</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The time when the action occurred on the device.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-21 15:51:54.867</p>
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
