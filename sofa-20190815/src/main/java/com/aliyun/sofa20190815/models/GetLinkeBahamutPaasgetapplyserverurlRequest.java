// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPaasgetapplyserverurlRequest extends TeaModel {
    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutPaasgetapplyserverurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPaasgetapplyserverurlRequest self = new GetLinkeBahamutPaasgetapplyserverurlRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPaasgetapplyserverurlRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public GetLinkeBahamutPaasgetapplyserverurlRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
