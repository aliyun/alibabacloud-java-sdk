// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantEncryptionResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>job</p>
     */
    @NameInMap("TenantEncryption")
    public ModifyTenantEncryptionResponseBodyTenantEncryption tenantEncryption;

    public static ModifyTenantEncryptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantEncryptionResponseBody self = new ModifyTenantEncryptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTenantEncryptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyTenantEncryptionResponseBody setTenantEncryption(ModifyTenantEncryptionResponseBodyTenantEncryption tenantEncryption) {
        this.tenantEncryption = tenantEncryption;
        return this;
    }
    public ModifyTenantEncryptionResponseBodyTenantEncryption getTenantEncryption() {
        return this.tenantEncryption;
    }

    public static class ModifyTenantEncryptionResponseBodyTenantEncryption extends TeaModel {
        @NameInMap("EncryptionType")
        public String encryptionType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("TenantId")
        public String tenantId;

        public static ModifyTenantEncryptionResponseBodyTenantEncryption build(java.util.Map<String, ?> map) throws Exception {
            ModifyTenantEncryptionResponseBodyTenantEncryption self = new ModifyTenantEncryptionResponseBodyTenantEncryption();
            return TeaModel.build(map, self);
        }

        public ModifyTenantEncryptionResponseBodyTenantEncryption setEncryptionType(String encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }
        public String getEncryptionType() {
            return this.encryptionType;
        }

        public ModifyTenantEncryptionResponseBodyTenantEncryption setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyTenantEncryptionResponseBodyTenantEncryption setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
