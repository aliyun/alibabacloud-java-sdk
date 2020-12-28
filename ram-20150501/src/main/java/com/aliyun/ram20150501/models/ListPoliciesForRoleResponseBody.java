// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPoliciesForRoleResponseBody extends TeaModel {
    @NameInMap("Policies")
    public java.util.List<ListPoliciesForRoleResponseBodyPolicies> policies;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPoliciesForRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesForRoleResponseBody self = new ListPoliciesForRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPoliciesForRoleResponseBody setPolicies(java.util.List<ListPoliciesForRoleResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<ListPoliciesForRoleResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public ListPoliciesForRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPoliciesForRoleResponseBodyPolicies extends TeaModel {
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

        public static ListPoliciesForRoleResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesForRoleResponseBodyPolicies self = new ListPoliciesForRoleResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public ListPoliciesForRoleResponseBodyPolicies setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public ListPoliciesForRoleResponseBodyPolicies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPoliciesForRoleResponseBodyPolicies setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListPoliciesForRoleResponseBodyPolicies setAttachDate(String attachDate) {
            this.attachDate = attachDate;
            return this;
        }
        public String getAttachDate() {
            return this.attachDate;
        }

        public ListPoliciesForRoleResponseBodyPolicies setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
