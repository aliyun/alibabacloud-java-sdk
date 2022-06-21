// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetCrowdReginResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCrowdReginResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public Boolean successResponse;

    public static GetCrowdReginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCrowdReginResponseBody self = new GetCrowdReginResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCrowdReginResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCrowdReginResponseBody setData(GetCrowdReginResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCrowdReginResponseBodyData getData() {
        return this.data;
    }

    public GetCrowdReginResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCrowdReginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCrowdReginResponseBody setSuccessResponse(Boolean successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public Boolean getSuccessResponse() {
        return this.successResponse;
    }

    public static class GetCrowdReginResponseBodyDataSaleNumbers extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public Long value;

        public static GetCrowdReginResponseBodyDataSaleNumbers build(java.util.Map<String, ?> map) throws Exception {
            GetCrowdReginResponseBodyDataSaleNumbers self = new GetCrowdReginResponseBodyDataSaleNumbers();
            return TeaModel.build(map, self);
        }

        public GetCrowdReginResponseBodyDataSaleNumbers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCrowdReginResponseBodyDataSaleNumbers setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class GetCrowdReginResponseBodyDataSearchNumbers extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public Long value;

        public static GetCrowdReginResponseBodyDataSearchNumbers build(java.util.Map<String, ?> map) throws Exception {
            GetCrowdReginResponseBodyDataSearchNumbers self = new GetCrowdReginResponseBodyDataSearchNumbers();
            return TeaModel.build(map, self);
        }

        public GetCrowdReginResponseBodyDataSearchNumbers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCrowdReginResponseBodyDataSearchNumbers setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class GetCrowdReginResponseBodyData extends TeaModel {
        @NameInMap("SaleNumbers")
        public java.util.List<GetCrowdReginResponseBodyDataSaleNumbers> saleNumbers;

        @NameInMap("SearchNumbers")
        public java.util.List<GetCrowdReginResponseBodyDataSearchNumbers> searchNumbers;

        public static GetCrowdReginResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCrowdReginResponseBodyData self = new GetCrowdReginResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCrowdReginResponseBodyData setSaleNumbers(java.util.List<GetCrowdReginResponseBodyDataSaleNumbers> saleNumbers) {
            this.saleNumbers = saleNumbers;
            return this;
        }
        public java.util.List<GetCrowdReginResponseBodyDataSaleNumbers> getSaleNumbers() {
            return this.saleNumbers;
        }

        public GetCrowdReginResponseBodyData setSearchNumbers(java.util.List<GetCrowdReginResponseBodyDataSearchNumbers> searchNumbers) {
            this.searchNumbers = searchNumbers;
            return this;
        }
        public java.util.List<GetCrowdReginResponseBodyDataSearchNumbers> getSearchNumbers() {
            return this.searchNumbers;
        }

    }

}
