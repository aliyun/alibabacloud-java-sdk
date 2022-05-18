// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class AddBlackEntryRequest extends TeaModel {
    // 黑名单词值
    @NameInMap("BlackEntryValue")
    public String blackEntryValue;

    // 机器人id
    @NameInMap("RobotCode")
    public String robotCode;

    // 槽位id
    @NameInMap("SlotId")
    public Integer slotId;

    public static AddBlackEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBlackEntryRequest self = new AddBlackEntryRequest();
        return TeaModel.build(map, self);
    }

    public AddBlackEntryRequest setBlackEntryValue(String blackEntryValue) {
        this.blackEntryValue = blackEntryValue;
        return this;
    }
    public String getBlackEntryValue() {
        return this.blackEntryValue;
    }

    public AddBlackEntryRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public AddBlackEntryRequest setSlotId(Integer slotId) {
        this.slotId = slotId;
        return this;
    }
    public Integer getSlotId() {
        return this.slotId;
    }

}
