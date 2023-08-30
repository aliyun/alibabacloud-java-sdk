// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseInstanceMetricDataResponseBody extends TeaModel {
    /**
     * <p>The data format. Valid values:</p>
     * <br>
     * <p>*   cpuusage\&memusage</p>
     * <p>*   active_session\&total_session</p>
     * <p>*   ins_size\&data_size\&log_size\&tmp_size\&other_size</p>
     * <p>*   io</p>
     */
    @NameInMap("DataFormat")
    public String dataFormat;

    /**
     * <p>The monitoring data.</p>
     */
    @NameInMap("MetricData")
    public String metricData;

    /**
     * <p>The name of the metric. Valid values:</p>
     * <br>
     * <p>*   MySQL_MemCpuUsage: The CPU utilization and memory usage of the instance within the entire operating system.</p>
     * <p>*   MySQL_DetailedSpaceUsage: The total space usage, data space, log space, temporary space, and system space of the instance.</p>
     * <p>*   MySQL_Sessions : The total number of active connections.</p>
     * <p>*   MySQL_IOPS: The IOPS of the instance.</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The unit of the monitoring metric.</p>
     * <br>
     * <p>*   %</p>
     * <p>*   int</p>
     * <p>*   MB</p>
     */
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
