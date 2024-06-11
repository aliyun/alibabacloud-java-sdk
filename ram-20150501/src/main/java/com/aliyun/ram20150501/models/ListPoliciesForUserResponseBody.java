// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPoliciesForUserResponseBody extends TeaModel {
    /**
     * <p>The information about the policy.</p>
     */
    @NameInMap("Policies")
    public ListPoliciesForUserResponseBodyPolicies policies;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPoliciesForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesForUserResponseBody self = new ListPoliciesForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPoliciesForUserResponseBody setPolicies(ListPoliciesForUserResponseBodyPolicies policies) {
        this.policies = policies;
        return this;
    }
    public ListPoliciesForUserResponseBodyPolicies getPolicies() {
        return this.policies;
    }

    public ListPoliciesForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPoliciesForUserResponseBodyPoliciesPolicy extends TeaModel {
        /**
         * <p>The time at which the policy is attached to the RAM user. The time is displayed in UTC.</p>
         */
        @NameInMap("AttachDate")
        public String attachDate;

        /**
         * <p>The current version.</p>
         */
        @NameInMap("DefaultVersion")
        public String defaultVersion;

        /**
         * <p>The description of the policy.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the policy.</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The type of the policy. Valid values:</p>
         * <br>
         * <p>*   System: system policy</p>
         * <p>*   Custom: custom policy</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static ListPoliciesForUserResponseBodyPoliciesPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesForUserResponseBodyPoliciesPolicy self = new ListPoliciesForUserResponseBodyPoliciesPolicy();
            return TeaModel.build(map, self);
        }

        public ListPoliciesForUserResponseBodyPoliciesPolicy setAttachDate(String attachDate) {
            this.attachDate = attachDate;
            return this;
        }
        public String getAttachDate() {
            return this.attachDate;
        }

        public ListPoliciesForUserResponseBodyPoliciesPolicy setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public ListPoliciesForUserResponseBodyPoliciesPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPoliciesForUserResponseBodyPoliciesPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListPoliciesForUserResponseBodyPoliciesPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ListPoliciesForUserResponseBodyPolicies extends TeaModel {
        @NameInMap("Policy")
        public java.util.List<ListPoliciesForUserResponseBodyPoliciesPolicy> policy;

        public static ListPoliciesForUserResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesForUserResponseBodyPolicies self = new ListPoliciesForUserResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public ListPoliciesForUserResponseBodyPolicies setPolicy(java.util.List<ListPoliciesForUserResponseBodyPoliciesPolicy> policy) {
            this.policy = policy;
            return this;
        }
        public java.util.List<ListPoliciesForUserResponseBodyPoliciesPolicy> getPolicy() {
            return this.policy;
        }

    }

}
