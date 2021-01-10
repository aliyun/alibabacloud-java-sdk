// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLinkeBahamutTenantcodeconfigRequest extends TeaModel {
    @NameInMap("MyCodeCenterHost")
    public String myCodeCenterHost;

    @NameInMap("TenantExternalId")
    public String tenantExternalId;

    public static SetLinkeBahamutTenantcodeconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLinkeBahamutTenantcodeconfigRequest self = new SetLinkeBahamutTenantcodeconfigRequest();
        return TeaModel.build(map, self);
    }

    public SetLinkeBahamutTenantcodeconfigRequest setMyCodeCenterHost(String myCodeCenterHost) {
        this.myCodeCenterHost = myCodeCenterHost;
        return this;
    }
    public String getMyCodeCenterHost() {
        return this.myCodeCenterHost;
    }

    public SetLinkeBahamutTenantcodeconfigRequest setTenantExternalId(String tenantExternalId) {
        this.tenantExternalId = tenantExternalId;
        return this;
    }
    public String getTenantExternalId() {
        return this.tenantExternalId;
    }

}
