// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutConfiglinkchostRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutConfiglinkchostRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutConfiglinkchostRequest self = new GetLinkeBahamutConfiglinkchostRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutConfiglinkchostRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
