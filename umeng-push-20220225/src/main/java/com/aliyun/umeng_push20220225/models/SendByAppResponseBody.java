// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SendByAppResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SendByAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendByAppResponseBody self = new SendByAppResponseBody();
        return TeaModel.build(map, self);
    }

    public SendByAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendByAppResponseBody setData(SendByAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendByAppResponseBodyData getData() {
        return this.data;
    }

    public SendByAppResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SendByAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendByAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendByAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SendByAppResponseBodyData extends TeaModel {
        @NameInMap("MsgId")
        public String msgId;

        public static SendByAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendByAppResponseBodyData self = new SendByAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendByAppResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

    }

}
