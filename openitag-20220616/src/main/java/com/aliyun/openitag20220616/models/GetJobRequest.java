// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class GetJobRequest extends TeaModel {
    /**
     * <p>Task Type. Currently, only DOWNLOWD_MARKRESULT_FLOW is available.</p>
     * 
     * <strong>example:</strong>
     * <p>DOWNLOWD_MARKRESULT_FLOW</p>
     */
    @NameInMap("JobType")
    public String jobType;

    public static GetJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobRequest self = new GetJobRequest();
        return TeaModel.build(map, self);
    }

    public GetJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

}
