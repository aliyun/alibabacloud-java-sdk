// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutReleasebyappgroupRequest extends TeaModel {
    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("ShowAll")
    public String showAll;

    @NameInMap("Status")
    public String status;

    @NameInMap("Type")
    public String type;

    public static GetLinkeBahamutReleasebyappgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutReleasebyappgroupRequest self = new GetLinkeBahamutReleasebyappgroupRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutReleasebyappgroupRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public GetLinkeBahamutReleasebyappgroupRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetLinkeBahamutReleasebyappgroupRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutReleasebyappgroupRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutReleasebyappgroupRequest setShowAll(String showAll) {
        this.showAll = showAll;
        return this;
    }
    public String getShowAll() {
        return this.showAll;
    }

    public GetLinkeBahamutReleasebyappgroupRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetLinkeBahamutReleasebyappgroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
