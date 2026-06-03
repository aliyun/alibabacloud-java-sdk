// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetAuditCountDistributionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>482EF142-BFA5-43FF-B4B0-84A4B0763639</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TimeList")
    public java.util.List<GetAuditCountDistributionResponseBodyTimeList> timeList;

    public static GetAuditCountDistributionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuditCountDistributionResponseBody self = new GetAuditCountDistributionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuditCountDistributionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuditCountDistributionResponseBody setTimeList(java.util.List<GetAuditCountDistributionResponseBodyTimeList> timeList) {
        this.timeList = timeList;
        return this;
    }
    public java.util.List<GetAuditCountDistributionResponseBodyTimeList> getTimeList() {
        return this.timeList;
    }

    public static class GetAuditCountDistributionResponseBodyTimeList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2019-06-06 00:00:00</p>
         */
        @NameInMap("BeginDate")
        public String beginDate;

        /**
         * <strong>example:</strong>
         * <p>2019-06-06 01:00:00</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("RiskCount")
        public Long riskCount;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("SessionCount")
        public Long sessionCount;

        /**
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("SqlCount")
        public Long sqlCount;

        public static GetAuditCountDistributionResponseBodyTimeList build(java.util.Map<String, ?> map) throws Exception {
            GetAuditCountDistributionResponseBodyTimeList self = new GetAuditCountDistributionResponseBodyTimeList();
            return TeaModel.build(map, self);
        }

        public GetAuditCountDistributionResponseBodyTimeList setBeginDate(String beginDate) {
            this.beginDate = beginDate;
            return this;
        }
        public String getBeginDate() {
            return this.beginDate;
        }

        public GetAuditCountDistributionResponseBodyTimeList setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetAuditCountDistributionResponseBodyTimeList setRiskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Long getRiskCount() {
            return this.riskCount;
        }

        public GetAuditCountDistributionResponseBodyTimeList setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public GetAuditCountDistributionResponseBodyTimeList setSqlCount(Long sqlCount) {
            this.sqlCount = sqlCount;
            return this;
        }
        public Long getSqlCount() {
            return this.sqlCount;
        }

    }

}
