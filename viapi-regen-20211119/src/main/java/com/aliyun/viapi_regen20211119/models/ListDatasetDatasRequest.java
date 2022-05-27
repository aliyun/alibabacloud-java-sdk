// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class ListDatasetDatasRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("DatasetId")
    public Long datasetId;

    @NameInMap("Identity")
    public String identity;

    @NameInMap("PageSize")
    public Long pageSize;

    public static ListDatasetDatasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetDatasRequest self = new ListDatasetDatasRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasetDatasRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListDatasetDatasRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public ListDatasetDatasRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public ListDatasetDatasRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
