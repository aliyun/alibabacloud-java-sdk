// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class ListLabelsetsRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("DatasetId")
    public Long datasetId;

    @NameInMap("PageSize")
    public Long pageSize;

    public static ListLabelsetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLabelsetsRequest self = new ListLabelsetsRequest();
        return TeaModel.build(map, self);
    }

    public ListLabelsetsRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListLabelsetsRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public ListLabelsetsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
