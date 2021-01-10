// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryPLRProductsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Products")
    public java.util.List<QueryPLRProductsResponseBodyProducts> products;

    @NameInMap("Productsets")
    public java.util.List<QueryPLRProductsResponseBodyProductsets> productsets;

    public static QueryPLRProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPLRProductsResponseBody self = new QueryPLRProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPLRProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPLRProductsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPLRProductsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryPLRProductsResponseBody setProducts(java.util.List<QueryPLRProductsResponseBodyProducts> products) {
        this.products = products;
        return this;
    }
    public java.util.List<QueryPLRProductsResponseBodyProducts> getProducts() {
        return this.products;
    }

    public QueryPLRProductsResponseBody setProductsets(java.util.List<QueryPLRProductsResponseBodyProductsets> productsets) {
        this.productsets = productsets;
        return this;
    }
    public java.util.List<QueryPLRProductsResponseBodyProductsets> getProductsets() {
        return this.productsets;
    }

    public static class QueryPLRProductsResponseBodyProducts extends TeaModel {
        @NameInMap("CapabilityInfo")
        public String capabilityInfo;

        @NameInMap("Category")
        public String category;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("Description")
        public String description;

        @NameInMap("DocLink")
        public String docLink;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("IsHot")
        public Boolean isHot;

        @NameInMap("MeritInfo")
        public String meritInfo;

        @NameInMap("Name")
        public String name;

        @NameInMap("Payment")
        public String payment;

        @NameInMap("ServiceCode")
        public String serviceCode;

        @NameInMap("Dependents")
        public java.util.List<String> dependents;

        public static QueryPLRProductsResponseBodyProducts build(java.util.Map<String, ?> map) throws Exception {
            QueryPLRProductsResponseBodyProducts self = new QueryPLRProductsResponseBodyProducts();
            return TeaModel.build(map, self);
        }

        public QueryPLRProductsResponseBodyProducts setCapabilityInfo(String capabilityInfo) {
            this.capabilityInfo = capabilityInfo;
            return this;
        }
        public String getCapabilityInfo() {
            return this.capabilityInfo;
        }

        public QueryPLRProductsResponseBodyProducts setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public QueryPLRProductsResponseBodyProducts setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QueryPLRProductsResponseBodyProducts setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryPLRProductsResponseBodyProducts setDocLink(String docLink) {
            this.docLink = docLink;
            return this;
        }
        public String getDocLink() {
            return this.docLink;
        }

        public QueryPLRProductsResponseBodyProducts setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public QueryPLRProductsResponseBodyProducts setIsHot(Boolean isHot) {
            this.isHot = isHot;
            return this;
        }
        public Boolean getIsHot() {
            return this.isHot;
        }

        public QueryPLRProductsResponseBodyProducts setMeritInfo(String meritInfo) {
            this.meritInfo = meritInfo;
            return this;
        }
        public String getMeritInfo() {
            return this.meritInfo;
        }

        public QueryPLRProductsResponseBodyProducts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryPLRProductsResponseBodyProducts setPayment(String payment) {
            this.payment = payment;
            return this;
        }
        public String getPayment() {
            return this.payment;
        }

        public QueryPLRProductsResponseBodyProducts setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public QueryPLRProductsResponseBodyProducts setDependents(java.util.List<String> dependents) {
            this.dependents = dependents;
            return this;
        }
        public java.util.List<String> getDependents() {
            return this.dependents;
        }

    }

    public static class QueryPLRProductsResponseBodyProductsets extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("HasDiscount")
        public Boolean hasDiscount;

        @NameInMap("Name")
        public String name;

        @NameInMap("Payment")
        public String payment;

        @NameInMap("PlanCode")
        public String planCode;

        @NameInMap("ContainingProducts")
        public java.util.List<String> containingProducts;

        public static QueryPLRProductsResponseBodyProductsets build(java.util.Map<String, ?> map) throws Exception {
            QueryPLRProductsResponseBodyProductsets self = new QueryPLRProductsResponseBodyProductsets();
            return TeaModel.build(map, self);
        }

        public QueryPLRProductsResponseBodyProductsets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryPLRProductsResponseBodyProductsets setHasDiscount(Boolean hasDiscount) {
            this.hasDiscount = hasDiscount;
            return this;
        }
        public Boolean getHasDiscount() {
            return this.hasDiscount;
        }

        public QueryPLRProductsResponseBodyProductsets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryPLRProductsResponseBodyProductsets setPayment(String payment) {
            this.payment = payment;
            return this;
        }
        public String getPayment() {
            return this.payment;
        }

        public QueryPLRProductsResponseBodyProductsets setPlanCode(String planCode) {
            this.planCode = planCode;
            return this;
        }
        public String getPlanCode() {
            return this.planCode;
        }

        public QueryPLRProductsResponseBodyProductsets setContainingProducts(java.util.List<String> containingProducts) {
            this.containingProducts = containingProducts;
            return this;
        }
        public java.util.List<String> getContainingProducts() {
            return this.containingProducts;
        }

    }

}
