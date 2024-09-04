// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByAliasFileIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SendByAliasFileIdResponseBodyData data;

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
        /**
         * <strong>example:</strong>
         * <p>ucj0242167047014687101</p>
         */
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
