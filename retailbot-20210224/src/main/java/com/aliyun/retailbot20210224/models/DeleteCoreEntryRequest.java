// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteCoreEntryRequest extends TeaModel {
    // 机器人id
    @NameInMap("RobotCode")
    public String robotCode;

    // 核心同义词信息
    @NameInMap("SimilarEntry")
    public DeleteCoreEntryRequestSimilarEntry similarEntry;

    // 槽位id
    @NameInMap("SlotId")
    public Integer slotId;

    public static DeleteCoreEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCoreEntryRequest self = new DeleteCoreEntryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCoreEntryRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public DeleteCoreEntryRequest setSimilarEntry(DeleteCoreEntryRequestSimilarEntry similarEntry) {
        this.similarEntry = similarEntry;
        return this;
    }
    public DeleteCoreEntryRequestSimilarEntry getSimilarEntry() {
        return this.similarEntry;
    }

    public DeleteCoreEntryRequest setSlotId(Integer slotId) {
        this.slotId = slotId;
        return this;
    }
    public Integer getSlotId() {
        return this.slotId;
    }

    public static class DeleteCoreEntryRequestSimilarEntry extends TeaModel {
        // 核心词id
        @NameInMap("CoreEntryId")
        public Integer coreEntryId;

        public static DeleteCoreEntryRequestSimilarEntry build(java.util.Map<String, ?> map) throws Exception {
            DeleteCoreEntryRequestSimilarEntry self = new DeleteCoreEntryRequestSimilarEntry();
            return TeaModel.build(map, self);
        }

        public DeleteCoreEntryRequestSimilarEntry setCoreEntryId(Integer coreEntryId) {
            this.coreEntryId = coreEntryId;
            return this;
        }
        public Integer getCoreEntryId() {
            return this.coreEntryId;
        }

    }

}
