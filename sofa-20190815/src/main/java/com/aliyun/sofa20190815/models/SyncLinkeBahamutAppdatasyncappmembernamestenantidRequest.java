// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncLinkeBahamutAppdatasyncappmembernamestenantidRequest extends TeaModel {
    @NameInMap("ImportApps")
    public String importApps;

    @NameInMap("TenantId")
    public String tenantId;

    public static SyncLinkeBahamutAppdatasyncappmembernamestenantidRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncLinkeBahamutAppdatasyncappmembernamestenantidRequest self = new SyncLinkeBahamutAppdatasyncappmembernamestenantidRequest();
        return TeaModel.build(map, self);
    }

    public SyncLinkeBahamutAppdatasyncappmembernamestenantidRequest setImportApps(String importApps) {
        this.importApps = importApps;
        return this;
    }
    public String getImportApps() {
        return this.importApps;
    }

    public SyncLinkeBahamutAppdatasyncappmembernamestenantidRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
