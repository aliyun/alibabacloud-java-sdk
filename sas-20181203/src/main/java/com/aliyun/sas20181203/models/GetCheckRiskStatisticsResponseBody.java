// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckRiskStatisticsResponseBody extends TeaModel {
    /**
     * <p>The number of risk scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>An array consisting of the statistics on check items that are used in risk scenarios.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetCheckRiskStatisticsResponseBodyData> data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>2C455672-2490-5211-84EC-420C7818****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Summary")
    public GetCheckRiskStatisticsResponseBodySummary summary;

    public static GetCheckRiskStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCheckRiskStatisticsResponseBody self = new GetCheckRiskStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCheckRiskStatisticsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public GetCheckRiskStatisticsResponseBody setData(java.util.List<GetCheckRiskStatisticsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCheckRiskStatisticsResponseBodyData> getData() {
        return this.data;
    }

    public GetCheckRiskStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCheckRiskStatisticsResponseBody setSummary(GetCheckRiskStatisticsResponseBodySummary summary) {
        this.summary = summary;
        return this;
    }
    public GetCheckRiskStatisticsResponseBodySummary getSummary() {
        return this.summary;
    }

    public static class GetCheckRiskStatisticsResponseBodyDataSubStatistics extends TeaModel {
        /**
         * <p>The name of the baseline type.</p>
         * 
         * <strong>example:</strong>
         * <p>weak_password</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The number of high-risk items.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HighWarningCount")
        public Integer highWarningCount;

        /**
         * <p>The number of low-risk items.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LowWarningCount")
        public Integer lowWarningCount;

        /**
         * <p>The number of medium-risk items.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MediumWarningCount")
        public Integer mediumWarningCount;

        /**
         * <p>The number of passed check items.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PassCount")
        public Integer passCount;

        /**
         * <p>The total number of check items.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The baseline type.</p>
         * 
         * <strong>example:</strong>
         * <p>weak_password</p>
         */
        @NameInMap("TypeName")
        public String typeName;

        public static GetCheckRiskStatisticsResponseBodyDataSubStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetCheckRiskStatisticsResponseBodyDataSubStatistics self = new GetCheckRiskStatisticsResponseBodyDataSubStatistics();
            return TeaModel.build(map, self);
        }

        public GetCheckRiskStatisticsResponseBodyDataSubStatistics setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetCheckRiskStatisticsResponseBodyDataSubStatistics setHighWarningCount(Integer highWarningCount) {
            this.highWarningCount = highWarningCount;
            return this;
        }
        public Integer getHighWarningCount() {
            return this.highWarningCount;
        }

        public GetCheckRiskStatisticsResponseBodyDataSubStatistics setLowWarningCount(Integer lowWarningCount) {
            this.lowWarningCount = lowWarningCount;
            return this;
        }
        public Integer getLowWarningCount() {
            return this.lowWarningCount;
        }

        public GetCheckRiskStatisticsResponseBodyDataSubStatistics setMediumWarningCount(Integer mediumWarningCount) {
            this.mediumWarningCount = mediumWarningCount;
            return this;
        }
        public Integer getMediumWarningCount() {
            return this.mediumWarningCount;
        }

        public GetCheckRiskStatisticsResponseBodyDataSubStatistics setPassCount(Integer passCount) {
            this.passCount = passCount;
            return this;
        }
        public Integer getPassCount() {
            return this.passCount;
        }

        public GetCheckRiskStatisticsResponseBodyDataSubStatistics setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetCheckRiskStatisticsResponseBodyDataSubStatistics setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

    public static class GetCheckRiskStatisticsResponseBodyData extends TeaModel {
        /**
         * <p>The number of high-risk items.</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("HighWarningCount")
        public Integer highWarningCount;

        /**
         * <p>The number of low-risk items.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("LowWarningCount")
        public Integer lowWarningCount;

        /**
         * <p>The number of medium-risk items.</p>
         * 
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("MediumWarningCount")
        public Integer mediumWarningCount;

        /**
         * <p>The number of passed check items.</p>
         * 
         * <strong>example:</strong>
         * <p>143</p>
         */
        @NameInMap("PassCount")
        public Integer passCount;

        /**
         * <p>The name of the risk scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>SECURITY</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>The statistics on check items that are used in the risk scenario by baseline type.</p>
         */
        @NameInMap("SubStatistics")
        public java.util.List<GetCheckRiskStatisticsResponseBodyDataSubStatistics> subStatistics;

        /**
         * <p>The total number of check items.</p>
         * 
         * <strong>example:</strong>
         * <p>219</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetCheckRiskStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCheckRiskStatisticsResponseBodyData self = new GetCheckRiskStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCheckRiskStatisticsResponseBodyData setHighWarningCount(Integer highWarningCount) {
            this.highWarningCount = highWarningCount;
            return this;
        }
        public Integer getHighWarningCount() {
            return this.highWarningCount;
        }

        public GetCheckRiskStatisticsResponseBodyData setLowWarningCount(Integer lowWarningCount) {
            this.lowWarningCount = lowWarningCount;
            return this;
        }
        public Integer getLowWarningCount() {
            return this.lowWarningCount;
        }

        public GetCheckRiskStatisticsResponseBodyData setMediumWarningCount(Integer mediumWarningCount) {
            this.mediumWarningCount = mediumWarningCount;
            return this;
        }
        public Integer getMediumWarningCount() {
            return this.mediumWarningCount;
        }

        public GetCheckRiskStatisticsResponseBodyData setPassCount(Integer passCount) {
            this.passCount = passCount;
            return this;
        }
        public Integer getPassCount() {
            return this.passCount;
        }

        public GetCheckRiskStatisticsResponseBodyData setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetCheckRiskStatisticsResponseBodyData setSubStatistics(java.util.List<GetCheckRiskStatisticsResponseBodyDataSubStatistics> subStatistics) {
            this.subStatistics = subStatistics;
            return this;
        }
        public java.util.List<GetCheckRiskStatisticsResponseBodyDataSubStatistics> getSubStatistics() {
            return this.subStatistics;
        }

        public GetCheckRiskStatisticsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetCheckRiskStatisticsResponseBodySummary extends TeaModel {
        @NameInMap("HandledCheckToday")
        public Integer handledCheckToday;

        @NameInMap("HandledCheckTotal")
        public Integer handledCheckTotal;

        @NameInMap("HandledDays")
        public Integer handledDays;

        @NameInMap("RiskCheckCnt")
        public Integer riskCheckCnt;

        @NameInMap("RiskDays")
        public Integer riskDays;

        @NameInMap("RiskWarningCnt")
        public Integer riskWarningCnt;

        public static GetCheckRiskStatisticsResponseBodySummary build(java.util.Map<String, ?> map) throws Exception {
            GetCheckRiskStatisticsResponseBodySummary self = new GetCheckRiskStatisticsResponseBodySummary();
            return TeaModel.build(map, self);
        }

        public GetCheckRiskStatisticsResponseBodySummary setHandledCheckToday(Integer handledCheckToday) {
            this.handledCheckToday = handledCheckToday;
            return this;
        }
        public Integer getHandledCheckToday() {
            return this.handledCheckToday;
        }

        public GetCheckRiskStatisticsResponseBodySummary setHandledCheckTotal(Integer handledCheckTotal) {
            this.handledCheckTotal = handledCheckTotal;
            return this;
        }
        public Integer getHandledCheckTotal() {
            return this.handledCheckTotal;
        }

        public GetCheckRiskStatisticsResponseBodySummary setHandledDays(Integer handledDays) {
            this.handledDays = handledDays;
            return this;
        }
        public Integer getHandledDays() {
            return this.handledDays;
        }

        public GetCheckRiskStatisticsResponseBodySummary setRiskCheckCnt(Integer riskCheckCnt) {
            this.riskCheckCnt = riskCheckCnt;
            return this;
        }
        public Integer getRiskCheckCnt() {
            return this.riskCheckCnt;
        }

        public GetCheckRiskStatisticsResponseBodySummary setRiskDays(Integer riskDays) {
            this.riskDays = riskDays;
            return this;
        }
        public Integer getRiskDays() {
            return this.riskDays;
        }

        public GetCheckRiskStatisticsResponseBodySummary setRiskWarningCnt(Integer riskWarningCnt) {
            this.riskWarningCnt = riskWarningCnt;
            return this;
        }
        public Integer getRiskWarningCnt() {
            return this.riskWarningCnt;
        }

    }

}
