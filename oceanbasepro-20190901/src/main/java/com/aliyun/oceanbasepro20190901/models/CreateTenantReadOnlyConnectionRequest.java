// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantReadOnlyConnectionRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 租户ID。
    @NameInMap("TenantId")
    public String tenantId;

    // 可用区的ZoneId。 详细参见DescribeInstance中的AvailableZones。
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateTenantReadOnlyConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantReadOnlyConnectionRequest self = new CreateTenantReadOnlyConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateTenantReadOnlyConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTenantReadOnlyConnectionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTenantReadOnlyConnectionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateTenantReadOnlyConnectionRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
