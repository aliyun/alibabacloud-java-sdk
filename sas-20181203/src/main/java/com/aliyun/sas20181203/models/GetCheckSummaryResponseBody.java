// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("FailCount")
        public Integer failCount;

        @NameInMap("Id")
        public Long id;

        @NameInMap("PassCount")
        public Integer passCount;

        @NameInMap("RiskLevelHighCount")
        public Integer riskLevelHighCount;

        @NameInMap("RiskLevelLowCount")
        public Integer riskLevelLowCount;

        @NameInMap("RiskLevelMediumCount")
        public Integer riskLevelMediumCount;

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
        @NameInMap("FailCount")
        public Integer failCount;

        @NameInMap("PassCount")
        public Long passCount;

        @NameInMap("Standards")
        public java.util.List<GetCheckSummaryResponseBodySummarysStandards> standards;

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
