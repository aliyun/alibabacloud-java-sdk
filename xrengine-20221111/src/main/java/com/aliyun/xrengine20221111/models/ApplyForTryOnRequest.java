// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ApplyForTryOnRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("JwtToken")
    public String jwtToken;

    public static ApplyForTryOnRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyForTryOnRequest self = new ApplyForTryOnRequest();
        return TeaModel.build(map, self);
    }

    public ApplyForTryOnRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ApplyForTryOnRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

}
