// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByAliasResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SendByAliasResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SendByAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendByAliasResponseBody self = new SendByAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public SendByAliasResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendByAliasResponseBody setData(SendByAliasResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendByAliasResponseBodyData getData() {
        return this.data;
    }

    public SendByAliasResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SendByAliasResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendByAliasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendByAliasResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SendByAliasResponseBodyData extends TeaModel {
        @NameInMap("MsgId")
        public String msgId;

        public static SendByAliasResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendByAliasResponseBodyData self = new SendByAliasResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendByAliasResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

    }

}
