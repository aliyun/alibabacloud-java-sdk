// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateAlertDestinationRequest extends TeaModel {
    /**
     * <p>ID of the alert contact</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>Name of the alert contact</p>
     * 
     * <strong>example:</strong>
     * <p>name1</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Configuration Parameter</p>
     */
    @NameInMap("params")
    public UpdateAlertDestinationRequestParams params;

    /**
     * <p>Source of the configuration</p>
     * 
     * <strong>example:</strong>
     * <p>console</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>Push Target for alerts. Currently, only DingTalk contacts are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("target")
    public String target;

    public static UpdateAlertDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertDestinationRequest self = new UpdateAlertDestinationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlertDestinationRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateAlertDestinationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAlertDestinationRequest setParams(UpdateAlertDestinationRequestParams params) {
        this.params = params;
        return this;
    }
    public UpdateAlertDestinationRequestParams getParams() {
        return this.params;
    }

    public UpdateAlertDestinationRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UpdateAlertDestinationRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public static class UpdateAlertDestinationRequestParams extends TeaModel {
        /**
         * <p>mailbox</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xxx@email.com">xxx@email.com</a></p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <p>Phone number</p>
         * 
         * <strong>example:</strong>
         * <p>1xxx</p>
         */
        @NameInMap("phone")
        public String phone;

        /**
         * <p>Robot key</p>
         * 
         * <strong>example:</strong>
         * <p>SECxxx</p>
         */
        @NameInMap("sec")
        public String sec;

        /**
         * <p>Robot webhook address</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=xxx">https://oapi.dingtalk.com/robot/send?access_token=xxx</a></p>
         */
        @NameInMap("webhook")
        public String webhook;

        public static UpdateAlertDestinationRequestParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertDestinationRequestParams self = new UpdateAlertDestinationRequestParams();
            return TeaModel.build(map, self);
        }

        public UpdateAlertDestinationRequestParams setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UpdateAlertDestinationRequestParams setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public UpdateAlertDestinationRequestParams setSec(String sec) {
            this.sec = sec;
            return this;
        }
        public String getSec() {
            return this.sec;
        }

        public UpdateAlertDestinationRequestParams setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

}
