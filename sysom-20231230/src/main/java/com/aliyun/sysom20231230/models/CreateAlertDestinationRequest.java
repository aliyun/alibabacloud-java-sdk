// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CreateAlertDestinationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("params")
    public CreateAlertDestinationRequestParams params;

    /**
     * <strong>example:</strong>
     * <p>console</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("target")
    public String target;

    public static CreateAlertDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertDestinationRequest self = new CreateAlertDestinationRequest();
        return TeaModel.build(map, self);
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
         * <strong>example:</strong>
         * <p><a href="mailto:xxx@email.com">xxx@email.com</a></p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>1xxx</p>
         */
        @NameInMap("phone")
        public String phone;

        /**
         * <strong>example:</strong>
         * <p>SECxxx</p>
         */
        @NameInMap("sec")
        public String sec;

        /**
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
