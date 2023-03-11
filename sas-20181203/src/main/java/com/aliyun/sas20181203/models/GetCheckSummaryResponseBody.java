// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckSummaryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the summary information about the configuration checks on cloud services.</p>
     */
    @NameInMap("Summarys")
    public java.util.List<GetCheckSummaryResponseBodySummarys> summarys;

    public static GetCheckSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCheckSummaryResponseBody self = new GetCheckSummaryResponseBody();
        return TeaModel.build(map, self);
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

    public static class GetCheckSummaryResponseBodySummarysStandards extends TeaModel {
        /**
         * <p>The number of risk items.</p>
         */
        @NameInMap("FailCount")
        public Integer failCount;

        /**
         * <p>The ID of the check item.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The number of passed check items.</p>
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
         * <p>An array that consist of the standard IDs of check items.</p>
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

    }

}
