// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateBlackEntryRequest extends TeaModel {
    @NameInMap("BlackEntryId")
    public Integer blackEntryId;

    @NameInMap("BlackEntryValue")
    public String blackEntryValue;

    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("SlotId")
    public Integer slotId;

    public static UpdateBlackEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlackEntryRequest self = new UpdateBlackEntryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBlackEntryRequest setBlackEntryId(Integer blackEntryId) {
        this.blackEntryId = blackEntryId;
        return this;
    }
    public Integer getBlackEntryId() {
        return this.blackEntryId;
    }

    public UpdateBlackEntryRequest setBlackEntryValue(String blackEntryValue) {
        this.blackEntryValue = blackEntryValue;
        return this;
    }
    public String getBlackEntryValue() {
        return this.blackEntryValue;
    }

    public UpdateBlackEntryRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public UpdateBlackEntryRequest setSlotId(Integer slotId) {
        this.slotId = slotId;
        return this;
    }
    public Integer getSlotId() {
        return this.slotId;
    }

}
