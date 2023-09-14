// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListFeatureConsistencyCheckJobConfigsRequest extends TeaModel {
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

    public static ListFeatureConsistencyCheckJobConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureConsistencyCheckJobConfigsRequest self = new ListFeatureConsistencyCheckJobConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListFeatureConsistencyCheckJobConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListFeatureConsistencyCheckJobConfigsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListFeatureConsistencyCheckJobConfigsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListFeatureConsistencyCheckJobConfigsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListFeatureConsistencyCheckJobConfigsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
