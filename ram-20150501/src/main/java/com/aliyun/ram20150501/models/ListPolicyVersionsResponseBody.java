// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPolicyVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PolicyVersions")
    public java.util.List<ListPolicyVersionsResponseBodyPolicyVersions> policyVersions;

    public static ListPolicyVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyVersionsResponseBody self = new ListPolicyVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPolicyVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPolicyVersionsResponseBody setPolicyVersions(java.util.List<ListPolicyVersionsResponseBodyPolicyVersions> policyVersions) {
        this.policyVersions = policyVersions;
        return this;
    }
    public java.util.List<ListPolicyVersionsResponseBodyPolicyVersions> getPolicyVersions() {
        return this.policyVersions;
    }

    public static class ListPolicyVersionsResponseBodyPolicyVersions extends TeaModel {
        @NameInMap("IsDefaultVersion")
        public Boolean isDefaultVersion;

        @NameInMap("PolicyDocument")
        public String policyDocument;

        @NameInMap("VersionId")
        public String versionId;

        @NameInMap("CreateDate")
        public String createDate;

        public static ListPolicyVersionsResponseBodyPolicyVersions build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyVersionsResponseBodyPolicyVersions self = new ListPolicyVersionsResponseBodyPolicyVersions();
            return TeaModel.build(map, self);
        }

        public ListPolicyVersionsResponseBodyPolicyVersions setIsDefaultVersion(Boolean isDefaultVersion) {
            this.isDefaultVersion = isDefaultVersion;
            return this;
        }
        public Boolean getIsDefaultVersion() {
            return this.isDefaultVersion;
        }

        public ListPolicyVersionsResponseBodyPolicyVersions setPolicyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }
        public String getPolicyDocument() {
            return this.policyDocument;
        }

        public ListPolicyVersionsResponseBodyPolicyVersions setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ListPolicyVersionsResponseBodyPolicyVersions setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

}
