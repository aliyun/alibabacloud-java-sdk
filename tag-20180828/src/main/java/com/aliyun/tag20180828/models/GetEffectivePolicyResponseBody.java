// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class GetEffectivePolicyResponseBody extends TeaModel {
    /**
     * <p>The effective tag policy.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;tags\&quot;:{\&quot;costcenter\&quot;:{\&quot;tag_value\&quot;:[\&quot;Beijing\&quot;,\&quot;Shanghai\&quot;],\&quot;tag_key\&quot;:\&quot;CostCenter\&quot;}}}</p>
     */
    @NameInMap("EffectivePolicy")
    public String effectivePolicy;

    @NameInMap("PolicyAttachments")
    public java.util.List<GetEffectivePolicyResponseBodyPolicyAttachments> policyAttachments;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BB532282-94F5-5F56-877F-32D5E2A04F3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetEffectivePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEffectivePolicyResponseBody self = new GetEffectivePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEffectivePolicyResponseBody setEffectivePolicy(String effectivePolicy) {
        this.effectivePolicy = effectivePolicy;
        return this;
    }
    public String getEffectivePolicy() {
        return this.effectivePolicy;
    }

    public GetEffectivePolicyResponseBody setPolicyAttachments(java.util.List<GetEffectivePolicyResponseBodyPolicyAttachments> policyAttachments) {
        this.policyAttachments = policyAttachments;
        return this;
    }
    public java.util.List<GetEffectivePolicyResponseBodyPolicyAttachments> getPolicyAttachments() {
        return this.policyAttachments;
    }

    public GetEffectivePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEffectivePolicyResponseBodyPolicyAttachmentsPolicyList extends TeaModel {
        @NameInMap("AttachSeq")
        public Integer attachSeq;

        @NameInMap("AttachTime")
        public String attachTime;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("TargetId")
        public String targetId;

        @NameInMap("TargetType")
        public String targetType;

        public static GetEffectivePolicyResponseBodyPolicyAttachmentsPolicyList build(java.util.Map<String, ?> map) throws Exception {
            GetEffectivePolicyResponseBodyPolicyAttachmentsPolicyList self = new GetEffectivePolicyResponseBodyPolicyAttachmentsPolicyList();
            return TeaModel.build(map, self);
        }

        public GetEffectivePolicyResponseBodyPolicyAttachmentsPolicyList setAttachSeq(Integer attachSeq) {
            this.attachSeq = attachSeq;
            return this;
        }
        public Integer getAttachSeq() {
            return this.attachSeq;
        }

        public GetEffectivePolicyResponseBodyPolicyAttachmentsPolicyList setAttachTime(String attachTime) {
            this.attachTime = attachTime;
            return this;
        }
        public String getAttachTime() {
            return this.attachTime;
        }

        public GetEffectivePolicyResponseBodyPolicyAttachmentsPolicyList setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public GetEffectivePolicyResponseBodyPolicyAttachmentsPolicyList setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public GetEffectivePolicyResponseBodyPolicyAttachmentsPolicyList setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public GetEffectivePolicyResponseBodyPolicyAttachmentsPolicyList setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class GetEffectivePolicyResponseBodyPolicyAttachments extends TeaModel {
        @NameInMap("PolicyList")
        public java.util.List<GetEffectivePolicyResponseBodyPolicyAttachmentsPolicyList> policyList;

        @NameInMap("PolicyType")
        public String policyType;

        @NameInMap("TagKey")
        public String tagKey;

        public static GetEffectivePolicyResponseBodyPolicyAttachments build(java.util.Map<String, ?> map) throws Exception {
            GetEffectivePolicyResponseBodyPolicyAttachments self = new GetEffectivePolicyResponseBodyPolicyAttachments();
            return TeaModel.build(map, self);
        }

        public GetEffectivePolicyResponseBodyPolicyAttachments setPolicyList(java.util.List<GetEffectivePolicyResponseBodyPolicyAttachmentsPolicyList> policyList) {
            this.policyList = policyList;
            return this;
        }
        public java.util.List<GetEffectivePolicyResponseBodyPolicyAttachmentsPolicyList> getPolicyList() {
            return this.policyList;
        }

        public GetEffectivePolicyResponseBodyPolicyAttachments setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public GetEffectivePolicyResponseBodyPolicyAttachments setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

}
