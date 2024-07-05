// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAppPoliciesForIdentityResponseBody extends TeaModel {
    /**
     * <p>The details of each policy.</p>
     * <blockquote>
     * <p>A maximum of 100 entries can be returned.</p>
     * </blockquote>
     */
    @NameInMap("AppPolicyList")
    public java.util.List<ListAppPoliciesForIdentityResponseBodyAppPolicyList> appPolicyList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C9F3E715-B3B8-4D*****27-3A70346F0E04</p>
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
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The time when the application policy was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T01:01:01Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>App full access permission</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The last time when the application policy was modified. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T01:08:01Z</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>VODAppFullAccess</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The type of the policy. Valid values:</p>
         * <ul>
         * <li><strong>System</strong></li>
         * <li><strong>Custom</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The content of the policy.</p>
         * 
         * <strong>example:</strong>
         * <hr>
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
