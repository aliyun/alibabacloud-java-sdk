// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListTaskLogsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListTaskLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskLogsRequest self = new ListTaskLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTaskLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
