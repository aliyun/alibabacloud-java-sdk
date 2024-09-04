// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class QueryMsgStatResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryMsgStatResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>86C4236B-D6C2-1E31-8370-2FAEC5CFE012</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Accept")
        public Long accept;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Arrive")
        public Long arrive;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ClosePush")
        public Long closePush;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dismiss")
        public Long dismiss;

        /**
         * <strong>example:</strong>
         * <p>ufe29y2167046828041801</p>
         */
        @NameInMap("MsgId")
        public String msgId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Open")
        public Long open;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sent")
        public Long sent;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
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
