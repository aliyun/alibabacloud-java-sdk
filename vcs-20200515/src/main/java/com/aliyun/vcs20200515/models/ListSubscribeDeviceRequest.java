// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListSubscribeDeviceRequest extends TeaModel {
    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListSubscribeDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubscribeDeviceRequest self = new ListSubscribeDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ListSubscribeDeviceRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListSubscribeDeviceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
