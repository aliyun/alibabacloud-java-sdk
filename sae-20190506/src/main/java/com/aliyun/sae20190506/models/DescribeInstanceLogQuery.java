// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeInstanceLogQuery extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    public static DescribeInstanceLogQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceLogQuery self = new DescribeInstanceLogQuery();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceLogQuery setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
