// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAppPolicyResponseBody extends TeaModel {
    @NameInMap("AppPolicy")
    public UpdateAppPolicyResponseBodyAppPolicy appPolicy;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAppPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppPolicyResponseBody self = new UpdateAppPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppPolicyResponseBody setAppPolicy(UpdateAppPolicyResponseBodyAppPolicy appPolicy) {
        this.appPolicy = appPolicy;
        return this;
    }
    public UpdateAppPolicyResponseBodyAppPolicy getAppPolicy() {
        return this.appPolicy;
    }

    public UpdateAppPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateAppPolicyResponseBodyAppPolicy extends TeaModel {
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

        public static UpdateAppPolicyResponseBodyAppPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppPolicyResponseBodyAppPolicy self = new UpdateAppPolicyResponseBodyAppPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateAppPolicyResponseBodyAppPolicy setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public UpdateAppPolicyResponseBodyAppPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateAppPolicyResponseBodyAppPolicy setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public UpdateAppPolicyResponseBodyAppPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public UpdateAppPolicyResponseBodyAppPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public UpdateAppPolicyResponseBodyAppPolicy setPolicyValue(String policyValue) {
            this.policyValue = policyValue;
            return this;
        }
        public String getPolicyValue() {
            return this.policyValue;
        }

        public UpdateAppPolicyResponseBodyAppPolicy setProducts(String products) {
            this.products = products;
            return this;
        }
        public String getProducts() {
            return this.products;
        }

    }

}
