// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeJobRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("VersionId")
    public String versionId;

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

    public DescribeJobRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
