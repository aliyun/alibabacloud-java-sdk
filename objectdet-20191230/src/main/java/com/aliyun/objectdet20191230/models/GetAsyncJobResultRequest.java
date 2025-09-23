// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class GetAsyncJobResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>35B11E1B-800C-4598-B5AA-577E3BDBD917</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetAsyncJobResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncJobResultRequest self = new GetAsyncJobResultRequest();
        return TeaModel.build(map, self);
    }

    public GetAsyncJobResultRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
