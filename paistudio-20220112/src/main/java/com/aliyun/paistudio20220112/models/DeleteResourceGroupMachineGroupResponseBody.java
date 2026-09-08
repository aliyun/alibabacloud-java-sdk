// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class DeleteResourceGroupMachineGroupResponseBody extends TeaModel {
    @NameInMap("MachineGroupID")
    public String machineGroupID;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteResourceGroupMachineGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceGroupMachineGroupResponseBody self = new DeleteResourceGroupMachineGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResourceGroupMachineGroupResponseBody setMachineGroupID(String machineGroupID) {
        this.machineGroupID = machineGroupID;
        return this;
    }
    public String getMachineGroupID() {
        return this.machineGroupID;
    }

    public DeleteResourceGroupMachineGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
