// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetPolicyVersionResponseBody extends TeaModel {
    @NameInMap("PolicyVersion")
    public GetPolicyVersionResponseBodyPolicyVersion policyVersion;

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
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("IsDefaultVersion")
        public Boolean isDefaultVersion;

        @NameInMap("PolicyDocument")
        public String policyDocument;

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
