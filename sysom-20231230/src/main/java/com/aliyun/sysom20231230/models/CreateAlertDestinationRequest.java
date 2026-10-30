// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CreateAlertDestinationRequest extends TeaModel {
    /**
     * <p>The ID of the IM bot.</p>
     * 
     * <strong>example:</strong>
     * <p>0ab724ba952448eab4b5ed7ebe1d51ab</p>
     */
    @NameInMap("app_id")
    public String appId;

    /**
     * <p>The secret key of the IM bot.</p>
     * 
     * <strong>example:</strong>
     * <p>cmxjamd2a2MwbzAweHgqZ2U4TH55RjNOP0RUOy8tVVo</p>
     */
    @NameInMap("app_secret")
    public String appSecret;

    /**
     * <p>The ID of the group.</p>
     */
    @NameInMap("group_id")
    public java.util.List<String> groupId;

    /**
     * <p>Specifies whether the IM bot is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("imbot")
    public Boolean imbot;

    /**
     * <p>The name of the alert contact.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The configuration parameters of the alert contact.</p>
     */
    @NameInMap("params")
    public CreateAlertDestinationRequestParams params;

    /**
     * <p>The configuration source.</p>
     * 
     * <strong>example:</strong>
     * <p>console</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The push target. Currently, only DingTalk bots are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("target")
    public String target;

    public static CreateAlertDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertDestinationRequest self = new CreateAlertDestinationRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlertDestinationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAlertDestinationRequest setAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public String getAppSecret() {
        return this.appSecret;
    }

    public CreateAlertDestinationRequest setGroupId(java.util.List<String> groupId) {
        this.groupId = groupId;
        return this;
    }
    public java.util.List<String> getGroupId() {
        return this.groupId;
    }

    public CreateAlertDestinationRequest setImbot(Boolean imbot) {
        this.imbot = imbot;
        return this;
    }
    public Boolean getImbot() {
        return this.imbot;
    }

    public CreateAlertDestinationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAlertDestinationRequest setParams(CreateAlertDestinationRequestParams params) {
        this.params = params;
        return this;
    }
    public CreateAlertDestinationRequestParams getParams() {
        return this.params;
    }

    public CreateAlertDestinationRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateAlertDestinationRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public static class CreateAlertDestinationRequestParams extends TeaModel {
        /**
         * <p>The email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xxx@email.com">xxx@email.com</a></p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1xxx</p>
         */
        @NameInMap("phone")
        public String phone;

        /**
         * <p>The secret key of the bot.</p>
         * 
         * <strong>example:</strong>
         * <p>SECxxx</p>
         */
        @NameInMap("sec")
        public String sec;

        /**
         * <p>The webhook URL of the bot.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=xxx">https://oapi.dingtalk.com/robot/send?access_token=xxx</a></p>
         */
        @NameInMap("webhook")
        public String webhook;

        public static CreateAlertDestinationRequestParams build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertDestinationRequestParams self = new CreateAlertDestinationRequestParams();
            return TeaModel.build(map, self);
        }

        public CreateAlertDestinationRequestParams setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateAlertDestinationRequestParams setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public CreateAlertDestinationRequestParams setSec(String sec) {
            this.sec = sec;
            return this;
        }
        public String getSec() {
            return this.sec;
        }

        public CreateAlertDestinationRequestParams setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

}
