// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetPolicyVersionResponseBody extends TeaModel {
    /**
     * <p>The information about the policy version.</p>
     */
    @NameInMap("PolicyVersion")
    public GetPolicyVersionResponseBodyPolicyVersion policyVersion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B34724D-54B0-4A51-B34D-4512372FE1BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPolicyVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyVersionResponseBody self = new GetPolicyVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolicyVersionResponseBody setPolicyVersion(GetPolicyVersionResponseBodyPolicyVersion policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public GetPolicyVersionResponseBodyPolicyVersion getPolicyVersion() {
        return this.policyVersion;
    }

    public GetPolicyVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPolicyVersionResponseBodyPolicyVersion extends TeaModel {
        /**
         * <p>The time when the policy version was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-01-23T12:33:18Z</p>
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
         * <p>The document of the permission policy.</p>
         * 
         * <strong>example:</strong>
         * <p>{ \&quot;Statement\&quot;: [{ \&quot;Action\&quot;: [\&quot;oss:<em>\&quot;], \&quot;Effect\&quot;: \&quot;Allow\&quot;, \&quot;Resource\&quot;: [\&quot;acs:oss:</em>:<em>:</em>\&quot;]}], \&quot;Version\&quot;: \&quot;1\&quot;}</p>
         */
        @NameInMap("PolicyDocument")
        public String policyDocument;

        /**
         * <p>The ID of the policy version.</p>
         * 
         * <strong>example:</strong>
         * <p>v3</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static GetPolicyVersionResponseBodyPolicyVersion build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyVersionResponseBodyPolicyVersion self = new GetPolicyVersionResponseBodyPolicyVersion();
            return TeaModel.build(map, self);
        }

        public GetPolicyVersionResponseBodyPolicyVersion setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetPolicyVersionResponseBodyPolicyVersion setIsDefaultVersion(Boolean isDefaultVersion) {
            this.isDefaultVersion = isDefaultVersion;
            return this;
        }
        public Boolean getIsDefaultVersion() {
            return this.isDefaultVersion;
        }

        public GetPolicyVersionResponseBodyPolicyVersion setPolicyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }
        public String getPolicyDocument() {
            return this.policyDocument;
        }

        public GetPolicyVersionResponseBodyPolicyVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
