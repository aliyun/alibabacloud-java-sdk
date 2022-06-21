// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetPriceRangeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetPriceRangeResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public String successResponse;

    public static GetPriceRangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPriceRangeResponseBody self = new GetPriceRangeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPriceRangeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPriceRangeResponseBody setData(java.util.List<GetPriceRangeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetPriceRangeResponseBodyData> getData() {
        return this.data;
    }

    public GetPriceRangeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPriceRangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPriceRangeResponseBody setSuccessResponse(String successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public String getSuccessResponse() {
        return this.successResponse;
    }

    public static class GetPriceRangeResponseBodyData extends TeaModel {
        @NameInMap("ClosingDate")
        public String closingDate;

        @NameInMap("GoodsSales")
        public Long goodsSales;

        @NameInMap("PriceRange")
        public String priceRange;

        @NameInMap("SalesVolume")
        public Double salesVolume;

        public static GetPriceRangeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPriceRangeResponseBodyData self = new GetPriceRangeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPriceRangeResponseBodyData setClosingDate(String closingDate) {
            this.closingDate = closingDate;
            return this;
        }
        public String getClosingDate() {
            return this.closingDate;
        }

        public GetPriceRangeResponseBodyData setGoodsSales(Long goodsSales) {
            this.goodsSales = goodsSales;
            return this;
        }
        public Long getGoodsSales() {
            return this.goodsSales;
        }

        public GetPriceRangeResponseBodyData setPriceRange(String priceRange) {
            this.priceRange = priceRange;
            return this;
        }
        public String getPriceRange() {
            return this.priceRange;
        }

        public GetPriceRangeResponseBodyData setSalesVolume(Double salesVolume) {
            this.salesVolume = salesVolume;
            return this;
        }
        public Double getSalesVolume() {
            return this.salesVolume;
        }

    }

}
