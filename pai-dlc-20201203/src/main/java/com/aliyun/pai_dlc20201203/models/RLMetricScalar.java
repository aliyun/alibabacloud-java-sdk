// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLMetricScalar extends TeaModel {
    /**
     * <p>该标量的源事件时间，UTC RFC3339，秒精度</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-10T06:00:00Z</p>
     */
    @NameInMap("GmtTime")
    public String gmtTime;

    /**
     * <p>精确且区分大小写的原生指标键</p>
     * 
     * <strong>example:</strong>
     * <p>actor/ppo_kl</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>该指标在生效日志窗口内最高已观测步数，0 有效；稀疏指标的步数可以不同</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Step")
    public Long step;

    /**
     * <p>最新已观测值；空值或非有限值为 null，不回退到较早有限值，也不填 0。完整读取时为 Available，空值本身不产生原因码；查询受限或记录损坏时仍为 Partial</p>
     * 
     * <strong>example:</strong>
     * <p>0.012</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Value")
    public Double value;

    public static RLMetricScalar build(java.util.Map<String, ?> map) throws Exception {
        RLMetricScalar self = new RLMetricScalar();
        return TeaModel.build(map, self);
    }

    public RLMetricScalar setGmtTime(String gmtTime) {
        this.gmtTime = gmtTime;
        return this;
    }
    public String getGmtTime() {
        return this.gmtTime;
    }

    public RLMetricScalar setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public RLMetricScalar setStep(Long step) {
        this.step = step;
        return this;
    }
    public Long getStep() {
        return this.step;
    }

    public RLMetricScalar setValue(Double value) {
        this.value = value;
        return this;
    }
    public Double getValue() {
        return this.value;
    }

}
