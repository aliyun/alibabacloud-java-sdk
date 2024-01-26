// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20181111.models;

import com.aliyun.tea.*;

public class ListRunnableScenesRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListRunnableScenesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRunnableScenesRequest self = new ListRunnableScenesRequest();
        return TeaModel.build(map, self);
    }

    public ListRunnableScenesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRunnableScenesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
