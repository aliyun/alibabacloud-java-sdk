// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticReportListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ReportList")
    @Validation(required = true)
    public java.util.List<DescribeDiagnosticReportListResponseReportList> reportList;

    public static DescribeDiagnosticReportListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticReportListResponse self = new DescribeDiagnosticReportListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosticReportListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiagnosticReportListResponse setReportList(java.util.List<DescribeDiagnosticReportListResponseReportList> reportList) {
        this.reportList = reportList;
        return this;
    }
    public java.util.List<DescribeDiagnosticReportListResponseReportList> getReportList() {
        return this.reportList;
    }

    public static class DescribeDiagnosticReportListResponseReportList extends TeaModel {
        @NameInMap("DiagnosticTime")
        @Validation(required = true)
        public String diagnosticTime;

        @NameInMap("Score")
        @Validation(required = true)
        public Integer score;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("DownloadURL")
        @Validation(required = true)
        public String downloadURL;

        public static DescribeDiagnosticReportListResponseReportList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosticReportListResponseReportList self = new DescribeDiagnosticReportListResponseReportList();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosticReportListResponseReportList setDiagnosticTime(String diagnosticTime) {
            this.diagnosticTime = diagnosticTime;
            return this;
        }
        public String getDiagnosticTime() {
            return this.diagnosticTime;
        }

        public DescribeDiagnosticReportListResponseReportList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public DescribeDiagnosticReportListResponseReportList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDiagnosticReportListResponseReportList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDiagnosticReportListResponseReportList setDownloadURL(String downloadURL) {
            this.downloadURL = downloadURL;
            return this;
        }
        public String getDownloadURL() {
            return this.downloadURL;
        }

    }

}
