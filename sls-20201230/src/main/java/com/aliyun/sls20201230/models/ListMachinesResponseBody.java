// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMachinesResponseBody extends TeaModel {
    // 当前页返回的机器数目。
    @NameInMap("count")
    public Integer count;

    // 返回的机器信息列表。
    @NameInMap("machines")
    public java.util.List<Machine> machines;

    // 机器总数。
    @NameInMap("total")
    public Integer total;

    public static ListMachinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMachinesResponseBody self = new ListMachinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMachinesResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListMachinesResponseBody setMachines(java.util.List<Machine> machines) {
        this.machines = machines;
        return this;
    }
    public java.util.List<Machine> getMachines() {
        return this.machines;
    }

    public ListMachinesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
