// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseInstanceMetricDataResponseBody extends TeaModel {
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("MetricData")
    public String metricData;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Unit")
    public String unit;

    public static DescribeDatabaseInstanceMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabaseInstanceMetricDataResponseBody self = new DescribeDatabaseInstanceMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDatabaseInstanceMetricDataResponseBody setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public DescribeDatabaseInstanceMetricDataResponseBody setMetricData(String metricData) {
        this.metricData = metricData;
        return this;
    }
    public String getMetricData() {
        return this.metricData;
    }

    public DescribeDatabaseInstanceMetricDataResponseBody setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeDatabaseInstanceMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDatabaseInstanceMetricDataResponseBody setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
