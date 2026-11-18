// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetVideoCharacterReplaceJobRequest extends TeaModel {
    /**
     * <p>The task ID, which is returned by SubmitVideoCharacterReplaceJob.</p>
     * 
     * <strong>example:</strong>
     * <p>ag_83baeea38b534ee1937b8a4acd08****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetVideoCharacterReplaceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoCharacterReplaceJobRequest self = new GetVideoCharacterReplaceJobRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoCharacterReplaceJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
