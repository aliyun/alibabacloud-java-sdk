// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyDatabaseAccountRequest extends TeaModel {
    /**
     * <p>The ID of the database account to modify.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2758839.html">ListDatabaseAccounts</a> operation to query the database account ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DatabaseAccountId")
    public String databaseAccountId;

    /**
     * <p>The new username of the database account. The username can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>aaa</p>
     */
    @NameInMap("DatabaseAccountName")
    public String databaseAccountName;

    /**
     * <p>The new name of the database. This parameter is required if the database engine is PostgreSQL or Oracle.</p>
     * 
     * <strong>example:</strong>
     * <p>orcl</p>
     */
    @NameInMap("DatabaseSchema")
    public String databaseSchema;

    /**
     * <p>The ID of the bastion host that manages the database account to modify.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-zpr2zyqx603</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new password of the database account.</p>
     * 
     * <strong>example:</strong>
     * <p>14SZ!******</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region ID of the bastion host that manages the database account to modify.</p>
     * <blockquote>
     * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDatabaseAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseAccountRequest self = new ModifyDatabaseAccountRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseAccountRequest setDatabaseAccountId(String databaseAccountId) {
        this.databaseAccountId = databaseAccountId;
        return this;
    }
    public String getDatabaseAccountId() {
        return this.databaseAccountId;
    }

    public ModifyDatabaseAccountRequest setDatabaseAccountName(String databaseAccountName) {
        this.databaseAccountName = databaseAccountName;
        return this;
    }
    public String getDatabaseAccountName() {
        return this.databaseAccountName;
    }

    public ModifyDatabaseAccountRequest setDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
        return this;
    }
    public String getDatabaseSchema() {
        return this.databaseSchema;
    }

    public ModifyDatabaseAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDatabaseAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyDatabaseAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
