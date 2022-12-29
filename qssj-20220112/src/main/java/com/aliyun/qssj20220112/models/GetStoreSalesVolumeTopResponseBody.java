// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetStoreSalesVolumeTopResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetStoreSalesVolumeTopResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public Boolean successResponse;

    public static GetStoreSalesVolumeTopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStoreSalesVolumeTopResponseBody self = new GetStoreSalesVolumeTopResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStoreSalesVolumeTopResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetStoreSalesVolumeTopResponseBody setData(java.util.List<GetStoreSalesVolumeTopResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetStoreSalesVolumeTopResponseBodyData> getData() {
        return this.data;
    }

    public GetStoreSalesVolumeTopResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStoreSalesVolumeTopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStoreSalesVolumeTopResponseBody setSuccessResponse(Boolean successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public Boolean getSuccessResponse() {
        return this.successResponse;
    }

    public static class GetStoreSalesVolumeTopResponseBodyData extends TeaModel {
        @NameInMap("CommodityQuantity")
        public Long commodityQuantity;

        @NameInMap("SalesVolume")
        public Long salesVolume;

        @NameInMap("SearchVolume")
        public Long searchVolume;

        @NameInMap("ShopId")
        public Long shopId;

        @NameInMap("ShopName")
        public String shopName;

        @NameInMap("TotalSales")
        public Double totalSales;

        public static GetStoreSalesVolumeTopResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStoreSalesVolumeTopResponseBodyData self = new GetStoreSalesVolumeTopResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStoreSalesVolumeTopResponseBodyData setCommodityQuantity(Long commodityQuantity) {
            this.commodityQuantity = commodityQuantity;
            return this;
        }
        public Long getCommodityQuantity() {
            return this.commodityQuantity;
        }

        public GetStoreSalesVolumeTopResponseBodyData setSalesVolume(Long salesVolume) {
            this.salesVolume = salesVolume;
            return this;
        }
        public Long getSalesVolume() {
            return this.salesVolume;
        }

        public GetStoreSalesVolumeTopResponseBodyData setSearchVolume(Long searchVolume) {
            this.searchVolume = searchVolume;
            return this;
        }
        public Long getSearchVolume() {
            return this.searchVolume;
        }

        public GetStoreSalesVolumeTopResponseBodyData setShopId(Long shopId) {
            this.shopId = shopId;
            return this;
        }
        public Long getShopId() {
            return this.shopId;
        }

        public GetStoreSalesVolumeTopResponseBodyData setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

        public GetStoreSalesVolumeTopResponseBodyData setTotalSales(Double totalSales) {
            this.totalSales = totalSales;
            return this;
        }
        public Double getTotalSales() {
            return this.totalSales;
        }

    }

}
