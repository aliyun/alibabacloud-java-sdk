// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktMyparticipatedprojectsRequest extends TeaModel {
    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    public static QueryLinkeLinktMyparticipatedprojectsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktMyparticipatedprojectsRequest self = new QueryLinkeLinktMyparticipatedprojectsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktMyparticipatedprojectsRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public QueryLinkeLinktMyparticipatedprojectsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
