// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveClriskModelRequest extends TeaModel {
    @NameInMap("DataNodesRepeatList")
    public java.util.List<String> dataNodesRepeatList;

    @NameInMap("ExtMap")
    public java.util.List<SaveClriskModelRequestExtMap> extMap;

    @NameInMap("Memo")
    public String memo;

    @NameInMap("ModelCode")
    public String modelCode;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnersRepeatList")
    public java.util.List<String> ownersRepeatList;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("TriggerDelay")
    public String triggerDelay;

    @NameInMap("TriggerMode")
    public String triggerMode;

    public static SaveClriskModelRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveClriskModelRequest self = new SaveClriskModelRequest();
        return TeaModel.build(map, self);
    }

    public SaveClriskModelRequest setDataNodesRepeatList(java.util.List<String> dataNodesRepeatList) {
        this.dataNodesRepeatList = dataNodesRepeatList;
        return this;
    }
    public java.util.List<String> getDataNodesRepeatList() {
        return this.dataNodesRepeatList;
    }

    public SaveClriskModelRequest setExtMap(java.util.List<SaveClriskModelRequestExtMap> extMap) {
        this.extMap = extMap;
        return this;
    }
    public java.util.List<SaveClriskModelRequestExtMap> getExtMap() {
        return this.extMap;
    }

    public SaveClriskModelRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public SaveClriskModelRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public SaveClriskModelRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SaveClriskModelRequest setOwnersRepeatList(java.util.List<String> ownersRepeatList) {
        this.ownersRepeatList = ownersRepeatList;
        return this;
    }
    public java.util.List<String> getOwnersRepeatList() {
        return this.ownersRepeatList;
    }

    public SaveClriskModelRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public SaveClriskModelRequest setTriggerDelay(String triggerDelay) {
        this.triggerDelay = triggerDelay;
        return this;
    }
    public String getTriggerDelay() {
        return this.triggerDelay;
    }

    public SaveClriskModelRequest setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }
    public String getTriggerMode() {
        return this.triggerMode;
    }

    public static class SaveClriskModelRequestExtMap extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static SaveClriskModelRequestExtMap build(java.util.Map<String, ?> map) throws Exception {
            SaveClriskModelRequestExtMap self = new SaveClriskModelRequestExtMap();
            return TeaModel.build(map, self);
        }

        public SaveClriskModelRequestExtMap setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SaveClriskModelRequestExtMap setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
