// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceUpdateRequest extends TeaModel {
    @NameInMap("Remark")
    public String remark;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsInstanceUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsInstanceUpdateRequest self = new OnsInstanceUpdateRequest();
        return TeaModel.build(map, self);
    }

    public OnsInstanceUpdateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public OnsInstanceUpdateRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public OnsInstanceUpdateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
