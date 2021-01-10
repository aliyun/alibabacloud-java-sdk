// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinklogAccountlistRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public String currentPage;

    @NameInMap("Nick")
    public String nick;

    @NameInMap("PageSize")
    public String pageSize;

    public static QueryLinkeLinklogAccountlistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinklogAccountlistRequest self = new QueryLinkeLinklogAccountlistRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinklogAccountlistRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public QueryLinkeLinklogAccountlistRequest setNick(String nick) {
        this.nick = nick;
        return this;
    }
    public String getNick() {
        return this.nick;
    }

    public QueryLinkeLinklogAccountlistRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
