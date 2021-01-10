// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutTasksgettaskbykeywordRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    public static GetLinkeBahamutTasksgettaskbykeywordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutTasksgettaskbykeywordRequest self = new GetLinkeBahamutTasksgettaskbykeywordRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutTasksgettaskbykeywordRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetLinkeBahamutTasksgettaskbykeywordRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutTasksgettaskbykeywordRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
