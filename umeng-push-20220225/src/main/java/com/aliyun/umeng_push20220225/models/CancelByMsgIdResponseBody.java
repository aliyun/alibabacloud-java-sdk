// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class CancelByMsgIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CancelByMsgIdResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CancelByMsgIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelByMsgIdResponseBody self = new CancelByMsgIdResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelByMsgIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CancelByMsgIdResponseBody setData(CancelByMsgIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CancelByMsgIdResponseBodyData getData() {
        return this.data;
    }

    public CancelByMsgIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CancelByMsgIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CancelByMsgIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelByMsgIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CancelByMsgIdResponseBodyData extends TeaModel {
        @NameInMap("MsgId")
        public String msgId;

        public static CancelByMsgIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CancelByMsgIdResponseBodyData self = new CancelByMsgIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CancelByMsgIdResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

    }

}
