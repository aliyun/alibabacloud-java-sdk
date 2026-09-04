// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLFlowTransition extends TeaModel {
    /**
     * <p>The average duration in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1.9</p>
     */
    @NameInMap("Avg")
    public Double avg;

    /**
     * <p>The number of trajectories included in the statistics.</p>
     * 
     * <strong>example:</strong>
     * <p>96</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The phase identifier. Valid values: dispatch_wait, start_wait, env_prepare, generation, agent_finish, reward, buffer_wait, logprob, ref_logprob, advantage, update, and e2e.</p>
     * 
     * <strong>example:</strong>
     * <p>traj</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The Chinese name of the phase.</p>
     * 
     * <strong>example:</strong>
     * <p>生成轨迹</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The maximum duration in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>9.2</p>
     */
    @NameInMap("Max")
    public Double max;

    /**
     * <p>The P50 duration in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>0.8</p>
     */
    @NameInMap("P50")
    public Double p50;

    /**
     * <p>The P90 duration in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>5.9</p>
     */
    @NameInMap("P90")
    public Double p90;

    /**
     * <p>The P99 duration in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>8.6</p>
     */
    @NameInMap("P99")
    public Double p99;

    /**
     * <p>The slowest 5 trajectories.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;PromptUid&quot;:&quot;321fa56f-e1e5-4eb3-8047-db7a230c9a75&quot;,&quot;SampleIndex&quot;:&quot;2&quot;,&quot;Sec&quot;:9.2}]</p>
     */
    @NameInMap("Slowest")
    public java.util.List<RLFlowSlowestItem> slowest;

    public static RLFlowTransition build(java.util.Map<String, ?> map) throws Exception {
        RLFlowTransition self = new RLFlowTransition();
        return TeaModel.build(map, self);
    }

    public RLFlowTransition setAvg(Double avg) {
        this.avg = avg;
        return this;
    }
    public Double getAvg() {
        return this.avg;
    }

    public RLFlowTransition setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public RLFlowTransition setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public RLFlowTransition setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public RLFlowTransition setMax(Double max) {
        this.max = max;
        return this;
    }
    public Double getMax() {
        return this.max;
    }

    public RLFlowTransition setP50(Double p50) {
        this.p50 = p50;
        return this;
    }
    public Double getP50() {
        return this.p50;
    }

    public RLFlowTransition setP90(Double p90) {
        this.p90 = p90;
        return this;
    }
    public Double getP90() {
        return this.p90;
    }

    public RLFlowTransition setP99(Double p99) {
        this.p99 = p99;
        return this;
    }
    public Double getP99() {
        return this.p99;
    }

    public RLFlowTransition setSlowest(java.util.List<RLFlowSlowestItem> slowest) {
        this.slowest = slowest;
        return this;
    }
    public java.util.List<RLFlowSlowestItem> getSlowest() {
        return this.slowest;
    }

}
