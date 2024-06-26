// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceCreatableZoneRequest extends TeaModel {
    /**
     * <p>The ID of the zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeInstanceCreatableZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceCreatableZoneRequest self = new DescribeInstanceCreatableZoneRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceCreatableZoneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
