// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutAppcustomciconfigRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TenantId")
    public String tenantId;

    public static ListLinkeBahamutAppcustomciconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutAppcustomciconfigRequest self = new ListLinkeBahamutAppcustomciconfigRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutAppcustomciconfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListLinkeBahamutAppcustomciconfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
