// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneinternaldailyreleasesRequest extends TeaModel {
    @NameInMap("IdOrSummary")
    public String idOrSummary;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    public static GetLinkeBahamutAoneinternaldailyreleasesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneinternaldailyreleasesRequest self = new GetLinkeBahamutAoneinternaldailyreleasesRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneinternaldailyreleasesRequest setIdOrSummary(String idOrSummary) {
        this.idOrSummary = idOrSummary;
        return this;
    }
    public String getIdOrSummary() {
        return this.idOrSummary;
    }

    public GetLinkeBahamutAoneinternaldailyreleasesRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutAoneinternaldailyreleasesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
