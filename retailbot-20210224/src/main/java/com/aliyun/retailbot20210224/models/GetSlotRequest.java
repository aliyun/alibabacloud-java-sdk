// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetSlotRequest extends TeaModel {
    // 机器人id
    @NameInMap("RobotCode")
    public String robotCode;

    // 槽位id
    @NameInMap("SlotId")
    public Integer slotId;

    public static GetSlotRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSlotRequest self = new GetSlotRequest();
        return TeaModel.build(map, self);
    }

    public GetSlotRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public GetSlotRequest setSlotId(Integer slotId) {
        this.slotId = slotId;
        return this;
    }
    public Integer getSlotId() {
        return this.slotId;
    }

}
