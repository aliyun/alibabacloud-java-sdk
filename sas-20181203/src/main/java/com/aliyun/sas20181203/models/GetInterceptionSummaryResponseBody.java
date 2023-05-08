// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetInterceptionSummaryResponseBody extends TeaModel {
    @NameInMap("InterceptionSummary")
    public GetInterceptionSummaryResponseBodyInterceptionSummary interceptionSummary;

    @NameInMap("RequestId")
    public String requestId;

    public static GetInterceptionSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInterceptionSummaryResponseBody self = new GetInterceptionSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInterceptionSummaryResponseBody setInterceptionSummary(GetInterceptionSummaryResponseBodyInterceptionSummary interceptionSummary) {
        this.interceptionSummary = interceptionSummary;
        return this;
    }
    public GetInterceptionSummaryResponseBodyInterceptionSummary getInterceptionSummary() {
        return this.interceptionSummary;
    }

    public GetInterceptionSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInterceptionSummaryResponseBodyInterceptionSummary extends TeaModel {
        @NameInMap("CloseClusterCount")
        public Integer closeClusterCount;

        @NameInMap("CloseRuleCount")
        public Integer closeRuleCount;

        @NameInMap("ClusterCount")
        public Integer clusterCount;

        @NameInMap("InterceptionCountInDays")
        public Integer interceptionCountInDays;

        @NameInMap("OpenClusterCount")
        public Integer openClusterCount;

        @NameInMap("OpenRuleCount")
        public Integer openRuleCount;

        @NameInMap("RiskCount180Day")
        public Long riskCount180Day;

        @NameInMap("RiskCount30Day")
        public Long riskCount30Day;

        @NameInMap("RiskCountToday")
        public Long riskCountToday;

        @NameInMap("RuleCount")
        public Integer ruleCount;

        public static GetInterceptionSummaryResponseBodyInterceptionSummary build(java.util.Map<String, ?> map) throws Exception {
            GetInterceptionSummaryResponseBodyInterceptionSummary self = new GetInterceptionSummaryResponseBodyInterceptionSummary();
            return TeaModel.build(map, self);
        }

        public GetInterceptionSummaryResponseBodyInterceptionSummary setCloseClusterCount(Integer closeClusterCount) {
            this.closeClusterCount = closeClusterCount;
            return this;
        }
        public Integer getCloseClusterCount() {
            return this.closeClusterCount;
        }

        public GetInterceptionSummaryResponseBodyInterceptionSummary setCloseRuleCount(Integer closeRuleCount) {
            this.closeRuleCount = closeRuleCount;
            return this;
        }
        public Integer getCloseRuleCount() {
            return this.closeRuleCount;
        }

        public GetInterceptionSummaryResponseBodyInterceptionSummary setClusterCount(Integer clusterCount) {
            this.clusterCount = clusterCount;
            return this;
        }
        public Integer getClusterCount() {
            return this.clusterCount;
        }

        public GetInterceptionSummaryResponseBodyInterceptionSummary setInterceptionCountInDays(Integer interceptionCountInDays) {
            this.interceptionCountInDays = interceptionCountInDays;
            return this;
        }
        public Integer getInterceptionCountInDays() {
            return this.interceptionCountInDays;
        }

        public GetInterceptionSummaryResponseBodyInterceptionSummary setOpenClusterCount(Integer openClusterCount) {
            this.openClusterCount = openClusterCount;
            return this;
        }
        public Integer getOpenClusterCount() {
            return this.openClusterCount;
        }

        public GetInterceptionSummaryResponseBodyInterceptionSummary setOpenRuleCount(Integer openRuleCount) {
            this.openRuleCount = openRuleCount;
            return this;
        }
        public Integer getOpenRuleCount() {
            return this.openRuleCount;
        }

        public GetInterceptionSummaryResponseBodyInterceptionSummary setRiskCount180Day(Long riskCount180Day) {
            this.riskCount180Day = riskCount180Day;
            return this;
        }
        public Long getRiskCount180Day() {
            return this.riskCount180Day;
        }

        public GetInterceptionSummaryResponseBodyInterceptionSummary setRiskCount30Day(Long riskCount30Day) {
            this.riskCount30Day = riskCount30Day;
            return this;
        }
        public Long getRiskCount30Day() {
            return this.riskCount30Day;
        }

        public GetInterceptionSummaryResponseBodyInterceptionSummary setRiskCountToday(Long riskCountToday) {
            this.riskCountToday = riskCountToday;
            return this;
        }
        public Long getRiskCountToday() {
            return this.riskCountToday;
        }

        public GetInterceptionSummaryResponseBodyInterceptionSummary setRuleCount(Integer ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Integer getRuleCount() {
            return this.ruleCount;
        }

    }

}
