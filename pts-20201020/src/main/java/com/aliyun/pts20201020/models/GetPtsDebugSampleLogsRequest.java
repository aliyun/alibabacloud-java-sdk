// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsDebugSampleLogsRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the debugging task.</p>
     * 
     * <strong>example:</strong>
     * <p>NJJBH8B</p>
     */
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
