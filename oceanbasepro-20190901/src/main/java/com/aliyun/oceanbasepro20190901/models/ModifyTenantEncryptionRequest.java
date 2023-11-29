// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantEncryptionRequest extends TeaModel {
    @NameInMap("EncryptionKeyId")
    public String encryptionKeyId;

    @NameInMap("EncryptionType")
    public String encryptionType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TenantId")
    public String tenantId;

    public static ModifyTenantEncryptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantEncryptionRequest self = new ModifyTenantEncryptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTenantEncryptionRequest setEncryptionKeyId(String encryptionKeyId) {
        this.encryptionKeyId = encryptionKeyId;
        return this;
    }
    public String getEncryptionKeyId() {
        return this.encryptionKeyId;
    }

    public ModifyTenantEncryptionRequest setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public String getEncryptionType() {
        return this.encryptionType;
    }

    public ModifyTenantEncryptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTenantEncryptionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
