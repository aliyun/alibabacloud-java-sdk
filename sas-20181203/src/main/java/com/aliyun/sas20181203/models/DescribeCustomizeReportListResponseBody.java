// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomizeReportListResponseBody extends TeaModel {
    /**
     * <p>The reports.</p>
     */
    @NameInMap("ReportList")
    public java.util.List<DescribeCustomizeReportListResponseBodyReportList> reportList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9FBC6E47-7508-58C9-9E76-528E118CB1CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCustomizeReportListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizeReportListResponseBody self = new DescribeCustomizeReportListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizeReportListResponseBody setReportList(java.util.List<DescribeCustomizeReportListResponseBodyReportList> reportList) {
        this.reportList = reportList;
        return this;
    }
    public java.util.List<DescribeCustomizeReportListResponseBodyReportList> getReportList() {
        return this.reportList;
    }

    public DescribeCustomizeReportListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCustomizeReportListResponseBodyReportList extends TeaModel {
        /**
         * <p>Indicates whether the report is the default report. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsDefault")
        public String isDefault;

        /**
         * <p>The timestamp when the report is pinned. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1721836800000</p>
         */
        @NameInMap("PinnedTime")
        public Long pinnedTime;

        /**
         * <p>The most recent days for report statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("ReportDays")
        public Integer reportDays;

        /**
         * <p>The end date on which the report is sent. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1721923199999</p>
         */
        @NameInMap("ReportEndDate")
        public Long reportEndDate;

        /**
         * <p>The ID of the report.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReportId")
        public Long reportId;

        /**
         * <p>The start date on which the report is sent. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1721836800000</p>
         */
        @NameInMap("ReportStartDate")
        public Long reportStartDate;

        /**
         * <p>The state of the report. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReportStatus")
        public String reportStatus;

        /**
         * <p>The type of the report. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: daily report</li>
         * <li><strong>1</strong>: weekly report</li>
         * <li><strong>2</strong>: monthly report</li>
         * <li><strong>3</strong>: report whose statistics are collected in a custom time range</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReportType")
        public Integer reportType;

        /**
         * <p>The report version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        @NameInMap("ReportVersion")
        public String reportVersion;

        /**
         * <p>The name of the report.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Title")
        public String title;

        public static DescribeCustomizeReportListResponseBodyReportList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomizeReportListResponseBodyReportList self = new DescribeCustomizeReportListResponseBodyReportList();
            return TeaModel.build(map, self);
        }

        public DescribeCustomizeReportListResponseBodyReportList setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public DescribeCustomizeReportListResponseBodyReportList setPinnedTime(Long pinnedTime) {
            this.pinnedTime = pinnedTime;
            return this;
        }
        public Long getPinnedTime() {
            return this.pinnedTime;
        }

        public DescribeCustomizeReportListResponseBodyReportList setReportDays(Integer reportDays) {
            this.reportDays = reportDays;
            return this;
        }
        public Integer getReportDays() {
            return this.reportDays;
        }

        public DescribeCustomizeReportListResponseBodyReportList setReportEndDate(Long reportEndDate) {
            this.reportEndDate = reportEndDate;
            return this;
        }
        public Long getReportEndDate() {
            return this.reportEndDate;
        }

        public DescribeCustomizeReportListResponseBodyReportList setReportId(Long reportId) {
            this.reportId = reportId;
            return this;
        }
        public Long getReportId() {
            return this.reportId;
        }

        public DescribeCustomizeReportListResponseBodyReportList setReportStartDate(Long reportStartDate) {
            this.reportStartDate = reportStartDate;
            return this;
        }
        public Long getReportStartDate() {
            return this.reportStartDate;
        }

        public DescribeCustomizeReportListResponseBodyReportList setReportStatus(String reportStatus) {
            this.reportStatus = reportStatus;
            return this;
        }
        public String getReportStatus() {
            return this.reportStatus;
        }

        public DescribeCustomizeReportListResponseBodyReportList setReportType(Integer reportType) {
            this.reportType = reportType;
            return this;
        }
        public Integer getReportType() {
            return this.reportType;
        }

        public DescribeCustomizeReportListResponseBodyReportList setReportVersion(String reportVersion) {
            this.reportVersion = reportVersion;
            return this;
        }
        public String getReportVersion() {
            return this.reportVersion;
        }

        public DescribeCustomizeReportListResponseBodyReportList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
