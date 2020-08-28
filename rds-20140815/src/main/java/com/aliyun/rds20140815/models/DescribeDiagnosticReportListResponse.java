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

    }

}
