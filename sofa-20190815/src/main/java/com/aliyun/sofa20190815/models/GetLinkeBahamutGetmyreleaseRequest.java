// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutGetmyreleaseRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutGetmyreleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutGetmyreleaseRequest self = new GetLinkeBahamutGetmyreleaseRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutGetmyreleaseRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
