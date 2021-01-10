// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutTenantstorageconfigRequest extends TeaModel {
    @NameInMap("TenantPath")
    public String tenantPath;

    public static InitLinkeBahamutTenantstorageconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutTenantstorageconfigRequest self = new InitLinkeBahamutTenantstorageconfigRequest();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutTenantstorageconfigRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
