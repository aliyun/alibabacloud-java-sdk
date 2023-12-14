// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200809.models;

import com.aliyun.tea.*;

public class ListRecentViewReportsRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("OffsetDay")
    public Integer offsetDay;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryMode")
    public String queryMode;

    @NameInMap("TreeType")
    public String treeType;

    @NameInMap("UserId")
    public String userId;

    public static ListRecentViewReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecentViewReportsRequest self = new ListRecentViewReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListRecentViewReportsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListRecentViewReportsRequest setOffsetDay(Integer offsetDay) {
        this.offsetDay = offsetDay;
        return this;
    }
    public Integer getOffsetDay() {
        return this.offsetDay;
    }

    public ListRecentViewReportsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRecentViewReportsRequest setQueryMode(String queryMode) {
        this.queryMode = queryMode;
        return this;
    }
    public String getQueryMode() {
        return this.queryMode;
    }

    public ListRecentViewReportsRequest setTreeType(String treeType) {
        this.treeType = treeType;
        return this;
    }
    public String getTreeType() {
        return this.treeType;
    }

    public ListRecentViewReportsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
