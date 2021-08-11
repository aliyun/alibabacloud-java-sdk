// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateControlPolicyResponseBody extends TeaModel {
    @NameInMap("ControlPolicy")
    public UpdateControlPolicyResponseBodyControlPolicy controlPolicy;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateControlPolicyResponseBody self = new UpdateControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateControlPolicyResponseBody setControlPolicy(UpdateControlPolicyResponseBodyControlPolicy controlPolicy) {
        this.controlPolicy = controlPolicy;
        return this;
    }
    public UpdateControlPolicyResponseBodyControlPolicy getControlPolicy() {
        return this.controlPolicy;
    }

    public UpdateControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateControlPolicyResponseBodyControlPolicy extends TeaModel {
        @NameInMap("UpdateDate")
        public String updateDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("EffectScope")
        public String effectScope;

        @NameInMap("AttachmentCount")
        public String attachmentCount;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("PolicyType")
        public String policyType;

        public static UpdateControlPolicyResponseBodyControlPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateControlPolicyResponseBodyControlPolicy self = new UpdateControlPolicyResponseBodyControlPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateControlPolicyResponseBodyControlPolicy setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public UpdateControlPolicyResponseBodyControlPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateControlPolicyResponseBodyControlPolicy setEffectScope(String effectScope) {
            this.effectScope = effectScope;
            return this;
        }
        public String getEffectScope() {
            return this.effectScope;
        }

        public UpdateControlPolicyResponseBodyControlPolicy setAttachmentCount(String attachmentCount) {
            this.attachmentCount = attachmentCount;
            return this;
        }
        public String getAttachmentCount() {
            return this.attachmentCount;
        }

        public UpdateControlPolicyResponseBodyControlPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public UpdateControlPolicyResponseBodyControlPolicy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public UpdateControlPolicyResponseBodyControlPolicy setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public UpdateControlPolicyResponseBodyControlPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
