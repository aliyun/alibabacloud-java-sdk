// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryMqttTraceDeviceResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The details of the device activity entries.</p>
     */
    @NameInMap("DeviceInfoList")
    public java.util.List<QueryMqttTraceDeviceResponseBodyDeviceInfoList> deviceInfoList;

    /**
     * <p>The maximum number of device activity entries displayed per page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>A common parameter. Each request has a unique ID that is active for troubleshooting and locating issues.</p>
     * 
     * <strong>example:</strong>
     * <p>317076B7-F946-46BC-A98F-4CF9777C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of device activity entries returned.</p>
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
         * <p>The device action. Valid values:</p>
         * <ul>
         * <li><p><strong>connect</strong>: The client requests a connection to the server.</p>
         * </li>
         * <li><p><strong>close</strong>: The TCP connection is closed.</p>
         * </li>
         * <li><p><strong>disconnect</strong>: The client requests to disconnect from the server.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>connect</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The return code of the device action. Valid values:</p>
         * <ul>
         * <li><p><strong>mqtt.trace.action.connect</strong>: returned when the device action is <strong>connect</strong>.</p>
         * </li>
         * <li><p><strong>mqtt.trace.action.close</strong>: returned when the device action is <strong>close</strong>.</p>
         * </li>
         * <li><p><strong>mqtt.trace.action.disconnect</strong>: returned when the device action is <strong>disconnect</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mqtt.trace.action.connect</p>
         */
        @NameInMap("ActionCode")
        public String actionCode;

        /**
         * <p>The description of the device action. Valid values:</p>
         * <ul>
         * <li><p><strong>accepted</strong>: The server accepts the connection request from the client.</p>
         * </li>
         * <li><p><strong>not authorized</strong>: The TCP connection is closed because the permission verification of the instance accessed by the client fails.</p>
         * </li>
         * <li><p><strong>clientId conflict</strong>: The TCP connection is closed because of a client ID conflict.</p>
         * </li>
         * <li><p><strong>resource auth failed</strong>: The TCP connection is closed because the permission verification of the topic or group ID resource accessed by the client fails.</p>
         * </li>
         * <li><p><strong>no heart</strong>: The TCP connection is closed because no heartbeat is detected from the client.</p>
         * </li>
         * <li><p><strong>closed by client</strong>: The TCP connection is closed because of a client exception.</p>
         * </li>
         * <li><p><strong>disconnected by client</strong>: The client requests to disconnect.</p>
         * </li>
         * <li><p><strong>invalid param</strong>: The TCP connection is closed because of invalid request parameters.</p>
         * </li>
         * <li><p><strong>Socket IOException</strong>: The TCP connection is closed because of network jitter or packet loss.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("ActionInfo")
        public String actionInfo;

        /**
         * <p>The connection identifier of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>c69fe839209547fa9d073781b9cd****</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The time when the device action occurred.</p>
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
