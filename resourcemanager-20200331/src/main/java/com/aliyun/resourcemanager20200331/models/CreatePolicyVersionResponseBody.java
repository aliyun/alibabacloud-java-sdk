// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreatePolicyVersionResponseBody extends TeaModel {
    /**
     * <p>The information about the policy version.</p>
     */
    @NameInMap("PolicyVersion")
    public CreatePolicyVersionResponseBodyPolicyVersion policyVersion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B34724D-54B0-4A51-B34D-4512372FE1BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePolicyVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyVersionResponseBody self = new CreatePolicyVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePolicyVersionResponseBody setPolicyVersion(CreatePolicyVersionResponseBodyPolicyVersion policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public CreatePolicyVersionResponseBodyPolicyVersion getPolicyVersion() {
        return this.policyVersion;
    }

    public CreatePolicyVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePolicyVersionResponseBodyPolicyVersion extends TeaModel {
        /**
         * <p>The time when the policy version was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-01-23T12:33:18</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>Indicates whether the policy version is the default version.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefaultVersion")
        public Boolean isDefaultVersion;

        /**
         * <p>The ID of the policy version.</p>
         * 
         * <strong>example:</strong>
         * <p>v3</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static CreatePolicyVersionResponseBodyPolicyVersion build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyVersionResponseBodyPolicyVersion self = new CreatePolicyVersionResponseBodyPolicyVersion();
            return TeaModel.build(map, self);
        }

        public CreatePolicyVersionResponseBodyPolicyVersion setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreatePolicyVersionResponseBodyPolicyVersion setIsDefaultVersion(Boolean isDefaultVersion) {
            this.isDefaultVersion = isDefaultVersion;
            return this;
        }
        public Boolean getIsDefaultVersion() {
            return this.isDefaultVersion;
        }

        public CreatePolicyVersionResponseBodyPolicyVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
