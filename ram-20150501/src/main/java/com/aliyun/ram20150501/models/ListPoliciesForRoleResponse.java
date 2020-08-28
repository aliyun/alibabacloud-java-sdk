// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPoliciesForRoleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Policies")
    @Validation(required = true)
    public ListPoliciesForRoleResponsePolicies policies;

    public static ListPoliciesForRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesForRoleResponse self = new ListPoliciesForRoleResponse();
        return TeaModel.build(map, self);
    }

    public static class ListPoliciesForRoleResponsePoliciesPolicy extends TeaModel {
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

        public static ListPoliciesForRoleResponsePoliciesPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesForRoleResponsePoliciesPolicy self = new ListPoliciesForRoleResponsePoliciesPolicy();
            return TeaModel.build(map, self);
        }

    }

    public static class ListPoliciesForRoleResponsePolicies extends TeaModel {
        @NameInMap("Policy")
        @Validation(required = true)
        public java.util.List<ListPoliciesForRoleResponsePoliciesPolicy> policy;

        public static ListPoliciesForRoleResponsePolicies build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesForRoleResponsePolicies self = new ListPoliciesForRoleResponsePolicies();
            return TeaModel.build(map, self);
        }

    }

}
