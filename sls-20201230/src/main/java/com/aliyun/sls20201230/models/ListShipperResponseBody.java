// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListShipperResponseBody extends TeaModel {
    @NameInMap("count")
    public Long count;

    @NameInMap("shipper")
    public java.util.List<String> shipper;

    @NameInMap("total")
    public Long total;

    public static ListShipperResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListShipperResponseBody self = new ListShipperResponseBody();
        return TeaModel.build(map, self);
    }

    public ListShipperResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListShipperResponseBody setShipper(java.util.List<String> shipper) {
        this.shipper = shipper;
        return this;
    }
    public java.util.List<String> getShipper() {
        return this.shipper;
    }

    public ListShipperResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
