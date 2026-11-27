// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetRLLogContextResponseBody extends TeaModel {
    /**
     * <p>The index of the anchor line in Lines. This value is empty if the fallback path does not match the anchor. In this case, Lines contains all lines in the window.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("AnchorIndex")
    public Integer anchorIndex;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc-20210126170216-xxxxxxxx</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The context log lines in ascending order of time.</p>
     */
    @NameInMap("Lines")
    public java.util.List<RLLogContextLine> lines;

    /**
     * <p>The log locating mode. Valid values: agent_collect_time for the exact path, and raw_time_cluster for the fallback path.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_collect_time</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the number of raw lines in the fallback path reaches the upper limit of 5,000.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("Truncated")
    public Boolean truncated;

    public static GetRLLogContextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRLLogContextResponseBody self = new GetRLLogContextResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRLLogContextResponseBody setAnchorIndex(Integer anchorIndex) {
        this.anchorIndex = anchorIndex;
        return this;
    }
    public Integer getAnchorIndex() {
        return this.anchorIndex;
    }

    public GetRLLogContextResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetRLLogContextResponseBody setLines(java.util.List<RLLogContextLine> lines) {
        this.lines = lines;
        return this;
    }
    public java.util.List<RLLogContextLine> getLines() {
        return this.lines;
    }

    public GetRLLogContextResponseBody setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public GetRLLogContextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRLLogContextResponseBody setTruncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }
    public Boolean getTruncated() {
        return this.truncated;
    }

}
