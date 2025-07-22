// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetUserCommandRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Token")
    public String token;

    public static GetUserCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserCommandRequest self = new GetUserCommandRequest();
        return TeaModel.build(map, self);
    }

    public GetUserCommandRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetUserCommandRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
