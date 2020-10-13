// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetTrafficByRegionRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    public static GetTrafficByRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrafficByRegionRequest self = new GetTrafficByRegionRequest();
        return TeaModel.build(map, self);
    }

    public GetTrafficByRegionRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public GetTrafficByRegionRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
