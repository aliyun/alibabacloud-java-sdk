// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListResourceGroupMachineGroupsResponseBody extends TeaModel {
    @NameInMap("MachineGroups")
    public java.util.List<MachineGroup> machineGroups;

    /**
     * <strong>example:</strong>
     * <p>E7C42CC7-2E85-508A-84F4-923B605FD10F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListResourceGroupMachineGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupMachineGroupsResponseBody self = new ListResourceGroupMachineGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupMachineGroupsResponseBody setMachineGroups(java.util.List<MachineGroup> machineGroups) {
        this.machineGroups = machineGroups;
        return this;
    }
    public java.util.List<MachineGroup> getMachineGroups() {
        return this.machineGroups;
    }

    public ListResourceGroupMachineGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceGroupMachineGroupsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

}
