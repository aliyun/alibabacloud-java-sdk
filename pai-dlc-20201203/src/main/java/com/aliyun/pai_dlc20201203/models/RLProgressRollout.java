// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLProgressRollout extends TeaModel {
    /**
     * <p>窗口内完成总数</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("Finished")
    public Integer finished;

    /**
     * <p>rollout 已处理计数</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Processed")
    public RLProgressProcessed processed;

    /**
     * <p>完成速率（条/分钟），由最近 120 条完成事件估算</p>
     * 
     * <strong>example:</strong>
     * <p>31.2</p>
     */
    @NameInMap("RatePerMin")
    public Double ratePerMin;

    public static RLProgressRollout build(java.util.Map<String, ?> map) throws Exception {
        RLProgressRollout self = new RLProgressRollout();
        return TeaModel.build(map, self);
    }

    public RLProgressRollout setFinished(Integer finished) {
        this.finished = finished;
        return this;
    }
    public Integer getFinished() {
        return this.finished;
    }

    public RLProgressRollout setProcessed(RLProgressProcessed processed) {
        this.processed = processed;
        return this;
    }
    public RLProgressProcessed getProcessed() {
        return this.processed;
    }

    public RLProgressRollout setRatePerMin(Double ratePerMin) {
        this.ratePerMin = ratePerMin;
        return this;
    }
    public Double getRatePerMin() {
        return this.ratePerMin;
    }

}
