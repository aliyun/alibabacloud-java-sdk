// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class RevokeTokenRequest extends TeaModel {
    @NameInMap("Token")
    public String token;

    @NameInMap("InstanceId")
    public String instanceId;

    public static RevokeTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeTokenRequest self = new RevokeTokenRequest();
        return TeaModel.build(map, self);
    }

    public RevokeTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public RevokeTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
