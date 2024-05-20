// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeJobStatusRequest extends TeaModel {
    /**
     * <p>The ID of the job template.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The job ID.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static DescribeJobStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobStatusRequest self = new DescribeJobStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeJobStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeJobStatusRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
