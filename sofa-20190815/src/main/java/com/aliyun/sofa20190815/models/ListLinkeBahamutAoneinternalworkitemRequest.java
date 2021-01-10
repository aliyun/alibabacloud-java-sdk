// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutAoneinternalworkitemRequest extends TeaModel {
    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("SearchText")
    public String searchText;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("Stamp")
    public String stamp;

    @NameInMap("Status")
    public String status;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Type")
    public String type;

    public static ListLinkeBahamutAoneinternalworkitemRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutAoneinternalworkitemRequest self = new ListLinkeBahamutAoneinternalworkitemRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutAoneinternalworkitemRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public ListLinkeBahamutAoneinternalworkitemRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListLinkeBahamutAoneinternalworkitemRequest setSearchText(String searchText) {
        this.searchText = searchText;
        return this;
    }
    public String getSearchText() {
        return this.searchText;
    }

    public ListLinkeBahamutAoneinternalworkitemRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListLinkeBahamutAoneinternalworkitemRequest setStamp(String stamp) {
        this.stamp = stamp;
        return this;
    }
    public String getStamp() {
        return this.stamp;
    }

    public ListLinkeBahamutAoneinternalworkitemRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListLinkeBahamutAoneinternalworkitemRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListLinkeBahamutAoneinternalworkitemRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
