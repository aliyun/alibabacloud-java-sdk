// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetRLFlowAnalysisResponseBody extends TeaModel {
    /**
     * <p>Indicates whether trajectory data exists within the query window.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Found")
    public Boolean found;

    /**
     * <p>The 6-level funnel: traj → dispatch → run → push → selected → trained.</p>
     */
    @NameInMap("Funnel")
    public java.util.List<RLFlowFunnelStage> funnel;

    /**
     * <p>The count of in-flight trajectories by milestone, sorted in descending order of Count.</p>
     */
    @NameInMap("InflightByMilestone")
    public java.util.List<RLFlowMilestoneCount> inflightByMilestone;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc-20210126170216-xxxxxxx</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The offset of the Megatron global_step relative to the FORM_BATCH batch_id. Valid values: 0 or 1.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MegaStepOffset")
    public Long megaStepOffset;

    /**
     * <p>The server observation time in milliseconds, calculated as min(EndTime, now). This value serves as the baseline for calculating in-flight idle time.</p>
     * 
     * <strong>example:</strong>
     * <p>1787475397000</p>
     */
    @NameInMap("NowMs")
    public Long nowMs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Sankey diagram.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Sankey")
    public RLFlowSankey sankey;

    /**
     * <p>The time source for steps. A value of progress indicates that the time is extracted from the step markers in the task logs. A value of trace indicates that the time is grouped by global_step in the trace. An empty value indicates that no step data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>progress</p>
     */
    @NameInMap("StepSource")
    public String stepSource;

    /**
     * <p>The step production-consumption view.</p>
     */
    @NameInMap("Steps")
    public java.util.List<RLFlowStep> steps;

    /**
     * <p>The top 100 in-flight stuck points, sorted in descending order of IdleSec.</p>
     */
    @NameInMap("Stuck")
    public java.util.List<RLFlowStuckItem> stuck;

    /**
     * <p>The total statistics.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Sampled&quot;: 0, &quot;Uids&quot;: 0, &quot;Inflight&quot;: 0, &quot;Trained&quot;: 0, &quot;Trajs&quot;: 0, &quot;Rewarded&quot;: 0}</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Totals")
    public RLFlowTotals totals;

    /**
     * <p>The percentile statistics for the duration in seconds of 8 stages.</p>
     */
    @NameInMap("Transitions")
    public java.util.List<RLFlowTransition> transitions;

    /**
     * <p>The distribution of generation turns.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Count&quot;: 0, &quot;Max&quot;: None, &quot;Avg&quot;: None, &quot;P50&quot;: None, &quot;P90&quot;: None}</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Turns")
    public RLFlowTurns turns;

    /**
     * <p>The oversampling waste.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;UsefulSec&quot;: 0}</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Waste")
    public RLFlowWaste waste;

    public static GetRLFlowAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRLFlowAnalysisResponseBody self = new GetRLFlowAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRLFlowAnalysisResponseBody setFound(Boolean found) {
        this.found = found;
        return this;
    }
    public Boolean getFound() {
        return this.found;
    }

    public GetRLFlowAnalysisResponseBody setFunnel(java.util.List<RLFlowFunnelStage> funnel) {
        this.funnel = funnel;
        return this;
    }
    public java.util.List<RLFlowFunnelStage> getFunnel() {
        return this.funnel;
    }

    public GetRLFlowAnalysisResponseBody setInflightByMilestone(java.util.List<RLFlowMilestoneCount> inflightByMilestone) {
        this.inflightByMilestone = inflightByMilestone;
        return this;
    }
    public java.util.List<RLFlowMilestoneCount> getInflightByMilestone() {
        return this.inflightByMilestone;
    }

    public GetRLFlowAnalysisResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetRLFlowAnalysisResponseBody setMegaStepOffset(Long megaStepOffset) {
        this.megaStepOffset = megaStepOffset;
        return this;
    }
    public Long getMegaStepOffset() {
        return this.megaStepOffset;
    }

    public GetRLFlowAnalysisResponseBody setNowMs(Long nowMs) {
        this.nowMs = nowMs;
        return this;
    }
    public Long getNowMs() {
        return this.nowMs;
    }

    public GetRLFlowAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRLFlowAnalysisResponseBody setSankey(RLFlowSankey sankey) {
        this.sankey = sankey;
        return this;
    }
    public RLFlowSankey getSankey() {
        return this.sankey;
    }

    public GetRLFlowAnalysisResponseBody setStepSource(String stepSource) {
        this.stepSource = stepSource;
        return this;
    }
    public String getStepSource() {
        return this.stepSource;
    }

    public GetRLFlowAnalysisResponseBody setSteps(java.util.List<RLFlowStep> steps) {
        this.steps = steps;
        return this;
    }
    public java.util.List<RLFlowStep> getSteps() {
        return this.steps;
    }

    public GetRLFlowAnalysisResponseBody setStuck(java.util.List<RLFlowStuckItem> stuck) {
        this.stuck = stuck;
        return this;
    }
    public java.util.List<RLFlowStuckItem> getStuck() {
        return this.stuck;
    }

    public GetRLFlowAnalysisResponseBody setTotals(RLFlowTotals totals) {
        this.totals = totals;
        return this;
    }
    public RLFlowTotals getTotals() {
        return this.totals;
    }

    public GetRLFlowAnalysisResponseBody setTransitions(java.util.List<RLFlowTransition> transitions) {
        this.transitions = transitions;
        return this;
    }
    public java.util.List<RLFlowTransition> getTransitions() {
        return this.transitions;
    }

    public GetRLFlowAnalysisResponseBody setTurns(RLFlowTurns turns) {
        this.turns = turns;
        return this;
    }
    public RLFlowTurns getTurns() {
        return this.turns;
    }

    public GetRLFlowAnalysisResponseBody setWaste(RLFlowWaste waste) {
        this.waste = waste;
        return this;
    }
    public RLFlowWaste getWaste() {
        return this.waste;
    }

}
