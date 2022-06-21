// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetStyleTopResponseBody extends TeaModel {
    // Id of the request
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
        @NameInMap("CateName")
        public String cateName;

        @NameInMap("Color")
        public String color;

        @NameInMap("Images")
        public java.util.List<String> images;

        @NameInMap("Material")
        public String material;

        @NameInMap("ProductLink")
        public String productLink;

        @NameInMap("SalesVolume")
        public Double salesVolume;

        @NameInMap("SearchVolume")
        public Double searchVolume;

        @NameInMap("Style")
        public String style;

        @NameInMap("Title")
        public String title;

        public static GetStyleTopResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStyleTopResponseBodyData self = new GetStyleTopResponseBodyData();
            return TeaModel.build(map, self);
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

        public GetStyleTopResponseBodyData setProductLink(String productLink) {
            this.productLink = productLink;
            return this;
        }
        public String getProductLink() {
            return this.productLink;
        }

        public GetStyleTopResponseBodyData setSalesVolume(Double salesVolume) {
            this.salesVolume = salesVolume;
            return this;
        }
        public Double getSalesVolume() {
            return this.salesVolume;
        }

        public GetStyleTopResponseBodyData setSearchVolume(Double searchVolume) {
            this.searchVolume = searchVolume;
            return this;
        }
        public Double getSearchVolume() {
            return this.searchVolume;
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
