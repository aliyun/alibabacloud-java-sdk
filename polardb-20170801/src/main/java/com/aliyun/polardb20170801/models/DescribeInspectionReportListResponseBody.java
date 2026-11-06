// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeInspectionReportListResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The list of inspection reports.</p>
     */
    @NameInMap("ReportItems")
    public java.util.List<DescribeInspectionReportListResponseBodyReportItems> reportItems;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The score returned by the inspection task.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("Score")
    public Integer score;

    /**
     * <p>The total number of reports that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeInspectionReportListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionReportListResponseBody self = new DescribeInspectionReportListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionReportListResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInspectionReportListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeInspectionReportListResponseBody setReportItems(java.util.List<DescribeInspectionReportListResponseBodyReportItems> reportItems) {
        this.reportItems = reportItems;
        return this;
    }
    public java.util.List<DescribeInspectionReportListResponseBodyReportItems> getReportItems() {
        return this.reportItems;
    }

    public DescribeInspectionReportListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInspectionReportListResponseBody setScore(Integer score) {
        this.score = score;
        return this;
    }
    public Integer getScore() {
        return this.score;
    }

    public DescribeInspectionReportListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInspectionReportListResponseBodyReportItemsSubItems extends TeaModel {
        /**
         * <p>The number of check items at the Critical level.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Critical")
        public Long critical;

        /**
         * <p>The number of check items at the Info level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Info")
        public Long info;

        /**
         * <p>The number of check items at the Normal level.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Normal")
        public Long normal;

        /**
         * <p>The number of check items at the Warning level.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Warning")
        public Long warning;

        public static DescribeInspectionReportListResponseBodyReportItemsSubItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInspectionReportListResponseBodyReportItemsSubItems self = new DescribeInspectionReportListResponseBodyReportItemsSubItems();
            return TeaModel.build(map, self);
        }

        public DescribeInspectionReportListResponseBodyReportItemsSubItems setCritical(Long critical) {
            this.critical = critical;
            return this;
        }
        public Long getCritical() {
            return this.critical;
        }

        public DescribeInspectionReportListResponseBodyReportItemsSubItems setInfo(Long info) {
            this.info = info;
            return this;
        }
        public Long getInfo() {
            return this.info;
        }

        public DescribeInspectionReportListResponseBodyReportItemsSubItems setNormal(Long normal) {
            this.normal = normal;
            return this;
        }
        public Long getNormal() {
            return this.normal;
        }

        public DescribeInspectionReportListResponseBodyReportItemsSubItems setWarning(Long warning) {
            this.warning = warning;
            return this;
        }
        public Long getWarning() {
            return this.warning;
        }

    }

    public static class DescribeInspectionReportListResponseBodyReportItems extends TeaModel {
        /**
         * <p>The ID of the inspected PolarDB cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>Indicates whether this is the latest inspection report. The value is returned as a string.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Latest")
        public String latest;

        /**
         * <p>The region ID of the inspected cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The detailed description of the inspection report.</p>
         * 
         * <strong>example:</strong>
         * <p>No critical risks were found in this inspection</p>
         */
        @NameInMap("ReportDescription")
        public String reportDescription;

        /**
         * <p>The ID of the inspection report.</p>
         * 
         * <strong>example:</strong>
         * <p>report-001</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        /**
         * <p>The score of the inspection report.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("ReportScore")
        public Long reportScore;

        /**
         * <p>The status of the inspection report.</p>
         * 
         * <strong>example:</strong>
         * <p>Completed</p>
         */
        @NameInMap("ReportStatus")
        public String reportStatus;

        /**
         * <p>The summary of the inspection report.</p>
         * 
         * <strong>example:</strong>
         * <p>The instance is running normally</p>
         */
        @NameInMap("ReportSummary")
        public String reportSummary;

        /**
         * <p>The time when the inspection report was generated. The time is in the yyyy-MM-dd HH:mm:ss format and is in the UTC+8 time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05 16:00:00</p>
         */
        @NameInMap("ReportTime")
        public String reportTime;

        /**
         * <p>The number of check items categorized by inspection result level.</p>
         */
        @NameInMap("SubItems")
        public java.util.List<DescribeInspectionReportListResponseBodyReportItemsSubItems> subItems;

        /**
         * <p>The ID of the inspection task.</p>
         * 
         * <strong>example:</strong>
         * <p>task-001</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeInspectionReportListResponseBodyReportItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInspectionReportListResponseBodyReportItems self = new DescribeInspectionReportListResponseBodyReportItems();
            return TeaModel.build(map, self);
        }

        public DescribeInspectionReportListResponseBodyReportItems setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeInspectionReportListResponseBodyReportItems setLatest(String latest) {
            this.latest = latest;
            return this;
        }
        public String getLatest() {
            return this.latest;
        }

        public DescribeInspectionReportListResponseBodyReportItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInspectionReportListResponseBodyReportItems setReportDescription(String reportDescription) {
            this.reportDescription = reportDescription;
            return this;
        }
        public String getReportDescription() {
            return this.reportDescription;
        }

        public DescribeInspectionReportListResponseBodyReportItems setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public DescribeInspectionReportListResponseBodyReportItems setReportScore(Long reportScore) {
            this.reportScore = reportScore;
            return this;
        }
        public Long getReportScore() {
            return this.reportScore;
        }

        public DescribeInspectionReportListResponseBodyReportItems setReportStatus(String reportStatus) {
            this.reportStatus = reportStatus;
            return this;
        }
        public String getReportStatus() {
            return this.reportStatus;
        }

        public DescribeInspectionReportListResponseBodyReportItems setReportSummary(String reportSummary) {
            this.reportSummary = reportSummary;
            return this;
        }
        public String getReportSummary() {
            return this.reportSummary;
        }

        public DescribeInspectionReportListResponseBodyReportItems setReportTime(String reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public String getReportTime() {
            return this.reportTime;
        }

        public DescribeInspectionReportListResponseBodyReportItems setSubItems(java.util.List<DescribeInspectionReportListResponseBodyReportItemsSubItems> subItems) {
            this.subItems = subItems;
            return this;
        }
        public java.util.List<DescribeInspectionReportListResponseBodyReportItemsSubItems> getSubItems() {
            return this.subItems;
        }

        public DescribeInspectionReportListResponseBodyReportItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
