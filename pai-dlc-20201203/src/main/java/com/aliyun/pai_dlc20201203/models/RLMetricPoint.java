// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLMetricPoint extends TeaModel {
    /**
     * <p>UTC RFC3339，秒精度；聚合桶使用最后一个有效源点的时间，不表示极值发生时间</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-10T06:00:00Z</p>
     */
    @NameInMap("GmtTime")
    public String gmtTime;

    /**
     * <p>去重且排除非有限值后的有效源点数，正整数；仅聚合桶返回</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SampleCount")
    public Long sampleCount;

    /**
     * <p>桶内有效点的最小步数，包含；仅聚合桶返回</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StartStep")
    public Long startStep;

    /**
     * <p>非负框架步数，0 有效；聚合桶使用最后一个有效源点的步数</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Step")
    public Long step;

    /**
     * <p>原始有限数值或桶聚合结果。非有限点省略；缺失区间不补点或填 0</p>
     * 
     * <strong>example:</strong>
     * <p>0.012</p>
     */
    @NameInMap("Value")
    public Double value;

    public static RLMetricPoint build(java.util.Map<String, ?> map) throws Exception {
        RLMetricPoint self = new RLMetricPoint();
        return TeaModel.build(map, self);
    }

    public RLMetricPoint setGmtTime(String gmtTime) {
        this.gmtTime = gmtTime;
        return this;
    }
    public String getGmtTime() {
        return this.gmtTime;
    }

    public RLMetricPoint setSampleCount(Long sampleCount) {
        this.sampleCount = sampleCount;
        return this;
    }
    public Long getSampleCount() {
        return this.sampleCount;
    }

    public RLMetricPoint setStartStep(Long startStep) {
        this.startStep = startStep;
        return this;
    }
    public Long getStartStep() {
        return this.startStep;
    }

    public RLMetricPoint setStep(Long step) {
        this.step = step;
        return this;
    }
    public Long getStep() {
        return this.step;
    }

    public RLMetricPoint setValue(Double value) {
        this.value = value;
        return this;
    }
    public Double getValue() {
        return this.value;
    }

}
