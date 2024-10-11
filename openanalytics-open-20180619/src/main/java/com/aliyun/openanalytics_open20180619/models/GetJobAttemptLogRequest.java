// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetJobAttemptLogRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>j202105272322hangzhou5d64f1560000128-0001</p>
     */
    @NameInMap("JobAttemptId")
    public String jobAttemptId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>j202105272322hangzhou5d64f1560000128</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>release-test</p>
     */
    @NameInMap("VcName")
    public String vcName;

    public static GetJobAttemptLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobAttemptLogRequest self = new GetJobAttemptLogRequest();
        return TeaModel.build(map, self);
    }

    public GetJobAttemptLogRequest setJobAttemptId(String jobAttemptId) {
        this.jobAttemptId = jobAttemptId;
        return this;
    }
    public String getJobAttemptId() {
        return this.jobAttemptId;
    }

    public GetJobAttemptLogRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetJobAttemptLogRequest setVcName(String vcName) {
        this.vcName = vcName;
        return this;
    }
    public String getVcName() {
        return this.vcName;
    }

}
