// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAllbuRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutAllbuRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAllbuRequest self = new GetLinkeBahamutAllbuRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAllbuRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
