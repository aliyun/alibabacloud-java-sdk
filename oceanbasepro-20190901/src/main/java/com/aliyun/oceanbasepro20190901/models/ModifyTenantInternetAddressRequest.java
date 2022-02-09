// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantInternetAddressRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InternetAddressStatus")
    public String internetAddressStatus;

    @NameInMap("TenantId")
    public String tenantId;

    public static ModifyTenantInternetAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantInternetAddressRequest self = new ModifyTenantInternetAddressRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTenantInternetAddressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTenantInternetAddressRequest setInternetAddressStatus(String internetAddressStatus) {
        this.internetAddressStatus = internetAddressStatus;
        return this;
    }
    public String getInternetAddressStatus() {
        return this.internetAddressStatus;
    }

    public ModifyTenantInternetAddressRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
