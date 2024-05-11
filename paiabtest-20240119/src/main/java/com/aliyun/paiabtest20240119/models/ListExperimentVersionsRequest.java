// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class ListExperimentVersionsRequest extends TeaModel {
    @NameInMap("All")
    public Boolean all;

    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    public static ListExperimentVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentVersionsRequest self = new ListExperimentVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListExperimentVersionsRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public ListExperimentVersionsRequest setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public ListExperimentVersionsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListExperimentVersionsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListExperimentVersionsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListExperimentVersionsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
