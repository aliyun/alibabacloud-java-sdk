// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetRLTrajectoryResponseBody extends TeaModel {
    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc-20210114104214-vf9lowjt3pso</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The sample UID.</p>
     * 
     * <strong>example:</strong>
     * <p>3afcfbdf-3956-4ab2-b9cb-f9c204b8fc9c</p>
     */
    @NameInMap("PromptUid")
    public String promptUid;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The trajectory index.</p>
     * 
     * <strong>example:</strong>
     * <p>14</p>
     */
    @NameInMap("SampleIndex")
    public String sampleIndex;

    /**
     * <p>The number of turn rows. The maximum number of turns per trajectory is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The raw rows of sgl-metric for each turn. The schema is dynamic and retains the Logstore column names. JSON strings are parsed back into objects, and system fields with the __ prefix are excluded.</p>
     */
    @NameInMap("Turns")
    public java.util.List<java.util.Map<String, ?>> turns;

    public static GetRLTrajectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRLTrajectoryResponseBody self = new GetRLTrajectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRLTrajectoryResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetRLTrajectoryResponseBody setPromptUid(String promptUid) {
        this.promptUid = promptUid;
        return this;
    }
    public String getPromptUid() {
        return this.promptUid;
    }

    public GetRLTrajectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRLTrajectoryResponseBody setSampleIndex(String sampleIndex) {
        this.sampleIndex = sampleIndex;
        return this;
    }
    public String getSampleIndex() {
        return this.sampleIndex;
    }

    public GetRLTrajectoryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetRLTrajectoryResponseBody setTurns(java.util.List<java.util.Map<String, ?>> turns) {
        this.turns = turns;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getTurns() {
        return this.turns;
    }

}
