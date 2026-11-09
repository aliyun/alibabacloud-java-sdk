// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetVideoCreativeGenerationJobRequest extends TeaModel {
    /**
     * <p>The job ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2ff6142097984dde9591925df43291a9</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetVideoCreativeGenerationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoCreativeGenerationJobRequest self = new GetVideoCreativeGenerationJobRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoCreativeGenerationJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
