// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeStandbyCreateModeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob4wibn0abo9uo</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>txxxxxxx</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeStandbyCreateModeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStandbyCreateModeRequest self = new DescribeStandbyCreateModeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStandbyCreateModeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeStandbyCreateModeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
