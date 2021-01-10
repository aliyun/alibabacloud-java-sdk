// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class FinishLinkeBahamutTenantinitRequest extends TeaModel {
    @NameInMap("TenantPath")
    public String tenantPath;

    public static FinishLinkeBahamutTenantinitRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishLinkeBahamutTenantinitRequest self = new FinishLinkeBahamutTenantinitRequest();
        return TeaModel.build(map, self);
    }

    public FinishLinkeBahamutTenantinitRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
