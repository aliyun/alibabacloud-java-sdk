// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetODPMiddlewareInstanceRequest extends TeaModel {
    @NameInMap("CurrTenant")
    public String currTenant;

    @NameInMap("CurrWorkspace")
    public String currWorkspace;

    public static GetODPMiddlewareInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetODPMiddlewareInstanceRequest self = new GetODPMiddlewareInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetODPMiddlewareInstanceRequest setCurrTenant(String currTenant) {
        this.currTenant = currTenant;
        return this;
    }
    public String getCurrTenant() {
        return this.currTenant;
    }

    public GetODPMiddlewareInstanceRequest setCurrWorkspace(String currWorkspace) {
        this.currWorkspace = currWorkspace;
        return this;
    }
    public String getCurrWorkspace() {
        return this.currWorkspace;
    }

}
