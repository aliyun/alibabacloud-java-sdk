// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GrantAccountPrivilegeRequest extends TeaModel {
    /**
     * <p>The account name. You can call <a href="https://help.aliyun.com/document_detail/610454.html">DescribeAccounts</a> to query the account name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The type of account permission. If you specify multiple values for DBName, you must specify the same number of permission types in the same order, separated by commas (,).</p>
     * <p>The supported permission types vary by database engine. Valid values:</p>
     * <blockquote>
     * <p>For more information about account permissions, see <a href="https://help.aliyun.com/document_detail/146395.html">MySQL/MariaDB permission list</a>, <a href="https://help.aliyun.com/document_detail/95692.html">SQL Server permission list</a>, and <a href="https://help.aliyun.com/document_detail/257684.html">PostgreSQL permission list</a>.</p>
     * </blockquote>
     * <details>
     * <summary>ApsaraDB RDS for MySQL/ApsaraDB RDS for MariaDB</summary>
     * 
     * <ul>
     * <li><strong>ReadWrite</strong>: read and write.</li>
     * <li><strong>ReadOnly</strong>: read-only.</li>
     * <li><strong>DDLOnly</strong>: DDL only.</li>
     * <li><strong>DMLOnly</strong>: DML only.</li>
     * </ul>
     * </details>
     * 
     * <details>
     * <summary>ApsaraDB RDS for SQL Server</summary>
     * 
     * <ul>
     * <li><strong>ReadWrite</strong>: read and write. This permission corresponds to the <code>db_datawriter</code> and <code>db_datareader</code> database roles in SQL Server.</li>
     * <li><strong>ReadOnly</strong>: read-only. This permission corresponds to the <code>db_datareader</code> database role in SQL Server.</li>
     * <li><strong>DBOwner</strong>: database owner. This permission corresponds to the <code>db_owner</code> database role in SQL Server.<blockquote>
     * <p>For more information about database-level roles, see <a href="https://learn.microsoft.com/en-us/sql/relational-databases/security/authentication-access/database-level-roles?view=sql-server-ver16">Microsoft official documentation</a>.</p>
     * </blockquote>
     * </details></li>
     * </ul>
     * <details>
     * <summary>ApsaraDB RDS for PostgreSQL</summary>
     * 
     * <p><strong>DBOwner</strong>: database owner.</p>
     * <blockquote>
     * <p>For fine-grained permission management, see <a href="https://help.aliyun.com/document_detail/352149.html">Best practices for PostgreSQL permission management</a>.</p>
     * </blockquote>
     * </details>
     * 
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ReadWrite</p>
     */
    @NameInMap("AccountPrivilege")
    public String accountPrivilege;

    /**
     * <p>The instance ID. You can call <a href="https://help.aliyun.com/document_detail/610396.html">DescribeDBInstances</a> to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database to which you want to grant access permissions. To grant permissions on multiple databases at a time, separate the database names with commas (,), such as <code>db1,db2,db3</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testDB1</p>
     */
    @NameInMap("DBName")
    public String DBName;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static GrantAccountPrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantAccountPrivilegeRequest self = new GrantAccountPrivilegeRequest();
        return TeaModel.build(map, self);
    }

    public GrantAccountPrivilegeRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public GrantAccountPrivilegeRequest setAccountPrivilege(String accountPrivilege) {
        this.accountPrivilege = accountPrivilege;
        return this;
    }
    public String getAccountPrivilege() {
        return this.accountPrivilege;
    }

    public GrantAccountPrivilegeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public GrantAccountPrivilegeRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public GrantAccountPrivilegeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
