// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateAppPolicyResponseBody extends TeaModel {
    @NameInMap("AppPolicy")
    public CreateAppPolicyResponseBodyAppPolicy appPolicy;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppPolicyResponseBody self = new CreateAppPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppPolicyResponseBody setAppPolicy(CreateAppPolicyResponseBodyAppPolicy appPolicy) {
        this.appPolicy = appPolicy;
        return this;
    }
    public CreateAppPolicyResponseBodyAppPolicy getAppPolicy() {
        return this.appPolicy;
    }

    public CreateAppPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAppPolicyResponseBodyAppPolicy extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("PolicyType")
        public String policyType;

        @NameInMap("PolicyValue")
        public String policyValue;

        @NameInMap("Products")
        public String products;

        public static CreateAppPolicyResponseBodyAppPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateAppPolicyResponseBodyAppPolicy self = new CreateAppPolicyResponseBodyAppPolicy();
            return TeaModel.build(map, self);
        }

        public CreateAppPolicyResponseBodyAppPolicy setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public CreateAppPolicyResponseBodyAppPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAppPolicyResponseBodyAppPolicy setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public CreateAppPolicyResponseBodyAppPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public CreateAppPolicyResponseBodyAppPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public CreateAppPolicyResponseBodyAppPolicy setPolicyValue(String policyValue) {
            this.policyValue = policyValue;
            return this;
        }
        public String getPolicyValue() {
            return this.policyValue;
        }

        public CreateAppPolicyResponseBodyAppPolicy setProducts(String products) {
            this.products = products;
            return this;
        }
        public String getProducts() {
            return this.products;
        }

    }

}
