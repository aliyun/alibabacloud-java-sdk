// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetRiskLevelDistributionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TimeList")
    public java.util.List<GetRiskLevelDistributionResponseBodyTimeList> timeList;

    public static GetRiskLevelDistributionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRiskLevelDistributionResponseBody self = new GetRiskLevelDistributionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRiskLevelDistributionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRiskLevelDistributionResponseBody setTimeList(java.util.List<GetRiskLevelDistributionResponseBodyTimeList> timeList) {
        this.timeList = timeList;
        return this;
    }
    public java.util.List<GetRiskLevelDistributionResponseBodyTimeList> getTimeList() {
        return this.timeList;
    }

    public static class GetRiskLevelDistributionResponseBodyTimeList extends TeaModel {
        @NameInMap("MiddleRiskCount")
        public Long middleRiskCount;

        @NameInMap("HighRiskCount")
        public Long highRiskCount;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("BeginDate")
        public String beginDate;

        @NameInMap("RiskCount")
        public Long riskCount;

        @NameInMap("LowRiskCount")
        public Long lowRiskCount;

        public static GetRiskLevelDistributionResponseBodyTimeList build(java.util.Map<String, ?> map) throws Exception {
            GetRiskLevelDistributionResponseBodyTimeList self = new GetRiskLevelDistributionResponseBodyTimeList();
            return TeaModel.build(map, self);
        }

        public GetRiskLevelDistributionResponseBodyTimeList setMiddleRiskCount(Long middleRiskCount) {
            this.middleRiskCount = middleRiskCount;
            return this;
        }
        public Long getMiddleRiskCount() {
            return this.middleRiskCount;
        }

        public GetRiskLevelDistributionResponseBodyTimeList setHighRiskCount(Long highRiskCount) {
            this.highRiskCount = highRiskCount;
            return this;
        }
        public Long getHighRiskCount() {
            return this.highRiskCount;
        }

        public GetRiskLevelDistributionResponseBodyTimeList setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetRiskLevelDistributionResponseBodyTimeList setBeginDate(String beginDate) {
            this.beginDate = beginDate;
            return this;
        }
        public String getBeginDate() {
            return this.beginDate;
        }

        public GetRiskLevelDistributionResponseBodyTimeList setRiskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Long getRiskCount() {
            return this.riskCount;
        }

        public GetRiskLevelDistributionResponseBodyTimeList setLowRiskCount(Long lowRiskCount) {
            this.lowRiskCount = lowRiskCount;
            return this;
        }
        public Long getLowRiskCount() {
            return this.lowRiskCount;
        }

    }

}
