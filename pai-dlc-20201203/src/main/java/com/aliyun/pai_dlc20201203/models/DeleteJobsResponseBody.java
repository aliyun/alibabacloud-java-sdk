// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DeleteJobsResponseBody extends TeaModel {
    @NameInMap("JobIds")
    public java.util.List<String> jobIds;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobsResponseBody self = new DeleteJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteJobsResponseBody setJobIds(java.util.List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public java.util.List<String> getJobIds() {
        return this.jobIds;
    }

    public DeleteJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
