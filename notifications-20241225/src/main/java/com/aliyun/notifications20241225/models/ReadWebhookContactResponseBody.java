// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadWebhookContactResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The query result.</p>
     */
    @NameInMap("Data")
    public ReadWebhookContactResponseBodyData data;

    /**
     * <p>The business message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5F62766-1C2F-1F56-A39D-63E3D30F0633</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ReadWebhookContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadWebhookContactResponseBody self = new ReadWebhookContactResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadWebhookContactResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReadWebhookContactResponseBody setData(ReadWebhookContactResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReadWebhookContactResponseBodyData getData() {
        return this.data;
    }

    public ReadWebhookContactResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadWebhookContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReadWebhookContactResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReadWebhookContactResponseBodyData extends TeaModel {
        /**
         * <p>The security token.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("BotSecurityToken")
        public String botSecurityToken;

        /**
         * <p>webhook id</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        /**
         * <p>The name of the webhook contact.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>The security token (deprecated).</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("SecurityToken")
        @Deprecated
        public String securityToken;

        /**
         * <p>The bot server URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=xxxxxx">https://oapi.dingtalk.com/robot/send?access_token=xxxxxx</a></p>
         */
        @NameInMap("ServerUrl")
        public String serverUrl;

        /**
         * <p>The webhook type.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        @NameInMap("WebhookType")
        public String webhookType;

        public static ReadWebhookContactResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReadWebhookContactResponseBodyData self = new ReadWebhookContactResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReadWebhookContactResponseBodyData setBotSecurityToken(String botSecurityToken) {
            this.botSecurityToken = botSecurityToken;
            return this;
        }
        public String getBotSecurityToken() {
            return this.botSecurityToken;
        }

        public ReadWebhookContactResponseBodyData setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public ReadWebhookContactResponseBodyData setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        @Deprecated
        public ReadWebhookContactResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public ReadWebhookContactResponseBodyData setServerUrl(String serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }
        public String getServerUrl() {
            return this.serverUrl;
        }

        public ReadWebhookContactResponseBodyData setWebhookType(String webhookType) {
            this.webhookType = webhookType;
            return this;
        }
        public String getWebhookType() {
            return this.webhookType;
        }

    }

}
