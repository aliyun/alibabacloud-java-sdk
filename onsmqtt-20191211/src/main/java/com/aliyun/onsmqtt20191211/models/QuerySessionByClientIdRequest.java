// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20191211.models;

import com.aliyun.tea.*;

public class QuerySessionByClientIdRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static QuerySessionByClientIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionByClientIdRequest self = new QuerySessionByClientIdRequest();
        return TeaModel.build(map, self);
    }

    public QuerySessionByClientIdRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public QuerySessionByClientIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
