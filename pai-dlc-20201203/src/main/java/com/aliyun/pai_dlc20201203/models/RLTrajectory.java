// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLTrajectory extends TeaModel {
    /**
     * <p>The latest event millisecond UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1787293215480</p>
     */
    @NameInMap("LatestTimestampMs")
    public Long latestTimestampMs;

    /**
     * <p>The trajectory ordinal number.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SampleIndex")
    public String sampleIndex;

    /**
     * <p>The desired state. Valid values:</p>
     * <ul>
     * <li>trained: Training is complete.</li>
     * <li>Empty string: In progress.</li>
     * </ul>
     * <p>The current frame does not perform oversampling, so discarded and cancelled do not occur.</p>
     * 
     * <strong>example:</strong>
     * <p>trained</p>
     */
    @NameInMap("TerminalState")
    public String terminalState;

    /**
     * <p>The number of trace rows.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TraceCount")
    public Long traceCount;

    public static RLTrajectory build(java.util.Map<String, ?> map) throws Exception {
        RLTrajectory self = new RLTrajectory();
        return TeaModel.build(map, self);
    }

    public RLTrajectory setLatestTimestampMs(Long latestTimestampMs) {
        this.latestTimestampMs = latestTimestampMs;
        return this;
    }
    public Long getLatestTimestampMs() {
        return this.latestTimestampMs;
    }

    public RLTrajectory setSampleIndex(String sampleIndex) {
        this.sampleIndex = sampleIndex;
        return this;
    }
    public String getSampleIndex() {
        return this.sampleIndex;
    }

    public RLTrajectory setTerminalState(String terminalState) {
        this.terminalState = terminalState;
        return this;
    }
    public String getTerminalState() {
        return this.terminalState;
    }

    public RLTrajectory setTraceCount(Long traceCount) {
        this.traceCount = traceCount;
        return this;
    }
    public Long getTraceCount() {
        return this.traceCount;
    }

}
