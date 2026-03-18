// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeSystemTimezoneRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeSystemTimezoneRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemTimezoneRequest self = new DescribeSystemTimezoneRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSystemTimezoneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
