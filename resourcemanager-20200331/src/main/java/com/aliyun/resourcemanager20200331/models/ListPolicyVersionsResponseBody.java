// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListPolicyVersionsResponseBody extends TeaModel {
    @NameInMap("PolicyVersions")
    public ListPolicyVersionsResponseBodyPolicyVersions policyVersions;

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
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("IsDefaultVersion")
        public Boolean isDefaultVersion;

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
