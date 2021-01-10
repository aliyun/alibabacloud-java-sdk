// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPInstancesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static BatchqueryODPInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPInstancesRequest self = new BatchqueryODPInstancesRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
