// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class AuthUserRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JwtToken")
    public String jwtToken;

    public static AuthUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthUserRequest self = new AuthUserRequest();
        return TeaModel.build(map, self);
    }

    public AuthUserRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

}
