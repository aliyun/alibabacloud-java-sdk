// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigetemergencyunitsbyappRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("StageName")
    public String stageName;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutWebapigetemergencyunitsbyappRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigetemergencyunitsbyappRequest self = new GetLinkeBahamutWebapigetemergencyunitsbyappRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigetemergencyunitsbyappRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLinkeBahamutWebapigetemergencyunitsbyappRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public GetLinkeBahamutWebapigetemergencyunitsbyappRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
