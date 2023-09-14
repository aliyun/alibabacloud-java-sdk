// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListFeatureConsistencyCheckJobsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("Status")
    public String status;

    public static ListFeatureConsistencyCheckJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureConsistencyCheckJobsRequest self = new ListFeatureConsistencyCheckJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListFeatureConsistencyCheckJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListFeatureConsistencyCheckJobsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListFeatureConsistencyCheckJobsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListFeatureConsistencyCheckJobsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListFeatureConsistencyCheckJobsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListFeatureConsistencyCheckJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
