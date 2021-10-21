// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryOfficialFileCustomListRequest extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNum")
    public Integer pageNum;

    public static QueryOfficialFileCustomListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOfficialFileCustomListRequest self = new QueryOfficialFileCustomListRequest();
        return TeaModel.build(map, self);
    }

    public QueryOfficialFileCustomListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryOfficialFileCustomListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

}
