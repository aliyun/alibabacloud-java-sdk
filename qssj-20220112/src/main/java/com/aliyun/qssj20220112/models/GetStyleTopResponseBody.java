// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetStyleTopResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetStyleTopResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public String successResponse;

    public static GetStyleTopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStyleTopResponseBody self = new GetStyleTopResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStyleTopResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetStyleTopResponseBody setData(java.util.List<GetStyleTopResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetStyleTopResponseBodyData> getData() {
        return this.data;
    }

    public GetStyleTopResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStyleTopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStyleTopResponseBody setSuccessResponse(String successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public String getSuccessResponse() {
        return this.successResponse;
    }

    public static class GetStyleTopResponseBodyData extends TeaModel {
        @NameInMap("AttributeContent")
        public String attributeContent;

        @NameInMap("BrandName")
        public String brandName;

        @NameInMap("BuyerTags")
        public String buyerTags;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("Color")
        public String color;

        @NameInMap("ExposureValue")
        public Long exposureValue;

        @NameInMap("Images")
        public java.util.List<String> images;

        @NameInMap("Material")
        public String material;

        @NameInMap("Price")
        public Double price;

        @NameInMap("ProductLink")
        public String productLink;

        @NameInMap("Sales")
        public Double sales;

        @NameInMap("SalesVolume")
        public Long salesVolume;

        @NameInMap("SearchVolume")
        public Double searchVolume;

        @NameInMap("ShopId")
        public Long shopId;

        @NameInMap("ShopName")
        public String shopName;

        @NameInMap("Style")
        public String style;

        @NameInMap("Title")
        public String title;

        public static GetStyleTopResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStyleTopResponseBodyData self = new GetStyleTopResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStyleTopResponseBodyData setAttributeContent(String attributeContent) {
            this.attributeContent = attributeContent;
            return this;
        }
        public String getAttributeContent() {
            return this.attributeContent;
        }

        public GetStyleTopResponseBodyData setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }
        public String getBrandName() {
            return this.brandName;
        }

        public GetStyleTopResponseBodyData setBuyerTags(String buyerTags) {
            this.buyerTags = buyerTags;
            return this;
        }
        public String getBuyerTags() {
            return this.buyerTags;
        }

        public GetStyleTopResponseBodyData setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetStyleTopResponseBodyData setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public GetStyleTopResponseBodyData setExposureValue(Long exposureValue) {
            this.exposureValue = exposureValue;
            return this;
        }
        public Long getExposureValue() {
            return this.exposureValue;
        }

        public GetStyleTopResponseBodyData setImages(java.util.List<String> images) {
            this.images = images;
            return this;
        }
        public java.util.List<String> getImages() {
            return this.images;
        }

        public GetStyleTopResponseBodyData setMaterial(String material) {
            this.material = material;
            return this;
        }
        public String getMaterial() {
            return this.material;
        }

        public GetStyleTopResponseBodyData setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

        public GetStyleTopResponseBodyData setProductLink(String productLink) {
            this.productLink = productLink;
            return this;
        }
        public String getProductLink() {
            return this.productLink;
        }

        public GetStyleTopResponseBodyData setSales(Double sales) {
            this.sales = sales;
            return this;
        }
        public Double getSales() {
            return this.sales;
        }

        public GetStyleTopResponseBodyData setSalesVolume(Long salesVolume) {
            this.salesVolume = salesVolume;
            return this;
        }
        public Long getSalesVolume() {
            return this.salesVolume;
        }

        public GetStyleTopResponseBodyData setSearchVolume(Double searchVolume) {
            this.searchVolume = searchVolume;
            return this;
        }
        public Double getSearchVolume() {
            return this.searchVolume;
        }

        public GetStyleTopResponseBodyData setShopId(Long shopId) {
            this.shopId = shopId;
            return this;
        }
        public Long getShopId() {
            return this.shopId;
        }

        public GetStyleTopResponseBodyData setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

        public GetStyleTopResponseBodyData setStyle(String style) {
            this.style = style;
            return this;
        }
        public String getStyle() {
            return this.style;
        }

        public GetStyleTopResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
