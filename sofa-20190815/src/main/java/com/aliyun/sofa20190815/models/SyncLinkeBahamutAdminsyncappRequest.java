// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncLinkeBahamutAdminsyncappRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("TenantPath")
    public String tenantPath;

    @NameInMap("Type")
    public String type;

    public static SyncLinkeBahamutAdminsyncappRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncLinkeBahamutAdminsyncappRequest self = new SyncLinkeBahamutAdminsyncappRequest();
        return TeaModel.build(map, self);
    }

    public SyncLinkeBahamutAdminsyncappRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SyncLinkeBahamutAdminsyncappRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

    public SyncLinkeBahamutAdminsyncappRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
