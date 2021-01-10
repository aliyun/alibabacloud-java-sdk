// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMiddlewareDmsInstanceRequest extends TeaModel {
    @NameInMap("CurrTenant")
    public String currTenant;

    @NameInMap("CurrWorkspace")
    public String currWorkspace;

    public static GetMiddlewareDmsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMiddlewareDmsInstanceRequest self = new GetMiddlewareDmsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetMiddlewareDmsInstanceRequest setCurrTenant(String currTenant) {
        this.currTenant = currTenant;
        return this;
    }
    public String getCurrTenant() {
        return this.currTenant;
    }

    public GetMiddlewareDmsInstanceRequest setCurrWorkspace(String currWorkspace) {
        this.currWorkspace = currWorkspace;
        return this;
    }
    public String getCurrWorkspace() {
        return this.currWorkspace;
    }

}
