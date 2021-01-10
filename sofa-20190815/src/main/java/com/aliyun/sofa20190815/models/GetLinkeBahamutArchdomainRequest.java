// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutArchdomainRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserId")
    public String userId;

    public static GetLinkeBahamutArchdomainRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutArchdomainRequest self = new GetLinkeBahamutArchdomainRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutArchdomainRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetLinkeBahamutArchdomainRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutArchdomainRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutArchdomainRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetLinkeBahamutArchdomainRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
