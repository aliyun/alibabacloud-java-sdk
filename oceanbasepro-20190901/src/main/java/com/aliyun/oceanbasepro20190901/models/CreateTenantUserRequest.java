// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantUserRequest extends TeaModel {
    /**
     * <p>The description of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test database</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>加密方式。</p>
     * 
     * <strong>example:</strong>
     * <p>RAS</p>
     */
    @NameInMap("EncryptionType")
    public String encryptionType;

    /**
     * <p>The ID of the OceanBase cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The role of the user account.  In Oracle mode, this parameter unspecified is left unspecified.  In MySQL mode, the super administrator account has ALL PRIVILEGES, and you can leave this parameter unspecified.  You need to specify the account information for a general user account. By default, the account information is a JSON array that contains the information of the role and the schema (Oracle mode) or database (MySQL mode).  Valid values: ReadWrite: a role that has the read and write privileges, namely ALL PRIVILEGES. ReadOnly: a role that has only the read-only privilege SELECT. DDL: a role that has DDL privileges such as CREATE, DROP, ALTER, SHOW VIEW, and CREATE VIEW. DML: a role that has DML privileges such as SELECT, INSERT, UPDATE, DELETE, and SHOW VIEW.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Database&quot;:&quot;oceanbase1&quot;,&quot;Role&quot;:&quot;readwrite&quot;},{&quot;Database&quot;:&quot;oceanbase2&quot;,&quot;Role&quot;:&quot;readonly&quot;}]</p>
     */
    @NameInMap("Roles")
    public String roles;

    /**
     * <p>The ID of the tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob2mr3oae0****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The name of the database account.  You cannot use reserved keywords, such as SYS and root.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pay_test</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The password of the database account.  It must be 10 to 32 characters in length and contain three types of the following characters: uppercase letters, lowercase letters, digits, and special characters. The special characters are ! @ # $ % \ ^ \ &amp; \ * ( ) _ + - =</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>!Aliyun4Oceanbase</p>
     */
    @NameInMap("UserPassword")
    public String userPassword;

    /**
     * <p>The type of the database account. Valid values: Admin: the super administrator account. Normal: a general account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("UserType")
    public String userType;

    public static CreateTenantUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantUserRequest self = new CreateTenantUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateTenantUserRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTenantUserRequest setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public String getEncryptionType() {
        return this.encryptionType;
    }

    public CreateTenantUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTenantUserRequest setRoles(String roles) {
        this.roles = roles;
        return this;
    }
    public String getRoles() {
        return this.roles;
    }

    public CreateTenantUserRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateTenantUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateTenantUserRequest setUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }
    public String getUserPassword() {
        return this.userPassword;
    }

    public CreateTenantUserRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
