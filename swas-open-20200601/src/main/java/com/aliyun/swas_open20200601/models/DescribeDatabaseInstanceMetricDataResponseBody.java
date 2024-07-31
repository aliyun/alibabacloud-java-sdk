// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseInstanceMetricDataResponseBody extends TeaModel {
    /**
     * <p>The data format. Valid values:</p>
     * <ul>
     * <li>cpuusage\&amp;memusage</li>
     * <li>active_session\&amp;total_session</li>
     * <li>ins_size\&amp;data_size\&amp;log_size\&amp;tmp_size\&amp;other_size</li>
     * <li>io</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cpuusage&amp;memusage</p>
     */
    @NameInMap("DataFormat")
    public String dataFormat;

    /**
     * <p>The monitoring data.</p>
     * 
     * <strong>example:</strong>
     * <p>[  {     \&quot;date&quot;\: &quot; 2022-09-06T04:04:00Z&quot;,\&quot;value\&quot;:\&quot;0.77&amp;3.69\&quot;  } ]</p>
     */
    @NameInMap("MetricData")
    public String metricData;

    /**
     * <p>The name of the metric. Valid values:</p>
     * <ul>
     * <li>MySQL_MemCpuUsage: The CPU utilization and memory usage of the instance within the entire operating system.</li>
     * <li>MySQL_DetailedSpaceUsage: The total space usage, data space, log space, temporary space, and system space of the instance.</li>
     * <li>MySQL_Sessions : The total number of active connections.</li>
     * <li>MySQL_IOPS: The IOPS of the instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL_MemCpuUsage</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The unit of the monitoring metric.</p>
     * <ul>
     * <li>%</li>
     * <li>int</li>
     * <li>MB</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>%</p>
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
