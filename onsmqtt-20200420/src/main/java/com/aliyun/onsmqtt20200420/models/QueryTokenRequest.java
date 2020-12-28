// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryTokenRequest extends TeaModel {
    @NameInMap("Token")
    public String token;

    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTokenRequest self = new QueryTokenRequest();
        return TeaModel.build(map, self);
    }

    public QueryTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public QueryTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
