// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetCrowdLabelResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetCrowdLabelResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public String successResponse;

    public static GetCrowdLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCrowdLabelResponseBody self = new GetCrowdLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCrowdLabelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCrowdLabelResponseBody setData(java.util.List<GetCrowdLabelResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCrowdLabelResponseBodyData> getData() {
        return this.data;
    }

    public GetCrowdLabelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCrowdLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCrowdLabelResponseBody setSuccessResponse(String successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public String getSuccessResponse() {
        return this.successResponse;
    }

    public static class GetCrowdLabelResponseBodyData extends TeaModel {
        @NameInMap("ClosingDate")
        public String closingDate;

        @NameInMap("LabelName")
        public String labelName;

        @NameInMap("OrderAmount")
        public Double orderAmount;

        @NameInMap("PurchaseAmount")
        public Double purchaseAmount;

        @NameInMap("SearchVolume")
        public Double searchVolume;

        public static GetCrowdLabelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCrowdLabelResponseBodyData self = new GetCrowdLabelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCrowdLabelResponseBodyData setClosingDate(String closingDate) {
            this.closingDate = closingDate;
            return this;
        }
        public String getClosingDate() {
            return this.closingDate;
        }

        public GetCrowdLabelResponseBodyData setLabelName(String labelName) {
            this.labelName = labelName;
            return this;
        }
        public String getLabelName() {
            return this.labelName;
        }

        public GetCrowdLabelResponseBodyData setOrderAmount(Double orderAmount) {
            this.orderAmount = orderAmount;
            return this;
        }
        public Double getOrderAmount() {
            return this.orderAmount;
        }

        public GetCrowdLabelResponseBodyData setPurchaseAmount(Double purchaseAmount) {
            this.purchaseAmount = purchaseAmount;
            return this;
        }
        public Double getPurchaseAmount() {
            return this.purchaseAmount;
        }

        public GetCrowdLabelResponseBodyData setSearchVolume(Double searchVolume) {
            this.searchVolume = searchVolume;
            return this;
        }
        public Double getSearchVolume() {
            return this.searchVolume;
        }

    }

}
