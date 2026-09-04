// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLSample extends TeaModel {
    /**
     * <p>The detail of the latest event.</p>
     * 
     * <strong>example:</strong>
     * <p>actor_parameters_updated</p>
     */
    @NameInMap("LatestDetail")
    public String latestDetail;

    /**
     * <p>The stage of the latest event.</p>
     * 
     * <strong>example:</strong>
     * <p>TRAIN_UPDATE</p>
     */
    @NameInMap("LatestStage")
    public String latestStage;

    /**
     * <p>The latest sample_status.</p>
     * 
     * <strong>example:</strong>
     * <p>COMPLETE</p>
     */
    @NameInMap("LatestStatus")
    public String latestStatus;

    /**
     * <p>The millisecond timestamp of the latest event.</p>
     * 
     * <strong>example:</strong>
     * <p>1787293215480</p>
     */
    @NameInMap("LatestTimestampMs")
    public Long latestTimestampMs;

    /**
     * <p>The sample UID.</p>
     * 
     * <strong>example:</strong>
     * <p>321fa56f-e1e5-4eb3-8047-db7a230c9a75</p>
     */
    @NameInMap("PromptUid")
    public String promptUid;

    /**
     * <p>The trajectory ordinal number (numeric string).</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SampleIndex")
    public String sampleIndex;

    /**
     * <p>The desired state. Valid values: trained (training completed) and empty string (in progress). The current frame does not perform oversampling, so discarded and cancelled do not occur.</p>
     * 
     * <strong>example:</strong>
     * <p>trained</p>
     */
    @NameInMap("TerminalState")
    public String terminalState;

    /**
     * <p>The number of trace rows for the trajectory, including B/C type allocations.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TraceCount")
    public Long traceCount;

    public static RLSample build(java.util.Map<String, ?> map) throws Exception {
        RLSample self = new RLSample();
        return TeaModel.build(map, self);
    }

    public RLSample setLatestDetail(String latestDetail) {
        this.latestDetail = latestDetail;
        return this;
    }
    public String getLatestDetail() {
        return this.latestDetail;
    }

    public RLSample setLatestStage(String latestStage) {
        this.latestStage = latestStage;
        return this;
    }
    public String getLatestStage() {
        return this.latestStage;
    }

    public RLSample setLatestStatus(String latestStatus) {
        this.latestStatus = latestStatus;
        return this;
    }
    public String getLatestStatus() {
        return this.latestStatus;
    }

    public RLSample setLatestTimestampMs(Long latestTimestampMs) {
        this.latestTimestampMs = latestTimestampMs;
        return this;
    }
    public Long getLatestTimestampMs() {
        return this.latestTimestampMs;
    }

    public RLSample setPromptUid(String promptUid) {
        this.promptUid = promptUid;
        return this;
    }
    public String getPromptUid() {
        return this.promptUid;
    }

    public RLSample setSampleIndex(String sampleIndex) {
        this.sampleIndex = sampleIndex;
        return this;
    }
    public String getSampleIndex() {
        return this.sampleIndex;
    }

    public RLSample setTerminalState(String terminalState) {
        this.terminalState = terminalState;
        return this;
    }
    public String getTerminalState() {
        return this.terminalState;
    }

    public RLSample setTraceCount(Long traceCount) {
        this.traceCount = traceCount;
        return this;
    }
    public Long getTraceCount() {
        return this.traceCount;
    }

}
