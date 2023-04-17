// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsDebugSampleLogsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PlanId")
    public String planId;

    public static GetPtsDebugSampleLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPtsDebugSampleLogsRequest self = new GetPtsDebugSampleLogsRequest();
        return TeaModel.build(map, self);
    }

    public GetPtsDebugSampleLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetPtsDebugSampleLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetPtsDebugSampleLogsRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}
