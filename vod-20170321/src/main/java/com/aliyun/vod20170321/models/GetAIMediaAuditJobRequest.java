// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIMediaAuditJobRequest extends TeaModel {
    /**
     * <p>The ID of the intelligent review job.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetAIMediaAuditJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAIMediaAuditJobRequest self = new GetAIMediaAuditJobRequest();
        return TeaModel.build(map, self);
    }

    public GetAIMediaAuditJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
