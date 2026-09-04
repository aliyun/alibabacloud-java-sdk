// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLProgressTrainer extends TeaModel {
    /**
     * <p>micro-batch 进度</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Micro")
    public RLProgressMicro micro;

    /**
     * <p>当前 mini batch 序号</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MiniIdx")
    public Integer miniIdx;

    /**
     * <p>mini-batch 总数</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("NumMinibatches")
    public Integer numMinibatches;

    /**
     * <p>参数同步状态</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Sync")
    public RLProgressSync sync;

    public static RLProgressTrainer build(java.util.Map<String, ?> map) throws Exception {
        RLProgressTrainer self = new RLProgressTrainer();
        return TeaModel.build(map, self);
    }

    public RLProgressTrainer setMicro(RLProgressMicro micro) {
        this.micro = micro;
        return this;
    }
    public RLProgressMicro getMicro() {
        return this.micro;
    }

    public RLProgressTrainer setMiniIdx(Integer miniIdx) {
        this.miniIdx = miniIdx;
        return this;
    }
    public Integer getMiniIdx() {
        return this.miniIdx;
    }

    public RLProgressTrainer setNumMinibatches(Integer numMinibatches) {
        this.numMinibatches = numMinibatches;
        return this;
    }
    public Integer getNumMinibatches() {
        return this.numMinibatches;
    }

    public RLProgressTrainer setSync(RLProgressSync sync) {
        this.sync = sync;
        return this;
    }
    public RLProgressSync getSync() {
        return this.sync;
    }

}
