// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutOpengetrelatereleaseappsRequest extends TeaModel {
    @NameInMap("LoginName")
    public String loginName;

    @NameInMap("ReleaseId")
    public String releaseId;

    @NameInMap("State")
    public String state;

    @NameInMap("TenantName")
    public String tenantName;

    public static GetLinkeBahamutOpengetrelatereleaseappsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutOpengetrelatereleaseappsRequest self = new GetLinkeBahamutOpengetrelatereleaseappsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutOpengetrelatereleaseappsRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public GetLinkeBahamutOpengetrelatereleaseappsRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public GetLinkeBahamutOpengetrelatereleaseappsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public GetLinkeBahamutOpengetrelatereleaseappsRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
