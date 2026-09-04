// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLFlowTurns extends TeaModel {
    /**
     * <p>平均生成轮数</p>
     * 
     * <strong>example:</strong>
     * <p>1.9</p>
     */
    @NameInMap("Avg")
    public Double avg;

    /**
     * <p>参与统计的轨迹数</p>
     * 
     * <strong>example:</strong>
     * <p>96</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>最大生成轮数</p>
     * 
     * <strong>example:</strong>
     * <p>9.2</p>
     */
    @NameInMap("Max")
    public Integer max;

    /**
     * <p>生成轮数 P50</p>
     * 
     * <strong>example:</strong>
     * <p>0.8</p>
     */
    @NameInMap("P50")
    public Integer p50;

    /**
     * <p>生成轮数 P90</p>
     * 
     * <strong>example:</strong>
     * <p>5.9</p>
     */
    @NameInMap("P90")
    public Integer p90;

    public static RLFlowTurns build(java.util.Map<String, ?> map) throws Exception {
        RLFlowTurns self = new RLFlowTurns();
        return TeaModel.build(map, self);
    }

    public RLFlowTurns setAvg(Double avg) {
        this.avg = avg;
        return this;
    }
    public Double getAvg() {
        return this.avg;
    }

    public RLFlowTurns setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public RLFlowTurns setMax(Integer max) {
        this.max = max;
        return this;
    }
    public Integer getMax() {
        return this.max;
    }

    public RLFlowTurns setP50(Integer p50) {
        this.p50 = p50;
        return this;
    }
    public Integer getP50() {
        return this.p50;
    }

    public RLFlowTurns setP90(Integer p90) {
        this.p90 = p90;
        return this;
    }
    public Integer getP90() {
        return this.p90;
    }

}
