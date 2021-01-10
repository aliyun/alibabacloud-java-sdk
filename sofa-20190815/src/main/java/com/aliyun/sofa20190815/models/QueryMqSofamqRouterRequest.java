// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqRouterRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryMqSofamqRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqRouterRequest self = new QueryMqSofamqRouterRequest();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqRouterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
