// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeBahamutBuildconfigRequest extends TeaModel {
    @NameInMap("BuildConfigJsonStr")
    public String buildConfigJsonStr;

    @NameInMap("TenantPath")
    public String tenantPath;

    public static SaveLinkeBahamutBuildconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeBahamutBuildconfigRequest self = new SaveLinkeBahamutBuildconfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveLinkeBahamutBuildconfigRequest setBuildConfigJsonStr(String buildConfigJsonStr) {
        this.buildConfigJsonStr = buildConfigJsonStr;
        return this;
    }
    public String getBuildConfigJsonStr() {
        return this.buildConfigJsonStr;
    }

    public SaveLinkeBahamutBuildconfigRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
