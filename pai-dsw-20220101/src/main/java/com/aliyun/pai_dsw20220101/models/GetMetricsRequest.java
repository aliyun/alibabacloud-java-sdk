// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetMetricsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;userId&quot;:&quot;16122852825*****&quot;,&quot;jobId&quot;:&quot;dsw-328d2bbf605*****&quot;,&quot;regionId&quot;:&quot;cn-wulanchabu&quot;,&quot;pod&quot;:&quot;dsw-45680-76766f8778-95gxh&quot;}</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <strong>example:</strong>
     * <p>2020-11-08T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Length")
    public String length;

    /**
     * <strong>example:</strong>
     * <p>INSTANCE_SPEC_MEMORY_SWAP</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <strong>example:</strong>
     * <p>acs_pai_dsw</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <strong>example:</strong>
     * <p>15761485350009dd70bb64cff1f0fff750b08ffff073be5fb1e785e2b020f1a949d5ea14aea7fed82f01dd8****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <strong>example:</strong>
     * <p>2020-11-08T15:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

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

}
