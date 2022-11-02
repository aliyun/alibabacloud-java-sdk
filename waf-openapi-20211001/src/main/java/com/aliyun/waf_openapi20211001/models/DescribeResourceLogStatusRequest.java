// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResourceLogStatusRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Resources")
    public String resources;

    public static DescribeResourceLogStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceLogStatusRequest self = new DescribeResourceLogStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceLogStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeResourceLogStatusRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

}
