// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadAllWebhookContactsResponseBody extends TeaModel {
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
    public java.util.List<ReadAllWebhookContactsResponseBodyData> data;

    /**
     * <p>The business message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
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

    public static ReadAllWebhookContactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadAllWebhookContactsResponseBody self = new ReadAllWebhookContactsResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadAllWebhookContactsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReadAllWebhookContactsResponseBody setData(java.util.List<ReadAllWebhookContactsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ReadAllWebhookContactsResponseBodyData> getData() {
        return this.data;
    }

    public ReadAllWebhookContactsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadAllWebhookContactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReadAllWebhookContactsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReadAllWebhookContactsResponseBodyData extends TeaModel {
        /**
         * <p>The security token.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
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
         * <p>/</p>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        /**
         * <p>The bot URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=xxxx">https://oapi.dingtalk.com/robot/send?access_token=xxxx</a></p>
         */
        @NameInMap("ServerUrl")
        public String serverUrl;

        /**
         * <p>The template code.</p>
         * 
         * <strong>example:</strong>
         * <p>lark</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <p>The webhook type.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        @NameInMap("WebhookType")
        public String webhookType;

        public static ReadAllWebhookContactsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReadAllWebhookContactsResponseBodyData self = new ReadAllWebhookContactsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReadAllWebhookContactsResponseBodyData setBotSecurityToken(String botSecurityToken) {
            this.botSecurityToken = botSecurityToken;
            return this;
        }
        public String getBotSecurityToken() {
            return this.botSecurityToken;
        }

        public ReadAllWebhookContactsResponseBodyData setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public ReadAllWebhookContactsResponseBodyData setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public ReadAllWebhookContactsResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public ReadAllWebhookContactsResponseBodyData setServerUrl(String serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }
        public String getServerUrl() {
            return this.serverUrl;
        }

        public ReadAllWebhookContactsResponseBodyData setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public ReadAllWebhookContactsResponseBodyData setWebhookType(String webhookType) {
            this.webhookType = webhookType;
            return this;
        }
        public String getWebhookType() {
            return this.webhookType;
        }

    }

}
