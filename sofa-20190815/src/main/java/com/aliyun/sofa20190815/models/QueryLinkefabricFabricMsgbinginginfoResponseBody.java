// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricMsgbinginginfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<QueryLinkefabricFabricMsgbinginginfoResponseBodyData> data;

    public static QueryLinkefabricFabricMsgbinginginfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricMsgbinginginfoResponseBody self = new QueryLinkefabricFabricMsgbinginginfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricMsgbinginginfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricMsgbinginginfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricMsgbinginginfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricMsgbinginginfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricMsgbinginginfoResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricMsgbinginginfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricMsgbinginginfoResponseBody setData(java.util.List<QueryLinkefabricFabricMsgbinginginfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkefabricFabricMsgbinginginfoResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricMsgbinginginfoResponseBodyData extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("Eventcode")
        public String eventcode;

        @NameInMap("ExchangeType")
        public String exchangeType;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("FilterType")
        public String filterType;

        @NameInMap("FilterValue")
        public String filterValue;

        @NameInMap("Group")
        public String group;

        @NameInMap("Persistence")
        public Boolean persistence;

        @NameInMap("RoomInfo")
        public String roomInfo;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("ZoneInfo")
        public String zoneInfo;

        public static QueryLinkefabricFabricMsgbinginginfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricMsgbinginginfoResponseBodyData self = new QueryLinkefabricFabricMsgbinginginfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricMsgbinginginfoResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public QueryLinkefabricFabricMsgbinginginfoResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryLinkefabricFabricMsgbinginginfoResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public QueryLinkefabricFabricMsgbinginginfoResponseBodyData setEventcode(String eventcode) {
            this.eventcode = eventcode;
            return this;
        }
        public String getEventcode() {
            return this.eventcode;
        }

        public QueryLinkefabricFabricMsgbinginginfoResponseBodyData setExchangeType(String exchangeType) {
            this.exchangeType = exchangeType;
            return this;
        }
        public String getExchangeType() {
            return this.exchangeType;
        }

        public QueryLinkefabricFabricMsgbinginginfoResponseBodyData setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public QueryLinkefabricFabricMsgbinginginfoResponseBodyData setFilterType(String filterType) {
            this.filterType = filterType;
            return this;
        }
        public String getFilterType() {
            return this.filterType;
        }

        public QueryLinkefabricFabricMsgbinginginfoResponseBodyData setFilterValue(String filterValue) {
            this.filterValue = filterValue;
            return this;
        }
        public String getFilterValue() {
            return this.filterValue;
        }

        public QueryLinkefabricFabricMsgbinginginfoResponseBodyData setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public QueryLinkefabricFabricMsgbinginginfoResponseBodyData setPersistence(Boolean persistence) {
            this.persistence = persistence;
            return this;
        }
        public Boolean getPersistence() {
            return this.persistence;
        }

        public QueryLinkefabricFabricMsgbinginginfoResponseBodyData setRoomInfo(String roomInfo) {
            this.roomInfo = roomInfo;
            return this;
        }
        public String getRoomInfo() {
            return this.roomInfo;
        }

        public QueryLinkefabricFabricMsgbinginginfoResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public QueryLinkefabricFabricMsgbinginginfoResponseBodyData setZoneInfo(String zoneInfo) {
            this.zoneInfo = zoneInfo;
            return this;
        }
        public String getZoneInfo() {
            return this.zoneInfo;
        }

    }

}
