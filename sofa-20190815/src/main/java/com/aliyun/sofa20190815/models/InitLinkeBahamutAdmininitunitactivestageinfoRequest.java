// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutAdmininitunitactivestageinfoRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("TenantPath")
    public String tenantPath;

    @NameInMap("Update")
    public String update;

    public static InitLinkeBahamutAdmininitunitactivestageinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutAdmininitunitactivestageinfoRequest self = new InitLinkeBahamutAdmininitunitactivestageinfoRequest();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutAdmininitunitactivestageinfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public InitLinkeBahamutAdmininitunitactivestageinfoRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

    public InitLinkeBahamutAdmininitunitactivestageinfoRequest setUpdate(String update) {
        this.update = update;
        return this;
    }
    public String getUpdate() {
        return this.update;
    }

}
