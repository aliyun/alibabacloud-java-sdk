// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutOpengetrelatereleaseRequest extends TeaModel {
    @NameInMap("LoginName")
    public String loginName;

    @NameInMap("State")
    public String state;

    @NameInMap("TenantName")
    public String tenantName;

    public static GetLinkeBahamutOpengetrelatereleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutOpengetrelatereleaseRequest self = new GetLinkeBahamutOpengetrelatereleaseRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutOpengetrelatereleaseRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public GetLinkeBahamutOpengetrelatereleaseRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public GetLinkeBahamutOpengetrelatereleaseRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
