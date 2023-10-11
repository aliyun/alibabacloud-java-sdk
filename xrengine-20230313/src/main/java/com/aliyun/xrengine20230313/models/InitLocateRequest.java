// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class InitLocateRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("Params")
    public String params;

    public static InitLocateRequest build(java.util.Map<String, ?> map) throws Exception {
        InitLocateRequest self = new InitLocateRequest();
        return TeaModel.build(map, self);
    }

    public InitLocateRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public InitLocateRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
