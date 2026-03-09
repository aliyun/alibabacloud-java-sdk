// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCNetworkInterfacesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-m5sc1271fv344a1r****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeRCNetworkInterfacesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCNetworkInterfacesRequest self = new DescribeRCNetworkInterfacesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRCNetworkInterfacesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
