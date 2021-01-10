// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowTenantsRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetLinkelinkflowLinkflowTenantsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowTenantsRequest self = new GetLinkelinkflowLinkflowTenantsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowTenantsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
