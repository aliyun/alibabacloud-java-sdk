// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ReleaseSasInstanceRequest extends TeaModel {
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ReleaseSasInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseSasInstanceRequest self = new ReleaseSasInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseSasInstanceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ReleaseSasInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
