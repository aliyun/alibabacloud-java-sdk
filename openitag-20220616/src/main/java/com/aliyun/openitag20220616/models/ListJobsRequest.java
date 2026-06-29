// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class ListJobsRequest extends TeaModel {
    /**
     * <p>Task Type. Currently, only DOWNLOWD_MARKRESULT_FLOW is available.</p>
     * 
     * <strong>example:</strong>
     * <p>DOWNLOWD_MARKRESULT_FLOW</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The quantity of annotation results displayed per page in a paged query. The default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page number of the annotation result list. The starting value is 1, and the default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobsRequest self = new ListJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListJobsRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ListJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
