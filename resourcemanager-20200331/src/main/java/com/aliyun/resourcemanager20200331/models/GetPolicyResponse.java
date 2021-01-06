// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Policy")
    @Validation(required = true)
    public GetPolicyResponsePolicy policy;

    public static GetPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyResponse self = new GetPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetPolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPolicyResponse setPolicy(GetPolicyResponsePolicy policy) {
        this.policy = policy;
        return this;
    }
    public GetPolicyResponsePolicy getPolicy() {
        return this.policy;
    }

    public static class GetPolicyResponsePolicy extends TeaModel {
        @NameInMap("PolicyType")
        @Validation(required = true)
        public String policyType;

        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("AttachmentCount")
        @Validation(required = true)
        public Integer attachmentCount;

        @NameInMap("PolicyName")
        @Validation(required = true)
        public String policyName;

        @NameInMap("DefaultVersion")
        @Validation(required = true)
        public String defaultVersion;

        @NameInMap("PolicyDocument")
        @Validation(required = true)
        public String policyDocument;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        public static GetPolicyResponsePolicy build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyResponsePolicy self = new GetPolicyResponsePolicy();
            return TeaModel.build(map, self);
        }

        public GetPolicyResponsePolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public GetPolicyResponsePolicy setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public GetPolicyResponsePolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPolicyResponsePolicy setAttachmentCount(Integer attachmentCount) {
            this.attachmentCount = attachmentCount;
            return this;
        }
        public Integer getAttachmentCount() {
            return this.attachmentCount;
        }

        public GetPolicyResponsePolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public GetPolicyResponsePolicy setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public GetPolicyResponsePolicy setPolicyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }
        public String getPolicyDocument() {
            return this.policyDocument;
        }

        public GetPolicyResponsePolicy setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

}
