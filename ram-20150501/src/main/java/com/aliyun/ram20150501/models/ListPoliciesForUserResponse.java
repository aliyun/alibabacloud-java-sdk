// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPoliciesForUserResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Policies")
    @Validation(required = true)
    public ListPoliciesForUserResponsePolicies policies;

    public static ListPoliciesForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesForUserResponse self = new ListPoliciesForUserResponse();
        return TeaModel.build(map, self);
    }

    public static class ListPoliciesForUserResponsePoliciesPolicy extends TeaModel {
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

        @NameInMap("AttachDate")
        @Validation(required = true)
        public String attachDate;

        public static ListPoliciesForUserResponsePoliciesPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesForUserResponsePoliciesPolicy self = new ListPoliciesForUserResponsePoliciesPolicy();
            return TeaModel.build(map, self);
        }

    }

    public static class ListPoliciesForUserResponsePolicies extends TeaModel {
        @NameInMap("Policy")
        @Validation(required = true)
        public java.util.List<ListPoliciesForUserResponsePoliciesPolicy> policy;

        public static ListPoliciesForUserResponsePolicies build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesForUserResponsePolicies self = new ListPoliciesForUserResponsePolicies();
            return TeaModel.build(map, self);
        }

    }

}
