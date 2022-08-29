// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdatePolicyDescriptionResponseBody extends TeaModel {
    @NameInMap("Policy")
    public UpdatePolicyDescriptionResponseBodyPolicy policy;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePolicyDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyDescriptionResponseBody self = new UpdatePolicyDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyDescriptionResponseBody setPolicy(UpdatePolicyDescriptionResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public UpdatePolicyDescriptionResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public UpdatePolicyDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdatePolicyDescriptionResponseBodyPolicy extends TeaModel {
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("DefaultVersion")
        public String defaultVersion;

        @NameInMap("Description")
        public String description;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("PolicyType")
        public String policyType;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static UpdatePolicyDescriptionResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyDescriptionResponseBodyPolicy self = new UpdatePolicyDescriptionResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyDescriptionResponseBodyPolicy setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public UpdatePolicyDescriptionResponseBodyPolicy setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public UpdatePolicyDescriptionResponseBodyPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdatePolicyDescriptionResponseBodyPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public UpdatePolicyDescriptionResponseBodyPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public UpdatePolicyDescriptionResponseBodyPolicy setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
