// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetVideoRemakeJobRequest extends TeaModel {
    /**
     * <p>The task ID returned by SubmitVideoRemakeJob.</p>
     * 
     * <strong>example:</strong>
     * <p>0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetVideoRemakeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoRemakeJobRequest self = new GetVideoRemakeJobRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoRemakeJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
