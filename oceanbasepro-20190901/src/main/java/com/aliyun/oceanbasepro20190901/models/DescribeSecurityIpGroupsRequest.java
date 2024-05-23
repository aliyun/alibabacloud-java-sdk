// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSecurityIpGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the OceanBase cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeSecurityIpGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityIpGroupsRequest self = new DescribeSecurityIpGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityIpGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
