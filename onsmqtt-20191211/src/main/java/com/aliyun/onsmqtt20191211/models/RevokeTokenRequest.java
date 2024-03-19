// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20191211.models;

import com.aliyun.tea.*;

public class RevokeTokenRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Token")
    public String token;

    public static RevokeTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeTokenRequest self = new RevokeTokenRequest();
        return TeaModel.build(map, self);
    }

    public RevokeTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RevokeTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
