// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceSSLRequest extends TeaModel {
    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeInstanceSSLRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSSLRequest self = new DescribeInstanceSSLRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSSLRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
