// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteHistoryJobRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("JobId")
    public String jobId;

    public static DeleteHistoryJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHistoryJobRequest self = new DeleteHistoryJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHistoryJobRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteHistoryJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
