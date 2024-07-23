// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListSavepointsRequest extends TeaModel {
    /**
     * <p>The deployment ID. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>88a8fc49-e090-430a-85d8-3ee8c79c****</p>
     */
    @NameInMap("deploymentId")
    public String deploymentId;

    /**
     * <p>The job ID. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>99a8fc49-e090-430a-85d8-3ee8c79c****</p>
     */
    @NameInMap("jobId")
    public String jobId;

    /**
     * <p>The page number. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListSavepointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSavepointsRequest self = new ListSavepointsRequest();
        return TeaModel.build(map, self);
    }

    public ListSavepointsRequest setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public ListSavepointsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListSavepointsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListSavepointsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
