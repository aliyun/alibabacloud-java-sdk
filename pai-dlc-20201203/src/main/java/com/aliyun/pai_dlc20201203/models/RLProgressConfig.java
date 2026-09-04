// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLProgressConfig extends TeaModel {
    /**
     * <p>The number of mini-batches per step.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("NumMinibatches")
    public Integer numMinibatches;

    /**
     * <p>The PPO mini-batch size.</p>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("PpoMiniBatchSize")
    public Integer ppoMiniBatchSize;

    /**
     * <p>The number of rollouts per prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("RolloutN")
    public Integer rolloutN;

    /**
     * <p>The total number of training steps.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalSteps")
    public Integer totalSteps;

    /**
     * <p>The training batch size.</p>
     * 
     * <strong>example:</strong>
     * <p>512</p>
     */
    @NameInMap("TrainBatchSize")
    public Integer trainBatchSize;

    public static RLProgressConfig build(java.util.Map<String, ?> map) throws Exception {
        RLProgressConfig self = new RLProgressConfig();
        return TeaModel.build(map, self);
    }

    public RLProgressConfig setNumMinibatches(Integer numMinibatches) {
        this.numMinibatches = numMinibatches;
        return this;
    }
    public Integer getNumMinibatches() {
        return this.numMinibatches;
    }

    public RLProgressConfig setPpoMiniBatchSize(Integer ppoMiniBatchSize) {
        this.ppoMiniBatchSize = ppoMiniBatchSize;
        return this;
    }
    public Integer getPpoMiniBatchSize() {
        return this.ppoMiniBatchSize;
    }

    public RLProgressConfig setRolloutN(Integer rolloutN) {
        this.rolloutN = rolloutN;
        return this;
    }
    public Integer getRolloutN() {
        return this.rolloutN;
    }

    public RLProgressConfig setTotalSteps(Integer totalSteps) {
        this.totalSteps = totalSteps;
        return this;
    }
    public Integer getTotalSteps() {
        return this.totalSteps;
    }

    public RLProgressConfig setTrainBatchSize(Integer trainBatchSize) {
        this.trainBatchSize = trainBatchSize;
        return this;
    }
    public Integer getTrainBatchSize() {
        return this.trainBatchSize;
    }

}
