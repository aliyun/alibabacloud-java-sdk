// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResourcePortRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ResourceInstanceId")
    public String resourceInstanceId;

    public static DescribeResourcePortRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePortRequest self = new DescribeResourcePortRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePortRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeResourcePortRequest setResourceInstanceId(String resourceInstanceId) {
        this.resourceInstanceId = resourceInstanceId;
        return this;
    }
    public String getResourceInstanceId() {
        return this.resourceInstanceId;
    }

}
