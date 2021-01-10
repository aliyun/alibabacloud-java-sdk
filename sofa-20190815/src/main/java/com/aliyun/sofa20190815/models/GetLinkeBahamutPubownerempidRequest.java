// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPubownerempidRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutPubownerempidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPubownerempidRequest self = new GetLinkeBahamutPubownerempidRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPubownerempidRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
