// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPoliciesForGroupResponseBody extends TeaModel {
    @NameInMap("Policies")
    public java.util.List<ListPoliciesForGroupResponseBodyPolicies> policies;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPoliciesForGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesForGroupResponseBody self = new ListPoliciesForGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPoliciesForGroupResponseBody setPolicies(java.util.List<ListPoliciesForGroupResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<ListPoliciesForGroupResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public ListPoliciesForGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPoliciesForGroupResponseBodyPolicies extends TeaModel {
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

        public static ListPoliciesForGroupResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesForGroupResponseBodyPolicies self = new ListPoliciesForGroupResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public ListPoliciesForGroupResponseBodyPolicies setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public ListPoliciesForGroupResponseBodyPolicies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPoliciesForGroupResponseBodyPolicies setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListPoliciesForGroupResponseBodyPolicies setAttachDate(String attachDate) {
            this.attachDate = attachDate;
            return this;
        }
        public String getAttachDate() {
            return this.attachDate;
        }

        public ListPoliciesForGroupResponseBodyPolicies setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
