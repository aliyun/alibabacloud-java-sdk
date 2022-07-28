// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateCoreEntryRequest extends TeaModel {
    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("SimilarEntry")
    public UpdateCoreEntryRequestSimilarEntry similarEntry;

    @NameInMap("SlotId")
    public Integer slotId;

    public static UpdateCoreEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCoreEntryRequest self = new UpdateCoreEntryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCoreEntryRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public UpdateCoreEntryRequest setSimilarEntry(UpdateCoreEntryRequestSimilarEntry similarEntry) {
        this.similarEntry = similarEntry;
        return this;
    }
    public UpdateCoreEntryRequestSimilarEntry getSimilarEntry() {
        return this.similarEntry;
    }

    public UpdateCoreEntryRequest setSlotId(Integer slotId) {
        this.slotId = slotId;
        return this;
    }
    public Integer getSlotId() {
        return this.slotId;
    }

    public static class UpdateCoreEntryRequestSimilarEntry extends TeaModel {
        @NameInMap("CoreEntryId")
        public Integer coreEntryId;

        @NameInMap("CoreValue")
        public String coreValue;

        @NameInMap("SimilarValues")
        public java.util.List<String> similarValues;

        public static UpdateCoreEntryRequestSimilarEntry build(java.util.Map<String, ?> map) throws Exception {
            UpdateCoreEntryRequestSimilarEntry self = new UpdateCoreEntryRequestSimilarEntry();
            return TeaModel.build(map, self);
        }

        public UpdateCoreEntryRequestSimilarEntry setCoreEntryId(Integer coreEntryId) {
            this.coreEntryId = coreEntryId;
            return this;
        }
        public Integer getCoreEntryId() {
            return this.coreEntryId;
        }

        public UpdateCoreEntryRequestSimilarEntry setCoreValue(String coreValue) {
            this.coreValue = coreValue;
            return this;
        }
        public String getCoreValue() {
            return this.coreValue;
        }

        public UpdateCoreEntryRequestSimilarEntry setSimilarValues(java.util.List<String> similarValues) {
            this.similarValues = similarValues;
            return this;
        }
        public java.util.List<String> getSimilarValues() {
            return this.similarValues;
        }

    }

}
