// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListAlgorithmVersionsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    public static ListAlgorithmVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlgorithmVersionsRequest self = new ListAlgorithmVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlgorithmVersionsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAlgorithmVersionsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
