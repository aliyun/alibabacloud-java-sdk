// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncLinkeBahamutAppsyncforadminRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("TenantId")
    public String tenantId;

    public static SyncLinkeBahamutAppsyncforadminRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncLinkeBahamutAppsyncforadminRequest self = new SyncLinkeBahamutAppsyncforadminRequest();
        return TeaModel.build(map, self);
    }

    public SyncLinkeBahamutAppsyncforadminRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SyncLinkeBahamutAppsyncforadminRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
