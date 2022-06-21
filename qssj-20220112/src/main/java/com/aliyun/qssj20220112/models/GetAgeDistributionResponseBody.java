// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetAgeDistributionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetAgeDistributionResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public String successResponse;

    public static GetAgeDistributionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgeDistributionResponseBody self = new GetAgeDistributionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgeDistributionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgeDistributionResponseBody setData(java.util.List<GetAgeDistributionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAgeDistributionResponseBodyData> getData() {
        return this.data;
    }

    public GetAgeDistributionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgeDistributionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgeDistributionResponseBody setSuccessResponse(String successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public String getSuccessResponse() {
        return this.successResponse;
    }

    public static class GetAgeDistributionResponseBodyData extends TeaModel {
        @NameInMap("AgeRange")
        public String ageRange;

        @NameInMap("SaleNumbers")
        public Long saleNumbers;

        @NameInMap("SearchNumbers")
        public Long searchNumbers;

        public static GetAgeDistributionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgeDistributionResponseBodyData self = new GetAgeDistributionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgeDistributionResponseBodyData setAgeRange(String ageRange) {
            this.ageRange = ageRange;
            return this;
        }
        public String getAgeRange() {
            return this.ageRange;
        }

        public GetAgeDistributionResponseBodyData setSaleNumbers(Long saleNumbers) {
            this.saleNumbers = saleNumbers;
            return this;
        }
        public Long getSaleNumbers() {
            return this.saleNumbers;
        }

        public GetAgeDistributionResponseBodyData setSearchNumbers(Long searchNumbers) {
            this.searchNumbers = searchNumbers;
            return this;
        }
        public Long getSearchNumbers() {
            return this.searchNumbers;
        }

    }

}
