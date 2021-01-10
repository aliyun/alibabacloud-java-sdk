// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutVcsmembersRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("TenantId")
    public String tenantId;

    public static ListLinkeBahamutVcsmembersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutVcsmembersRequest self = new ListLinkeBahamutVcsmembersRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutVcsmembersRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListLinkeBahamutVcsmembersRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
