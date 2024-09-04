// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByDeviceFileIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SendByDeviceFileIdResponseBodyData data;

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
        /**
         * <strong>example:</strong>
         * <p>ufe29y2167046828041801</p>
         */
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
