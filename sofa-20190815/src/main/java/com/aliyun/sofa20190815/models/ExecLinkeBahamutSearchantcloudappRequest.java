// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeBahamutSearchantcloudappRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("TenantId")
    public String tenantId;

    public static ExecLinkeBahamutSearchantcloudappRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeBahamutSearchantcloudappRequest self = new ExecLinkeBahamutSearchantcloudappRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeBahamutSearchantcloudappRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ExecLinkeBahamutSearchantcloudappRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
