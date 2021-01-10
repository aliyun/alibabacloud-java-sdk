// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAdmintenantidconfigRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutAdmintenantidconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAdmintenantidconfigRequest self = new GetLinkeBahamutAdmintenantidconfigRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAdmintenantidconfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
