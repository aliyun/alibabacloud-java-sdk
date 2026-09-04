// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLFlowMilestoneCount extends TeaModel {
    /**
     * <p>The number of in-transit trajectories that remain at this milestone.</p>
     * 
     * <strong>example:</strong>
     * <p>96</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The milestone. Valid values are the same as those of Stuck[].Milestone.</p>
     * 
     * <strong>example:</strong>
     * <p>生成中</p>
     */
    @NameInMap("Milestone")
    public String milestone;

    public static RLFlowMilestoneCount build(java.util.Map<String, ?> map) throws Exception {
        RLFlowMilestoneCount self = new RLFlowMilestoneCount();
        return TeaModel.build(map, self);
    }

    public RLFlowMilestoneCount setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public RLFlowMilestoneCount setMilestone(String milestone) {
        this.milestone = milestone;
        return this;
    }
    public String getMilestone() {
        return this.milestone;
    }

}
