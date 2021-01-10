// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPSqlAuditInstancesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryODPSqlAuditInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryODPSqlAuditInstancesRequest self = new QueryODPSqlAuditInstancesRequest();
        return TeaModel.build(map, self);
    }

    public QueryODPSqlAuditInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
