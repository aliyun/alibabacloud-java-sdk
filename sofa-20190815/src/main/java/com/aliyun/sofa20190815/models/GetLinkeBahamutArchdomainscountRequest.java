// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutArchdomainscountRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserId")
    public String userId;

    public static GetLinkeBahamutArchdomainscountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutArchdomainscountRequest self = new GetLinkeBahamutArchdomainscountRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutArchdomainscountRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetLinkeBahamutArchdomainscountRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
