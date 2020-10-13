// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetExpenseSummaryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Data")
    @Validation(required = true)
    public GetExpenseSummaryResponseData data;

    public static GetExpenseSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExpenseSummaryResponse self = new GetExpenseSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetExpenseSummaryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExpenseSummaryResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetExpenseSummaryResponse setData(GetExpenseSummaryResponseData data) {
        this.data = data;
        return this;
    }
    public GetExpenseSummaryResponseData getData() {
        return this.data;
    }

    public static class GetExpenseSummaryResponseData extends TeaModel {
        @NameInMap("TotalTraffic")
        @Validation(required = true)
        public Long totalTraffic;

        @NameInMap("TotalUV")
        @Validation(required = true)
        public Integer totalUV;

        @NameInMap("ShareRate")
        @Validation(required = true)
        public Float shareRate;

        @NameInMap("CoverRate")
        @Validation(required = true)
        public Float coverRate;

        @NameInMap("ForecastFluency")
        @Validation(required = true)
        public Float forecastFluency;

        @NameInMap("TopBandwidth")
        @Validation(required = true)
        public Long topBandwidth;

        public static GetExpenseSummaryResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetExpenseSummaryResponseData self = new GetExpenseSummaryResponseData();
            return TeaModel.build(map, self);
        }

        public GetExpenseSummaryResponseData setTotalTraffic(Long totalTraffic) {
            this.totalTraffic = totalTraffic;
            return this;
        }
        public Long getTotalTraffic() {
            return this.totalTraffic;
        }

        public GetExpenseSummaryResponseData setTotalUV(Integer totalUV) {
            this.totalUV = totalUV;
            return this;
        }
        public Integer getTotalUV() {
            return this.totalUV;
        }

        public GetExpenseSummaryResponseData setShareRate(Float shareRate) {
            this.shareRate = shareRate;
            return this;
        }
        public Float getShareRate() {
            return this.shareRate;
        }

        public GetExpenseSummaryResponseData setCoverRate(Float coverRate) {
            this.coverRate = coverRate;
            return this;
        }
        public Float getCoverRate() {
            return this.coverRate;
        }

        public GetExpenseSummaryResponseData setForecastFluency(Float forecastFluency) {
            this.forecastFluency = forecastFluency;
            return this;
        }
        public Float getForecastFluency() {
            return this.forecastFluency;
        }

        public GetExpenseSummaryResponseData setTopBandwidth(Long topBandwidth) {
            this.topBandwidth = topBandwidth;
            return this;
        }
        public Long getTopBandwidth() {
            return this.topBandwidth;
        }

    }

}
