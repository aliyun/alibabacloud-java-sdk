// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLFlowStuckItem extends TeaModel {
    /**
     * <p>The number of idle seconds since NowMs (the descending sort key for the stuck list).</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IdleSec")
    public Long idleSec;

    /**
     * <p>The millisecond timestamp of the last event.</p>
     * 
     * <strong>example:</strong>
     * <p>1787293215480</p>
     */
    @NameInMap("LastTsMs")
    public Long lastTsMs;

    /**
     * <p>The current milestone: generated but not dispatched, dispatched but not started, started but pending generation, generating, rollout completed pending scoring, scored pending sampling, or sampled pending training.</p>
     * 
     * <strong>example:</strong>
     * <p>Generating</p>
     */
    @NameInMap("Milestone")
    public String milestone;

    /**
     * <p>The number of completed generation turns.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("NTurns")
    public Integer NTurns;

    /**
     * <p>The sample UID.</p>
     * 
     * <strong>example:</strong>
     * <p>321fa56f-e1e5-4eb3-8047-db7a230c9a75</p>
     */
    @NameInMap("PromptUid")
    public String promptUid;

    /**
     * <p>The trajectory index.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SampleIndex")
    public String sampleIndex;

    public static RLFlowStuckItem build(java.util.Map<String, ?> map) throws Exception {
        RLFlowStuckItem self = new RLFlowStuckItem();
        return TeaModel.build(map, self);
    }

    public RLFlowStuckItem setIdleSec(Long idleSec) {
        this.idleSec = idleSec;
        return this;
    }
    public Long getIdleSec() {
        return this.idleSec;
    }

    public RLFlowStuckItem setLastTsMs(Long lastTsMs) {
        this.lastTsMs = lastTsMs;
        return this;
    }
    public Long getLastTsMs() {
        return this.lastTsMs;
    }

    public RLFlowStuckItem setMilestone(String milestone) {
        this.milestone = milestone;
        return this;
    }
    public String getMilestone() {
        return this.milestone;
    }

    public RLFlowStuckItem setNTurns(Integer NTurns) {
        this.NTurns = NTurns;
        return this;
    }
    public Integer getNTurns() {
        return this.NTurns;
    }

    public RLFlowStuckItem setPromptUid(String promptUid) {
        this.promptUid = promptUid;
        return this;
    }
    public String getPromptUid() {
        return this.promptUid;
    }

    public RLFlowStuckItem setSampleIndex(String sampleIndex) {
        this.sampleIndex = sampleIndex;
        return this;
    }
    public String getSampleIndex() {
        return this.sampleIndex;
    }

}
