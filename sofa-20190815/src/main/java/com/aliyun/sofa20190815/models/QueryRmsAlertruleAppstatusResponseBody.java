// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlertruleAppstatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsAlertruleAppstatusResponseBodyResponse response;

    public static QueryRmsAlertruleAppstatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlertruleAppstatusResponseBody self = new QueryRmsAlertruleAppstatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlertruleAppstatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsAlertruleAppstatusResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsAlertruleAppstatusResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsAlertruleAppstatusResponseBody setResponse(QueryRmsAlertruleAppstatusResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsAlertruleAppstatusResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsAlertruleAppstatusResponseBodyResponse extends TeaModel {
        @NameInMap("ItemTypeAlerting")
        public java.util.List<String> itemTypeAlerting;

        @NameInMap("ItemTypeConfigured")
        public java.util.List<String> itemTypeConfigured;

        @NameInMap("ItemTypeNotConfigured")
        public java.util.List<String> itemTypeNotConfigured;

        public static QueryRmsAlertruleAppstatusResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlertruleAppstatusResponseBodyResponse self = new QueryRmsAlertruleAppstatusResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlertruleAppstatusResponseBodyResponse setItemTypeAlerting(java.util.List<String> itemTypeAlerting) {
            this.itemTypeAlerting = itemTypeAlerting;
            return this;
        }
        public java.util.List<String> getItemTypeAlerting() {
            return this.itemTypeAlerting;
        }

        public QueryRmsAlertruleAppstatusResponseBodyResponse setItemTypeConfigured(java.util.List<String> itemTypeConfigured) {
            this.itemTypeConfigured = itemTypeConfigured;
            return this;
        }
        public java.util.List<String> getItemTypeConfigured() {
            return this.itemTypeConfigured;
        }

        public QueryRmsAlertruleAppstatusResponseBodyResponse setItemTypeNotConfigured(java.util.List<String> itemTypeNotConfigured) {
            this.itemTypeNotConfigured = itemTypeNotConfigured;
            return this;
        }
        public java.util.List<String> getItemTypeNotConfigured() {
            return this.itemTypeNotConfigured;
        }

    }

}
