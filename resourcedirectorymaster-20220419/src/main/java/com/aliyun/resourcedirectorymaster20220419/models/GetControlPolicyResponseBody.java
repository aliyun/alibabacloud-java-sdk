// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetControlPolicyResponseBody extends TeaModel {
    @NameInMap("ControlPolicy")
    public GetControlPolicyResponseBodyControlPolicy controlPolicy;

    @NameInMap("RequestId")
    public String requestId;

    public static GetControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetControlPolicyResponseBody self = new GetControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetControlPolicyResponseBody setControlPolicy(GetControlPolicyResponseBodyControlPolicy controlPolicy) {
        this.controlPolicy = controlPolicy;
        return this;
    }
    public GetControlPolicyResponseBodyControlPolicy getControlPolicy() {
        return this.controlPolicy;
    }

    public GetControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetControlPolicyResponseBodyControlPolicy extends TeaModel {
        @NameInMap("AttachmentCount")
        public String attachmentCount;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("EffectScope")
        public String effectScope;

        @NameInMap("PolicyDocument")
        public String policyDocument;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("PolicyType")
        public String policyType;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static GetControlPolicyResponseBodyControlPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetControlPolicyResponseBodyControlPolicy self = new GetControlPolicyResponseBodyControlPolicy();
            return TeaModel.build(map, self);
        }

        public GetControlPolicyResponseBodyControlPolicy setAttachmentCount(String attachmentCount) {
            this.attachmentCount = attachmentCount;
            return this;
        }
        public String getAttachmentCount() {
            return this.attachmentCount;
        }

        public GetControlPolicyResponseBodyControlPolicy setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetControlPolicyResponseBodyControlPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetControlPolicyResponseBodyControlPolicy setEffectScope(String effectScope) {
            this.effectScope = effectScope;
            return this;
        }
        public String getEffectScope() {
            return this.effectScope;
        }

        public GetControlPolicyResponseBodyControlPolicy setPolicyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }
        public String getPolicyDocument() {
            return this.policyDocument;
        }

        public GetControlPolicyResponseBodyControlPolicy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public GetControlPolicyResponseBodyControlPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public GetControlPolicyResponseBodyControlPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public GetControlPolicyResponseBodyControlPolicy setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
