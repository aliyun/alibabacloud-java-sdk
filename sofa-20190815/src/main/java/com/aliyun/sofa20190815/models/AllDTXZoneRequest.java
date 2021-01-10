// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AllDTXZoneRequest extends TeaModel {
    @NameInMap("Env")
    public String env;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TenantName")
    public String tenantName;

    public static AllDTXZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        AllDTXZoneRequest self = new AllDTXZoneRequest();
        return TeaModel.build(map, self);
    }

    public AllDTXZoneRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public AllDTXZoneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AllDTXZoneRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
