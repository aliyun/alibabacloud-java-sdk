// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateMachineGroupMachineRequest extends TeaModel {
    /**
     * <p>The operation on the machine. Valid values: add and delete. A value of add specifies to add the machine to the machine group. A value of delete specifies to remove the machine from the machine group.</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>The machines to be added or removed.</p>
     */
    @NameInMap("body")
    public java.util.List<String> body;

    public static UpdateMachineGroupMachineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMachineGroupMachineRequest self = new UpdateMachineGroupMachineRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMachineGroupMachineRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public UpdateMachineGroupMachineRequest setBody(java.util.List<String> body) {
        this.body = body;
        return this;
    }
    public java.util.List<String> getBody() {
        return this.body;
    }

}
