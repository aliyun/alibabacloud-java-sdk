// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetExpenseSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetExpenseSummaryResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    public static GetExpenseSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExpenseSummaryResponseBody self = new GetExpenseSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExpenseSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExpenseSummaryResponseBody setData(GetExpenseSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetExpenseSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetExpenseSummaryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetExpenseSummaryResponseBodyData extends TeaModel {
        @NameInMap("ForecastFluency")
        public Float forecastFluency;

        @NameInMap("TopBandwidth")
        public Long topBandwidth;

        @NameInMap("TotalTraffic")
        public Long totalTraffic;

        @NameInMap("CoverRate")
        public Float coverRate;

        @NameInMap("ShareRate")
        public Float shareRate;

        @NameInMap("TotalUV")
        public Integer totalUV;

        public static GetExpenseSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetExpenseSummaryResponseBodyData self = new GetExpenseSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetExpenseSummaryResponseBodyData setForecastFluency(Float forecastFluency) {
            this.forecastFluency = forecastFluency;
            return this;
        }
        public Float getForecastFluency() {
            return this.forecastFluency;
        }

        public GetExpenseSummaryResponseBodyData setTopBandwidth(Long topBandwidth) {
            this.topBandwidth = topBandwidth;
            return this;
        }
        public Long getTopBandwidth() {
            return this.topBandwidth;
        }

        public GetExpenseSummaryResponseBodyData setTotalTraffic(Long totalTraffic) {
            this.totalTraffic = totalTraffic;
            return this;
        }
        public Long getTotalTraffic() {
            return this.totalTraffic;
        }

        public GetExpenseSummaryResponseBodyData setCoverRate(Float coverRate) {
            this.coverRate = coverRate;
            return this;
        }
        public Float getCoverRate() {
            return this.coverRate;
        }

        public GetExpenseSummaryResponseBodyData setShareRate(Float shareRate) {
            this.shareRate = shareRate;
            return this;
        }
        public Float getShareRate() {
            return this.shareRate;
        }

        public GetExpenseSummaryResponseBodyData setTotalUV(Integer totalUV) {
            this.totalUV = totalUV;
            return this;
        }
        public Integer getTotalUV() {
            return this.totalUV;
        }

    }

}
