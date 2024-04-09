// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class RefreshTokenResponseBody extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    public static RefreshTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshTokenResponseBody self = new RefreshTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshTokenResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

}
