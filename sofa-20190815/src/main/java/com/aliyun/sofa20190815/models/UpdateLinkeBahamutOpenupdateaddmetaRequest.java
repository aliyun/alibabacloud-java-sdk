// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutOpenupdateaddmetaRequest extends TeaModel {
    @NameInMap("AppInfo")
    public String appInfo;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("TenantId")
    public String tenantId;

    public static UpdateLinkeBahamutOpenupdateaddmetaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutOpenupdateaddmetaRequest self = new UpdateLinkeBahamutOpenupdateaddmetaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutOpenupdateaddmetaRequest setAppInfo(String appInfo) {
        this.appInfo = appInfo;
        return this;
    }
    public String getAppInfo() {
        return this.appInfo;
    }

    public UpdateLinkeBahamutOpenupdateaddmetaRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateLinkeBahamutOpenupdateaddmetaRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
