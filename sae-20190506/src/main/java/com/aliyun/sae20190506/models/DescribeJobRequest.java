// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeJobRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The job ID.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static DescribeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobRequest self = new DescribeJobRequest();
        return TeaModel.build(map, self);
    }

    public DescribeJobRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
