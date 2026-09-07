// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetVideoDetextJobRequest extends TeaModel {
    /**
     * <p>The video text erasure task ID returned by SubmitVideoDetextJob.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vdt_0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetVideoDetextJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoDetextJobRequest self = new GetVideoDetextJobRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoDetextJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
