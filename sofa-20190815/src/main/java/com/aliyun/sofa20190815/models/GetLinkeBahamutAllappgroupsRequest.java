// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAllappgroupsRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutAllappgroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAllappgroupsRequest self = new GetLinkeBahamutAllappgroupsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAllappgroupsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
