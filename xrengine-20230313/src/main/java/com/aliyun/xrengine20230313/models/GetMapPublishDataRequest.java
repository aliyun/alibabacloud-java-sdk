// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class GetMapPublishDataRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("JwtToken")
    public String jwtToken;

    public static GetMapPublishDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMapPublishDataRequest self = new GetMapPublishDataRequest();
        return TeaModel.build(map, self);
    }

    public GetMapPublishDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMapPublishDataRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

}
