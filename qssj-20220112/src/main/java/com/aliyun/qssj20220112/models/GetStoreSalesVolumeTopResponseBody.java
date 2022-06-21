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

    // Id of the request
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
        @NameInMap("ShopName")
        public String shopName;

        public static GetStoreSalesVolumeTopResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStoreSalesVolumeTopResponseBodyData self = new GetStoreSalesVolumeTopResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStoreSalesVolumeTopResponseBodyData setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

    }

}
