// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeInstanceInfosRequest extends TeaModel {
    @NameInMap("InstanceSource")
    public String instanceSource;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeInstanceInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceInfosRequest self = new DescribeInstanceInfosRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceInfosRequest setInstanceSource(String instanceSource) {
        this.instanceSource = instanceSource;
        return this;
    }
    public String getInstanceSource() {
        return this.instanceSource;
    }

    public DescribeInstanceInfosRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceInfosRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
