// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class AddCoreEntryRequest extends TeaModel {
    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("SimilarEntry")
    public AddCoreEntryRequestSimilarEntry similarEntry;

    @NameInMap("SlotId")
    public Integer slotId;

    public static AddCoreEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCoreEntryRequest self = new AddCoreEntryRequest();
        return TeaModel.build(map, self);
    }

    public AddCoreEntryRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public AddCoreEntryRequest setSimilarEntry(AddCoreEntryRequestSimilarEntry similarEntry) {
        this.similarEntry = similarEntry;
        return this;
    }
    public AddCoreEntryRequestSimilarEntry getSimilarEntry() {
        return this.similarEntry;
    }

    public AddCoreEntryRequest setSlotId(Integer slotId) {
        this.slotId = slotId;
        return this;
    }
    public Integer getSlotId() {
        return this.slotId;
    }

    public static class AddCoreEntryRequestSimilarEntry extends TeaModel {
        @NameInMap("CoreValue")
        public String coreValue;

        @NameInMap("SimilarValues")
        public java.util.List<String> similarValues;

        public static AddCoreEntryRequestSimilarEntry build(java.util.Map<String, ?> map) throws Exception {
            AddCoreEntryRequestSimilarEntry self = new AddCoreEntryRequestSimilarEntry();
            return TeaModel.build(map, self);
        }

        public AddCoreEntryRequestSimilarEntry setCoreValue(String coreValue) {
            this.coreValue = coreValue;
            return this;
        }
        public String getCoreValue() {
            return this.coreValue;
        }

        public AddCoreEntryRequestSimilarEntry setSimilarValues(java.util.List<String> similarValues) {
            this.similarValues = similarValues;
            return this;
        }
        public java.util.List<String> getSimilarValues() {
            return this.similarValues;
        }

    }

}
