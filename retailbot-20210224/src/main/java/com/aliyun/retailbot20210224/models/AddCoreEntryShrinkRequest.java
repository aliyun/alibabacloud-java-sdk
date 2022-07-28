// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class AddCoreEntryShrinkRequest extends TeaModel {
    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("SimilarEntry")
    public String similarEntryShrink;

    @NameInMap("SlotId")
    public Integer slotId;

    public static AddCoreEntryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCoreEntryShrinkRequest self = new AddCoreEntryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddCoreEntryShrinkRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public AddCoreEntryShrinkRequest setSimilarEntryShrink(String similarEntryShrink) {
        this.similarEntryShrink = similarEntryShrink;
        return this;
    }
    public String getSimilarEntryShrink() {
        return this.similarEntryShrink;
    }

    public AddCoreEntryShrinkRequest setSlotId(Integer slotId) {
        this.slotId = slotId;
        return this;
    }
    public Integer getSlotId() {
        return this.slotId;
    }

}
