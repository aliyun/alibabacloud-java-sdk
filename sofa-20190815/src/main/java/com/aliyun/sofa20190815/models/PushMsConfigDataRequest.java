// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushMsConfigDataRequest extends TeaModel {
    @NameInMap("AttributeId")
    public Long attributeId;

    @NameInMap("Cells")
    public String cells;

    @NameInMap("Data")
    public String data;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Operator")
    public String operator;

    public static PushMsConfigDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMsConfigDataRequest self = new PushMsConfigDataRequest();
        return TeaModel.build(map, self);
    }

    public PushMsConfigDataRequest setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
        return this;
    }
    public Long getAttributeId() {
        return this.attributeId;
    }

    public PushMsConfigDataRequest setCells(String cells) {
        this.cells = cells;
        return this;
    }
    public String getCells() {
        return this.cells;
    }

    public PushMsConfigDataRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PushMsConfigDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PushMsConfigDataRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
