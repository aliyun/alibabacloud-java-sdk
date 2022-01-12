// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class EVENTQUERYRequest extends TeaModel {
    // 应用名
    @NameInMap("appName")
    public String appName;

    // token
    @NameInMap("token")
    public String token;

    public static EVENTQUERYRequest build(java.util.Map<String, ?> map) throws Exception {
        EVENTQUERYRequest self = new EVENTQUERYRequest();
        return TeaModel.build(map, self);
    }

    public EVENTQUERYRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EVENTQUERYRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
