// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotNodeMetricListRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Valid values:</p>
     * <ul>
     * <li>UNIX timestamp: the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC</li>
     * <li>Date format: YYYY-MM-DDThh:mm:ssZ</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2019-01-30 00:10:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The expression that is used to compute the query results in real time.</p>
     * <blockquote>
     * <p> Only the groupby expression is supported. This expression is similar to the GROUP BY statement that applies to databases.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;groupby&quot;:[&quot;userId&quot;,&quot;instanceId&quot;]}</p>
     */
    @NameInMap("Express")
    public String express;

    /**
     * <p>The number of entries per page.</p>
     * <blockquote>
     * <p> The maximum value of the Length parameter in a request is 1440.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Length")
    public String length;

    /**
     * <p>The metric that is used to monitor the cloud service.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_total</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The namespace of the cloud service. Format: acs_cloud service name.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The management node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cc427e14-f257-4670-9d2b-d83bbbe7****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The time interval. Unit: seconds. Valid values: 60, 300, and 900.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The beginning of the time range to query. The following formats are supported:</p>
     * <ul>
     * <li>UNIX timestamp: the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC</li>
     * <li>Date format: YYYY-MM-DDThh:mm:ssZ</li>
     * <li>The interval between the start time and the end time is less than or equal to 31 days.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2019-01-30 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetHoneypotNodeMetricListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotNodeMetricListRequest self = new GetHoneypotNodeMetricListRequest();
        return TeaModel.build(map, self);
    }

    public GetHoneypotNodeMetricListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetHoneypotNodeMetricListRequest setExpress(String express) {
        this.express = express;
        return this;
    }
    public String getExpress() {
        return this.express;
    }

    public GetHoneypotNodeMetricListRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public GetHoneypotNodeMetricListRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public GetHoneypotNodeMetricListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetHoneypotNodeMetricListRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetHoneypotNodeMetricListRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public GetHoneypotNodeMetricListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
