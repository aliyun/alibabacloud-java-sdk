// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPaasgetappsRequest extends TeaModel {
    @NameInMap("IterationExternalId")
    public String iterationExternalId;

    @NameInMap("TenantExternalId")
    public String tenantExternalId;

    public static GetLinkeBahamutPaasgetappsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPaasgetappsRequest self = new GetLinkeBahamutPaasgetappsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPaasgetappsRequest setIterationExternalId(String iterationExternalId) {
        this.iterationExternalId = iterationExternalId;
        return this;
    }
    public String getIterationExternalId() {
        return this.iterationExternalId;
    }

    public GetLinkeBahamutPaasgetappsRequest setTenantExternalId(String tenantExternalId) {
        this.tenantExternalId = tenantExternalId;
        return this;
    }
    public String getTenantExternalId() {
        return this.tenantExternalId;
    }

}
