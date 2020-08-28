// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

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

    public static class ListPolicyVersionsResponsePolicyVersionsPolicyVersion extends TeaModel {
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

        public static ListPolicyVersionsResponsePolicyVersionsPolicyVersion build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyVersionsResponsePolicyVersionsPolicyVersion self = new ListPolicyVersionsResponsePolicyVersionsPolicyVersion();
            return TeaModel.build(map, self);
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

    }

}
