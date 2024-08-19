// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeBackupEncryptedStringRequest extends TeaModel {
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

    public static DescribeBackupEncryptedStringRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupEncryptedStringRequest self = new DescribeBackupEncryptedStringRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupEncryptedStringRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeBackupEncryptedStringRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
