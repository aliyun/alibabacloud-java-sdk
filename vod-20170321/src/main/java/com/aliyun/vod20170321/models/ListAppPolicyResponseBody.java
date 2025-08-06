// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAppPolicyResponseBody extends TeaModel {
    @NameInMap("AppPolicyList")
    public java.util.List<ListAppPolicyResponseBodyAppPolicyList> appPolicyList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static ListAppPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppPolicyResponseBody self = new ListAppPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppPolicyResponseBody setAppPolicyList(java.util.List<ListAppPolicyResponseBodyAppPolicyList> appPolicyList) {
        this.appPolicyList = appPolicyList;
        return this;
    }
    public java.util.List<ListAppPolicyResponseBodyAppPolicyList> getAppPolicyList() {
        return this.appPolicyList;
    }

    public ListAppPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppPolicyResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListAppPolicyResponseBodyAppPolicyList extends TeaModel {
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

        public static ListAppPolicyResponseBodyAppPolicyList build(java.util.Map<String, ?> map) throws Exception {
            ListAppPolicyResponseBodyAppPolicyList self = new ListAppPolicyResponseBodyAppPolicyList();
            return TeaModel.build(map, self);
        }

        public ListAppPolicyResponseBodyAppPolicyList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAppPolicyResponseBodyAppPolicyList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAppPolicyResponseBodyAppPolicyList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public ListAppPolicyResponseBodyAppPolicyList setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListAppPolicyResponseBodyAppPolicyList setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public ListAppPolicyResponseBodyAppPolicyList setPolicyValue(String policyValue) {
            this.policyValue = policyValue;
            return this;
        }
        public String getPolicyValue() {
            return this.policyValue;
        }

        public ListAppPolicyResponseBodyAppPolicyList setProducts(String products) {
            this.products = products;
            return this;
        }
        public String getProducts() {
            return this.products;
        }

    }

}
