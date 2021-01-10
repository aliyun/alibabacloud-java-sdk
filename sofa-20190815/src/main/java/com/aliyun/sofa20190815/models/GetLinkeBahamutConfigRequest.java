// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutConfigRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutConfigRequest self = new GetLinkeBahamutConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutConfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
