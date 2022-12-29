// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetCrowdDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetCrowdDataResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public String successResponse;

    public static GetCrowdDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCrowdDataResponseBody self = new GetCrowdDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCrowdDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCrowdDataResponseBody setData(java.util.List<GetCrowdDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCrowdDataResponseBodyData> getData() {
        return this.data;
    }

    public GetCrowdDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCrowdDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCrowdDataResponseBody setSuccessResponse(String successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public String getSuccessResponse() {
        return this.successResponse;
    }

    public static class GetCrowdDataResponseBodyData extends TeaModel {
        @NameInMap("Age")
        public Integer age;

        @NameInMap("BuyerId")
        public Long buyerId;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("Classification")
        public String classification;

        @NameInMap("ClassificationNew")
        public String classificationNew;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("OnlineDate")
        public String onlineDate;

        @NameInMap("OrderAmount")
        public Double orderAmount;

        @NameInMap("OrderQuantity")
        public Long orderQuantity;

        @NameInMap("Province")
        public String province;

        @NameInMap("SearchVolume")
        public Long searchVolume;

        @NameInMap("TrendLevel")
        public String trendLevel;

        public static GetCrowdDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCrowdDataResponseBodyData self = new GetCrowdDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCrowdDataResponseBodyData setAge(Integer age) {
            this.age = age;
            return this;
        }
        public Integer getAge() {
            return this.age;
        }

        public GetCrowdDataResponseBodyData setBuyerId(Long buyerId) {
            this.buyerId = buyerId;
            return this;
        }
        public Long getBuyerId() {
            return this.buyerId;
        }

        public GetCrowdDataResponseBodyData setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetCrowdDataResponseBodyData setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetCrowdDataResponseBodyData setClassification(String classification) {
            this.classification = classification;
            return this;
        }
        public String getClassification() {
            return this.classification;
        }

        public GetCrowdDataResponseBodyData setClassificationNew(String classificationNew) {
            this.classificationNew = classificationNew;
            return this;
        }
        public String getClassificationNew() {
            return this.classificationNew;
        }

        public GetCrowdDataResponseBodyData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public GetCrowdDataResponseBodyData setOnlineDate(String onlineDate) {
            this.onlineDate = onlineDate;
            return this;
        }
        public String getOnlineDate() {
            return this.onlineDate;
        }

        public GetCrowdDataResponseBodyData setOrderAmount(Double orderAmount) {
            this.orderAmount = orderAmount;
            return this;
        }
        public Double getOrderAmount() {
            return this.orderAmount;
        }

        public GetCrowdDataResponseBodyData setOrderQuantity(Long orderQuantity) {
            this.orderQuantity = orderQuantity;
            return this;
        }
        public Long getOrderQuantity() {
            return this.orderQuantity;
        }

        public GetCrowdDataResponseBodyData setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public GetCrowdDataResponseBodyData setSearchVolume(Long searchVolume) {
            this.searchVolume = searchVolume;
            return this;
        }
        public Long getSearchVolume() {
            return this.searchVolume;
        }

        public GetCrowdDataResponseBodyData setTrendLevel(String trendLevel) {
            this.trendLevel = trendLevel;
            return this;
        }
        public String getTrendLevel() {
            return this.trendLevel;
        }

    }

}
