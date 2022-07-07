// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryMqttTraceDeviceResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DeviceInfoList")
    public java.util.List<QueryMqttTraceDeviceResponseBodyDeviceInfoList> deviceInfoList;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Action")
        public String action;

        @NameInMap("ActionCode")
        public String actionCode;

        @NameInMap("ActionInfo")
        public String actionInfo;

        @NameInMap("ChannelId")
        public String channelId;

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
