// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListPolicyVersionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PolicyVersions")
    @Validation(required = true)
    public ListPolicyVersionsResponsePolicyVersions policyVersions;

    public static ListPolicyVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyVersionsResponse self = new ListPolicyVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListPolicyVersionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPolicyVersionsResponse setPolicyVersions(ListPolicyVersionsResponsePolicyVersions policyVersions) {
        this.policyVersions = policyVersions;
        return this;
    }
    public ListPolicyVersionsResponsePolicyVersions getPolicyVersions() {
        return this.policyVersions;
    }

    public static class ListPolicyVersionsResponsePolicyVersionsPolicyVersion extends TeaModel {
        @NameInMap("VersionId")
        @Validation(required = true)
        public String versionId;

        @NameInMap("IsDefaultVersion")
        @Validation(required = true)
        public Boolean isDefaultVersion;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        public static ListPolicyVersionsResponsePolicyVersionsPolicyVersion build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyVersionsResponsePolicyVersionsPolicyVersion self = new ListPolicyVersionsResponsePolicyVersionsPolicyVersion();
            return TeaModel.build(map, self);
        }

        public ListPolicyVersionsResponsePolicyVersionsPolicyVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ListPolicyVersionsResponsePolicyVersionsPolicyVersion setIsDefaultVersion(Boolean isDefaultVersion) {
            this.isDefaultVersion = isDefaultVersion;
            return this;
        }
        public Boolean getIsDefaultVersion() {
            return this.isDefaultVersion;
        }

        public ListPolicyVersionsResponsePolicyVersionsPolicyVersion setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

    public static class ListPolicyVersionsResponsePolicyVersions extends TeaModel {
        @NameInMap("PolicyVersion")
        @Validation(required = true)
        public java.util.List<ListPolicyVersionsResponsePolicyVersionsPolicyVersion> policyVersion;

        public static ListPolicyVersionsResponsePolicyVersions build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyVersionsResponsePolicyVersions self = new ListPolicyVersionsResponsePolicyVersions();
            return TeaModel.build(map, self);
        }

        public ListPolicyVersionsResponsePolicyVersions setPolicyVersion(java.util.List<ListPolicyVersionsResponsePolicyVersionsPolicyVersion> policyVersion) {
            this.policyVersion = policyVersion;
            return this;
        }
        public java.util.List<ListPolicyVersionsResponsePolicyVersionsPolicyVersion> getPolicyVersion() {
            return this.policyVersion;
        }

    }

}
