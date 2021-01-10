// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktIterationsRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("ProjectSign")
    public String projectSign;

    public static QueryLinkeLinktIterationsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktIterationsRequest self = new QueryLinkeLinktIterationsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktIterationsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryLinkeLinktIterationsRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public QueryLinkeLinktIterationsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryLinkeLinktIterationsRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
