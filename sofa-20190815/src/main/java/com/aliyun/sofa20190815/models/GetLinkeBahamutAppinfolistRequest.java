// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAppinfolistRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutAppinfolistRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAppinfolistRequest self = new GetLinkeBahamutAppinfolistRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAppinfolistRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
