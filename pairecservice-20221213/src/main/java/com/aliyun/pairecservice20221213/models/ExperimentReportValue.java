// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ExperimentReportValue extends TeaModel {
    @NameInMap("Baseline")
    public Boolean baseline;

    @NameInMap("MetricResults")
    public java.util.Map<String, java.util.Map<String, ?>> metricResults;

    public static ExperimentReportValue build(java.util.Map<String, ?> map) throws Exception {
        ExperimentReportValue self = new ExperimentReportValue();
        return TeaModel.build(map, self);
    }

    public ExperimentReportValue setBaseline(Boolean baseline) {
        this.baseline = baseline;
        return this;
    }
    public Boolean getBaseline() {
        return this.baseline;
    }

    public ExperimentReportValue setMetricResults(java.util.Map<String, java.util.Map<String, ?>> metricResults) {
        this.metricResults = metricResults;
        return this;
    }
    public java.util.Map<String, java.util.Map<String, ?>> getMetricResults() {
        return this.metricResults;
    }

}
