// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPolicyVersionsResponseBody extends TeaModel {
    /**
     * <p>The list of the policy versions.</p>
     */
    @NameInMap("PolicyVersions")
    public ListPolicyVersionsResponseBodyPolicyVersions policyVersions;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPolicyVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyVersionsResponseBody self = new ListPolicyVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPolicyVersionsResponseBody setPolicyVersions(ListPolicyVersionsResponseBodyPolicyVersions policyVersions) {
        this.policyVersions = policyVersions;
        return this;
    }
    public ListPolicyVersionsResponseBodyPolicyVersions getPolicyVersions() {
        return this.policyVersions;
    }

    public ListPolicyVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPolicyVersionsResponseBodyPolicyVersionsPolicyVersion extends TeaModel {
        /**
         * <p>The time when the version was created.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>Indicates whether the version is the default version.</p>
         */
        @NameInMap("IsDefaultVersion")
        public Boolean isDefaultVersion;

        /**
         * <p>The script of the policy.</p>
         */
        @NameInMap("PolicyDocument")
        public String policyDocument;

        /**
         * <p>The ID of the version.</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static ListPolicyVersionsResponseBodyPolicyVersionsPolicyVersion build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyVersionsResponseBodyPolicyVersionsPolicyVersion self = new ListPolicyVersionsResponseBodyPolicyVersionsPolicyVersion();
            return TeaModel.build(map, self);
        }

        public ListPolicyVersionsResponseBodyPolicyVersionsPolicyVersion setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListPolicyVersionsResponseBodyPolicyVersionsPolicyVersion setIsDefaultVersion(Boolean isDefaultVersion) {
            this.isDefaultVersion = isDefaultVersion;
            return this;
        }
        public Boolean getIsDefaultVersion() {
            return this.isDefaultVersion;
        }

        public ListPolicyVersionsResponseBodyPolicyVersionsPolicyVersion setPolicyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }
        public String getPolicyDocument() {
            return this.policyDocument;
        }

        public ListPolicyVersionsResponseBodyPolicyVersionsPolicyVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

    public static class ListPolicyVersionsResponseBodyPolicyVersions extends TeaModel {
        @NameInMap("PolicyVersion")
        public java.util.List<ListPolicyVersionsResponseBodyPolicyVersionsPolicyVersion> policyVersion;

        public static ListPolicyVersionsResponseBodyPolicyVersions build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyVersionsResponseBodyPolicyVersions self = new ListPolicyVersionsResponseBodyPolicyVersions();
            return TeaModel.build(map, self);
        }

        public ListPolicyVersionsResponseBodyPolicyVersions setPolicyVersion(java.util.List<ListPolicyVersionsResponseBodyPolicyVersionsPolicyVersion> policyVersion) {
            this.policyVersion = policyVersion;
            return this;
        }
        public java.util.List<ListPolicyVersionsResponseBodyPolicyVersionsPolicyVersion> getPolicyVersion() {
            return this.policyVersion;
        }

    }

}
