// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutReleasestabledeploycheckRequest extends TeaModel {
    @NameInMap("ReleaseExternalId")
    public String releaseExternalId;

    @NameInMap("TenantId")
    public String tenantId;

    public static CheckLinkeBahamutReleasestabledeploycheckRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutReleasestabledeploycheckRequest self = new CheckLinkeBahamutReleasestabledeploycheckRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutReleasestabledeploycheckRequest setReleaseExternalId(String releaseExternalId) {
        this.releaseExternalId = releaseExternalId;
        return this;
    }
    public String getReleaseExternalId() {
        return this.releaseExternalId;
    }

    public CheckLinkeBahamutReleasestabledeploycheckRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
