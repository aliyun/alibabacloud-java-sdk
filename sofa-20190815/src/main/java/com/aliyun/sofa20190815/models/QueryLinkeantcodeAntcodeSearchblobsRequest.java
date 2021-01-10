// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeSearchblobsRequest extends TeaModel {
    @NameInMap("Language")
    public String language;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("Query")
    public String query;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("Sort")
    public String sort;

    public static QueryLinkeantcodeAntcodeSearchblobsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeSearchblobsRequest self = new QueryLinkeantcodeAntcodeSearchblobsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeSearchblobsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public QueryLinkeantcodeAntcodeSearchblobsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public QueryLinkeantcodeAntcodeSearchblobsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public QueryLinkeantcodeAntcodeSearchblobsRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public QueryLinkeantcodeAntcodeSearchblobsRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

}
