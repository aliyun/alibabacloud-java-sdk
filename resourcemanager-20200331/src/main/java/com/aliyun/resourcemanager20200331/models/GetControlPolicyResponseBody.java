// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetControlPolicyResponseBody extends TeaModel {
    /**
     * <p>The details of the access control policy.</p>
     */
    @NameInMap("ControlPolicy")
    public GetControlPolicyResponseBodyControlPolicy controlPolicy;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AB769936-CDFA-4D52-8CE2-A3581800044A</p>
     */
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
        /**
         * <p>The number of times that the access control policy is referenced.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AttachmentCount")
        public String attachmentCount;

        /**
         * <p>The time when the access control policy was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-18T08:51:33Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

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
         * <p>The document of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Version\&quot;:\&quot;1\&quot;,\&quot;Statement\&quot;:[{\&quot;Effect\&quot;:\&quot;Deny\&quot;,\&quot;Action\&quot;:[\&quot;ram:UpdateRole\&quot;,\&quot;ram:DeleteRole\&quot;,\&quot;ram:AttachPolicyToRole\&quot;,\&quot;ram:DetachPolicyFromRole\&quot;],\&quot;Resource\&quot;:\&quot;acs:ram:<em>:</em>:role/ResourceDirectoryAccountAccessRole\&quot;}]}</p>
         */
        @NameInMap("PolicyDocument")
        public String policyDocument;

        /**
         * <p>The ID of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-SImPt8GCEwiq****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The name of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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

        /**
         * <p>The time when the access control policy was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-18T08:51:33Z</p>
         */
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
