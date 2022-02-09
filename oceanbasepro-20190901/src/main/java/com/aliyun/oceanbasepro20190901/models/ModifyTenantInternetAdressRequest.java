// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantInternetAdressRequest extends TeaModel {
    @NameInMap("InternetAddressStatus")
    public String internetAddressStatus;

    @NameInMap("TenantId")
    public String tenantId;

    public static ModifyTenantInternetAdressRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantInternetAdressRequest self = new ModifyTenantInternetAdressRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTenantInternetAdressRequest setInternetAddressStatus(String internetAddressStatus) {
        this.internetAddressStatus = internetAddressStatus;
        return this;
    }
    public String getInternetAddressStatus() {
        return this.internetAddressStatus;
    }

    public ModifyTenantInternetAdressRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
