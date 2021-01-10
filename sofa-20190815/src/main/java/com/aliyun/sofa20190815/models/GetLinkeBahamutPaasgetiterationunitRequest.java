// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPaasgetiterationunitRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("TenantName")
    public String tenantName;

    public static GetLinkeBahamutPaasgetiterationunitRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPaasgetiterationunitRequest self = new GetLinkeBahamutPaasgetiterationunitRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPaasgetiterationunitRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLinkeBahamutPaasgetiterationunitRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
