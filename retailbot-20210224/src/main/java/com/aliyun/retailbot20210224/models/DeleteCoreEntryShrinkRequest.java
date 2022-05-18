// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteCoreEntryShrinkRequest extends TeaModel {
    // 机器人id
    @NameInMap("RobotCode")
    public String robotCode;

    // 核心同义词信息
    @NameInMap("SimilarEntry")
    public String similarEntryShrink;

    // 槽位id
    @NameInMap("SlotId")
    public Integer slotId;

    public static DeleteCoreEntryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCoreEntryShrinkRequest self = new DeleteCoreEntryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCoreEntryShrinkRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public DeleteCoreEntryShrinkRequest setSimilarEntryShrink(String similarEntryShrink) {
        this.similarEntryShrink = similarEntryShrink;
        return this;
    }
    public String getSimilarEntryShrink() {
        return this.similarEntryShrink;
    }

    public DeleteCoreEntryShrinkRequest setSlotId(Integer slotId) {
        this.slotId = slotId;
        return this;
    }
    public Integer getSlotId() {
        return this.slotId;
    }

}
