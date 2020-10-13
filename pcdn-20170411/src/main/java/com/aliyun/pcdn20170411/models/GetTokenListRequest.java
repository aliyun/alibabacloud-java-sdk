// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetTokenListRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    public static GetTokenListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTokenListRequest self = new GetTokenListRequest();
        return TeaModel.build(map, self);
    }

    public GetTokenListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public GetTokenListRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
