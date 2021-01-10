// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsmemberRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutVcsmemberRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsmemberRequest self = new GetLinkeBahamutVcsmemberRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsmemberRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLinkeBahamutVcsmemberRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
