// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class ListJobPlansResponseBody extends TeaModel {
    @NameInMap("JobPlans")
    public java.util.List<JobPlan> jobPlans;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListJobPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobPlansResponseBody self = new ListJobPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobPlansResponseBody setJobPlans(java.util.List<JobPlan> jobPlans) {
        this.jobPlans = jobPlans;
        return this;
    }
    public java.util.List<JobPlan> getJobPlans() {
        return this.jobPlans;
    }

    public ListJobPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobPlansResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
