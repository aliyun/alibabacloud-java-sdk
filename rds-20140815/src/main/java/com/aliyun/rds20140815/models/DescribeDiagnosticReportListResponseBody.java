// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticReportListResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The details of a diagnostic report.</p>
     */
    @NameInMap("ReportList")
    public java.util.List<DescribeDiagnosticReportListResponseBodyReportList> reportList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDiagnosticReportListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticReportListResponseBody self = new DescribeDiagnosticReportListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosticReportListResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDiagnosticReportListResponseBody setReportList(java.util.List<DescribeDiagnosticReportListResponseBodyReportList> reportList) {
        this.reportList = reportList;
        return this;
    }
    public java.util.List<DescribeDiagnosticReportListResponseBodyReportList> getReportList() {
        return this.reportList;
    }

    public DescribeDiagnosticReportListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDiagnosticReportListResponseBodyReportList extends TeaModel {
        /**
         * <p>The time when the diagnosis was performed.</p>
         */
        @NameInMap("DiagnosticTime")
        public String diagnosticTime;

        /**
         * <p>The URL that is used to download the backup set over the Internet. If the backup set cannot be downloaded, an empty string is returned.</p>
         */
        @NameInMap("DownloadURL")
        public String downloadURL;

        /**
         * <p>The end time of the monitoring data.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The diagnostic score.</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The start time of the monitoring data.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeDiagnosticReportListResponseBodyReportList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosticReportListResponseBodyReportList self = new DescribeDiagnosticReportListResponseBodyReportList();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosticReportListResponseBodyReportList setDiagnosticTime(String diagnosticTime) {
            this.diagnosticTime = diagnosticTime;
            return this;
        }
        public String getDiagnosticTime() {
            return this.diagnosticTime;
        }

        public DescribeDiagnosticReportListResponseBodyReportList setDownloadURL(String downloadURL) {
            this.downloadURL = downloadURL;
            return this;
        }
        public String getDownloadURL() {
            return this.downloadURL;
        }

        public DescribeDiagnosticReportListResponseBodyReportList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDiagnosticReportListResponseBodyReportList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public DescribeDiagnosticReportListResponseBodyReportList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
