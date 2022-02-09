// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeRestorableInstancesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Method")
    public String method;

    public static DescribeRestorableInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestorableInstancesRequest self = new DescribeRestorableInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRestorableInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRestorableInstancesRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

}
