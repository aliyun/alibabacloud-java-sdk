// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAppcodeserviceurlRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutAppcodeserviceurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAppcodeserviceurlRequest self = new GetLinkeBahamutAppcodeserviceurlRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAppcodeserviceurlRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLinkeBahamutAppcodeserviceurlRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
