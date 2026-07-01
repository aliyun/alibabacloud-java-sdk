// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListScheduledPlanRequest extends TeaModel {
    /**
     * <p>The ID of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>737d0921-c5ac-47fc-9ba9-07a1e0b4****</p>
     */
    @NameInMap("deploymentId")
    public String deploymentId;

    /**
     * <p>The page number to return. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries to return on each page. The default value is 10. The maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListScheduledPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledPlanRequest self = new ListScheduledPlanRequest();
        return TeaModel.build(map, self);
    }

    public ListScheduledPlanRequest setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public ListScheduledPlanRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListScheduledPlanRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
