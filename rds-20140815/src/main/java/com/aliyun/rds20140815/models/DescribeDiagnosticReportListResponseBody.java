// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticReportListResponseBody extends TeaModel {
    @NameInMap("ReportList")
    public java.util.List<DescribeDiagnosticReportListResponseBodyReportList> reportList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDiagnosticReportListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticReportListResponseBody self = new DescribeDiagnosticReportListResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("DiagnosticTime")
        public String diagnosticTime;

        @NameInMap("DownloadURL")
        public String downloadURL;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Score")
        public Integer score;

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
