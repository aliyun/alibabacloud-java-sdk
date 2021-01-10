// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutWorkitemsRequest extends TeaModel {
    @NameInMap("Order")
    public String order;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Search")
    public String search;

    @NameInMap("SprintId")
    public String sprintId;

    public static QueryLinkeBahamutWorkitemsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutWorkitemsRequest self = new QueryLinkeBahamutWorkitemsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutWorkitemsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QueryLinkeBahamutWorkitemsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public QueryLinkeBahamutWorkitemsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLinkeBahamutWorkitemsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryLinkeBahamutWorkitemsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public QueryLinkeBahamutWorkitemsRequest setSprintId(String sprintId) {
        this.sprintId = sprintId;
        return this;
    }
    public String getSprintId() {
        return this.sprintId;
    }

}
