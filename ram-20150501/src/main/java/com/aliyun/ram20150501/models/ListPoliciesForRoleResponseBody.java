// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPoliciesForRoleResponseBody extends TeaModel {
    @NameInMap("Policies")
    public ListPoliciesForRoleResponseBodyPolicies policies;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPoliciesForRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesForRoleResponseBody self = new ListPoliciesForRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPoliciesForRoleResponseBody setPolicies(ListPoliciesForRoleResponseBodyPolicies policies) {
        this.policies = policies;
        return this;
    }
    public ListPoliciesForRoleResponseBodyPolicies getPolicies() {
        return this.policies;
    }

    public ListPoliciesForRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPoliciesForRoleResponseBodyPoliciesPolicy extends TeaModel {
        @NameInMap("DefaultVersion")
        public String defaultVersion;

        @NameInMap("Description")
        public String description;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("AttachDate")
        public String attachDate;

        @NameInMap("PolicyType")
        public String policyType;

        public static ListPoliciesForRoleResponseBodyPoliciesPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesForRoleResponseBodyPoliciesPolicy self = new ListPoliciesForRoleResponseBodyPoliciesPolicy();
            return TeaModel.build(map, self);
        }

        public ListPoliciesForRoleResponseBodyPoliciesPolicy setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public ListPoliciesForRoleResponseBodyPoliciesPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPoliciesForRoleResponseBodyPoliciesPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListPoliciesForRoleResponseBodyPoliciesPolicy setAttachDate(String attachDate) {
            this.attachDate = attachDate;
            return this;
        }
        public String getAttachDate() {
            return this.attachDate;
        }

        public ListPoliciesForRoleResponseBodyPoliciesPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ListPoliciesForRoleResponseBodyPolicies extends TeaModel {
        @NameInMap("Policy")
        public java.util.List<ListPoliciesForRoleResponseBodyPoliciesPolicy> policy;

        public static ListPoliciesForRoleResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesForRoleResponseBodyPolicies self = new ListPoliciesForRoleResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public ListPoliciesForRoleResponseBodyPolicies setPolicy(java.util.List<ListPoliciesForRoleResponseBodyPoliciesPolicy> policy) {
            this.policy = policy;
            return this;
        }
        public java.util.List<ListPoliciesForRoleResponseBodyPoliciesPolicy> getPolicy() {
            return this.policy;
        }

    }

}
