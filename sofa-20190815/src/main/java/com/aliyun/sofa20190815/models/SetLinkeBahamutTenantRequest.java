// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLinkeBahamutTenantRequest extends TeaModel {
    @NameInMap("TenantName")
    public String tenantName;

    public static SetLinkeBahamutTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLinkeBahamutTenantRequest self = new SetLinkeBahamutTenantRequest();
        return TeaModel.build(map, self);
    }

    public SetLinkeBahamutTenantRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
