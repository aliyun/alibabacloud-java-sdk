// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTmCollectionPageListRequest extends TeaModel {
    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryTmCollectionPageListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTmCollectionPageListRequest self = new QueryTmCollectionPageListRequest();
        return TeaModel.build(map, self);
    }

    public QueryTmCollectionPageListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryTmCollectionPageListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
