// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryIntentionListRequest extends TeaModel {
    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SortFiled")
    public String sortFiled;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Type")
    public Integer type;

    public static QueryIntentionListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIntentionListRequest self = new QueryIntentionListRequest();
        return TeaModel.build(map, self);
    }

    public QueryIntentionListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryIntentionListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryIntentionListRequest setSortFiled(String sortFiled) {
        this.sortFiled = sortFiled;
        return this;
    }
    public String getSortFiled() {
        return this.sortFiled;
    }

    public QueryIntentionListRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public QueryIntentionListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryIntentionListRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
