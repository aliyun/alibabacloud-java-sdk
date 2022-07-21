// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class StopJobsResponseBody extends TeaModel {
    // 作业ID列表
    @NameInMap("JobIds")
    public java.util.List<String> jobIds;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static StopJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopJobsResponseBody self = new StopJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public StopJobsResponseBody setJobIds(java.util.List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public java.util.List<String> getJobIds() {
        return this.jobIds;
    }

    public StopJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
