// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf_autotest20210720.models;

import com.aliyun.tea.*;

public class CreateEnvironmentRequest extends TeaModel {
    // A short description of struct
    @NameInMap("userId")
    public String userId;

    @NameInMap("environment")
    public String environment;

    public static CreateEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentRequest self = new CreateEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateEnvironmentRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

}
