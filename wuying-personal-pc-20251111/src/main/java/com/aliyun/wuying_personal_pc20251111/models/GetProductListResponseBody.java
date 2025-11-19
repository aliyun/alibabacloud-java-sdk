// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class GetProductListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DisplayInfo")
    public GetProductListResponseBodyDisplayInfo displayInfo;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TraceId")
    public String traceId;

    public static GetProductListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductListResponseBody self = new GetProductListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProductListResponseBody setDisplayInfo(GetProductListResponseBodyDisplayInfo displayInfo) {
        this.displayInfo = displayInfo;
        return this;
    }
    public GetProductListResponseBodyDisplayInfo getDisplayInfo() {
        return this.displayInfo;
    }

    public GetProductListResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetProductListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProductListResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetProductListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProductListResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class GetProductListResponseBodyDisplayInfoProductListSkuList extends TeaModel {
        @NameInMap("AppleSkuCode")
        public String appleSkuCode;

        @NameInMap("Attribute")
        public String attribute;

        @NameInMap("PurchaseMode")
        public String purchaseMode;

        @NameInMap("SkuCode")
        public String skuCode;

        @NameInMap("SkuDesc")
        public String skuDesc;

        @NameInMap("SkuName")
        public String skuName;

        public static GetProductListResponseBodyDisplayInfoProductListSkuList build(java.util.Map<String, ?> map) throws Exception {
            GetProductListResponseBodyDisplayInfoProductListSkuList self = new GetProductListResponseBodyDisplayInfoProductListSkuList();
            return TeaModel.build(map, self);
        }

        public GetProductListResponseBodyDisplayInfoProductListSkuList setAppleSkuCode(String appleSkuCode) {
            this.appleSkuCode = appleSkuCode;
            return this;
        }
        public String getAppleSkuCode() {
            return this.appleSkuCode;
        }

        public GetProductListResponseBodyDisplayInfoProductListSkuList setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public GetProductListResponseBodyDisplayInfoProductListSkuList setPurchaseMode(String purchaseMode) {
            this.purchaseMode = purchaseMode;
            return this;
        }
        public String getPurchaseMode() {
            return this.purchaseMode;
        }

        public GetProductListResponseBodyDisplayInfoProductListSkuList setSkuCode(String skuCode) {
            this.skuCode = skuCode;
            return this;
        }
        public String getSkuCode() {
            return this.skuCode;
        }

        public GetProductListResponseBodyDisplayInfoProductListSkuList setSkuDesc(String skuDesc) {
            this.skuDesc = skuDesc;
            return this;
        }
        public String getSkuDesc() {
            return this.skuDesc;
        }

        public GetProductListResponseBodyDisplayInfoProductListSkuList setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

    }

    public static class GetProductListResponseBodyDisplayInfoProductList extends TeaModel {
        @NameInMap("DisplayAttribute")
        public String displayAttribute;

        @NameInMap("DisplayConfig")
        public String displayConfig;

        @NameInMap("DynamicAttribute")
        public String dynamicAttribute;

        @NameInMap("IsEnable")
        public Boolean isEnable;

        @NameInMap("ModificationLevel")
        public Integer modificationLevel;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductDesc")
        public String productDesc;

        @NameInMap("ProductGroup")
        public String productGroup;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("SkuList")
        public java.util.List<GetProductListResponseBodyDisplayInfoProductListSkuList> skuList;

        public static GetProductListResponseBodyDisplayInfoProductList build(java.util.Map<String, ?> map) throws Exception {
            GetProductListResponseBodyDisplayInfoProductList self = new GetProductListResponseBodyDisplayInfoProductList();
            return TeaModel.build(map, self);
        }

        public GetProductListResponseBodyDisplayInfoProductList setDisplayAttribute(String displayAttribute) {
            this.displayAttribute = displayAttribute;
            return this;
        }
        public String getDisplayAttribute() {
            return this.displayAttribute;
        }

        public GetProductListResponseBodyDisplayInfoProductList setDisplayConfig(String displayConfig) {
            this.displayConfig = displayConfig;
            return this;
        }
        public String getDisplayConfig() {
            return this.displayConfig;
        }

        public GetProductListResponseBodyDisplayInfoProductList setDynamicAttribute(String dynamicAttribute) {
            this.dynamicAttribute = dynamicAttribute;
            return this;
        }
        public String getDynamicAttribute() {
            return this.dynamicAttribute;
        }

        public GetProductListResponseBodyDisplayInfoProductList setIsEnable(Boolean isEnable) {
            this.isEnable = isEnable;
            return this;
        }
        public Boolean getIsEnable() {
            return this.isEnable;
        }

        public GetProductListResponseBodyDisplayInfoProductList setModificationLevel(Integer modificationLevel) {
            this.modificationLevel = modificationLevel;
            return this;
        }
        public Integer getModificationLevel() {
            return this.modificationLevel;
        }

        public GetProductListResponseBodyDisplayInfoProductList setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public GetProductListResponseBodyDisplayInfoProductList setProductDesc(String productDesc) {
            this.productDesc = productDesc;
            return this;
        }
        public String getProductDesc() {
            return this.productDesc;
        }

        public GetProductListResponseBodyDisplayInfoProductList setProductGroup(String productGroup) {
            this.productGroup = productGroup;
            return this;
        }
        public String getProductGroup() {
            return this.productGroup;
        }

        public GetProductListResponseBodyDisplayInfoProductList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetProductListResponseBodyDisplayInfoProductList setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetProductListResponseBodyDisplayInfoProductList setSkuList(java.util.List<GetProductListResponseBodyDisplayInfoProductListSkuList> skuList) {
            this.skuList = skuList;
            return this;
        }
        public java.util.List<GetProductListResponseBodyDisplayInfoProductListSkuList> getSkuList() {
            return this.skuList;
        }

    }

    public static class GetProductListResponseBodyDisplayInfo extends TeaModel {
        @NameInMap("ProductList")
        public java.util.List<GetProductListResponseBodyDisplayInfoProductList> productList;

        public static GetProductListResponseBodyDisplayInfo build(java.util.Map<String, ?> map) throws Exception {
            GetProductListResponseBodyDisplayInfo self = new GetProductListResponseBodyDisplayInfo();
            return TeaModel.build(map, self);
        }

        public GetProductListResponseBodyDisplayInfo setProductList(java.util.List<GetProductListResponseBodyDisplayInfoProductList> productList) {
            this.productList = productList;
            return this;
        }
        public java.util.List<GetProductListResponseBodyDisplayInfoProductList> getProductList() {
            return this.productList;
        }

    }

}
