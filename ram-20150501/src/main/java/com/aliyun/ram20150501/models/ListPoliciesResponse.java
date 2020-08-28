// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPoliciesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsTruncated")
    @Validation(required = true)
    public Boolean isTruncated;

    @NameInMap("Marker")
    @Validation(required = true)
    public String marker;

    @NameInMap("Policies")
    @Validation(required = true)
    public ListPoliciesResponsePolicies policies;

    public static ListPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesResponse self = new ListPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public static class ListPoliciesResponsePoliciesPolicy extends TeaModel {
        @NameInMap("PolicyName")
        @Validation(required = true)
        public String policyName;

        @NameInMap("PolicyType")
        @Validation(required = true)
        public String policyType;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("DefaultVersion")
        @Validation(required = true)
        public String defaultVersion;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        @NameInMap("AttachmentCount")
        @Validation(required = true)
        public Integer attachmentCount;

        public static ListPoliciesResponsePoliciesPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesResponsePoliciesPolicy self = new ListPoliciesResponsePoliciesPolicy();
            return TeaModel.build(map, self);
        }

    }

    public static class ListPoliciesResponsePolicies extends TeaModel {
        @NameInMap("Policy")
        @Validation(required = true)
        public java.util.List<ListPoliciesResponsePoliciesPolicy> policy;

        public static ListPoliciesResponsePolicies build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesResponsePolicies self = new ListPoliciesResponsePolicies();
            return TeaModel.build(map, self);
        }

    }

}
