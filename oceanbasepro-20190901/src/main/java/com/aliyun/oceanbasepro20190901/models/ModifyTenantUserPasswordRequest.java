// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantUserPasswordRequest extends TeaModel {
    /**
     * <p>加密方式。</p>
     */
    @NameInMap("EncryptionType")
    public String encryptionType;

    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>```</p>
     * <p>http(s)://[Endpoint]/?Action=ModifyTenantUserPassword</p>
     * <p>&UserName=pay_test</p>
     * <p>&TenantId=ob2mr3oae0****</p>
     * <p>&UserPassword=!Aliyun4Oceanbase</p>
     * <p>&InstanceId=ob317v4uif****</p>
     * <p>&Common request parameters</p>
     * <p>```</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The ID of the OceanBase cluster.</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>You can call this operation to change the logon password of a specified account in a tenant.</p>
     */
    @NameInMap("UserPassword")
    public String userPassword;

    public static ModifyTenantUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantUserPasswordRequest self = new ModifyTenantUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTenantUserPasswordRequest setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public String getEncryptionType() {
        return this.encryptionType;
    }

    public ModifyTenantUserPasswordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTenantUserPasswordRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ModifyTenantUserPasswordRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ModifyTenantUserPasswordRequest setUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }
    public String getUserPassword() {
        return this.userPassword;
    }

}
