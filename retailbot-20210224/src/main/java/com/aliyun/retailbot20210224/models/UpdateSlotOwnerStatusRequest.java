// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateSlotOwnerStatusRequest extends TeaModel {
    @NameInMap("OwnStatus")
    public Integer ownStatus;

    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("SlotId")
    public Integer slotId;

    public static UpdateSlotOwnerStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSlotOwnerStatusRequest self = new UpdateSlotOwnerStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSlotOwnerStatusRequest setOwnStatus(Integer ownStatus) {
        this.ownStatus = ownStatus;
        return this;
    }
    public Integer getOwnStatus() {
        return this.ownStatus;
    }

    public UpdateSlotOwnerStatusRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public UpdateSlotOwnerStatusRequest setSlotId(Integer slotId) {
        this.slotId = slotId;
        return this;
    }
    public Integer getSlotId() {
        return this.slotId;
    }

}
