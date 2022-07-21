// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DeleteJobsRequest extends TeaModel {
    // 作业ID列表
    @NameInMap("JobIds")
    public java.util.List<String> jobIds;

    public static DeleteJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobsRequest self = new DeleteJobsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteJobsRequest setJobIds(java.util.List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public java.util.List<String> getJobIds() {
        return this.jobIds;
    }

}
