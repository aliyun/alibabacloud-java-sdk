// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetJobLogRequest extends TeaModel {
    @NameInMap("JobId")
    @Validation(required = true)
    public String jobId;

    @NameInMap("VcName")
    @Validation(required = true)
    public String vcName;

    public static GetJobLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobLogRequest self = new GetJobLogRequest();
        return TeaModel.build(map, self);
    }

    public GetJobLogRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetJobLogRequest setVcName(String vcName) {
        this.vcName = vcName;
        return this;
    }
    public String getVcName() {
        return this.vcName;
    }

}
