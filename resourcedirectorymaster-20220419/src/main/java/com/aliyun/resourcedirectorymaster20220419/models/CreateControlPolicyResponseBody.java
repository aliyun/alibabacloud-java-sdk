// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class CreateControlPolicyResponseBody extends TeaModel {
    @NameInMap("ControlPolicy")
    public CreateControlPolicyResponseBodyControlPolicy controlPolicy;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateControlPolicyResponseBody self = new CreateControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateControlPolicyResponseBody setControlPolicy(CreateControlPolicyResponseBodyControlPolicy controlPolicy) {
        this.controlPolicy = controlPolicy;
        return this;
    }
    public CreateControlPolicyResponseBodyControlPolicy getControlPolicy() {
        return this.controlPolicy;
    }

    public CreateControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateControlPolicyResponseBodyControlPolicy extends TeaModel {
        @NameInMap("AttachmentCount")
        public String attachmentCount;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("EffectScope")
        public String effectScope;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("PolicyType")
        public String policyType;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static CreateControlPolicyResponseBodyControlPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateControlPolicyResponseBodyControlPolicy self = new CreateControlPolicyResponseBodyControlPolicy();
            return TeaModel.build(map, self);
        }

        public CreateControlPolicyResponseBodyControlPolicy setAttachmentCount(String attachmentCount) {
            this.attachmentCount = attachmentCount;
            return this;
        }
        public String getAttachmentCount() {
            return this.attachmentCount;
        }

        public CreateControlPolicyResponseBodyControlPolicy setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateControlPolicyResponseBodyControlPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateControlPolicyResponseBodyControlPolicy setEffectScope(String effectScope) {
            this.effectScope = effectScope;
            return this;
        }
        public String getEffectScope() {
            return this.effectScope;
        }

        public CreateControlPolicyResponseBodyControlPolicy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public CreateControlPolicyResponseBodyControlPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public CreateControlPolicyResponseBodyControlPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public CreateControlPolicyResponseBodyControlPolicy setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
