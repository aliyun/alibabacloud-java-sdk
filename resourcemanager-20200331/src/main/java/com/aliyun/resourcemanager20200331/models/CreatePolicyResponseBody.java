// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreatePolicyResponseBody extends TeaModel {
    @NameInMap("Policy")
    public CreatePolicyResponseBodyPolicy policy;

    @NameInMap("RequestId")
    public String requestId;

    public static CreatePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyResponseBody self = new CreatePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePolicyResponseBody setPolicy(CreatePolicyResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public CreatePolicyResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public CreatePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePolicyResponseBodyPolicy extends TeaModel {
        @NameInMap("DefaultVersion")
        public String defaultVersion;

        @NameInMap("Description")
        public String description;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("PolicyType")
        public String policyType;

        public static CreatePolicyResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyResponseBodyPolicy self = new CreatePolicyResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public CreatePolicyResponseBodyPolicy setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public CreatePolicyResponseBodyPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreatePolicyResponseBodyPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public CreatePolicyResponseBodyPolicy setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreatePolicyResponseBodyPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
