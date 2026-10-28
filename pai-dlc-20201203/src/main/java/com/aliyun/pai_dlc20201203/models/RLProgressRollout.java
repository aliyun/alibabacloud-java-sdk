// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLProgressRollout extends TeaModel {
    /**
     * <p>The total number of completed items within the window.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("Finished")
    public Integer finished;

    /**
     * <p>The rollout processed count.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Processed")
    public RLProgressProcessed processed;

    /**
     * <p>The completion rate (items per minute), estimated from the last 120 completion events.</p>
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
