// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLFlowStuckItem extends TeaModel {
    /**
     * <p>The number of idle seconds since NowMs. This value is the descending sort key of the Stuck list.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IdleSec")
    public Long idleSec;

    /**
     * <p>The UNIX timestamp of the last event, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787293215480</p>
     */
    @NameInMap("LastTsMs")
    public Long lastTsMs;

    /**
     * <p>The current milestone where the entry is staying. Valid values:</p>
     * <ul>
     * <li>已生成未下发: Generated but not delivered.</li>
     * <li>已下发未启动: Delivered but not started.</li>
     * <li>已启动待生成: Started and pending generation.</li>
     * <li>生成中: Generating.</li>
     * <li>Rollout完成待打分: Rollout completed and pending scoring.</li>
     * <li>已打分待采样: Scored and pending sampling.</li>
     * <li>已采样待训练: Sampled and pending training.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>生成中</p>
     */
    @NameInMap("Milestone")
    public String milestone;

    /**
     * <p>The number of completed generation rounds.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("NTurns")
    public Integer NTurns;

    /**
     * <p>The UID of the sample.</p>
     * 
     * <strong>example:</strong>
     * <p>321fa56f-e1e5-4eb3-8047-db7a230c9a75</p>
     */
    @NameInMap("PromptUid")
    public String promptUid;

    /**
     * <p>The ordinal number of the trajectory.</p>
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
