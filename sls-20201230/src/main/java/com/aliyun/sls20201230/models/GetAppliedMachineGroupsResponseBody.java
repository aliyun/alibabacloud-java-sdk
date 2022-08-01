// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetAppliedMachineGroupsResponseBody extends TeaModel {
    @NameInMap("count")
    public Integer count;

    @NameInMap("machinegroups")
    public java.util.List<String> machinegroups;

    public static GetAppliedMachineGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppliedMachineGroupsResponseBody self = new GetAppliedMachineGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppliedMachineGroupsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public GetAppliedMachineGroupsResponseBody setMachinegroups(java.util.List<String> machinegroups) {
        this.machinegroups = machinegroups;
        return this;
    }
    public java.util.List<String> getMachinegroups() {
        return this.machinegroups;
    }

}
