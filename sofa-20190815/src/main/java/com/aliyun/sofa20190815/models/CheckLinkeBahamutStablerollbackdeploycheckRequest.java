// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutStablerollbackdeploycheckRequest extends TeaModel {
    @NameInMap("ReleaseExternalId")
    public String releaseExternalId;

    @NameInMap("TenantId")
    public String tenantId;

    public static CheckLinkeBahamutStablerollbackdeploycheckRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutStablerollbackdeploycheckRequest self = new CheckLinkeBahamutStablerollbackdeploycheckRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutStablerollbackdeploycheckRequest setReleaseExternalId(String releaseExternalId) {
        this.releaseExternalId = releaseExternalId;
        return this;
    }
    public String getReleaseExternalId() {
        return this.releaseExternalId;
    }

    public CheckLinkeBahamutStablerollbackdeploycheckRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
