// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutTaskbykeywordRequest extends TeaModel {
    @NameInMap("Field")
    public String field;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Order")
    public String order;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutTaskbykeywordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutTaskbykeywordRequest self = new GetLinkeBahamutTaskbykeywordRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutTaskbykeywordRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public GetLinkeBahamutTaskbykeywordRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetLinkeBahamutTaskbykeywordRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public GetLinkeBahamutTaskbykeywordRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutTaskbykeywordRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutTaskbykeywordRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
