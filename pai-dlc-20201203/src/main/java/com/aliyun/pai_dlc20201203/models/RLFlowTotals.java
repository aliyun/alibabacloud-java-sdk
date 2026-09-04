// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLFlowTotals extends TeaModel {
    /**
     * <p>The number of in-flight trajectories (no desired state).</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Inflight")
    public Integer inflight;

    /**
     * <p>The number of trajectories that have completed reward scoring (hit reward_score_computed).</p>
     * 
     * <strong>example:</strong>
     * <p>96</p>
     */
    @NameInMap("Rewarded")
    public Integer rewarded;

    /**
     * <p>The number of trajectories sampled into a batch by the trainer (hit sampled_from_replay_buffer).</p>
     * 
     * <strong>example:</strong>
     * <p>96</p>
     */
    @NameInMap("Sampled")
    public Integer sampled;

    /**
     * <p>The number of trajectories that have completed training (hit actor_parameters_updated).</p>
     * 
     * <strong>example:</strong>
     * <p>96</p>
     */
    @NameInMap("Trained")
    public Integer trained;

    /**
     * <p>The total number of trajectories in the window.</p>
     * 
     * <strong>example:</strong>
     * <p>96</p>
     */
    @NameInMap("Trajs")
    public Integer trajs;

    /**
     * <p>The number of sample UIDs that appear in the window.</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("Uids")
    public Integer uids;

    public static RLFlowTotals build(java.util.Map<String, ?> map) throws Exception {
        RLFlowTotals self = new RLFlowTotals();
        return TeaModel.build(map, self);
    }

    public RLFlowTotals setInflight(Integer inflight) {
        this.inflight = inflight;
        return this;
    }
    public Integer getInflight() {
        return this.inflight;
    }

    public RLFlowTotals setRewarded(Integer rewarded) {
        this.rewarded = rewarded;
        return this;
    }
    public Integer getRewarded() {
        return this.rewarded;
    }

    public RLFlowTotals setSampled(Integer sampled) {
        this.sampled = sampled;
        return this;
    }
    public Integer getSampled() {
        return this.sampled;
    }

    public RLFlowTotals setTrained(Integer trained) {
        this.trained = trained;
        return this;
    }
    public Integer getTrained() {
        return this.trained;
    }

    public RLFlowTotals setTrajs(Integer trajs) {
        this.trajs = trajs;
        return this;
    }
    public Integer getTrajs() {
        return this.trajs;
    }

    public RLFlowTotals setUids(Integer uids) {
        this.uids = uids;
        return this;
    }
    public Integer getUids() {
        return this.uids;
    }

}
