// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetAllIspRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    public static GetAllIspRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAllIspRequest self = new GetAllIspRequest();
        return TeaModel.build(map, self);
    }

    public GetAllIspRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public GetAllIspRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
