// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTarsTenantRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeTarsTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTarsTenantRequest self = new DescribeTarsTenantRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTarsTenantRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
