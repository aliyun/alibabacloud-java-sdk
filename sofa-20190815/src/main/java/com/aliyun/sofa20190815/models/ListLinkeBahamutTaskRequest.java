// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutTaskRequest extends TeaModel {
    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("SearchText")
    public String searchText;

    @NameInMap("Status")
    public String status;

    @NameInMap("TenantName")
    public String tenantName;

    @NameInMap("Type")
    public String type;

    @NameInMap("WithAssignee")
    public String withAssignee;

    public static ListLinkeBahamutTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutTaskRequest self = new ListLinkeBahamutTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutTaskRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public ListLinkeBahamutTaskRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListLinkeBahamutTaskRequest setSearchText(String searchText) {
        this.searchText = searchText;
        return this;
    }
    public String getSearchText() {
        return this.searchText;
    }

    public ListLinkeBahamutTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListLinkeBahamutTaskRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public ListLinkeBahamutTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListLinkeBahamutTaskRequest setWithAssignee(String withAssignee) {
        this.withAssignee = withAssignee;
        return this;
    }
    public String getWithAssignee() {
        return this.withAssignee;
    }

}
