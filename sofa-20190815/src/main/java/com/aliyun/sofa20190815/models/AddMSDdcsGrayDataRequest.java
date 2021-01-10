// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMSDdcsGrayDataRequest extends TeaModel {
    @NameInMap("AttributeId")
    public Integer attributeId;

    @NameInMap("Data")
    public String data;

    @NameInMap("Hosts")
    public String hosts;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Operator")
    public String operator;

    public static AddMSDdcsGrayDataRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMSDdcsGrayDataRequest self = new AddMSDdcsGrayDataRequest();
        return TeaModel.build(map, self);
    }

    public AddMSDdcsGrayDataRequest setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
        return this;
    }
    public Integer getAttributeId() {
        return this.attributeId;
    }

    public AddMSDdcsGrayDataRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AddMSDdcsGrayDataRequest setHosts(String hosts) {
        this.hosts = hosts;
        return this;
    }
    public String getHosts() {
        return this.hosts;
    }

    public AddMSDdcsGrayDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddMSDdcsGrayDataRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
