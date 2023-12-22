// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ReportABMetricGroupResponseBody extends TeaModel {
    @NameInMap("ExperimentReport")
    public java.util.Map<String, ExperimentReportValue> experimentReport;

    @NameInMap("GroupDimension")
    public java.util.List<String> groupDimension;

    @NameInMap("RequestId")
    public String requestId;

    public static ReportABMetricGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportABMetricGroupResponseBody self = new ReportABMetricGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportABMetricGroupResponseBody setExperimentReport(java.util.Map<String, ExperimentReportValue> experimentReport) {
        this.experimentReport = experimentReport;
        return this;
    }
    public java.util.Map<String, ExperimentReportValue> getExperimentReport() {
        return this.experimentReport;
    }

    public ReportABMetricGroupResponseBody setGroupDimension(java.util.List<String> groupDimension) {
        this.groupDimension = groupDimension;
        return this;
    }
    public java.util.List<String> getGroupDimension() {
        return this.groupDimension;
    }

    public ReportABMetricGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
