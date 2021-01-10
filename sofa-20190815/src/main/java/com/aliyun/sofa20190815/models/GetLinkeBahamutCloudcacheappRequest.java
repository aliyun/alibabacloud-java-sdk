// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutCloudcacheappRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutCloudcacheappRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutCloudcacheappRequest self = new GetLinkeBahamutCloudcacheappRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutCloudcacheappRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
