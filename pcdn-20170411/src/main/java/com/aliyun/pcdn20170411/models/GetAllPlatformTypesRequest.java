// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetAllPlatformTypesRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Version")
    public String version;

    public static GetAllPlatformTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAllPlatformTypesRequest self = new GetAllPlatformTypesRequest();
        return TeaModel.build(map, self);
    }

    public GetAllPlatformTypesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public GetAllPlatformTypesRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
