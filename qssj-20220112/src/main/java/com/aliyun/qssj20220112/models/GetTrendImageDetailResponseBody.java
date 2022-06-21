// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetTrendImageDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTrendImageDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public Boolean successResponse;

    public static GetTrendImageDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrendImageDetailResponseBody self = new GetTrendImageDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrendImageDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTrendImageDetailResponseBody setData(GetTrendImageDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTrendImageDetailResponseBodyData getData() {
        return this.data;
    }

    public GetTrendImageDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTrendImageDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrendImageDetailResponseBody setSuccessResponse(Boolean successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public Boolean getSuccessResponse() {
        return this.successResponse;
    }

    public static class GetTrendImageDetailResponseBodyDataSimilarGoods extends TeaModel {
        @NameInMap("AiImgUrl")
        public String aiImgUrl;

        @NameInMap("GoodsSales")
        public Long goodsSales;

        @NameInMap("SearchVolume")
        public Long searchVolume;

        public static GetTrendImageDetailResponseBodyDataSimilarGoods build(java.util.Map<String, ?> map) throws Exception {
            GetTrendImageDetailResponseBodyDataSimilarGoods self = new GetTrendImageDetailResponseBodyDataSimilarGoods();
            return TeaModel.build(map, self);
        }

        public GetTrendImageDetailResponseBodyDataSimilarGoods setAiImgUrl(String aiImgUrl) {
            this.aiImgUrl = aiImgUrl;
            return this;
        }
        public String getAiImgUrl() {
            return this.aiImgUrl;
        }

        public GetTrendImageDetailResponseBodyDataSimilarGoods setGoodsSales(Long goodsSales) {
            this.goodsSales = goodsSales;
            return this;
        }
        public Long getGoodsSales() {
            return this.goodsSales;
        }

        public GetTrendImageDetailResponseBodyDataSimilarGoods setSearchVolume(Long searchVolume) {
            this.searchVolume = searchVolume;
            return this;
        }
        public Long getSearchVolume() {
            return this.searchVolume;
        }

    }

    public static class GetTrendImageDetailResponseBodyData extends TeaModel {
        @NameInMap("AiImgId")
        public String aiImgId;

        @NameInMap("AiImgUrl")
        public String aiImgUrl;

        @NameInMap("MultiPictUrl")
        public String multiPictUrl;

        @NameInMap("Population")
        public String population;

        @NameInMap("PriceMax")
        public Long priceMax;

        @NameInMap("PriceMin")
        public Long priceMin;

        @NameInMap("SimilarGoods")
        public java.util.List<GetTrendImageDetailResponseBodyDataSimilarGoods> similarGoods;

        @NameInMap("Tags")
        public String tags;

        public static GetTrendImageDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTrendImageDetailResponseBodyData self = new GetTrendImageDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTrendImageDetailResponseBodyData setAiImgId(String aiImgId) {
            this.aiImgId = aiImgId;
            return this;
        }
        public String getAiImgId() {
            return this.aiImgId;
        }

        public GetTrendImageDetailResponseBodyData setAiImgUrl(String aiImgUrl) {
            this.aiImgUrl = aiImgUrl;
            return this;
        }
        public String getAiImgUrl() {
            return this.aiImgUrl;
        }

        public GetTrendImageDetailResponseBodyData setMultiPictUrl(String multiPictUrl) {
            this.multiPictUrl = multiPictUrl;
            return this;
        }
        public String getMultiPictUrl() {
            return this.multiPictUrl;
        }

        public GetTrendImageDetailResponseBodyData setPopulation(String population) {
            this.population = population;
            return this;
        }
        public String getPopulation() {
            return this.population;
        }

        public GetTrendImageDetailResponseBodyData setPriceMax(Long priceMax) {
            this.priceMax = priceMax;
            return this;
        }
        public Long getPriceMax() {
            return this.priceMax;
        }

        public GetTrendImageDetailResponseBodyData setPriceMin(Long priceMin) {
            this.priceMin = priceMin;
            return this;
        }
        public Long getPriceMin() {
            return this.priceMin;
        }

        public GetTrendImageDetailResponseBodyData setSimilarGoods(java.util.List<GetTrendImageDetailResponseBodyDataSimilarGoods> similarGoods) {
            this.similarGoods = similarGoods;
            return this;
        }
        public java.util.List<GetTrendImageDetailResponseBodyDataSimilarGoods> getSimilarGoods() {
            return this.similarGoods;
        }

        public GetTrendImageDetailResponseBodyData setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

}
