// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class StopJobResponseBody extends TeaModel {
    // 作业Id
    @NameInMap("JobId")
    public String jobId;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static StopJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopJobResponseBody self = new StopJobResponseBody();
        return TeaModel.build(map, self);
    }

    public StopJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public StopJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
