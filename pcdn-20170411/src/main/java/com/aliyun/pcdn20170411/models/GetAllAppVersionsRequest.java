// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetAllAppVersionsRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Version")
    public String version;

    public static GetAllAppVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAllAppVersionsRequest self = new GetAllAppVersionsRequest();
        return TeaModel.build(map, self);
    }

    public GetAllAppVersionsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public GetAllAppVersionsRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
