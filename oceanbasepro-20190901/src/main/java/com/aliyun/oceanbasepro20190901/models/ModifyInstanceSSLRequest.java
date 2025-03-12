// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceSSLRequest extends TeaModel {
    /**
     * <p>The operation to modify the SSL status. Valid values:</p>
     * <ul>
     * <li><p>open: Enable SSL encryption.</p>
     * </li>
     * <li><p>update: Update the CA certificate.</p>
     * </li>
     * <li><p>close: Disable SSL encryption.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("EnableSSL")
    public String enableSSL;

    /**
     * <p>The ID of the OceanBase cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TenantId")
    public String tenantId;

    public static ModifyInstanceSSLRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceSSLRequest self = new ModifyInstanceSSLRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceSSLRequest setEnableSSL(String enableSSL) {
        this.enableSSL = enableSSL;
        return this;
    }
    public String getEnableSSL() {
        return this.enableSSL;
    }

    public ModifyInstanceSSLRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceSSLRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
