// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAppPoliciesForIdentityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AppPolicyList")
    public java.util.List<ListAppPoliciesForIdentityResponseBodyAppPolicyList> appPolicyList;

    public static ListAppPoliciesForIdentityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppPoliciesForIdentityResponseBody self = new ListAppPoliciesForIdentityResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppPoliciesForIdentityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppPoliciesForIdentityResponseBody setAppPolicyList(java.util.List<ListAppPoliciesForIdentityResponseBodyAppPolicyList> appPolicyList) {
        this.appPolicyList = appPolicyList;
        return this;
    }
    public java.util.List<ListAppPoliciesForIdentityResponseBodyAppPolicyList> getAppPolicyList() {
        return this.appPolicyList;
    }

    public static class ListAppPoliciesForIdentityResponseBodyAppPolicyList extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("PolicyValue")
        public String policyValue;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("PolicyType")
        public String policyType;

        public static ListAppPoliciesForIdentityResponseBodyAppPolicyList build(java.util.Map<String, ?> map) throws Exception {
            ListAppPoliciesForIdentityResponseBodyAppPolicyList self = new ListAppPoliciesForIdentityResponseBodyAppPolicyList();
            return TeaModel.build(map, self);
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

        public ListAppPoliciesForIdentityResponseBodyAppPolicyList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppPoliciesForIdentityResponseBodyAppPolicyList setPolicyValue(String policyValue) {
            this.policyValue = policyValue;
            return this;
        }
        public String getPolicyValue() {
            return this.policyValue;
        }

        public ListAppPoliciesForIdentityResponseBodyAppPolicyList setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListAppPoliciesForIdentityResponseBodyAppPolicyList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public ListAppPoliciesForIdentityResponseBodyAppPolicyList setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
