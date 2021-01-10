// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutWorkspaceRequest extends TeaModel {
    @NameInMap("TenantPath")
    public String tenantPath;

    public static InitLinkeBahamutWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutWorkspaceRequest self = new InitLinkeBahamutWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutWorkspaceRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
