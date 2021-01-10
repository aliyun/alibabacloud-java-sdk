// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("TenantPath")
    public String tenantPath;

    public static UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolRequest self = new UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateLinkeBahamutAdminupdatedataupdateofflineauthcontrolRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
