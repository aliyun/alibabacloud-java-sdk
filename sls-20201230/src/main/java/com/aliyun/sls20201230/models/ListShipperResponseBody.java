// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListShipperResponseBody extends TeaModel {
    /**
     * <p>The number of log shipping jobs returned.</p>
     */
    @NameInMap("count")
    public Long count;

    /**
     * <p>The names of the log shipping jobs.</p>
     */
    @NameInMap("shipper")
    public java.util.List<String> shipper;

    /**
     * <p>The total number of log shipping jobs.</p>
     */
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
