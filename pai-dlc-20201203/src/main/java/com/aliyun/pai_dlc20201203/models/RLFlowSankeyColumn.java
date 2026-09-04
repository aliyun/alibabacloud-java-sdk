// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLFlowSankeyColumn extends TeaModel {
    /**
     * <p>The number of trajectories in the column. The value is monotonized: reaching a later stage implies having passed through all preceding stages.</p>
     * 
     * <strong>example:</strong>
     * <p>96</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The column identifier. Valid values: gen, run, rollout, sampled, and trained.</p>
     * 
     * <strong>example:</strong>
     * <p>traj</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The Chinese name of the column. Valid values: 轨迹生成, Agent 启动, Rollout 完成, 采样入批, and 完成训练.</p>
     * 
     * <strong>example:</strong>
     * <p>生成轨迹</p>
     */
    @NameInMap("Label")
    public String label;

    public static RLFlowSankeyColumn build(java.util.Map<String, ?> map) throws Exception {
        RLFlowSankeyColumn self = new RLFlowSankeyColumn();
        return TeaModel.build(map, self);
    }

    public RLFlowSankeyColumn setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public RLFlowSankeyColumn setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public RLFlowSankeyColumn setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

}
