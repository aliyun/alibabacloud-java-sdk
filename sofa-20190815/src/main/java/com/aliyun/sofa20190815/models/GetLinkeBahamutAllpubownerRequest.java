// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAllpubownerRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutAllpubownerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAllpubownerRequest self = new GetLinkeBahamutAllpubownerRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAllpubownerRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
