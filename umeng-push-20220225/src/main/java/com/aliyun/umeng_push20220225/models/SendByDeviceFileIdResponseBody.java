// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByDeviceFileIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SendByDeviceFileIdResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SendByDeviceFileIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendByDeviceFileIdResponseBody self = new SendByDeviceFileIdResponseBody();
        return TeaModel.build(map, self);
    }

    public SendByDeviceFileIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendByDeviceFileIdResponseBody setData(SendByDeviceFileIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendByDeviceFileIdResponseBodyData getData() {
        return this.data;
    }

    public SendByDeviceFileIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SendByDeviceFileIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendByDeviceFileIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendByDeviceFileIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SendByDeviceFileIdResponseBodyData extends TeaModel {
        @NameInMap("MsgId")
        public String msgId;

        public static SendByDeviceFileIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendByDeviceFileIdResponseBodyData self = new SendByDeviceFileIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendByDeviceFileIdResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

    }

}
