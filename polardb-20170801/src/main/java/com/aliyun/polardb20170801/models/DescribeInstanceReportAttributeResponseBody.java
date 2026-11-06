// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeInstanceReportAttributeResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the report is the latest one.</p>
     */
    @NameInMap("Latest")
    public Boolean latest;

    /**
     * <p>The detailed description of the inspection report.</p>
     * 
     * <strong>example:</strong>
     * <p>No critical risks were found in this inspection</p>
     */
    @NameInMap("ReportDescription")
    public String reportDescription;

    /**
     * <p>The ID of the instance inspection report.</p>
     * 
     * <strong>example:</strong>
     * <p>report-001</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>The overall score of the inspection report.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("ReportScore")
    public Long reportScore;

    /**
     * <p>The generation status of the inspection report.</p>
     * 
     * <strong>example:</strong>
     * <p>Completed</p>
     */
    @NameInMap("ReportStatus")
    public String reportStatus;

    /**
     * <p>The inspection results for each item in the report.</p>
     */
    @NameInMap("ReportSubItems")
    public java.util.List<DescribeInstanceReportAttributeResponseBodyReportSubItems> reportSubItems;

    /**
     * <p>The overall summary of the inspection report.</p>
     * 
     * <strong>example:</strong>
     * <p>The instance is running normally</p>
     */
    @NameInMap("ReportSummary")
    public String reportSummary;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the inspection task that generated the report.</p>
     * 
     * <strong>example:</strong>
     * <p>task-001</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeInstanceReportAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceReportAttributeResponseBody self = new DescribeInstanceReportAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceReportAttributeResponseBody setLatest(Boolean latest) {
        this.latest = latest;
        return this;
    }
    public Boolean getLatest() {
        return this.latest;
    }

    public DescribeInstanceReportAttributeResponseBody setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
        return this;
    }
    public String getReportDescription() {
        return this.reportDescription;
    }

    public DescribeInstanceReportAttributeResponseBody setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public DescribeInstanceReportAttributeResponseBody setReportScore(Long reportScore) {
        this.reportScore = reportScore;
        return this;
    }
    public Long getReportScore() {
        return this.reportScore;
    }

    public DescribeInstanceReportAttributeResponseBody setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
        return this;
    }
    public String getReportStatus() {
        return this.reportStatus;
    }

    public DescribeInstanceReportAttributeResponseBody setReportSubItems(java.util.List<DescribeInstanceReportAttributeResponseBodyReportSubItems> reportSubItems) {
        this.reportSubItems = reportSubItems;
        return this;
    }
    public java.util.List<DescribeInstanceReportAttributeResponseBodyReportSubItems> getReportSubItems() {
        return this.reportSubItems;
    }

    public DescribeInstanceReportAttributeResponseBody setReportSummary(String reportSummary) {
        this.reportSummary = reportSummary;
        return this;
    }
    public String getReportSummary() {
        return this.reportSummary;
    }

    public DescribeInstanceReportAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceReportAttributeResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class DescribeInstanceReportAttributeResponseBodyReportSubItems extends TeaModel {
        /**
         * <p>The risk level of the inspection item.</p>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The score of the inspection item.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Score")
        public Long score;

        /**
         * <p>The name of the inspection skill that generated the result.</p>
         * 
         * <strong>example:</strong>
         * <p>performance</p>
         */
        @NameInMap("SkillName")
        public String skillName;

        /**
         * <p>The result summary of the inspection item.</p>
         * 
         * <strong>example:</strong>
         * <p>No anomalies found</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static DescribeInstanceReportAttributeResponseBodyReportSubItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceReportAttributeResponseBodyReportSubItems self = new DescribeInstanceReportAttributeResponseBodyReportSubItems();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceReportAttributeResponseBodyReportSubItems setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeInstanceReportAttributeResponseBodyReportSubItems setScore(Long score) {
            this.score = score;
            return this;
        }
        public Long getScore() {
            return this.score;
        }

        public DescribeInstanceReportAttributeResponseBodyReportSubItems setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

        public DescribeInstanceReportAttributeResponseBodyReportSubItems setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

}
