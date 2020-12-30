// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeInstanceHealthRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeInstanceHealthRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceHealthRequest self = new DescribeInstanceHealthRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceHealthRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
