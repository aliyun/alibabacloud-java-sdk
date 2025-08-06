// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAppPoliciesResponseBody extends TeaModel {
    @NameInMap("AppPolicyList")
    public java.util.List<GetAppPoliciesResponseBodyAppPolicyList> appPolicyList;

    @NameInMap("NonExistPolicyNames")
    public java.util.List<String> nonExistPolicyNames;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAppPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppPoliciesResponseBody self = new GetAppPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppPoliciesResponseBody setAppPolicyList(java.util.List<GetAppPoliciesResponseBodyAppPolicyList> appPolicyList) {
        this.appPolicyList = appPolicyList;
        return this;
    }
    public java.util.List<GetAppPoliciesResponseBodyAppPolicyList> getAppPolicyList() {
        return this.appPolicyList;
    }

    public GetAppPoliciesResponseBody setNonExistPolicyNames(java.util.List<String> nonExistPolicyNames) {
        this.nonExistPolicyNames = nonExistPolicyNames;
        return this;
    }
    public java.util.List<String> getNonExistPolicyNames() {
        return this.nonExistPolicyNames;
    }

    public GetAppPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAppPoliciesResponseBodyAppPolicyList extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("PolicyType")
        public String policyType;

        @NameInMap("PolicyValue")
        public String policyValue;

        @NameInMap("Products")
        public String products;

        public static GetAppPoliciesResponseBodyAppPolicyList build(java.util.Map<String, ?> map) throws Exception {
            GetAppPoliciesResponseBodyAppPolicyList self = new GetAppPoliciesResponseBodyAppPolicyList();
            return TeaModel.build(map, self);
        }

        public GetAppPoliciesResponseBodyAppPolicyList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetAppPoliciesResponseBodyAppPolicyList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAppPoliciesResponseBodyAppPolicyList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetAppPoliciesResponseBodyAppPolicyList setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public GetAppPoliciesResponseBodyAppPolicyList setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public GetAppPoliciesResponseBodyAppPolicyList setPolicyValue(String policyValue) {
            this.policyValue = policyValue;
            return this;
        }
        public String getPolicyValue() {
            return this.policyValue;
        }

        public GetAppPoliciesResponseBodyAppPolicyList setProducts(String products) {
            this.products = products;
            return this;
        }
        public String getProducts() {
            return this.products;
        }

    }

}
