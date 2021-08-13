// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf_autotest20210720.models;

import com.aliyun.tea.*;

public class CreateEnvironmentResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("environment")
    public String environment;

    public static CreateEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentResponseBody self = new CreateEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentResponseBody setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

}
