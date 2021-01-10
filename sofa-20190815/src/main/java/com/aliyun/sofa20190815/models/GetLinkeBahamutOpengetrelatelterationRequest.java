// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutOpengetrelatelterationRequest extends TeaModel {
    @NameInMap("LoginName")
    public String loginName;

    @NameInMap("TenantName")
    public String tenantName;

    public static GetLinkeBahamutOpengetrelatelterationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutOpengetrelatelterationRequest self = new GetLinkeBahamutOpengetrelatelterationRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutOpengetrelatelterationRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public GetLinkeBahamutOpengetrelatelterationRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
