// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetMetricsRequest extends TeaModel {
    /**
     * <p>(Required) The request parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;jobId\&quot;:\&quot;dlcdpfpc96mh63mg\&quot;,\&quot;pod\&quot;:\&quot;dlcdpfpc96mh63mg-worker-748\&quot;,\&quot;regionId\&quot;:\&quot;cn-wulanchabu\&quot;,\&quot;userId\&quot;:\&quot;1458867964644701\&quot;}]</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <p>The end time of the query. Default value: the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-09T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dlckjd5hm84tmjec</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The number of entries per query. This parameter is used for paged query with paging. Default value: 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("Length")
    public String length;

    /**
     * <p>The metric name. Not populated. Not in use.</p>
     * 
     * <strong>example:</strong>
     * <p>JOB_MEMORY_FREE</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The data namespace of the cloud service. For information about the data namespaces of cloud services, see cloud service monitoring items.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_pai_dlc</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The pagination token. If you do not set this parameter, data on the first page is returned. If a value is returned for this parameter, more pages are available. You can set NextToken to the returned value to retrieve the next page. Repeat this process until a null value is returned, which indicates that all data has been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>2c6b65b6f9d625d4716568ca19b2064be0b5e8707e68181f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The statistical period of the monitoring data. Unit: seconds. Valid values: 15, 60, 900, and 3600.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The start time (UTC) of the time range for querying monitoring data. Default value: one hour before the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The temporary token used for authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>eyXXXX-XXXX.XXXXX</p>
     */
    @NameInMap("Token")
    public String token;

    public static GetMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetricsRequest self = new GetMetricsRequest();
        return TeaModel.build(map, self);
    }

    public GetMetricsRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public GetMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetMetricsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetMetricsRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public GetMetricsRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public GetMetricsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetMetricsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetMetricsRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public GetMetricsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetMetricsRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
