// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsauthorizedprojectRequest extends TeaModel {
    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Search")
    public String search;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutVcsauthorizedprojectRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsauthorizedprojectRequest self = new GetLinkeBahamutVcsauthorizedprojectRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsauthorizedprojectRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutVcsauthorizedprojectRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutVcsauthorizedprojectRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public GetLinkeBahamutVcsauthorizedprojectRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
