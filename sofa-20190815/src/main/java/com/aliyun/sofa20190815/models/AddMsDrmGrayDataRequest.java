// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsDrmGrayDataRequest extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("Hosts")
    public String hosts;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Value")
    public String value;

    public static AddMsDrmGrayDataRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMsDrmGrayDataRequest self = new AddMsDrmGrayDataRequest();
        return TeaModel.build(map, self);
    }

    public AddMsDrmGrayDataRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public AddMsDrmGrayDataRequest setHosts(String hosts) {
        this.hosts = hosts;
        return this;
    }
    public String getHosts() {
        return this.hosts;
    }

    public AddMsDrmGrayDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddMsDrmGrayDataRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
