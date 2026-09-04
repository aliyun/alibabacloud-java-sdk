// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLFlowFunnelStage extends TeaModel {
    /**
     * <p>The number of trajectories that reach this level.</p>
     * 
     * <strong>example:</strong>
     * <p>96</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The level identifier. Valid values: traj, dispatch, run, rollout, reward, sampled, and trained.</p>
     * 
     * <strong>example:</strong>
     * <p>traj</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The Chinese name of the level. Valid values: 生成轨迹, 下发到 Worker, Agent 启动, Rollout 完成, reward 打分, 采样入批, and 完成训练.</p>
     * 
     * <strong>example:</strong>
     * <p>生成轨迹</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The percentage relative to the first traj level.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Pct")
    public Double pct;

    public static RLFlowFunnelStage build(java.util.Map<String, ?> map) throws Exception {
        RLFlowFunnelStage self = new RLFlowFunnelStage();
        return TeaModel.build(map, self);
    }

    public RLFlowFunnelStage setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public RLFlowFunnelStage setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public RLFlowFunnelStage setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public RLFlowFunnelStage setPct(Double pct) {
        this.pct = pct;
        return this;
    }
    public Double getPct() {
        return this.pct;
    }

}
