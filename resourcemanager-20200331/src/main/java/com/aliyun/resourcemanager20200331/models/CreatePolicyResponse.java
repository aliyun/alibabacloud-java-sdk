// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreatePolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Policy")
    @Validation(required = true)
    public CreatePolicyResponsePolicy policy;

    public static CreatePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyResponse self = new CreatePolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreatePolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePolicyResponse setPolicy(CreatePolicyResponsePolicy policy) {
        this.policy = policy;
        return this;
    }
    public CreatePolicyResponsePolicy getPolicy() {
        return this.policy;
    }

    public static class CreatePolicyResponsePolicy extends TeaModel {
        @NameInMap("PolicyType")
        @Validation(required = true)
        public String policyType;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("PolicyName")
        @Validation(required = true)
        public String policyName;

        @NameInMap("DefaultVersion")
        @Validation(required = true)
        public String defaultVersion;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        public static CreatePolicyResponsePolicy build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyResponsePolicy self = new CreatePolicyResponsePolicy();
            return TeaModel.build(map, self);
        }

        public CreatePolicyResponsePolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public CreatePolicyResponsePolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreatePolicyResponsePolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public CreatePolicyResponsePolicy setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public CreatePolicyResponsePolicy setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

}
