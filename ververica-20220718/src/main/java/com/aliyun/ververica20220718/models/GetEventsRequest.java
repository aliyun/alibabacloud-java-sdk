// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetEventsRequest extends TeaModel {
    /**
     * <p>The ID of the deployed job. If you specify this parameter, the operation returns events only for this job.</p>
     * 
     * <strong>example:</strong>
     * <p>58718c99-3b29-4c5e-93bb-c9fc4ec6****</p>
     */
    @NameInMap("deploymentId")
    public String deploymentId;

    @NameInMap("deploymentName")
    public String deploymentName;

    /**
     * <p>The page number to retrieve. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static GetEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEventsRequest self = new GetEventsRequest();
        return TeaModel.build(map, self);
    }

    public GetEventsRequest setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public GetEventsRequest setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }
    public String getDeploymentName() {
        return this.deploymentName;
    }

    public GetEventsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
