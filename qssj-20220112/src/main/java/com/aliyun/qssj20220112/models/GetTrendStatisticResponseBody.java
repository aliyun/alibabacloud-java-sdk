// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetTrendStatisticResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTrendStatisticResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public Boolean successResponse;

    public static GetTrendStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrendStatisticResponseBody self = new GetTrendStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrendStatisticResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTrendStatisticResponseBody setData(GetTrendStatisticResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTrendStatisticResponseBodyData getData() {
        return this.data;
    }

    public GetTrendStatisticResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTrendStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrendStatisticResponseBody setSuccessResponse(Boolean successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public Boolean getSuccessResponse() {
        return this.successResponse;
    }

    public static class GetTrendStatisticResponseBodyData extends TeaModel {
        @NameInMap("CommodityCount")
        public Long commodityCount;

        @NameInMap("Sales")
        public Double sales;

        @NameInMap("ShopCount")
        public Long shopCount;

        public static GetTrendStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTrendStatisticResponseBodyData self = new GetTrendStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTrendStatisticResponseBodyData setCommodityCount(Long commodityCount) {
            this.commodityCount = commodityCount;
            return this;
        }
        public Long getCommodityCount() {
            return this.commodityCount;
        }

        public GetTrendStatisticResponseBodyData setSales(Double sales) {
            this.sales = sales;
            return this;
        }
        public Double getSales() {
            return this.sales;
        }

        public GetTrendStatisticResponseBodyData setShopCount(Long shopCount) {
            this.shopCount = shopCount;
            return this;
        }
        public Long getShopCount() {
            return this.shopCount;
        }

    }

}
