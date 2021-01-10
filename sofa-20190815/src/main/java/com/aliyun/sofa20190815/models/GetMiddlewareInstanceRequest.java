// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMiddlewareInstanceRequest extends TeaModel {
    @NameInMap("CurrTenant")
    public String currTenant;

    @NameInMap("CurrWorkspace")
    public String currWorkspace;

    public static GetMiddlewareInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMiddlewareInstanceRequest self = new GetMiddlewareInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetMiddlewareInstanceRequest setCurrTenant(String currTenant) {
        this.currTenant = currTenant;
        return this;
    }
    public String getCurrTenant() {
        return this.currTenant;
    }

    public GetMiddlewareInstanceRequest setCurrWorkspace(String currWorkspace) {
        this.currWorkspace = currWorkspace;
        return this;
    }
    public String getCurrWorkspace() {
        return this.currWorkspace;
    }

}
