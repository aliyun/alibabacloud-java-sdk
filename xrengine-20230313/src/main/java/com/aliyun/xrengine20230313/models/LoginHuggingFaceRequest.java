// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class LoginHuggingFaceRequest extends TeaModel {
    @NameInMap("Token")
    public String token;

    @NameInMap("Type")
    public String type;

    public static LoginHuggingFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        LoginHuggingFaceRequest self = new LoginHuggingFaceRequest();
        return TeaModel.build(map, self);
    }

    public LoginHuggingFaceRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public LoginHuggingFaceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
