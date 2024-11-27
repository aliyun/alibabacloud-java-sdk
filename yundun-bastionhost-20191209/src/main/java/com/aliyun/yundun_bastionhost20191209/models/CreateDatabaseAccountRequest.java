// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateDatabaseAccountRequest extends TeaModel {
    /**
     * <p>The username of the database account to be created. The username can be up to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("DatabaseAccountName")
    public String databaseAccountName;

    /**
     * <p>The ID of the database for which you want to create a database account.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2758839.html">ListDatabaseAccounts</a> operation to query the database account ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DatabaseId")
    public String databaseId;

    /**
     * <p>The name of the database. This parameter is required for PostgreSQL and Oracle databases.</p>
     * 
     * <strong>example:</strong>
     * <p>orcl</p>
     */
    @NameInMap("DatabaseSchema")
    public String databaseSchema;

    /**
     * <p>The ID of the bastion host for which you want to create a database account.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-5yd34ol020a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The logon attribute. This parameter is required for Oracle databases. Valid values:</p>
     * <ul>
     * <li>SERVICENAME</li>
     * <li>SID</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SID</p>
     */
    @NameInMap("LoginAttribute")
    public String loginAttribute;

    /**
     * <p>The password of the database account to be created.</p>
     * 
     * <strong>example:</strong>
     * <p>MCQ******</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region ID of the bastion host for which you want to create a database account.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateDatabaseAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseAccountRequest self = new CreateDatabaseAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseAccountRequest setDatabaseAccountName(String databaseAccountName) {
        this.databaseAccountName = databaseAccountName;
        return this;
    }
    public String getDatabaseAccountName() {
        return this.databaseAccountName;
    }

    public CreateDatabaseAccountRequest setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }
    public String getDatabaseId() {
        return this.databaseId;
    }

    public CreateDatabaseAccountRequest setDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
        return this;
    }
    public String getDatabaseSchema() {
        return this.databaseSchema;
    }

    public CreateDatabaseAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDatabaseAccountRequest setLoginAttribute(String loginAttribute) {
        this.loginAttribute = loginAttribute;
        return this;
    }
    public String getLoginAttribute() {
        return this.loginAttribute;
    }

    public CreateDatabaseAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateDatabaseAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
