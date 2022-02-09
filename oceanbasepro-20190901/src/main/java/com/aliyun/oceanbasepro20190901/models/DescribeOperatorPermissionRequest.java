// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOperatorPermissionRequest extends TeaModel {
    // Oceanbase集群ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeOperatorPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperatorPermissionRequest self = new DescribeOperatorPermissionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOperatorPermissionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
