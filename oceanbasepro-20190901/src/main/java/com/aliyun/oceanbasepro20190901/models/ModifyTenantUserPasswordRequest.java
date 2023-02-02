// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantUserPasswordRequest extends TeaModel {
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

    /**
     * <p>The name of the database account.    </p>
     * <p>You cannot use reserved keywords, such as SYS and root.</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The password of the database account.    </p>
     * <p>It must be 10 to 32 characters in length and contain three types of the following characters: uppercase letters, lowercase letters, digits, and special characters. The special characters are ! @ # $ % \ ^ \ & \ * ( ) _ + - =</p>
     */
    @NameInMap("UserPassword")
    public String userPassword;

    public static ModifyTenantUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantUserPasswordRequest self = new ModifyTenantUserPasswordRequest();
        return TeaModel.build(map, self);
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
