// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListControlPolicyAttachmentsForTargetResponseBody extends TeaModel {
    /**
     * <p>The attached access control policies.</p>
     */
    @NameInMap("ControlPolicyAttachments")
    public ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachments controlPolicyAttachments;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C276B600-7B7A-49E8-938C-E16CFA955A82</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListControlPolicyAttachmentsForTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListControlPolicyAttachmentsForTargetResponseBody self = new ListControlPolicyAttachmentsForTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public ListControlPolicyAttachmentsForTargetResponseBody setControlPolicyAttachments(ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachments controlPolicyAttachments) {
        this.controlPolicyAttachments = controlPolicyAttachments;
        return this;
    }
    public ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachments getControlPolicyAttachments() {
        return this.controlPolicyAttachments;
    }

    public ListControlPolicyAttachmentsForTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment extends TeaModel {
        /**
         * <p>The time when the access control policy was attached.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-19T02:56:24Z</p>
         */
        @NameInMap("AttachDate")
        public String attachDate;

        /**
         * <p>The description of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>ExampleControlPolicy</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The effective scope of the access control policy. Valid values:</p>
         * <ul>
         * <li>All: The access control policy is in effect for Alibaba Cloud accounts, RAM users, and RAM roles.</li>
         * <li>RAM: The access control policy is in effect only for RAM users and RAM roles.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RAM</p>
         */
        @NameInMap("EffectScope")
        public String effectScope;

        /**
         * <p>The ID of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-jExXAqIYkwHN****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The name of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>ExampleControlPolicy</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The type of the access control policy. Valid values:</p>
         * <ul>
         * <li>System: system access control policy</li>
         * <li>Custom: custom access control policy</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment build(java.util.Map<String, ?> map) throws Exception {
            ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment self = new ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment();
            return TeaModel.build(map, self);
        }

        public ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment setAttachDate(String attachDate) {
            this.attachDate = attachDate;
            return this;
        }
        public String getAttachDate() {
            return this.attachDate;
        }

        public ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment setEffectScope(String effectScope) {
            this.effectScope = effectScope;
            return this;
        }
        public String getEffectScope() {
            return this.effectScope;
        }

        public ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachments extends TeaModel {
        @NameInMap("ControlPolicyAttachment")
        public java.util.List<ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment> controlPolicyAttachment;

        public static ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachments build(java.util.Map<String, ?> map) throws Exception {
            ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachments self = new ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachments();
            return TeaModel.build(map, self);
        }

        public ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachments setControlPolicyAttachment(java.util.List<ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment> controlPolicyAttachment) {
            this.controlPolicyAttachment = controlPolicyAttachment;
            return this;
        }
        public java.util.List<ListControlPolicyAttachmentsForTargetResponseBodyControlPolicyAttachmentsControlPolicyAttachment> getControlPolicyAttachment() {
            return this.controlPolicyAttachment;
        }

    }

}
