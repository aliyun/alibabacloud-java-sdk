// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListHandshakesForResourceDirectoryRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListHandshakesForResourceDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHandshakesForResourceDirectoryRequest self = new ListHandshakesForResourceDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public ListHandshakesForResourceDirectoryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHandshakesForResourceDirectoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
