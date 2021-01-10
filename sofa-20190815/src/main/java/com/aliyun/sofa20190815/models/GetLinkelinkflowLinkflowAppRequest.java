// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowAppRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("LinkflowTenant")
    public String linkflowTenant;

    public static GetLinkelinkflowLinkflowAppRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowAppRequest self = new GetLinkelinkflowLinkflowAppRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLinkelinkflowLinkflowAppRequest setLinkflowTenant(String linkflowTenant) {
        this.linkflowTenant = linkflowTenant;
        return this;
    }
    public String getLinkflowTenant() {
        return this.linkflowTenant;
    }

}
