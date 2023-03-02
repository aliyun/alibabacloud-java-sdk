// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAppPoliciesForIdentityResponseBody extends TeaModel {
    /**
     * <p>The details of each policy.</p>
     * <br>
     * <p>> A maximum of 100 entries can be returned.</p>
     */
    @NameInMap("AppPolicyList")
    public java.util.List<ListAppPoliciesForIdentityResponseBodyAppPolicyList> appPolicyList;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The time when the application policy was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the policy.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The last time when the application policy was modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The name of the policy.</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The type of the policy. Valid values:</p>
         * <br>
         * <p>*   **System**</p>
         * <p>*   **Custom**</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The content of the policy.</p>
         */
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
