// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteSlotRequest extends TeaModel {
    // 机器人id
    @NameInMap("RobotCode")
    public String robotCode;

    // 槽位id
    @NameInMap("SlotId")
    public Integer slotId;

    public static DeleteSlotRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSlotRequest self = new DeleteSlotRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSlotRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public DeleteSlotRequest setSlotId(Integer slotId) {
        this.slotId = slotId;
        return this;
    }
    public Integer getSlotId() {
        return this.slotId;
    }

}
