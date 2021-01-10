// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinklogStoresRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public String currentPage;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageSize")
    public String pageSize;

    public static ListLinkeLinklogStoresRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinklogStoresRequest self = new ListLinkeLinklogStoresRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinklogStoresRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public ListLinkeLinklogStoresRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListLinkeLinklogStoresRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
