// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AcceptApproveCommandRequest extends TeaModel {
    @NameInMap("CommandId")
    public String commandId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static AcceptApproveCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        AcceptApproveCommandRequest self = new AcceptApproveCommandRequest();
        return TeaModel.build(map, self);
    }

    public AcceptApproveCommandRequest setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public AcceptApproveCommandRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AcceptApproveCommandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
