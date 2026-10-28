// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class DeleteMachineGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>mg1</p>
     */
    @NameInMap("MachineGroupID")
    public String machineGroupID;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F2D0392B-D749-5C48-A98A-3FAE5C9444A6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMachineGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMachineGroupResponseBody self = new DeleteMachineGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMachineGroupResponseBody setMachineGroupID(String machineGroupID) {
        this.machineGroupID = machineGroupID;
        return this;
    }
    public String getMachineGroupID() {
        return this.machineGroupID;
    }

    public DeleteMachineGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
