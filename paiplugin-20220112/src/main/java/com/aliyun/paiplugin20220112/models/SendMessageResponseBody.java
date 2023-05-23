// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class SendMessageResponseBody extends TeaModel {
    /**
     * <p>返回数据。</p>
     */
    @NameInMap("Data")
    public SendMessageResponseBodyData data;

    /**
     * <p>错误码。</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <p>错误信息。</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SendMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendMessageResponseBody self = new SendMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SendMessageResponseBody setData(SendMessageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendMessageResponseBodyData getData() {
        return this.data;
    }

    public SendMessageResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public SendMessageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SendMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SendMessageResponseBodyDataMessages extends TeaModel {
        /**
         * <p>短信Id，可使用ListMessages查询短信状态。</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>手机号码。</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        public static SendMessageResponseBodyDataMessages build(java.util.Map<String, ?> map) throws Exception {
            SendMessageResponseBodyDataMessages self = new SendMessageResponseBodyDataMessages();
            return TeaModel.build(map, self);
        }

        public SendMessageResponseBodyDataMessages setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SendMessageResponseBodyDataMessages setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

    }

    public static class SendMessageResponseBodyData extends TeaModel {
        /**
         * <p>短信结果列表，列表中手机号的顺序与输入请求手机号顺序一一对应。</p>
         */
        @NameInMap("Messages")
        public java.util.List<SendMessageResponseBodyDataMessages> messages;

        /**
         * <p>短信批处理Id，可使用ListMessages查询短信状态。</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        public static SendMessageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendMessageResponseBodyData self = new SendMessageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendMessageResponseBodyData setMessages(java.util.List<SendMessageResponseBodyDataMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<SendMessageResponseBodyDataMessages> getMessages() {
            return this.messages;
        }

        public SendMessageResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
