// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class GetAccountSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SummaryMap")
    public GetAccountSummaryResponseBodySummaryMap summaryMap;

    public static GetAccountSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountSummaryResponseBody self = new GetAccountSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccountSummaryResponseBody setSummaryMap(GetAccountSummaryResponseBodySummaryMap summaryMap) {
        this.summaryMap = summaryMap;
        return this;
    }
    public GetAccountSummaryResponseBodySummaryMap getSummaryMap() {
        return this.summaryMap;
    }

    public static class GetAccountSummaryResponseBodySummaryMap extends TeaModel {
        @NameInMap("AttachedPoliciesPerGroupQuota")
        public Integer attachedPoliciesPerGroupQuota;

        @NameInMap("AttachedPoliciesPerRoleQuota")
        public Integer attachedPoliciesPerRoleQuota;

        @NameInMap("AttachedPoliciesPerUserQuota")
        public Integer attachedPoliciesPerUserQuota;

        @NameInMap("AttachedSystemPoliciesPerGroupQuota")
        public Integer attachedSystemPoliciesPerGroupQuota;

        @NameInMap("AttachedSystemPoliciesPerRoleQuota")
        public Integer attachedSystemPoliciesPerRoleQuota;

        @NameInMap("AttachedSystemPoliciesPerUserQuota")
        public Integer attachedSystemPoliciesPerUserQuota;

        @NameInMap("Policies")
        public Integer policies;

        @NameInMap("PoliciesQuota")
        public Integer policiesQuota;

        @NameInMap("PolicySizeQuota")
        public Integer policySizeQuota;

        @NameInMap("ResourceGroups")
        public Integer resourceGroups;

        @NameInMap("ResourceGroupsQuota")
        public Integer resourceGroupsQuota;

        @NameInMap("Roles")
        public Integer roles;

        @NameInMap("RolesQuota")
        public Integer rolesQuota;

        @NameInMap("VersionsPerPolicyQuota")
        public Integer versionsPerPolicyQuota;

        public static GetAccountSummaryResponseBodySummaryMap build(java.util.Map<String, ?> map) throws Exception {
            GetAccountSummaryResponseBodySummaryMap self = new GetAccountSummaryResponseBodySummaryMap();
            return TeaModel.build(map, self);
        }

        public GetAccountSummaryResponseBodySummaryMap setAttachedPoliciesPerGroupQuota(Integer attachedPoliciesPerGroupQuota) {
            this.attachedPoliciesPerGroupQuota = attachedPoliciesPerGroupQuota;
            return this;
        }
        public Integer getAttachedPoliciesPerGroupQuota() {
            return this.attachedPoliciesPerGroupQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setAttachedPoliciesPerRoleQuota(Integer attachedPoliciesPerRoleQuota) {
            this.attachedPoliciesPerRoleQuota = attachedPoliciesPerRoleQuota;
            return this;
        }
        public Integer getAttachedPoliciesPerRoleQuota() {
            return this.attachedPoliciesPerRoleQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setAttachedPoliciesPerUserQuota(Integer attachedPoliciesPerUserQuota) {
            this.attachedPoliciesPerUserQuota = attachedPoliciesPerUserQuota;
            return this;
        }
        public Integer getAttachedPoliciesPerUserQuota() {
            return this.attachedPoliciesPerUserQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setAttachedSystemPoliciesPerGroupQuota(Integer attachedSystemPoliciesPerGroupQuota) {
            this.attachedSystemPoliciesPerGroupQuota = attachedSystemPoliciesPerGroupQuota;
            return this;
        }
        public Integer getAttachedSystemPoliciesPerGroupQuota() {
            return this.attachedSystemPoliciesPerGroupQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setAttachedSystemPoliciesPerRoleQuota(Integer attachedSystemPoliciesPerRoleQuota) {
            this.attachedSystemPoliciesPerRoleQuota = attachedSystemPoliciesPerRoleQuota;
            return this;
        }
        public Integer getAttachedSystemPoliciesPerRoleQuota() {
            return this.attachedSystemPoliciesPerRoleQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setAttachedSystemPoliciesPerUserQuota(Integer attachedSystemPoliciesPerUserQuota) {
            this.attachedSystemPoliciesPerUserQuota = attachedSystemPoliciesPerUserQuota;
            return this;
        }
        public Integer getAttachedSystemPoliciesPerUserQuota() {
            return this.attachedSystemPoliciesPerUserQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setPolicies(Integer policies) {
            this.policies = policies;
            return this;
        }
        public Integer getPolicies() {
            return this.policies;
        }

        public GetAccountSummaryResponseBodySummaryMap setPoliciesQuota(Integer policiesQuota) {
            this.policiesQuota = policiesQuota;
            return this;
        }
        public Integer getPoliciesQuota() {
            return this.policiesQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setPolicySizeQuota(Integer policySizeQuota) {
            this.policySizeQuota = policySizeQuota;
            return this;
        }
        public Integer getPolicySizeQuota() {
            return this.policySizeQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setResourceGroups(Integer resourceGroups) {
            this.resourceGroups = resourceGroups;
            return this;
        }
        public Integer getResourceGroups() {
            return this.resourceGroups;
        }

        public GetAccountSummaryResponseBodySummaryMap setResourceGroupsQuota(Integer resourceGroupsQuota) {
            this.resourceGroupsQuota = resourceGroupsQuota;
            return this;
        }
        public Integer getResourceGroupsQuota() {
            return this.resourceGroupsQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setRoles(Integer roles) {
            this.roles = roles;
            return this;
        }
        public Integer getRoles() {
            return this.roles;
        }

        public GetAccountSummaryResponseBodySummaryMap setRolesQuota(Integer rolesQuota) {
            this.rolesQuota = rolesQuota;
            return this;
        }
        public Integer getRolesQuota() {
            return this.rolesQuota;
        }

        public GetAccountSummaryResponseBodySummaryMap setVersionsPerPolicyQuota(Integer versionsPerPolicyQuota) {
            this.versionsPerPolicyQuota = versionsPerPolicyQuota;
            return this;
        }
        public Integer getVersionsPerPolicyQuota() {
            return this.versionsPerPolicyQuota;
        }

    }

}
