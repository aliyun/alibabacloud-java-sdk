// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class UpdateUserEmailRequest extends TeaModel {
    @NameInMap("Email")
    public String email;

    @NameInMap("JwtToken")
    public String jwtToken;

    public static UpdateUserEmailRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserEmailRequest self = new UpdateUserEmailRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserEmailRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateUserEmailRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

}
