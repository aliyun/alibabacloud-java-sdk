// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutApptenantpathappnamecustompipelineRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("TenantPath")
    public String tenantPath;

    public static GetLinkeBahamutApptenantpathappnamecustompipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutApptenantpathappnamecustompipelineRequest self = new GetLinkeBahamutApptenantpathappnamecustompipelineRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutApptenantpathappnamecustompipelineRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLinkeBahamutApptenantpathappnamecustompipelineRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
