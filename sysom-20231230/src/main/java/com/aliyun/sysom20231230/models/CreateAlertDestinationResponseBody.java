// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CreateAlertDestinationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateAlertDestinationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPIException: SysomOpenAPI.InvalidParameter Invalid params, should be json string or dict</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateAlertDestinationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertDestinationResponseBody self = new CreateAlertDestinationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAlertDestinationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAlertDestinationResponseBody setData(CreateAlertDestinationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAlertDestinationResponseBodyData getData() {
        return this.data;
    }

    public CreateAlertDestinationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAlertDestinationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAlertDestinationResponseBodyDataParams extends TeaModel {
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

        public static CreateAlertDestinationResponseBodyDataParams build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertDestinationResponseBodyDataParams self = new CreateAlertDestinationResponseBodyDataParams();
            return TeaModel.build(map, self);
        }

        public CreateAlertDestinationResponseBodyDataParams setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateAlertDestinationResponseBodyDataParams setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public CreateAlertDestinationResponseBodyDataParams setSec(String sec) {
            this.sec = sec;
            return this;
        }
        public String getSec() {
            return this.sec;
        }

        public CreateAlertDestinationResponseBodyDataParams setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

    public static class CreateAlertDestinationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1753669116286</p>
         */
        @NameInMap("createdAt")
        public Long createdAt;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Integer id;

        /**
         * <strong>example:</strong>
         * <p>SysOM</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("params")
        public CreateAlertDestinationResponseBodyDataParams params;

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

        /**
         * <strong>example:</strong>
         * <p>1222933234714935</p>
         */
        @NameInMap("uid")
        public String uid;

        /**
         * <strong>example:</strong>
         * <p>1751254826285</p>
         */
        @NameInMap("updatedAt")
        public Long updatedAt;

        public static CreateAlertDestinationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertDestinationResponseBodyData self = new CreateAlertDestinationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAlertDestinationResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public CreateAlertDestinationResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public CreateAlertDestinationResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAlertDestinationResponseBodyData setParams(CreateAlertDestinationResponseBodyDataParams params) {
            this.params = params;
            return this;
        }
        public CreateAlertDestinationResponseBodyDataParams getParams() {
            return this.params;
        }

        public CreateAlertDestinationResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateAlertDestinationResponseBodyData setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public CreateAlertDestinationResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public CreateAlertDestinationResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
