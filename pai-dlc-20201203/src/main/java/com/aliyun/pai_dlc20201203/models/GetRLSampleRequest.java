// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetRLSampleRequest extends TeaModel {
    /**
     * <p>The end time of the query window.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-07T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The sample UID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3afcfbdf-3956-4ab2-b9cb-f9c204b8fc9c</p>
     */
    @NameInMap("PromptUid")
    public String promptUid;

    /**
     * <p>The trajectory index.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>14</p>
     */
    @NameInMap("SampleIndex")
    public String sampleIndex;

    /**
     * <p>The start time of the query window.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-04T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetRLSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRLSampleRequest self = new GetRLSampleRequest();
        return TeaModel.build(map, self);
    }

    public GetRLSampleRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetRLSampleRequest setPromptUid(String promptUid) {
        this.promptUid = promptUid;
        return this;
    }
    public String getPromptUid() {
        return this.promptUid;
    }

    public GetRLSampleRequest setSampleIndex(String sampleIndex) {
        this.sampleIndex = sampleIndex;
        return this;
    }
    public String getSampleIndex() {
        return this.sampleIndex;
    }

    public GetRLSampleRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
