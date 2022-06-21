// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetTrendImageListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetTrendImageListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public Boolean successResponse;

    public static GetTrendImageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrendImageListResponseBody self = new GetTrendImageListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrendImageListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTrendImageListResponseBody setData(java.util.List<GetTrendImageListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetTrendImageListResponseBodyData> getData() {
        return this.data;
    }

    public GetTrendImageListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTrendImageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrendImageListResponseBody setSuccessResponse(Boolean successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public Boolean getSuccessResponse() {
        return this.successResponse;
    }

    public static class GetTrendImageListResponseBodyData extends TeaModel {
        @NameInMap("AiImgId")
        public String aiImgId;

        @NameInMap("AiImgUrl")
        public String aiImgUrl;

        @NameInMap("Population")
        public String population;

        @NameInMap("PriceMax")
        public Long priceMax;

        @NameInMap("PriceMin")
        public Long priceMin;

        public static GetTrendImageListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTrendImageListResponseBodyData self = new GetTrendImageListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTrendImageListResponseBodyData setAiImgId(String aiImgId) {
            this.aiImgId = aiImgId;
            return this;
        }
        public String getAiImgId() {
            return this.aiImgId;
        }

        public GetTrendImageListResponseBodyData setAiImgUrl(String aiImgUrl) {
            this.aiImgUrl = aiImgUrl;
            return this;
        }
        public String getAiImgUrl() {
            return this.aiImgUrl;
        }

        public GetTrendImageListResponseBodyData setPopulation(String population) {
            this.population = population;
            return this;
        }
        public String getPopulation() {
            return this.population;
        }

        public GetTrendImageListResponseBodyData setPriceMax(Long priceMax) {
            this.priceMax = priceMax;
            return this;
        }
        public Long getPriceMax() {
            return this.priceMax;
        }

        public GetTrendImageListResponseBodyData setPriceMin(Long priceMin) {
            this.priceMin = priceMin;
            return this;
        }
        public Long getPriceMin() {
            return this.priceMin;
        }

    }

}
