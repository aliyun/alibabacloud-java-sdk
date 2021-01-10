// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncLinkeBahamutCloudapplistsyncRequest extends TeaModel {
    @NameInMap("SyncAppRequestJsonStr")
    public String syncAppRequestJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    public static SyncLinkeBahamutCloudapplistsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncLinkeBahamutCloudapplistsyncRequest self = new SyncLinkeBahamutCloudapplistsyncRequest();
        return TeaModel.build(map, self);
    }

    public SyncLinkeBahamutCloudapplistsyncRequest setSyncAppRequestJsonStr(String syncAppRequestJsonStr) {
        this.syncAppRequestJsonStr = syncAppRequestJsonStr;
        return this;
    }
    public String getSyncAppRequestJsonStr() {
        return this.syncAppRequestJsonStr;
    }

    public SyncLinkeBahamutCloudapplistsyncRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
