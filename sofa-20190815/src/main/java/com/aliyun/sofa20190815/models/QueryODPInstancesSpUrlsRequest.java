// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPInstancesSpUrlsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryODPInstancesSpUrlsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryODPInstancesSpUrlsRequest self = new QueryODPInstancesSpUrlsRequest();
        return TeaModel.build(map, self);
    }

    public QueryODPInstancesSpUrlsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
