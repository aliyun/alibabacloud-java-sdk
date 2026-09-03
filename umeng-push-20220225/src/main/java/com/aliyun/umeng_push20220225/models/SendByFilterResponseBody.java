// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByFilterResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SendByFilterResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SendByFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendByFilterResponseBody self = new SendByFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public SendByFilterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendByFilterResponseBody setData(SendByFilterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendByFilterResponseBodyData getData() {
        return this.data;
    }

    public SendByFilterResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SendByFilterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendByFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendByFilterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SendByFilterResponseBodyData extends TeaModel {
        @NameInMap("MsgId")
        public String msgId;

        public static SendByFilterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendByFilterResponseBodyData self = new SendByFilterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendByFilterResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

    }

}
