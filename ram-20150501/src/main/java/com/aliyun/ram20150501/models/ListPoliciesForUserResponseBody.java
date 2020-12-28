// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPoliciesForUserResponseBody extends TeaModel {
    @NameInMap("Policies")
    public java.util.List<ListPoliciesForUserResponseBodyPolicies> policies;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPoliciesForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesForUserResponseBody self = new ListPoliciesForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPoliciesForUserResponseBody setPolicies(java.util.List<ListPoliciesForUserResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<ListPoliciesForUserResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public ListPoliciesForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPoliciesForUserResponseBodyPolicies extends TeaModel {
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

        public static ListPoliciesForUserResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesForUserResponseBodyPolicies self = new ListPoliciesForUserResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public ListPoliciesForUserResponseBodyPolicies setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public ListPoliciesForUserResponseBodyPolicies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPoliciesForUserResponseBodyPolicies setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListPoliciesForUserResponseBodyPolicies setAttachDate(String attachDate) {
            this.attachDate = attachDate;
            return this;
        }
        public String getAttachDate() {
            return this.attachDate;
        }

        public ListPoliciesForUserResponseBodyPolicies setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
