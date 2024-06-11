// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetPolicyResponseBody extends TeaModel {
    /**
     * <p>The information of the default policy version.</p>
     */
    @NameInMap("DefaultPolicyVersion")
    public GetPolicyResponseBodyDefaultPolicyVersion defaultPolicyVersion;

    /**
     * <p>The basic information of the policy.</p>
     */
    @NameInMap("Policy")
    public GetPolicyResponseBodyPolicy policy;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyResponseBody self = new GetPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolicyResponseBody setDefaultPolicyVersion(GetPolicyResponseBodyDefaultPolicyVersion defaultPolicyVersion) {
        this.defaultPolicyVersion = defaultPolicyVersion;
        return this;
    }
    public GetPolicyResponseBodyDefaultPolicyVersion getDefaultPolicyVersion() {
        return this.defaultPolicyVersion;
    }

    public GetPolicyResponseBody setPolicy(GetPolicyResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public GetPolicyResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public GetPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPolicyResponseBodyDefaultPolicyVersion extends TeaModel {
        /**
         * <p>The time when the default policy version was created.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>An attribute in the `DefaultPolicyVersion` parameter. The value of the `IsDefaultVersion` parameter is `true`.</p>
         */
        @NameInMap("IsDefaultVersion")
        public Boolean isDefaultVersion;

        /**
         * <p>The script of the default policy version.</p>
         */
        @NameInMap("PolicyDocument")
        public String policyDocument;

        /**
         * <p>The ID of the default policy version.</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static GetPolicyResponseBodyDefaultPolicyVersion build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyResponseBodyDefaultPolicyVersion self = new GetPolicyResponseBodyDefaultPolicyVersion();
            return TeaModel.build(map, self);
        }

        public GetPolicyResponseBodyDefaultPolicyVersion setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetPolicyResponseBodyDefaultPolicyVersion setIsDefaultVersion(Boolean isDefaultVersion) {
            this.isDefaultVersion = isDefaultVersion;
            return this;
        }
        public Boolean getIsDefaultVersion() {
            return this.isDefaultVersion;
        }

        public GetPolicyResponseBodyDefaultPolicyVersion setPolicyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }
        public String getPolicyDocument() {
            return this.policyDocument;
        }

        public GetPolicyResponseBodyDefaultPolicyVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

    public static class GetPolicyResponseBodyPolicy extends TeaModel {
        /**
         * <p>The number of references to the policy.</p>
         */
        @NameInMap("AttachmentCount")
        public Integer attachmentCount;

        /**
         * <p>The time when the policy was created.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The default version ID of the policy.</p>
         */
        @NameInMap("DefaultVersion")
        public String defaultVersion;

        /**
         * <p>The description of the policy.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("PolicyDocument")
        public String policyDocument;

        /**
         * <p>The name of the policy.</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The type of the policy.</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The time when the policy was modified.</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static GetPolicyResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyResponseBodyPolicy self = new GetPolicyResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public GetPolicyResponseBodyPolicy setAttachmentCount(Integer attachmentCount) {
            this.attachmentCount = attachmentCount;
            return this;
        }
        public Integer getAttachmentCount() {
            return this.attachmentCount;
        }

        public GetPolicyResponseBodyPolicy setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetPolicyResponseBodyPolicy setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public GetPolicyResponseBodyPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPolicyResponseBodyPolicy setPolicyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }
        public String getPolicyDocument() {
            return this.policyDocument;
        }

        public GetPolicyResponseBodyPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public GetPolicyResponseBodyPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public GetPolicyResponseBodyPolicy setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
