// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutTenantuseoauthRequest extends TeaModel {
    @NameInMap("TenantPath")
    public String tenantPath;

    public static GetLinkeBahamutTenantuseoauthRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutTenantuseoauthRequest self = new GetLinkeBahamutTenantuseoauthRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutTenantuseoauthRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
