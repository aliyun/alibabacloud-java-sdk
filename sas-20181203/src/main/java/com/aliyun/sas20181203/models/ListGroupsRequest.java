// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListGroupsRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("UseNextToken")
    public Boolean useNextToken;

    public static ListGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsRequest self = new ListGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListGroupsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListGroupsRequest setUseNextToken(Boolean useNextToken) {
        this.useNextToken = useNextToken;
        return this;
    }
    public Boolean getUseNextToken() {
        return this.useNextToken;
    }

}
