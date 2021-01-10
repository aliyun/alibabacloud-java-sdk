// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationgetiterationsRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Search")
    public String search;

    public static GetLinkeBahamutIterationgetiterationsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationgetiterationsRequest self = new GetLinkeBahamutIterationgetiterationsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationgetiterationsRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public GetLinkeBahamutIterationgetiterationsRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutIterationgetiterationsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutIterationgetiterationsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

}
