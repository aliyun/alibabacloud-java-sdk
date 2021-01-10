// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqEndpointRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryMqSofamqEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqEndpointRequest self = new QueryMqSofamqEndpointRequest();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqEndpointRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
