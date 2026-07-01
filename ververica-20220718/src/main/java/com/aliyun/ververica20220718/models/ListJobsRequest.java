// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListJobsRequest extends TeaModel {
    /**
     * <p>The ID of the deployment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>58718c99-3b29-4c5e-93bb-c9fc4ec6****</p>
     */
    @NameInMap("deploymentId")
    public String deploymentId;

    /**
     * <p>The page number to return. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page. Maximum value: 100. Minimum value: 1. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The field to sort the results by.</p>
     * 
     * <strong>example:</strong>
     * <p>gmt_create</p>
     */
    @NameInMap("sortName")
    public String sortName;

    @NameInMap("sortOrder")
    public String sortOrder;

    public static ListJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobsRequest self = new ListJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListJobsRequest setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public ListJobsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobsRequest setSortName(String sortName) {
        this.sortName = sortName;
        return this;
    }
    public String getSortName() {
        return this.sortName;
    }

    public ListJobsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

}
