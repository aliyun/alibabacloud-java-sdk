// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetRiskLevelDistributionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1B217656-2267-4FBF-B26C-CDD201BDC3B8</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2019-06-06 01:00:00</p>
         */
        @NameInMap("BeginDate")
        public String beginDate;

        /**
         * <strong>example:</strong>
         * <p>2019-06-06 00:00:00</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("HighRiskCount")
        public Long highRiskCount;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("LowRiskCount")
        public Long lowRiskCount;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("MiddleRiskCount")
        public Long middleRiskCount;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("RiskCount")
        public Long riskCount;

        public static GetRiskLevelDistributionResponseBodyTimeList build(java.util.Map<String, ?> map) throws Exception {
            GetRiskLevelDistributionResponseBodyTimeList self = new GetRiskLevelDistributionResponseBodyTimeList();
            return TeaModel.build(map, self);
        }

        public GetRiskLevelDistributionResponseBodyTimeList setBeginDate(String beginDate) {
            this.beginDate = beginDate;
            return this;
        }
        public String getBeginDate() {
            return this.beginDate;
        }

        public GetRiskLevelDistributionResponseBodyTimeList setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetRiskLevelDistributionResponseBodyTimeList setHighRiskCount(Long highRiskCount) {
            this.highRiskCount = highRiskCount;
            return this;
        }
        public Long getHighRiskCount() {
            return this.highRiskCount;
        }

        public GetRiskLevelDistributionResponseBodyTimeList setLowRiskCount(Long lowRiskCount) {
            this.lowRiskCount = lowRiskCount;
            return this;
        }
        public Long getLowRiskCount() {
            return this.lowRiskCount;
        }

        public GetRiskLevelDistributionResponseBodyTimeList setMiddleRiskCount(Long middleRiskCount) {
            this.middleRiskCount = middleRiskCount;
            return this;
        }
        public Long getMiddleRiskCount() {
            return this.middleRiskCount;
        }

        public GetRiskLevelDistributionResponseBodyTimeList setRiskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Long getRiskCount() {
            return this.riskCount;
        }

    }

}
