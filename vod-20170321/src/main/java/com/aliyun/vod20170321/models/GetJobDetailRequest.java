// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetJobDetailRequest extends TeaModel {
    /**
     * <p>The ID of the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5c9dff***************59d50a967f5</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li>transcode</li>
     * <li>snapshot</li>
     * <li>ai</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>transcode</p>
     */
    @NameInMap("JobType")
    public String jobType;

    public static GetJobDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobDetailRequest self = new GetJobDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetJobDetailRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetJobDetailRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

}
