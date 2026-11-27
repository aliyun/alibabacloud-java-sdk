// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetRLSampleResponseBody extends TeaModel {
    /**
     * <p>The event stream sorted in ascending order by time.</p>
     */
    @NameInMap("Events")
    public java.util.List<RLSampleEvent> events;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc5yfk7eyg95lac</p>
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
     * <p>The total number of returned events.</p>
     * 
     * <strong>example:</strong>
     * <p>116</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetRLSampleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRLSampleResponseBody self = new GetRLSampleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRLSampleResponseBody setEvents(java.util.List<RLSampleEvent> events) {
        this.events = events;
        return this;
    }
    public java.util.List<RLSampleEvent> getEvents() {
        return this.events;
    }

    public GetRLSampleResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetRLSampleResponseBody setPromptUid(String promptUid) {
        this.promptUid = promptUid;
        return this;
    }
    public String getPromptUid() {
        return this.promptUid;
    }

    public GetRLSampleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRLSampleResponseBody setSampleIndex(String sampleIndex) {
        this.sampleIndex = sampleIndex;
        return this;
    }
    public String getSampleIndex() {
        return this.sampleIndex;
    }

    public GetRLSampleResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
