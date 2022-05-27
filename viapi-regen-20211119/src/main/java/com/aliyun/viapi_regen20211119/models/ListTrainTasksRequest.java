// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class ListTrainTasksRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static ListTrainTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrainTasksRequest self = new ListTrainTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListTrainTasksRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListTrainTasksRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTrainTasksRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
