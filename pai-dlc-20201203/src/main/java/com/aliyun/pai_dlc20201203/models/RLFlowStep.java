// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLFlowStep extends TeaModel {
    /**
     * <p>The P50 duration in seconds from when trajectories of the step enter the buffer to when they are batched.</p>
     * 
     * <strong>example:</strong>
     * <p>0.8</p>
     */
    @NameInMap("BufferWaitP50")
    public Double bufferWaitP50;

    /**
     * <p>The gap duration in seconds, calculated as train started minus rollout finished, representing batching or transfer wait time.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("GapSec")
    public Double gapSec;

    /**
     * <p>The idle time in seconds between the training phases of adjacent steps. This value only reflects the time interval and cannot be used alone to determine data waiting or other specific causes.</p>
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
     * <p>The number of trajectories belonging to the current execution of the step.</p>
     * 
     * <strong>example:</strong>
     * <p>96</p>
     */
    @NameInMap("NTrajs")
    public Integer NTrajs;

    /**
     * <p>The latest time a trajectory of the step enters the buffer in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487713</p>
     */
    @NameInMap("ProdEndMs")
    public Long prodEndMs;

    /**
     * <p>The earliest time a trajectory of the step enters the buffer in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487713</p>
     */
    @NameInMap("ProdStartMs")
    public Long prodStartMs;

    /**
     * <p>The P50 duration in seconds from when trajectories of the step start execution to when they enter the buffer.</p>
     * 
     * <strong>example:</strong>
     * <p>0.8</p>
     */
    @NameInMap("RolloutP50")
    public Double rolloutP50;

    /**
     * <p>The rollout duration in seconds, calculated as rollout finished minus rollout started. This value is empty when no markers are available.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RolloutSec")
    public Double rolloutSec;

    /**
     * <p>The global step number.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Step")
    public Long step;

    /**
     * <p>The start time of the forward computation in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487713</p>
     */
    @NameInMap("TFwdStartMs")
    public Long TFwdStartMs;

    /**
     * <p>The end time of the optimizer in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487713</p>
     */
    @NameInMap("TOptEndMs")
    public Long TOptEndMs;

    /**
     * <p>The time of the &quot;Step N rollout finished&quot; entry in the node logs in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487713</p>
     */
    @NameInMap("TRolloutEndMs")
    public Long TRolloutEndMs;

    /**
     * <p>The observed rollout start time for the current step as a millisecond timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487713</p>
     */
    @NameInMap("TRolloutStartMs")
    public Long TRolloutStartMs;

    /**
     * <p>The time of the &quot;Step N train finished&quot; entry in the node logs in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487713</p>
     */
    @NameInMap("TTrainEndMs")
    public Long TTrainEndMs;

    /**
     * <p>The time of the &quot;Step N train started&quot; entry in the node logs in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487713</p>
     */
    @NameInMap("TTrainStartMs")
    public Long TTrainStartMs;

    /**
     * <p>The time of the TRAIN_UPDATE (parameter update) event in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487713</p>
     */
    @NameInMap("TUpdateMs")
    public Long TUpdateMs;

    /**
     * <p>The duration of the training phase for the step in seconds. This value is not provided when the training start and end times are unavailable.</p>
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
