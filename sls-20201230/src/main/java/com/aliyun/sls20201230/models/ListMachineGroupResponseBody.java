// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMachineGroupResponseBody extends TeaModel {
    @NameInMap("count")
    public Integer count;

    @NameInMap("machinegroups")
    public java.util.List<String> machinegroups;

    @NameInMap("total")
    public Integer total;

    public static ListMachineGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMachineGroupResponseBody self = new ListMachineGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMachineGroupResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListMachineGroupResponseBody setMachinegroups(java.util.List<String> machinegroups) {
        this.machinegroups = machinegroups;
        return this;
    }
    public java.util.List<String> getMachinegroups() {
        return this.machinegroups;
    }

    public ListMachineGroupResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
