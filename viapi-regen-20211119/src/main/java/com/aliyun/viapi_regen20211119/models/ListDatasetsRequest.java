// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class ListDatasetsRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static ListDatasetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetsRequest self = new ListDatasetsRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasetsRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListDatasetsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDatasetsRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
