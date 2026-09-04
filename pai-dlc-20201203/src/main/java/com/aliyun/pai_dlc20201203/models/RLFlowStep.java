// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLFlowStep extends TeaModel {
    /**
     * <p>The P50 latency in seconds from when trajectories of the step enter the buffer to when batching occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>0.8</p>
     */
    @NameInMap("BufferWaitP50")
    public Double bufferWaitP50;

    /**
     * <p>The gap duration in seconds, calculated as train started − rollout finished. This represents batching or transfer wait time.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("GapSec")
    public Double gapSec;

    /**
     * <p>The training idle time in seconds, calculated as the current step training start − the previous step training end. If no marker is present, the value falls back to the current step forward computation start − the previous step optimizer end. A value greater than 0 indicates that the trainer is waiting for data.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IdleSec")
    public Double idleSec;

    /**
     * <p>The number of samples (UIDs) consumed by the step.</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("NSamples")
    public Integer NSamples;

    /**
     * <p>The number of trajectories executed in the step.</p>
     * 
     * <strong>example:</strong>
     * <p>96</p>
     */
    @NameInMap("NTrajs")
    public Integer NTrajs;

    /**
     * <p>The latest time when trajectories of the step enter the buffer, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487713</p>
     */
    @NameInMap("ProdEndMs")
    public Long prodEndMs;

    /**
     * <p>The earliest time when trajectories of the step enter the buffer, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487713</p>
     */
    @NameInMap("ProdStartMs")
    public Long prodStartMs;

    /**
     * <p>The P50 latency in seconds from when trajectories of the step start execution to when they enter the buffer.</p>
     * 
     * <strong>example:</strong>
     * <p>0.8</p>
     */
    @NameInMap("RolloutP50")
    public Double rolloutP50;

    /**
     * <p>The rollout duration in seconds, calculated as rollout finished − rollout started. This value is null if no marker is present.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RolloutSec")
    public Double rolloutSec;

    /**
     * <p>The global step ordinal number.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Step")
    public Long step;

    /**
     * <p>The forward computation start time, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487713</p>
     */
    @NameInMap("TFwdStartMs")
    public Long TFwdStartMs;

    /**
     * <p>The optimizer end time, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487713</p>
     */
    @NameInMap("TOptEndMs")
    public Long TOptEndMs;

    /**
     * <p>The node operation log &quot;Step N rollout finished&quot; time, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487713</p>
     */
    @NameInMap("TRolloutEndMs")
    public Long TRolloutEndMs;

    /**
     * <p>The node operation log &quot;Step N rollout started&quot; time, in milliseconds (taken from agent_collect_time).</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487713</p>
     */
    @NameInMap("TRolloutStartMs")
    public Long TRolloutStartMs;

    /**
     * <p>The node operation log &quot;Step N train finished&quot; time, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487713</p>
     */
    @NameInMap("TTrainEndMs")
    public Long TTrainEndMs;

    /**
     * <p>The node operation log &quot;Step N train started&quot; time, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487713</p>
     */
    @NameInMap("TTrainStartMs")
    public Long TTrainStartMs;

    /**
     * <p>The TRAIN_UPDATE (parameter update) time, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487713</p>
     */
    @NameInMap("TUpdateMs")
    public Long TUpdateMs;

    /**
     * <p>The training duration in seconds. This value is preferentially calculated as train finished − train started. If no marker is present, the value falls back to the duration from batching to training completion. This value is null if global_step is duplicated because of a job restart.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TrainSec")
    public Double trainSec;

    public static RLFlowStep build(java.util.Map<String, ?> map) throws Exception {
        RLFlowStep self = new RLFlowStep();
        return TeaModel.build(map, self);
    }

    public RLFlowStep setBufferWaitP50(Double bufferWaitP50) {
        this.bufferWaitP50 = bufferWaitP50;
        return this;
    }
    public Double getBufferWaitP50() {
        return this.bufferWaitP50;
    }

    public RLFlowStep setGapSec(Double gapSec) {
        this.gapSec = gapSec;
        return this;
    }
    public Double getGapSec() {
        return this.gapSec;
    }

    public RLFlowStep setIdleSec(Double idleSec) {
        this.idleSec = idleSec;
        return this;
    }
    public Double getIdleSec() {
        return this.idleSec;
    }

    public RLFlowStep setNSamples(Integer NSamples) {
        this.NSamples = NSamples;
        return this;
    }
    public Integer getNSamples() {
        return this.NSamples;
    }

    public RLFlowStep setNTrajs(Integer NTrajs) {
        this.NTrajs = NTrajs;
        return this;
    }
    public Integer getNTrajs() {
        return this.NTrajs;
    }

    public RLFlowStep setProdEndMs(Long prodEndMs) {
        this.prodEndMs = prodEndMs;
        return this;
    }
    public Long getProdEndMs() {
        return this.prodEndMs;
    }

    public RLFlowStep setProdStartMs(Long prodStartMs) {
        this.prodStartMs = prodStartMs;
        return this;
    }
    public Long getProdStartMs() {
        return this.prodStartMs;
    }

    public RLFlowStep setRolloutP50(Double rolloutP50) {
        this.rolloutP50 = rolloutP50;
        return this;
    }
    public Double getRolloutP50() {
        return this.rolloutP50;
    }

    public RLFlowStep setRolloutSec(Double rolloutSec) {
        this.rolloutSec = rolloutSec;
        return this;
    }
    public Double getRolloutSec() {
        return this.rolloutSec;
    }

    public RLFlowStep setStep(Long step) {
        this.step = step;
        return this;
    }
    public Long getStep() {
        return this.step;
    }

    public RLFlowStep setTFwdStartMs(Long TFwdStartMs) {
        this.TFwdStartMs = TFwdStartMs;
        return this;
    }
    public Long getTFwdStartMs() {
        return this.TFwdStartMs;
    }

    public RLFlowStep setTOptEndMs(Long TOptEndMs) {
        this.TOptEndMs = TOptEndMs;
        return this;
    }
    public Long getTOptEndMs() {
        return this.TOptEndMs;
    }

    public RLFlowStep setTRolloutEndMs(Long TRolloutEndMs) {
        this.TRolloutEndMs = TRolloutEndMs;
        return this;
    }
    public Long getTRolloutEndMs() {
        return this.TRolloutEndMs;
    }

    public RLFlowStep setTRolloutStartMs(Long TRolloutStartMs) {
        this.TRolloutStartMs = TRolloutStartMs;
        return this;
    }
    public Long getTRolloutStartMs() {
        return this.TRolloutStartMs;
    }

    public RLFlowStep setTTrainEndMs(Long TTrainEndMs) {
        this.TTrainEndMs = TTrainEndMs;
        return this;
    }
    public Long getTTrainEndMs() {
        return this.TTrainEndMs;
    }

    public RLFlowStep setTTrainStartMs(Long TTrainStartMs) {
        this.TTrainStartMs = TTrainStartMs;
        return this;
    }
    public Long getTTrainStartMs() {
        return this.TTrainStartMs;
    }

    public RLFlowStep setTUpdateMs(Long TUpdateMs) {
        this.TUpdateMs = TUpdateMs;
        return this;
    }
    public Long getTUpdateMs() {
        return this.TUpdateMs;
    }

    public RLFlowStep setTrainSec(Double trainSec) {
        this.trainSec = trainSec;
        return this;
    }
    public Double getTrainSec() {
        return this.trainSec;
    }

}
