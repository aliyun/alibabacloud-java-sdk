// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetAuditCountDistributionResponseBody extends TeaModel {
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
        @NameInMap("SessionCount")
        public Long sessionCount;

        @NameInMap("BeginDate")
        public String beginDate;

        @NameInMap("SqlCount")
        public Long sqlCount;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("RiskCount")
        public Long riskCount;

        public static GetAuditCountDistributionResponseBodyTimeList build(java.util.Map<String, ?> map) throws Exception {
            GetAuditCountDistributionResponseBodyTimeList self = new GetAuditCountDistributionResponseBodyTimeList();
            return TeaModel.build(map, self);
        }

        public GetAuditCountDistributionResponseBodyTimeList setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public GetAuditCountDistributionResponseBodyTimeList setBeginDate(String beginDate) {
            this.beginDate = beginDate;
            return this;
        }
        public String getBeginDate() {
            return this.beginDate;
        }

        public GetAuditCountDistributionResponseBodyTimeList setSqlCount(Long sqlCount) {
            this.sqlCount = sqlCount;
            return this;
        }
        public Long getSqlCount() {
            return this.sqlCount;
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

    }

}
