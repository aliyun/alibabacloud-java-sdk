// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsRcSyncDataRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ServiceId")
    public String serviceId;

    public static QueryMsRcSyncDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsRcSyncDataRequest self = new QueryMsRcSyncDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsRcSyncDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMsRcSyncDataRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
