// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class ListWorkspacesRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageSize")
    public Long pageSize;

    public static ListWorkspacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesRequest self = new ListWorkspacesRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListWorkspacesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListWorkspacesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
