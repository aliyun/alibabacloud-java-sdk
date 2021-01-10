// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowAppnamelistRequest extends TeaModel {
    @NameInMap("LinkflowTenant")
    public String linkflowTenant;

    public static GetLinkelinkflowLinkflowAppnamelistRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowAppnamelistRequest self = new GetLinkelinkflowLinkflowAppnamelistRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowAppnamelistRequest setLinkflowTenant(String linkflowTenant) {
        this.linkflowTenant = linkflowTenant;
        return this;
    }
    public String getLinkflowTenant() {
        return this.linkflowTenant;
    }

}
