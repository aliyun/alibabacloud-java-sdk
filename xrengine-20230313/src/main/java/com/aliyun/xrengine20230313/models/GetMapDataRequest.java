// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class GetMapDataRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("JwtToken")
    public String jwtToken;

    public static GetMapDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMapDataRequest self = new GetMapDataRequest();
        return TeaModel.build(map, self);
    }

    public GetMapDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMapDataRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

}
