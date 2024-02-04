// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantSecurityConfigsRequest extends TeaModel {
    /**
     * <p>The unique identifier of the security check.</p>
     */
    @NameInMap("CheckId")
    public String checkId;

    /**
     * <p>The ID of the OceanBase cluster.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeTenantSecurityConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantSecurityConfigsRequest self = new DescribeTenantSecurityConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTenantSecurityConfigsRequest setCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }
    public String getCheckId() {
        return this.checkId;
    }

    public DescribeTenantSecurityConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTenantSecurityConfigsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
