// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetRLTrainingProgressResponseBody extends TeaModel {
    /**
     * <p>The readiness of the data buffer. The ETA is estimated by using the rollout completion rate as a proxy.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Buffer")
    public RLProgressBuffer buffer;

    /**
     * <p>The parsing result of the training configuration dump. Unparsed fields are empty.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Config")
    public RLProgressConfig config;

    /**
     * <p>The readiness of the eval buffer (tag=-1).</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Eval")
    public RLProgressEval eval;

    /**
     * <p>The fatal errors. A maximum of 5 errors are included, and sandbox business noise is excluded.</p>
     */
    @NameInMap("Fatal")
    public java.util.List<RLProgressFatal> fatal;

    /**
     * <p>Indicates whether master-0 has logs within the window. If the value is false, other fields use default values.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Found")
    public Boolean found;

    /**
     * <p>Indicates whether no fatal errors are found. The value is true if Fatal is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HealthOk")
    public Boolean healthOk;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc-20210126170216-xxxxxxx</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The time of the last log in UNIX seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487</p>
     */
    @NameInMap("LastLogTime")
    public Long lastLogTime;

    /**
     * <p>The original text of the latest trainer phase marker.</p>
     * 
     * <strong>example:</strong>
     * <p>disagg: actor generate sequences</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>The time of the phase marker in UNIX seconds, used by the frontend to calculate the dwell time.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487</p>
     */
    @NameInMap("PhaseTime")
    public Long phaseTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The rollout throughput.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Rollout")
    public RLProgressRollout rollout;

    /**
     * <p>The current server time in UNIX seconds, used by the frontend to calculate the time since the last log.</p>
     * 
     * <strong>example:</strong>
     * <p>1787475398</p>
     */
    @NameInMap("ServerNow")
    public Long serverNow;

    /**
     * <p>The soft alerts for slow inference. A maximum of 20 details are included.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Slow")
    public RLProgressSlow slow;

    /**
     * <p>The phase pipeline.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Index&quot;: &quot;Group0-Stage0&quot;, &quot;StageInfo&quot;: {&quot;Status&quot;: &quot;FAIL&quot;, &quot;EndTime&quot;: 0, &quot;Jobs&quot;: [{&quot;Id&quot;: 477917255}], &quot;Name&quot;: u&quot;\u9636\u6bb51&quot;, &quot;StartTime&quot;: 1784858533000}, &quot;Name&quot;: u&quot;\u9636\u6bb51&quot;}]</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Stages")
    public RLProgressStages stages;

    /**
     * <p>The step progress. Pace is calculated based on the difference between two adjacent Step markers. ETA = (Total - Current) × Pace.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Step")
    public RLProgressStep step;

    /**
     * <p>The latest generation throughput in tokens per second.</p>
     * 
     * <strong>example:</strong>
     * <p>1200</p>
     */
    @NameInMap("Throughput")
    public Double throughput;

    /**
     * <p>The training mode. Valid values: disagg (decoupled training and inference), colocate (integrated training and inference), or an empty string (unrecognized).</p>
     * 
     * <strong>example:</strong>
     * <p>disagg</p>
     */
    @NameInMap("TrainMode")
    public String trainMode;

    /**
     * <p>The internal status of the trainer, such as mini-batch, micro-batch, or parameter synchronization.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Trainer")
    public RLProgressTrainer trainer;

    public static GetRLTrainingProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRLTrainingProgressResponseBody self = new GetRLTrainingProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRLTrainingProgressResponseBody setBuffer(RLProgressBuffer buffer) {
        this.buffer = buffer;
        return this;
    }
    public RLProgressBuffer getBuffer() {
        return this.buffer;
    }

    public GetRLTrainingProgressResponseBody setConfig(RLProgressConfig config) {
        this.config = config;
        return this;
    }
    public RLProgressConfig getConfig() {
        return this.config;
    }

    public GetRLTrainingProgressResponseBody setEval(RLProgressEval eval) {
        this.eval = eval;
        return this;
    }
    public RLProgressEval getEval() {
        return this.eval;
    }

    public GetRLTrainingProgressResponseBody setFatal(java.util.List<RLProgressFatal> fatal) {
        this.fatal = fatal;
        return this;
    }
    public java.util.List<RLProgressFatal> getFatal() {
        return this.fatal;
    }

    public GetRLTrainingProgressResponseBody setFound(Boolean found) {
        this.found = found;
        return this;
    }
    public Boolean getFound() {
        return this.found;
    }

    public GetRLTrainingProgressResponseBody setHealthOk(Boolean healthOk) {
        this.healthOk = healthOk;
        return this;
    }
    public Boolean getHealthOk() {
        return this.healthOk;
    }

    public GetRLTrainingProgressResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetRLTrainingProgressResponseBody setLastLogTime(Long lastLogTime) {
        this.lastLogTime = lastLogTime;
        return this;
    }
    public Long getLastLogTime() {
        return this.lastLogTime;
    }

    public GetRLTrainingProgressResponseBody setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public GetRLTrainingProgressResponseBody setPhaseTime(Long phaseTime) {
        this.phaseTime = phaseTime;
        return this;
    }
    public Long getPhaseTime() {
        return this.phaseTime;
    }

    public GetRLTrainingProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRLTrainingProgressResponseBody setRollout(RLProgressRollout rollout) {
        this.rollout = rollout;
        return this;
    }
    public RLProgressRollout getRollout() {
        return this.rollout;
    }

    public GetRLTrainingProgressResponseBody setServerNow(Long serverNow) {
        this.serverNow = serverNow;
        return this;
    }
    public Long getServerNow() {
        return this.serverNow;
    }

    public GetRLTrainingProgressResponseBody setSlow(RLProgressSlow slow) {
        this.slow = slow;
        return this;
    }
    public RLProgressSlow getSlow() {
        return this.slow;
    }

    public GetRLTrainingProgressResponseBody setStages(RLProgressStages stages) {
        this.stages = stages;
        return this;
    }
    public RLProgressStages getStages() {
        return this.stages;
    }

    public GetRLTrainingProgressResponseBody setStep(RLProgressStep step) {
        this.step = step;
        return this;
    }
    public RLProgressStep getStep() {
        return this.step;
    }

    public GetRLTrainingProgressResponseBody setThroughput(Double throughput) {
        this.throughput = throughput;
        return this;
    }
    public Double getThroughput() {
        return this.throughput;
    }

    public GetRLTrainingProgressResponseBody setTrainMode(String trainMode) {
        this.trainMode = trainMode;
        return this;
    }
    public String getTrainMode() {
        return this.trainMode;
    }

    public GetRLTrainingProgressResponseBody setTrainer(RLProgressTrainer trainer) {
        this.trainer = trainer;
        return this;
    }
    public RLProgressTrainer getTrainer() {
        return this.trainer;
    }

}
