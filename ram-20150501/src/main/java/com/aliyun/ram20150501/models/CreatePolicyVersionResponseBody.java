// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreatePolicyVersionResponseBody extends TeaModel {
    @NameInMap("PolicyVersion")
    public CreatePolicyVersionResponseBodyPolicyVersion policyVersion;

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
        @NameInMap("IsDefaultVersion")
        public Boolean isDefaultVersion;

        @NameInMap("PolicyDocument")
        public String policyDocument;

        @NameInMap("VersionId")
        public String versionId;

        @NameInMap("CreateDate")
        public String createDate;

        public static CreatePolicyVersionResponseBodyPolicyVersion build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyVersionResponseBodyPolicyVersion self = new CreatePolicyVersionResponseBodyPolicyVersion();
            return TeaModel.build(map, self);
        }

        public CreatePolicyVersionResponseBodyPolicyVersion setIsDefaultVersion(Boolean isDefaultVersion) {
            this.isDefaultVersion = isDefaultVersion;
            return this;
        }
        public Boolean getIsDefaultVersion() {
            return this.isDefaultVersion;
        }

        public CreatePolicyVersionResponseBodyPolicyVersion setPolicyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }
        public String getPolicyDocument() {
            return this.policyDocument;
        }

        public CreatePolicyVersionResponseBodyPolicyVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public CreatePolicyVersionResponseBodyPolicyVersion setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

}
