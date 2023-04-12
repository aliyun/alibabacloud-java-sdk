// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class UpdateControlPolicyResponseBody extends TeaModel {
    /**
     * <p>The details of the access control policy.</p>
     */
    @NameInMap("ControlPolicy")
    public UpdateControlPolicyResponseBodyControlPolicy controlPolicy;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The number of times that the access control policy is referenced.</p>
         */
        @NameInMap("AttachmentCount")
        public String attachmentCount;

        /**
         * <p>The time when the access control policy was created.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The description of the access control policy.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The effective scope of the access control policy. Valid values:</p>
         * <br>
         * <p>*   All: The access control policy is in effect for Alibaba Cloud accounts, RAM users, and RAM roles.</p>
         * <p>*   RAM: The access control policy is in effect only for RAM users and RAM roles.</p>
         */
        @NameInMap("EffectScope")
        public String effectScope;

        /**
         * <p>The ID of the access control policy.</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The name of the access control policy.</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The type of the access control policy. Valid values:</p>
         * <br>
         * <p>*   System: system access control policy</p>
         * <p>*   Custom: custom access control policy</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The time when the access control policy was updated.</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static UpdateControlPolicyResponseBodyControlPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateControlPolicyResponseBodyControlPolicy self = new UpdateControlPolicyResponseBodyControlPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateControlPolicyResponseBodyControlPolicy setAttachmentCount(String attachmentCount) {
            this.attachmentCount = attachmentCount;
            return this;
        }
        public String getAttachmentCount() {
            return this.attachmentCount;
        }

        public UpdateControlPolicyResponseBodyControlPolicy setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
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

        public UpdateControlPolicyResponseBodyControlPolicy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public UpdateControlPolicyResponseBodyControlPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public UpdateControlPolicyResponseBodyControlPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public UpdateControlPolicyResponseBodyControlPolicy setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
