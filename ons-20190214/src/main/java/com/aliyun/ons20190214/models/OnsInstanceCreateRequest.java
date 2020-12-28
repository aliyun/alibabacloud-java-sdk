// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceCreateRequest extends TeaModel {
    @NameInMap("Remark")
    public String remark;

    @NameInMap("InstanceName")
    public String instanceName;

    public static OnsInstanceCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsInstanceCreateRequest self = new OnsInstanceCreateRequest();
        return TeaModel.build(map, self);
    }

    public OnsInstanceCreateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public OnsInstanceCreateRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
