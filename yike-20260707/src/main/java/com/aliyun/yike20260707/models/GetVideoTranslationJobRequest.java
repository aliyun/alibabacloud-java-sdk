// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetVideoTranslationJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vtj_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetVideoTranslationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoTranslationJobRequest self = new GetVideoTranslationJobRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoTranslationJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
