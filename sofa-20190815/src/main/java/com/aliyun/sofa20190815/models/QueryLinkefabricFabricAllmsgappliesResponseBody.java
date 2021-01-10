// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricAllmsgappliesResponseBody extends TeaModel {
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
    public QueryLinkefabricFabricAllmsgappliesResponseBodyData data;

    public static QueryLinkefabricFabricAllmsgappliesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricAllmsgappliesResponseBody self = new QueryLinkefabricFabricAllmsgappliesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricAllmsgappliesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricAllmsgappliesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricAllmsgappliesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricAllmsgappliesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricAllmsgappliesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricAllmsgappliesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricAllmsgappliesResponseBody setData(QueryLinkefabricFabricAllmsgappliesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkefabricFabricAllmsgappliesResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricAllmsgappliesResponseBodyData extends TeaModel {
        @NameInMap("FinishedMsgApplies")
        public java.util.List<String> finishedMsgApplies;

        @NameInMap("HandledMsgApplies")
        public java.util.List<String> handledMsgApplies;

        @NameInMap("UnHandledMsgApplies")
        public java.util.List<String> unHandledMsgApplies;

        public static QueryLinkefabricFabricAllmsgappliesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricAllmsgappliesResponseBodyData self = new QueryLinkefabricFabricAllmsgappliesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricAllmsgappliesResponseBodyData setFinishedMsgApplies(java.util.List<String> finishedMsgApplies) {
            this.finishedMsgApplies = finishedMsgApplies;
            return this;
        }
        public java.util.List<String> getFinishedMsgApplies() {
            return this.finishedMsgApplies;
        }

        public QueryLinkefabricFabricAllmsgappliesResponseBodyData setHandledMsgApplies(java.util.List<String> handledMsgApplies) {
            this.handledMsgApplies = handledMsgApplies;
            return this;
        }
        public java.util.List<String> getHandledMsgApplies() {
            return this.handledMsgApplies;
        }

        public QueryLinkefabricFabricAllmsgappliesResponseBodyData setUnHandledMsgApplies(java.util.List<String> unHandledMsgApplies) {
            this.unHandledMsgApplies = unHandledMsgApplies;
            return this;
        }
        public java.util.List<String> getUnHandledMsgApplies() {
            return this.unHandledMsgApplies;
        }

    }

}
