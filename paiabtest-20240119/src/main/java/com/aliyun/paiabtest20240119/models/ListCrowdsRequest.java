// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class ListCrowdsRequest extends TeaModel {
    @NameInMap("All")
    public Boolean all;

    @NameInMap("CrowdId")
    public String crowdId;

    @NameInMap("CrowdName")
    public String crowdName;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListCrowdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCrowdsRequest self = new ListCrowdsRequest();
        return TeaModel.build(map, self);
    }

    public ListCrowdsRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public ListCrowdsRequest setCrowdId(String crowdId) {
        this.crowdId = crowdId;
        return this;
    }
    public String getCrowdId() {
        return this.crowdId;
    }

    public ListCrowdsRequest setCrowdName(String crowdName) {
        this.crowdName = crowdName;
        return this;
    }
    public String getCrowdName() {
        return this.crowdName;
    }

    public ListCrowdsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListCrowdsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCrowdsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCrowdsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListCrowdsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListCrowdsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
