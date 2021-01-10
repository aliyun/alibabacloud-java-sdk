// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMSDdcsDataRequest extends TeaModel {
    @NameInMap("AttributeId")
    public Integer attributeId;

    @NameInMap("Cells")
    public String cells;

    @NameInMap("Data")
    public String data;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Operator")
    public String operator;

    public static AddMSDdcsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMSDdcsDataRequest self = new AddMSDdcsDataRequest();
        return TeaModel.build(map, self);
    }

    public AddMSDdcsDataRequest setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
        return this;
    }
    public Integer getAttributeId() {
        return this.attributeId;
    }

    public AddMSDdcsDataRequest setCells(String cells) {
        this.cells = cells;
        return this;
    }
    public String getCells() {
        return this.cells;
    }

    public AddMSDdcsDataRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AddMSDdcsDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddMSDdcsDataRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
