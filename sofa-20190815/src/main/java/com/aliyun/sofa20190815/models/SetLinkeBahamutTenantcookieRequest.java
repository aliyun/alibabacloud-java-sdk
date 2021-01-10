// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLinkeBahamutTenantcookieRequest extends TeaModel {
    @NameInMap("TenantName")
    public String tenantName;

    public static SetLinkeBahamutTenantcookieRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLinkeBahamutTenantcookieRequest self = new SetLinkeBahamutTenantcookieRequest();
        return TeaModel.build(map, self);
    }

    public SetLinkeBahamutTenantcookieRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
