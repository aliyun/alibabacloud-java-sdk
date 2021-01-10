// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationtemplatesgetlterationtemplatesRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutIterationtemplatesgetlterationtemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationtemplatesgetlterationtemplatesRequest self = new GetLinkeBahamutIterationtemplatesgetlterationtemplatesRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationtemplatesgetlterationtemplatesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
