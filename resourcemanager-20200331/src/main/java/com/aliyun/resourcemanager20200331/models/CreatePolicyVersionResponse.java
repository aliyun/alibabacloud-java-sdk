// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreatePolicyVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PolicyVersion")
    @Validation(required = true)
    public CreatePolicyVersionResponsePolicyVersion policyVersion;

    public static CreatePolicyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyVersionResponse self = new CreatePolicyVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreatePolicyVersionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePolicyVersionResponse setPolicyVersion(CreatePolicyVersionResponsePolicyVersion policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public CreatePolicyVersionResponsePolicyVersion getPolicyVersion() {
        return this.policyVersion;
    }

    public static class CreatePolicyVersionResponsePolicyVersion extends TeaModel {
        @NameInMap("VersionId")
        @Validation(required = true)
        public String versionId;

        @NameInMap("IsDefaultVersion")
        @Validation(required = true)
        public Boolean isDefaultVersion;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        public static CreatePolicyVersionResponsePolicyVersion build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyVersionResponsePolicyVersion self = new CreatePolicyVersionResponsePolicyVersion();
            return TeaModel.build(map, self);
        }

        public CreatePolicyVersionResponsePolicyVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public CreatePolicyVersionResponsePolicyVersion setIsDefaultVersion(Boolean isDefaultVersion) {
            this.isDefaultVersion = isDefaultVersion;
            return this;
        }
        public Boolean getIsDefaultVersion() {
            return this.isDefaultVersion;
        }

        public CreatePolicyVersionResponsePolicyVersion setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

}
