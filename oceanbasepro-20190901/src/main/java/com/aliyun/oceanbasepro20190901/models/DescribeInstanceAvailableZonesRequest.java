// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceAvailableZonesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeInstanceAvailableZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAvailableZonesRequest self = new DescribeInstanceAvailableZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAvailableZonesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
