// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByAliasFileIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SendByAliasFileIdResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SendByAliasFileIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendByAliasFileIdResponseBody self = new SendByAliasFileIdResponseBody();
        return TeaModel.build(map, self);
    }

    public SendByAliasFileIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendByAliasFileIdResponseBody setData(SendByAliasFileIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendByAliasFileIdResponseBodyData getData() {
        return this.data;
    }

    public SendByAliasFileIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SendByAliasFileIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendByAliasFileIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendByAliasFileIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SendByAliasFileIdResponseBodyData extends TeaModel {
        @NameInMap("MsgId")
        public String msgId;

        public static SendByAliasFileIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendByAliasFileIdResponseBodyData self = new SendByAliasFileIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendByAliasFileIdResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

    }

}
