// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SendByDeviceResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SendByDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendByDeviceResponseBody self = new SendByDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public SendByDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendByDeviceResponseBody setData(SendByDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendByDeviceResponseBodyData getData() {
        return this.data;
    }

    public SendByDeviceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SendByDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendByDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendByDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SendByDeviceResponseBodyData extends TeaModel {
        @NameInMap("MsgId")
        public String msgId;

        public static SendByDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendByDeviceResponseBodyData self = new SendByDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendByDeviceResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

    }

}
