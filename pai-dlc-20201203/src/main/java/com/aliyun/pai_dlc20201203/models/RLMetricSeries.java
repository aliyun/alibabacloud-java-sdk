// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLMetricSeries extends TeaModel {
    /**
     * <p>生效聚合策略，即使未降采样也返回</p>
     * 
     * <strong>example:</strong>
     * <p>Last</p>
     */
    @NameInMap("Aggregation")
    public String aggregation;

    /**
     * <p>是否为满足点数上限进行了等宽步数分桶</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Downsampled")
    public Boolean downsampled;

    /**
     * <p>本次查询的精确指标键</p>
     * 
     * <strong>example:</strong>
     * <p>actor/ppo_kl</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>按步数升序排列的有限数据点或聚合桶，同一步数取最新源事件。没有有限点时返回 []，不返回 null</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Step&quot;:1,&quot;GmtTime&quot;:&quot;2026-09-10T06:00:00Z&quot;,&quot;Value&quot;:0.012}]</p>
     */
    @NameInMap("Points")
    public java.util.List<RLMetricPoint> points;

    public static RLMetricSeries build(java.util.Map<String, ?> map) throws Exception {
        RLMetricSeries self = new RLMetricSeries();
        return TeaModel.build(map, self);
    }

    public RLMetricSeries setAggregation(String aggregation) {
        this.aggregation = aggregation;
        return this;
    }
    public String getAggregation() {
        return this.aggregation;
    }

    public RLMetricSeries setDownsampled(Boolean downsampled) {
        this.downsampled = downsampled;
        return this;
    }
    public Boolean getDownsampled() {
        return this.downsampled;
    }

    public RLMetricSeries setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public RLMetricSeries setPoints(java.util.List<RLMetricPoint> points) {
        this.points = points;
        return this;
    }
    public java.util.List<RLMetricPoint> getPoints() {
        return this.points;
    }

}
