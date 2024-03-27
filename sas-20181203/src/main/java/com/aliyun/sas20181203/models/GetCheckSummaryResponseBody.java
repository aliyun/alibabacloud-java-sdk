// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckSummaryResponseBody extends TeaModel {
    /**
     * <p>The statistics of the check items.</p>
     */
    @NameInMap("OverallItemStatistic")
    public GetCheckSummaryResponseBodyOverallItemStatistic overallItemStatistic;

    /**
     * <p>The overall risk statistics.</p>
     */
    @NameInMap("OverallStatistic")
    public GetCheckSummaryResponseBodyOverallStatistic overallStatistic;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The summary information about the configuration checks on cloud services.</p>
     */
    @NameInMap("Summarys")
    public java.util.List<GetCheckSummaryResponseBodySummarys> summarys;

    public static GetCheckSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCheckSummaryResponseBody self = new GetCheckSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCheckSummaryResponseBody setOverallItemStatistic(GetCheckSummaryResponseBodyOverallItemStatistic overallItemStatistic) {
        this.overallItemStatistic = overallItemStatistic;
        return this;
    }
    public GetCheckSummaryResponseBodyOverallItemStatistic getOverallItemStatistic() {
        return this.overallItemStatistic;
    }

    public GetCheckSummaryResponseBody setOverallStatistic(GetCheckSummaryResponseBodyOverallStatistic overallStatistic) {
        this.overallStatistic = overallStatistic;
        return this;
    }
    public GetCheckSummaryResponseBodyOverallStatistic getOverallStatistic() {
        return this.overallStatistic;
    }

    public GetCheckSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCheckSummaryResponseBody setSummarys(java.util.List<GetCheckSummaryResponseBodySummarys> summarys) {
        this.summarys = summarys;
        return this;
    }
    public java.util.List<GetCheckSummaryResponseBodySummarys> getSummarys() {
        return this.summarys;
    }

    public static class GetCheckSummaryResponseBodyOverallItemStatistic extends TeaModel {
        /**
         * <p>The number of check items supported by the system.</p>
         */
        @NameInMap("ReleaseCount")
        public Integer releaseCount;

        /**
         * <p>The number of check items available to you.</p>
         */
        @NameInMap("ResultCount")
        public Integer resultCount;

        public static GetCheckSummaryResponseBodyOverallItemStatistic build(java.util.Map<String, ?> map) throws Exception {
            GetCheckSummaryResponseBodyOverallItemStatistic self = new GetCheckSummaryResponseBodyOverallItemStatistic();
            return TeaModel.build(map, self);
        }

        public GetCheckSummaryResponseBodyOverallItemStatistic setReleaseCount(Integer releaseCount) {
            this.releaseCount = releaseCount;
            return this;
        }
        public Integer getReleaseCount() {
            return this.releaseCount;
        }

        public GetCheckSummaryResponseBodyOverallItemStatistic setResultCount(Integer resultCount) {
            this.resultCount = resultCount;
            return this;
        }
        public Integer getResultCount() {
            return this.resultCount;
        }

    }

    public static class GetCheckSummaryResponseBodyOverallStatistic extends TeaModel {
        /**
         * <p>The number of unchecked check items.</p>
         */
        @NameInMap("NotCheckCount")
        public Integer notCheckCount;

        /**
         * <p>The number of unchecked high-risk check items.</p>
         */
        @NameInMap("NotCheckHighCount")
        public Integer notCheckHighCount;

        /**
         * <p>The number of unchecked low-risk check items.</p>
         */
        @NameInMap("NotCheckLowCount")
        public Integer notCheckLowCount;

        /**
         * <p>The number of unchecked medium-risk check items.</p>
         */
        @NameInMap("NotCheckMediumCount")
        public Integer notCheckMediumCount;

        /**
         * <p>The number of check items that failed to pass the check.</p>
         */
        @NameInMap("NotPassCount")
        public Integer notPassCount;

        /**
         * <p>The number of high-risk check items that failed to pass the check.</p>
         */
        @NameInMap("NotPassHighCount")
        public Integer notPassHighCount;

        /**
         * <p>The number of low-risk check items that failed to pass the check.</p>
         */
        @NameInMap("NotPassLowCount")
        public Integer notPassLowCount;

        /**
         * <p>The number of medium-risk check items that failed to pass the check.</p>
         */
        @NameInMap("NotPassMediumCount")
        public Integer notPassMediumCount;

        /**
         * <p>The number of check items that pass the check.</p>
         */
        @NameInMap("PassCount")
        public Integer passCount;

        /**
         * <p>The number of high-risk check items that pass the check.</p>
         */
        @NameInMap("PassHighCount")
        public Integer passHighCount;

        /**
         * <p>The number of low-risk check items that pass the check.</p>
         */
        @NameInMap("PassLowCount")
        public Integer passLowCount;

        /**
         * <p>The number of medium-risk check items that pass the check.</p>
         */
        @NameInMap("PassMediumCount")
        public Integer passMediumCount;

        public static GetCheckSummaryResponseBodyOverallStatistic build(java.util.Map<String, ?> map) throws Exception {
            GetCheckSummaryResponseBodyOverallStatistic self = new GetCheckSummaryResponseBodyOverallStatistic();
            return TeaModel.build(map, self);
        }

        public GetCheckSummaryResponseBodyOverallStatistic setNotCheckCount(Integer notCheckCount) {
            this.notCheckCount = notCheckCount;
            return this;
        }
        public Integer getNotCheckCount() {
            return this.notCheckCount;
        }

        public GetCheckSummaryResponseBodyOverallStatistic setNotCheckHighCount(Integer notCheckHighCount) {
            this.notCheckHighCount = notCheckHighCount;
            return this;
        }
        public Integer getNotCheckHighCount() {
            return this.notCheckHighCount;
        }

        public GetCheckSummaryResponseBodyOverallStatistic setNotCheckLowCount(Integer notCheckLowCount) {
            this.notCheckLowCount = notCheckLowCount;
            return this;
        }
        public Integer getNotCheckLowCount() {
            return this.notCheckLowCount;
        }

        public GetCheckSummaryResponseBodyOverallStatistic setNotCheckMediumCount(Integer notCheckMediumCount) {
            this.notCheckMediumCount = notCheckMediumCount;
            return this;
        }
        public Integer getNotCheckMediumCount() {
            return this.notCheckMediumCount;
        }

        public GetCheckSummaryResponseBodyOverallStatistic setNotPassCount(Integer notPassCount) {
            this.notPassCount = notPassCount;
            return this;
        }
        public Integer getNotPassCount() {
            return this.notPassCount;
        }

        public GetCheckSummaryResponseBodyOverallStatistic setNotPassHighCount(Integer notPassHighCount) {
            this.notPassHighCount = notPassHighCount;
            return this;
        }
        public Integer getNotPassHighCount() {
            return this.notPassHighCount;
        }

        public GetCheckSummaryResponseBodyOverallStatistic setNotPassLowCount(Integer notPassLowCount) {
            this.notPassLowCount = notPassLowCount;
            return this;
        }
        public Integer getNotPassLowCount() {
            return this.notPassLowCount;
        }

        public GetCheckSummaryResponseBodyOverallStatistic setNotPassMediumCount(Integer notPassMediumCount) {
            this.notPassMediumCount = notPassMediumCount;
            return this;
        }
        public Integer getNotPassMediumCount() {
            return this.notPassMediumCount;
        }

        public GetCheckSummaryResponseBodyOverallStatistic setPassCount(Integer passCount) {
            this.passCount = passCount;
            return this;
        }
        public Integer getPassCount() {
            return this.passCount;
        }

        public GetCheckSummaryResponseBodyOverallStatistic setPassHighCount(Integer passHighCount) {
            this.passHighCount = passHighCount;
            return this;
        }
        public Integer getPassHighCount() {
            return this.passHighCount;
        }

        public GetCheckSummaryResponseBodyOverallStatistic setPassLowCount(Integer passLowCount) {
            this.passLowCount = passLowCount;
            return this;
        }
        public Integer getPassLowCount() {
            return this.passLowCount;
        }

        public GetCheckSummaryResponseBodyOverallStatistic setPassMediumCount(Integer passMediumCount) {
            this.passMediumCount = passMediumCount;
            return this;
        }
        public Integer getPassMediumCount() {
            return this.passMediumCount;
        }

    }

    public static class GetCheckSummaryResponseBodySummarysStandardsStandardStatistic extends TeaModel {
        /**
         * <p>The number of unchecked check items.</p>
         */
        @NameInMap("NotCheckCount")
        public Integer notCheckCount;

        /**
         * <p>The number of unchecked high-risk check items.</p>
         */
        @NameInMap("NotCheckHighCount")
        public Integer notCheckHighCount;

        /**
         * <p>The number of unchecked low-risk check items.</p>
         */
        @NameInMap("NotCheckLowCount")
        public Integer notCheckLowCount;

        /**
         * <p>The number of unchecked medium-risk check items.</p>
         */
        @NameInMap("NotCheckMediumCount")
        public Integer notCheckMediumCount;

        /**
         * <p>The number of check items that failed to pass the check.</p>
         */
        @NameInMap("NotPassCount")
        public Integer notPassCount;

        /**
         * <p>The number of high-risk check items that failed to pass the check.</p>
         */
        @NameInMap("NotPassHighCount")
        public Integer notPassHighCount;

        /**
         * <p>The number of low-risk check items that failed to pass the check.</p>
         */
        @NameInMap("NotPassLowCount")
        public Integer notPassLowCount;

        /**
         * <p>The number of medium-risk check items that failed to pass the check.</p>
         */
        @NameInMap("NotPassMediumCount")
        public Integer notPassMediumCount;

        /**
         * <p>The number of check items that pass the check.</p>
         */
        @NameInMap("PassCount")
        public Integer passCount;

        /**
         * <p>The number of high-risk check items that pass the check.</p>
         */
        @NameInMap("PassHighCount")
        public Integer passHighCount;

        /**
         * <p>The number of low-risk check items that pass the check.</p>
         */
        @NameInMap("PassLowCount")
        public Integer passLowCount;

        /**
         * <p>The number of medium-risk check items that pass the check.</p>
         */
        @NameInMap("PassMediumCount")
        public Integer passMediumCount;

        public static GetCheckSummaryResponseBodySummarysStandardsStandardStatistic build(java.util.Map<String, ?> map) throws Exception {
            GetCheckSummaryResponseBodySummarysStandardsStandardStatistic self = new GetCheckSummaryResponseBodySummarysStandardsStandardStatistic();
            return TeaModel.build(map, self);
        }

        public GetCheckSummaryResponseBodySummarysStandardsStandardStatistic setNotCheckCount(Integer notCheckCount) {
            this.notCheckCount = notCheckCount;
            return this;
        }
        public Integer getNotCheckCount() {
            return this.notCheckCount;
        }

        public GetCheckSummaryResponseBodySummarysStandardsStandardStatistic setNotCheckHighCount(Integer notCheckHighCount) {
            this.notCheckHighCount = notCheckHighCount;
            return this;
        }
        public Integer getNotCheckHighCount() {
            return this.notCheckHighCount;
        }

        public GetCheckSummaryResponseBodySummarysStandardsStandardStatistic setNotCheckLowCount(Integer notCheckLowCount) {
            this.notCheckLowCount = notCheckLowCount;
            return this;
        }
        public Integer getNotCheckLowCount() {
            return this.notCheckLowCount;
        }

        public GetCheckSummaryResponseBodySummarysStandardsStandardStatistic setNotCheckMediumCount(Integer notCheckMediumCount) {
            this.notCheckMediumCount = notCheckMediumCount;
            return this;
        }
        public Integer getNotCheckMediumCount() {
            return this.notCheckMediumCount;
        }

        public GetCheckSummaryResponseBodySummarysStandardsStandardStatistic setNotPassCount(Integer notPassCount) {
            this.notPassCount = notPassCount;
            return this;
        }
        public Integer getNotPassCount() {
            return this.notPassCount;
        }

        public GetCheckSummaryResponseBodySummarysStandardsStandardStatistic setNotPassHighCount(Integer notPassHighCount) {
            this.notPassHighCount = notPassHighCount;
            return this;
        }
        public Integer getNotPassHighCount() {
            return this.notPassHighCount;
        }

        public GetCheckSummaryResponseBodySummarysStandardsStandardStatistic setNotPassLowCount(Integer notPassLowCount) {
            this.notPassLowCount = notPassLowCount;
            return this;
        }
        public Integer getNotPassLowCount() {
            return this.notPassLowCount;
        }

        public GetCheckSummaryResponseBodySummarysStandardsStandardStatistic setNotPassMediumCount(Integer notPassMediumCount) {
            this.notPassMediumCount = notPassMediumCount;
            return this;
        }
        public Integer getNotPassMediumCount() {
            return this.notPassMediumCount;
        }

        public GetCheckSummaryResponseBodySummarysStandardsStandardStatistic setPassCount(Integer passCount) {
            this.passCount = passCount;
            return this;
        }
        public Integer getPassCount() {
            return this.passCount;
        }

        public GetCheckSummaryResponseBodySummarysStandardsStandardStatistic setPassHighCount(Integer passHighCount) {
            this.passHighCount = passHighCount;
            return this;
        }
        public Integer getPassHighCount() {
            return this.passHighCount;
        }

        public GetCheckSummaryResponseBodySummarysStandardsStandardStatistic setPassLowCount(Integer passLowCount) {
            this.passLowCount = passLowCount;
            return this;
        }
        public Integer getPassLowCount() {
            return this.passLowCount;
        }

        public GetCheckSummaryResponseBodySummarysStandardsStandardStatistic setPassMediumCount(Integer passMediumCount) {
            this.passMediumCount = passMediumCount;
            return this;
        }
        public Integer getPassMediumCount() {
            return this.passMediumCount;
        }

    }

    public static class GetCheckSummaryResponseBodySummarysStandards extends TeaModel {
        /**
         * <p>The number of check items that failed to pass the check.</p>
         */
        @NameInMap("FailCount")
        public Integer failCount;

        /**
         * <p>The ID of the check item.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The number of check items that pass the check.</p>
         */
        @NameInMap("PassCount")
        public Integer passCount;

        /**
         * <p>The number of **high-risk** items.</p>
         */
        @NameInMap("RiskLevelHighCount")
        public Integer riskLevelHighCount;

        /**
         * <p>The number of **low-risk** items.</p>
         */
        @NameInMap("RiskLevelLowCount")
        public Integer riskLevelLowCount;

        /**
         * <p>The number of **medium-risk** items.</p>
         */
        @NameInMap("RiskLevelMediumCount")
        public Integer riskLevelMediumCount;

        /**
         * <p>The name of the check item.</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The standard statistics of the check items.</p>
         */
        @NameInMap("StandardStatistic")
        public GetCheckSummaryResponseBodySummarysStandardsStandardStatistic standardStatistic;

        public static GetCheckSummaryResponseBodySummarysStandards build(java.util.Map<String, ?> map) throws Exception {
            GetCheckSummaryResponseBodySummarysStandards self = new GetCheckSummaryResponseBodySummarysStandards();
            return TeaModel.build(map, self);
        }

        public GetCheckSummaryResponseBodySummarysStandards setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public GetCheckSummaryResponseBodySummarysStandards setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetCheckSummaryResponseBodySummarysStandards setPassCount(Integer passCount) {
            this.passCount = passCount;
            return this;
        }
        public Integer getPassCount() {
            return this.passCount;
        }

        public GetCheckSummaryResponseBodySummarysStandards setRiskLevelHighCount(Integer riskLevelHighCount) {
            this.riskLevelHighCount = riskLevelHighCount;
            return this;
        }
        public Integer getRiskLevelHighCount() {
            return this.riskLevelHighCount;
        }

        public GetCheckSummaryResponseBodySummarysStandards setRiskLevelLowCount(Integer riskLevelLowCount) {
            this.riskLevelLowCount = riskLevelLowCount;
            return this;
        }
        public Integer getRiskLevelLowCount() {
            return this.riskLevelLowCount;
        }

        public GetCheckSummaryResponseBodySummarysStandards setRiskLevelMediumCount(Integer riskLevelMediumCount) {
            this.riskLevelMediumCount = riskLevelMediumCount;
            return this;
        }
        public Integer getRiskLevelMediumCount() {
            return this.riskLevelMediumCount;
        }

        public GetCheckSummaryResponseBodySummarysStandards setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public GetCheckSummaryResponseBodySummarysStandards setStandardStatistic(GetCheckSummaryResponseBodySummarysStandardsStandardStatistic standardStatistic) {
            this.standardStatistic = standardStatistic;
            return this;
        }
        public GetCheckSummaryResponseBodySummarysStandardsStandardStatistic getStandardStatistic() {
            return this.standardStatistic;
        }

    }

    public static class GetCheckSummaryResponseBodySummarysTypeStatistic extends TeaModel {
        /**
         * <p>The number of unchecked check items.</p>
         */
        @NameInMap("NotCheckCount")
        public Integer notCheckCount;

        /**
         * <p>The number of unchecked high-risk check items.</p>
         */
        @NameInMap("NotCheckHighCount")
        public Integer notCheckHighCount;

        /**
         * <p>The number of unchecked low-risk check items.</p>
         */
        @NameInMap("NotCheckLowCount")
        public Integer notCheckLowCount;

        /**
         * <p>The number of unchecked medium-risk check items.</p>
         */
        @NameInMap("NotCheckMediumCount")
        public Integer notCheckMediumCount;

        /**
         * <p>The number of check items that failed to pass the check.</p>
         */
        @NameInMap("NotPassCount")
        public Integer notPassCount;

        /**
         * <p>The number of high-risk check items that failed to pass the check.</p>
         */
        @NameInMap("NotPassHighCount")
        public Integer notPassHighCount;

        /**
         * <p>The number of low-risk check items that failed to pass the check.</p>
         */
        @NameInMap("NotPassLowCount")
        public Integer notPassLowCount;

        /**
         * <p>The number of medium-risk check items that failed to pass the check.</p>
         */
        @NameInMap("NotPassMediumCount")
        public Integer notPassMediumCount;

        /**
         * <p>The number of check items that passed the check.</p>
         */
        @NameInMap("PassCount")
        public Integer passCount;

        /**
         * <p>The number of high-risk check items that pass the check.</p>
         */
        @NameInMap("PassHighCount")
        public Integer passHighCount;

        /**
         * <p>The number of low-risk check items that pass the check.</p>
         */
        @NameInMap("PassLowCount")
        public Integer passLowCount;

        /**
         * <p>The number of medium-risk check items that pass the check.</p>
         */
        @NameInMap("PassMediumCount")
        public Integer passMediumCount;

        public static GetCheckSummaryResponseBodySummarysTypeStatistic build(java.util.Map<String, ?> map) throws Exception {
            GetCheckSummaryResponseBodySummarysTypeStatistic self = new GetCheckSummaryResponseBodySummarysTypeStatistic();
            return TeaModel.build(map, self);
        }

        public GetCheckSummaryResponseBodySummarysTypeStatistic setNotCheckCount(Integer notCheckCount) {
            this.notCheckCount = notCheckCount;
            return this;
        }
        public Integer getNotCheckCount() {
            return this.notCheckCount;
        }

        public GetCheckSummaryResponseBodySummarysTypeStatistic setNotCheckHighCount(Integer notCheckHighCount) {
            this.notCheckHighCount = notCheckHighCount;
            return this;
        }
        public Integer getNotCheckHighCount() {
            return this.notCheckHighCount;
        }

        public GetCheckSummaryResponseBodySummarysTypeStatistic setNotCheckLowCount(Integer notCheckLowCount) {
            this.notCheckLowCount = notCheckLowCount;
            return this;
        }
        public Integer getNotCheckLowCount() {
            return this.notCheckLowCount;
        }

        public GetCheckSummaryResponseBodySummarysTypeStatistic setNotCheckMediumCount(Integer notCheckMediumCount) {
            this.notCheckMediumCount = notCheckMediumCount;
            return this;
        }
        public Integer getNotCheckMediumCount() {
            return this.notCheckMediumCount;
        }

        public GetCheckSummaryResponseBodySummarysTypeStatistic setNotPassCount(Integer notPassCount) {
            this.notPassCount = notPassCount;
            return this;
        }
        public Integer getNotPassCount() {
            return this.notPassCount;
        }

        public GetCheckSummaryResponseBodySummarysTypeStatistic setNotPassHighCount(Integer notPassHighCount) {
            this.notPassHighCount = notPassHighCount;
            return this;
        }
        public Integer getNotPassHighCount() {
            return this.notPassHighCount;
        }

        public GetCheckSummaryResponseBodySummarysTypeStatistic setNotPassLowCount(Integer notPassLowCount) {
            this.notPassLowCount = notPassLowCount;
            return this;
        }
        public Integer getNotPassLowCount() {
            return this.notPassLowCount;
        }

        public GetCheckSummaryResponseBodySummarysTypeStatistic setNotPassMediumCount(Integer notPassMediumCount) {
            this.notPassMediumCount = notPassMediumCount;
            return this;
        }
        public Integer getNotPassMediumCount() {
            return this.notPassMediumCount;
        }

        public GetCheckSummaryResponseBodySummarysTypeStatistic setPassCount(Integer passCount) {
            this.passCount = passCount;
            return this;
        }
        public Integer getPassCount() {
            return this.passCount;
        }

        public GetCheckSummaryResponseBodySummarysTypeStatistic setPassHighCount(Integer passHighCount) {
            this.passHighCount = passHighCount;
            return this;
        }
        public Integer getPassHighCount() {
            return this.passHighCount;
        }

        public GetCheckSummaryResponseBodySummarysTypeStatistic setPassLowCount(Integer passLowCount) {
            this.passLowCount = passLowCount;
            return this;
        }
        public Integer getPassLowCount() {
            return this.passLowCount;
        }

        public GetCheckSummaryResponseBodySummarysTypeStatistic setPassMediumCount(Integer passMediumCount) {
            this.passMediumCount = passMediumCount;
            return this;
        }
        public Integer getPassMediumCount() {
            return this.passMediumCount;
        }

    }

    public static class GetCheckSummaryResponseBodySummarys extends TeaModel {
        /**
         * <p>The number of detected risk items.</p>
         */
        @NameInMap("FailCount")
        public Integer failCount;

        /**
         * <p>The number of check items that pass the check.</p>
         */
        @NameInMap("PassCount")
        public Long passCount;

        /**
         * <p>The information about the check items.</p>
         */
        @NameInMap("Standards")
        public java.util.List<GetCheckSummaryResponseBodySummarysStandards> standards;

        /**
         * <p>The type of the check item. Valid values:</p>
         * <br>
         * <p>*   **COMPLIANCE**: compliance</p>
         * <p>*   **RISK**: security risk</p>
         * <p>*   **IDENTITY_PERMISSION**: identity and permission</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The risk statistics by type.</p>
         */
        @NameInMap("TypeStatistic")
        public GetCheckSummaryResponseBodySummarysTypeStatistic typeStatistic;

        public static GetCheckSummaryResponseBodySummarys build(java.util.Map<String, ?> map) throws Exception {
            GetCheckSummaryResponseBodySummarys self = new GetCheckSummaryResponseBodySummarys();
            return TeaModel.build(map, self);
        }

        public GetCheckSummaryResponseBodySummarys setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public GetCheckSummaryResponseBodySummarys setPassCount(Long passCount) {
            this.passCount = passCount;
            return this;
        }
        public Long getPassCount() {
            return this.passCount;
        }

        public GetCheckSummaryResponseBodySummarys setStandards(java.util.List<GetCheckSummaryResponseBodySummarysStandards> standards) {
            this.standards = standards;
            return this;
        }
        public java.util.List<GetCheckSummaryResponseBodySummarysStandards> getStandards() {
            return this.standards;
        }

        public GetCheckSummaryResponseBodySummarys setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCheckSummaryResponseBodySummarys setTypeStatistic(GetCheckSummaryResponseBodySummarysTypeStatistic typeStatistic) {
            this.typeStatistic = typeStatistic;
            return this;
        }
        public GetCheckSummaryResponseBodySummarysTypeStatistic getTypeStatistic() {
            return this.typeStatistic;
        }

    }

}
