// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeBahamutSearchappRequest extends TeaModel {
    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Search")
    public String search;

    @NameInMap("TenantPath")
    public String tenantPath;

    public static ExecLinkeBahamutSearchappRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeBahamutSearchappRequest self = new ExecLinkeBahamutSearchappRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeBahamutSearchappRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public ExecLinkeBahamutSearchappRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ExecLinkeBahamutSearchappRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ExecLinkeBahamutSearchappRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
