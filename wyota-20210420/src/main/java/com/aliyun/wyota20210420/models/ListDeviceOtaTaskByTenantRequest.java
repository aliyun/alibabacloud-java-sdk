// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListDeviceOtaTaskByTenantRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDeviceOtaTaskByTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceOtaTaskByTenantRequest self = new ListDeviceOtaTaskByTenantRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceOtaTaskByTenantRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDeviceOtaTaskByTenantRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
