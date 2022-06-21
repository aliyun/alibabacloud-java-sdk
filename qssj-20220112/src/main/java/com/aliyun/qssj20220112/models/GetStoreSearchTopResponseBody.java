// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetStoreSearchTopResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetStoreSearchTopResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public Boolean successResponse;

    public static GetStoreSearchTopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStoreSearchTopResponseBody self = new GetStoreSearchTopResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStoreSearchTopResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetStoreSearchTopResponseBody setData(java.util.List<GetStoreSearchTopResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetStoreSearchTopResponseBodyData> getData() {
        return this.data;
    }

    public GetStoreSearchTopResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStoreSearchTopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStoreSearchTopResponseBody setSuccessResponse(Boolean successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public Boolean getSuccessResponse() {
        return this.successResponse;
    }

    public static class GetStoreSearchTopResponseBodyData extends TeaModel {
        @NameInMap("ShopName")
        public String shopName;

        public static GetStoreSearchTopResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStoreSearchTopResponseBodyData self = new GetStoreSearchTopResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStoreSearchTopResponseBodyData setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

    }

}
