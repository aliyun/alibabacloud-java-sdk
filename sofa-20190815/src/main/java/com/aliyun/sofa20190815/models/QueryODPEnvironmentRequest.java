// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPEnvironmentRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryODPEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryODPEnvironmentRequest self = new QueryODPEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public QueryODPEnvironmentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
