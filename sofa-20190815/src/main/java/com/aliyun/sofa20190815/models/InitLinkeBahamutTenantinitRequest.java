// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutTenantinitRequest extends TeaModel {
    @NameInMap("TenantPath")
    public String tenantPath;

    public static InitLinkeBahamutTenantinitRequest build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutTenantinitRequest self = new InitLinkeBahamutTenantinitRequest();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutTenantinitRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
