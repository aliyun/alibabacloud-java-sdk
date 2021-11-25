// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    // 作业列表
    @NameInMap("Jobs")
    public java.util.List<JobItem> jobs;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 符合过滤条件的总作业数
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobsResponseBody self = new ListJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobsResponseBody setJobs(java.util.List<JobItem> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<JobItem> getJobs() {
        return this.jobs;
    }

    public ListJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
