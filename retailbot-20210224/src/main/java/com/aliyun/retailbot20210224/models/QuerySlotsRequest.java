// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QuerySlotsRequest extends TeaModel {
    @NameInMap("CategoryId")
    public Integer categoryId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("Source")
    public Integer source;

    @NameInMap("Type")
    public Integer type;

    public static QuerySlotsRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySlotsRequest self = new QuerySlotsRequest();
        return TeaModel.build(map, self);
    }

    public QuerySlotsRequest setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public QuerySlotsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QuerySlotsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QuerySlotsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySlotsRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public QuerySlotsRequest setSource(Integer source) {
        this.source = source;
        return this;
    }
    public Integer getSource() {
        return this.source;
    }

    public QuerySlotsRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
