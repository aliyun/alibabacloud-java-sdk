// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetOpportunityMarketResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOpportunityMarketResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public Boolean successResponse;

    public static GetOpportunityMarketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpportunityMarketResponseBody self = new GetOpportunityMarketResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpportunityMarketResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOpportunityMarketResponseBody setData(java.util.List<GetOpportunityMarketResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOpportunityMarketResponseBodyData> getData() {
        return this.data;
    }

    public GetOpportunityMarketResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOpportunityMarketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOpportunityMarketResponseBody setSuccessResponse(Boolean successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public Boolean getSuccessResponse() {
        return this.successResponse;
    }

    public static class GetOpportunityMarketResponseBodyData extends TeaModel {
        @NameInMap("CateName")
        public String cateName;

        @NameInMap("OpportunityIndex")
        public Double opportunityIndex;

        @NameInMap("RelativeCommodity")
        public Double relativeCommodity;

        @NameInMap("RelativeDischarge")
        public Double relativeDischarge;

        @NameInMap("TimeUnit")
        public String timeUnit;

        public static GetOpportunityMarketResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOpportunityMarketResponseBodyData self = new GetOpportunityMarketResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOpportunityMarketResponseBodyData setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetOpportunityMarketResponseBodyData setOpportunityIndex(Double opportunityIndex) {
            this.opportunityIndex = opportunityIndex;
            return this;
        }
        public Double getOpportunityIndex() {
            return this.opportunityIndex;
        }

        public GetOpportunityMarketResponseBodyData setRelativeCommodity(Double relativeCommodity) {
            this.relativeCommodity = relativeCommodity;
            return this;
        }
        public Double getRelativeCommodity() {
            return this.relativeCommodity;
        }

        public GetOpportunityMarketResponseBodyData setRelativeDischarge(Double relativeDischarge) {
            this.relativeDischarge = relativeDischarge;
            return this;
        }
        public Double getRelativeDischarge() {
            return this.relativeDischarge;
        }

        public GetOpportunityMarketResponseBodyData setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

    }

}
