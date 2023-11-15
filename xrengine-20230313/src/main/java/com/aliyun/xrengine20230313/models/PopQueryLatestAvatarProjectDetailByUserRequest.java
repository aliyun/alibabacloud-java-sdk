// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopQueryLatestAvatarProjectDetailByUserRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    public static PopQueryLatestAvatarProjectDetailByUserRequest build(java.util.Map<String, ?> map) throws Exception {
        PopQueryLatestAvatarProjectDetailByUserRequest self = new PopQueryLatestAvatarProjectDetailByUserRequest();
        return TeaModel.build(map, self);
    }

    public PopQueryLatestAvatarProjectDetailByUserRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

}
