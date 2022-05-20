// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteBlackEntryRequest extends TeaModel {
    // 黑名单词id
    @NameInMap("BlackEntryId")
    public Integer blackEntryId;

    // 机器人id
    @NameInMap("RobotCode")
    public String robotCode;

    // 槽位id
    @NameInMap("SlotId")
    public Integer slotId;

    public static DeleteBlackEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlackEntryRequest self = new DeleteBlackEntryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBlackEntryRequest setBlackEntryId(Integer blackEntryId) {
        this.blackEntryId = blackEntryId;
        return this;
    }
    public Integer getBlackEntryId() {
        return this.blackEntryId;
    }

    public DeleteBlackEntryRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public DeleteBlackEntryRequest setSlotId(Integer slotId) {
        this.slotId = slotId;
        return this;
    }
    public Integer getSlotId() {
        return this.slotId;
    }

}
