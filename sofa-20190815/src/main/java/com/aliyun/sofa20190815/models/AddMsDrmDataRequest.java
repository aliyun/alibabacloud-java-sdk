// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsDrmDataRequest extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PushCells")
    public String pushCells;

    @NameInMap("PushTargetType")
    public String pushTargetType;

    @NameInMap("Value")
    public String value;

    public static AddMsDrmDataRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMsDrmDataRequest self = new AddMsDrmDataRequest();
        return TeaModel.build(map, self);
    }

    public AddMsDrmDataRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public AddMsDrmDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddMsDrmDataRequest setPushCells(String pushCells) {
        this.pushCells = pushCells;
        return this;
    }
    public String getPushCells() {
        return this.pushCells;
    }

    public AddMsDrmDataRequest setPushTargetType(String pushTargetType) {
        this.pushTargetType = pushTargetType;
        return this;
    }
    public String getPushTargetType() {
        return this.pushTargetType;
    }

    public AddMsDrmDataRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
