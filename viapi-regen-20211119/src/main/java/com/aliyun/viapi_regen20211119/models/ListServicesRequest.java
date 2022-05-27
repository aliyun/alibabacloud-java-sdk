// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class ListServicesRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public Long name;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static ListServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServicesRequest self = new ListServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListServicesRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListServicesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListServicesRequest setName(Long name) {
        this.name = name;
        return this;
    }
    public Long getName() {
        return this.name;
    }

    public ListServicesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListServicesRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
