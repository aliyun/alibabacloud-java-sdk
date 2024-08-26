// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DescribeNisInspectionReportSummaryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2024-06-03 09:36:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>nir-38abb318b27b49cc9a01</p>
     */
    @NameInMap("InspectionReportId")
    public String inspectionReportId;

    /**
     * <strong>example:</strong>
     * <p>ni-8svmpe0yso2bhzr7fh79</p>
     */
    @NameInMap("InspectionTaskId")
    public String inspectionTaskId;

    /**
     * <strong>example:</strong>
     * <p>4838F3F2-30E1-5D82-B25A-B9FE33BC3E25</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2024-06-03 09:35:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Summary")
    public DescribeNisInspectionReportSummaryResponseBodySummary summary;

    public static DescribeNisInspectionReportSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNisInspectionReportSummaryResponseBody self = new DescribeNisInspectionReportSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNisInspectionReportSummaryResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeNisInspectionReportSummaryResponseBody setInspectionReportId(String inspectionReportId) {
        this.inspectionReportId = inspectionReportId;
        return this;
    }
    public String getInspectionReportId() {
        return this.inspectionReportId;
    }

    public DescribeNisInspectionReportSummaryResponseBody setInspectionTaskId(String inspectionTaskId) {
        this.inspectionTaskId = inspectionTaskId;
        return this;
    }
    public String getInspectionTaskId() {
        return this.inspectionTaskId;
    }

    public DescribeNisInspectionReportSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNisInspectionReportSummaryResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeNisInspectionReportSummaryResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeNisInspectionReportSummaryResponseBody setSummary(DescribeNisInspectionReportSummaryResponseBodySummary summary) {
        this.summary = summary;
        return this;
    }
    public DescribeNisInspectionReportSummaryResponseBodySummary getSummary() {
        return this.summary;
    }

    public static class DescribeNisInspectionReportSummaryResponseBodySummaryPassRateSummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.98</p>
         */
        @NameInMap("PassRate")
        public Double passRate;

        /**
         * <strong>example:</strong>
         * <p>Stability</p>
         */
        @NameInMap("PassRateScope")
        public String passRateScope;

        public static DescribeNisInspectionReportSummaryResponseBodySummaryPassRateSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeNisInspectionReportSummaryResponseBodySummaryPassRateSummary self = new DescribeNisInspectionReportSummaryResponseBodySummaryPassRateSummary();
            return TeaModel.build(map, self);
        }

        public DescribeNisInspectionReportSummaryResponseBodySummaryPassRateSummary setPassRate(Double passRate) {
            this.passRate = passRate;
            return this;
        }
        public Double getPassRate() {
            return this.passRate;
        }

        public DescribeNisInspectionReportSummaryResponseBodySummaryPassRateSummary setPassRateScope(String passRateScope) {
            this.passRateScope = passRateScope;
            return this;
        }
        public String getPassRateScope() {
            return this.passRateScope;
        }

    }

    public static class DescribeNisInspectionReportSummaryResponseBodySummaryRiskSummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResourceCount")
        public Integer resourceCount;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RiskCount")
        public Integer riskCount;

        /**
         * <strong>example:</strong>
         * <p>HighRisk</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <strong>example:</strong>
         * <p>StabilityRisk</p>
         */
        @NameInMap("RiskType")
        public String riskType;

        public static DescribeNisInspectionReportSummaryResponseBodySummaryRiskSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeNisInspectionReportSummaryResponseBodySummaryRiskSummary self = new DescribeNisInspectionReportSummaryResponseBodySummaryRiskSummary();
            return TeaModel.build(map, self);
        }

        public DescribeNisInspectionReportSummaryResponseBodySummaryRiskSummary setResourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Integer getResourceCount() {
            return this.resourceCount;
        }

        public DescribeNisInspectionReportSummaryResponseBodySummaryRiskSummary setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

        public DescribeNisInspectionReportSummaryResponseBodySummaryRiskSummary setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeNisInspectionReportSummaryResponseBodySummaryRiskSummary setRiskType(String riskType) {
            this.riskType = riskType;
            return this;
        }
        public String getRiskType() {
            return this.riskType;
        }

    }

    public static class DescribeNisInspectionReportSummaryResponseBodySummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("CheckItemCount")
        public Integer checkItemCount;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CheckResourceCount")
        public Integer checkResourceCount;

        @NameInMap("PassRateSummary")
        public java.util.List<DescribeNisInspectionReportSummaryResponseBodySummaryPassRateSummary> passRateSummary;

        @NameInMap("RiskSummary")
        public java.util.List<DescribeNisInspectionReportSummaryResponseBodySummaryRiskSummary> riskSummary;

        public static DescribeNisInspectionReportSummaryResponseBodySummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeNisInspectionReportSummaryResponseBodySummary self = new DescribeNisInspectionReportSummaryResponseBodySummary();
            return TeaModel.build(map, self);
        }

        public DescribeNisInspectionReportSummaryResponseBodySummary setCheckItemCount(Integer checkItemCount) {
            this.checkItemCount = checkItemCount;
            return this;
        }
        public Integer getCheckItemCount() {
            return this.checkItemCount;
        }

        public DescribeNisInspectionReportSummaryResponseBodySummary setCheckResourceCount(Integer checkResourceCount) {
            this.checkResourceCount = checkResourceCount;
            return this;
        }
        public Integer getCheckResourceCount() {
            return this.checkResourceCount;
        }

        public DescribeNisInspectionReportSummaryResponseBodySummary setPassRateSummary(java.util.List<DescribeNisInspectionReportSummaryResponseBodySummaryPassRateSummary> passRateSummary) {
            this.passRateSummary = passRateSummary;
            return this;
        }
        public java.util.List<DescribeNisInspectionReportSummaryResponseBodySummaryPassRateSummary> getPassRateSummary() {
            return this.passRateSummary;
        }

        public DescribeNisInspectionReportSummaryResponseBodySummary setRiskSummary(java.util.List<DescribeNisInspectionReportSummaryResponseBodySummaryRiskSummary> riskSummary) {
            this.riskSummary = riskSummary;
            return this;
        }
        public java.util.List<DescribeNisInspectionReportSummaryResponseBodySummaryRiskSummary> getRiskSummary() {
            return this.riskSummary;
        }

    }

}
