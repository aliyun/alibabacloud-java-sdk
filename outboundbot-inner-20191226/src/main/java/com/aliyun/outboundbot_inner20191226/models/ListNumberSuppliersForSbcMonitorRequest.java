// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot_inner20191226.models;

import com.aliyun.tea.*;

public class ListNumberSuppliersForSbcMonitorRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListNumberSuppliersForSbcMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNumberSuppliersForSbcMonitorRequest self = new ListNumberSuppliersForSbcMonitorRequest();
        return TeaModel.build(map, self);
    }

    public ListNumberSuppliersForSbcMonitorRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNumberSuppliersForSbcMonitorRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
