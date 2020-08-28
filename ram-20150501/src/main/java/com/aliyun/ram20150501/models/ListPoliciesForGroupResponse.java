// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPoliciesForGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Policies")
    @Validation(required = true)
    public ListPoliciesForGroupResponsePolicies policies;

    public static ListPoliciesForGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesForGroupResponse self = new ListPoliciesForGroupResponse();
        return TeaModel.build(map, self);
    }

    public static class ListPoliciesForGroupResponsePoliciesPolicy extends TeaModel {
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

        public static ListPoliciesForGroupResponsePoliciesPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesForGroupResponsePoliciesPolicy self = new ListPoliciesForGroupResponsePoliciesPolicy();
            return TeaModel.build(map, self);
        }

    }

    public static class ListPoliciesForGroupResponsePolicies extends TeaModel {
        @NameInMap("Policy")
        @Validation(required = true)
        public java.util.List<ListPoliciesForGroupResponsePoliciesPolicy> policy;

        public static ListPoliciesForGroupResponsePolicies build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesForGroupResponsePolicies self = new ListPoliciesForGroupResponsePolicies();
            return TeaModel.build(map, self);
        }

    }

}
