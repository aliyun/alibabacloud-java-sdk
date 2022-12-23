// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAppPoliciesForIdentityResponseBody extends TeaModel {
    // The details of each policy.
    // 
    // > A maximum of 100 entries can be returned.
    @NameInMap("AppPolicyList")
    public java.util.List<ListAppPoliciesForIdentityResponseBodyAppPolicyList> appPolicyList;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ListAppPoliciesForIdentityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppPoliciesForIdentityResponseBody self = new ListAppPoliciesForIdentityResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppPoliciesForIdentityResponseBody setAppPolicyList(java.util.List<ListAppPoliciesForIdentityResponseBodyAppPolicyList> appPolicyList) {
        this.appPolicyList = appPolicyList;
        return this;
    }
    public java.util.List<ListAppPoliciesForIdentityResponseBodyAppPolicyList> getAppPolicyList() {
        return this.appPolicyList;
    }

    public ListAppPoliciesForIdentityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAppPoliciesForIdentityResponseBodyAppPolicyList extends TeaModel {
        // The ID of the application.
        @NameInMap("AppId")
        public String appId;

        // The time when the application policy was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The description of the policy.
        @NameInMap("Description")
        public String description;

        // The last time when the application policy was modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("ModificationTime")
        public String modificationTime;

        // The name of the policy.
        @NameInMap("PolicyName")
        public String policyName;

        // The type of the policy. Valid values:
        // 
        // *   **System**
        // *   **Custom**
        @NameInMap("PolicyType")
        public String policyType;

        // The content of the policy.
        @NameInMap("PolicyValue")
        public String policyValue;

        public static ListAppPoliciesForIdentityResponseBodyAppPolicyList build(java.util.Map<String, ?> map) throws Exception {
            ListAppPoliciesForIdentityResponseBodyAppPolicyList self = new ListAppPoliciesForIdentityResponseBodyAppPolicyList();
            return TeaModel.build(map, self);
        }

        public ListAppPoliciesForIdentityResponseBodyAppPolicyList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppPoliciesForIdentityResponseBodyAppPolicyList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAppPoliciesForIdentityResponseBodyAppPolicyList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAppPoliciesForIdentityResponseBodyAppPolicyList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public ListAppPoliciesForIdentityResponseBodyAppPolicyList setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListAppPoliciesForIdentityResponseBodyAppPolicyList setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public ListAppPoliciesForIdentityResponseBodyAppPolicyList setPolicyValue(String policyValue) {
            this.policyValue = policyValue;
            return this;
        }
        public String getPolicyValue() {
            return this.policyValue;
        }

    }

}
