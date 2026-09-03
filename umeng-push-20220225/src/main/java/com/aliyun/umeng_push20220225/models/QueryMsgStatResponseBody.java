// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class QueryMsgStatResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryMsgStatResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryMsgStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsgStatResponseBody self = new QueryMsgStatResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsgStatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMsgStatResponseBody setData(QueryMsgStatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMsgStatResponseBodyData getData() {
        return this.data;
    }

    public QueryMsgStatResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryMsgStatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMsgStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsgStatResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMsgStatResponseBodyData extends TeaModel {
        @NameInMap("Accept")
        public Long accept;

        @NameInMap("Arrive")
        public Long arrive;

        @NameInMap("ClosePush")
        public Long closePush;

        @NameInMap("Dismiss")
        public Long dismiss;

        @NameInMap("MsgId")
        public String msgId;

        @NameInMap("Open")
        public Long open;

        @NameInMap("Sent")
        public Long sent;

        @NameInMap("Status")
        public Integer status;

        public static QueryMsgStatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMsgStatResponseBodyData self = new QueryMsgStatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMsgStatResponseBodyData setAccept(Long accept) {
            this.accept = accept;
            return this;
        }
        public Long getAccept() {
            return this.accept;
        }

        public QueryMsgStatResponseBodyData setArrive(Long arrive) {
            this.arrive = arrive;
            return this;
        }
        public Long getArrive() {
            return this.arrive;
        }

        public QueryMsgStatResponseBodyData setClosePush(Long closePush) {
            this.closePush = closePush;
            return this;
        }
        public Long getClosePush() {
            return this.closePush;
        }

        public QueryMsgStatResponseBodyData setDismiss(Long dismiss) {
            this.dismiss = dismiss;
            return this;
        }
        public Long getDismiss() {
            return this.dismiss;
        }

        public QueryMsgStatResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public QueryMsgStatResponseBodyData setOpen(Long open) {
            this.open = open;
            return this;
        }
        public Long getOpen() {
            return this.open;
        }

        public QueryMsgStatResponseBodyData setSent(Long sent) {
            this.sent = sent;
            return this;
        }
        public Long getSent() {
            return this.sent;
        }

        public QueryMsgStatResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
