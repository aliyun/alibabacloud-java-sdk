// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetSexRatioResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSexRatioResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public String successResponse;

    public static GetSexRatioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSexRatioResponseBody self = new GetSexRatioResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSexRatioResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSexRatioResponseBody setData(GetSexRatioResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSexRatioResponseBodyData getData() {
        return this.data;
    }

    public GetSexRatioResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSexRatioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSexRatioResponseBody setSuccessResponse(String successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public String getSuccessResponse() {
        return this.successResponse;
    }

    public static class GetSexRatioResponseBodyDataSaleNumbers extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public Long value;

        public static GetSexRatioResponseBodyDataSaleNumbers build(java.util.Map<String, ?> map) throws Exception {
            GetSexRatioResponseBodyDataSaleNumbers self = new GetSexRatioResponseBodyDataSaleNumbers();
            return TeaModel.build(map, self);
        }

        public GetSexRatioResponseBodyDataSaleNumbers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSexRatioResponseBodyDataSaleNumbers setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class GetSexRatioResponseBodyDataSearchNumbers extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public Long value;

        public static GetSexRatioResponseBodyDataSearchNumbers build(java.util.Map<String, ?> map) throws Exception {
            GetSexRatioResponseBodyDataSearchNumbers self = new GetSexRatioResponseBodyDataSearchNumbers();
            return TeaModel.build(map, self);
        }

        public GetSexRatioResponseBodyDataSearchNumbers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSexRatioResponseBodyDataSearchNumbers setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class GetSexRatioResponseBodyData extends TeaModel {
        @NameInMap("SaleNumbers")
        public java.util.List<GetSexRatioResponseBodyDataSaleNumbers> saleNumbers;

        @NameInMap("SearchNumbers")
        public java.util.List<GetSexRatioResponseBodyDataSearchNumbers> searchNumbers;

        public static GetSexRatioResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSexRatioResponseBodyData self = new GetSexRatioResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSexRatioResponseBodyData setSaleNumbers(java.util.List<GetSexRatioResponseBodyDataSaleNumbers> saleNumbers) {
            this.saleNumbers = saleNumbers;
            return this;
        }
        public java.util.List<GetSexRatioResponseBodyDataSaleNumbers> getSaleNumbers() {
            return this.saleNumbers;
        }

        public GetSexRatioResponseBodyData setSearchNumbers(java.util.List<GetSexRatioResponseBodyDataSearchNumbers> searchNumbers) {
            this.searchNumbers = searchNumbers;
            return this;
        }
        public java.util.List<GetSexRatioResponseBodyDataSearchNumbers> getSearchNumbers() {
            return this.searchNumbers;
        }

    }

}
