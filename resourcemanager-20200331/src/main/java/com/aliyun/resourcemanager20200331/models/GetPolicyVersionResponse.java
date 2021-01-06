// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetPolicyVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PolicyVersion")
    @Validation(required = true)
    public GetPolicyVersionResponsePolicyVersion policyVersion;

    public static GetPolicyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyVersionResponse self = new GetPolicyVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetPolicyVersionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPolicyVersionResponse setPolicyVersion(GetPolicyVersionResponsePolicyVersion policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public GetPolicyVersionResponsePolicyVersion getPolicyVersion() {
        return this.policyVersion;
    }

    public static class GetPolicyVersionResponsePolicyVersion extends TeaModel {
        @NameInMap("VersionId")
        @Validation(required = true)
        public String versionId;

        @NameInMap("IsDefaultVersion")
        @Validation(required = true)
        public Boolean isDefaultVersion;

        @NameInMap("PolicyDocument")
        @Validation(required = true)
        public String policyDocument;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        public static GetPolicyVersionResponsePolicyVersion build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyVersionResponsePolicyVersion self = new GetPolicyVersionResponsePolicyVersion();
            return TeaModel.build(map, self);
        }

        public GetPolicyVersionResponsePolicyVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public GetPolicyVersionResponsePolicyVersion setIsDefaultVersion(Boolean isDefaultVersion) {
            this.isDefaultVersion = isDefaultVersion;
            return this;
        }
        public Boolean getIsDefaultVersion() {
            return this.isDefaultVersion;
        }

        public GetPolicyVersionResponsePolicyVersion setPolicyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }
        public String getPolicyDocument() {
            return this.policyDocument;
        }

        public GetPolicyVersionResponsePolicyVersion setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

}
