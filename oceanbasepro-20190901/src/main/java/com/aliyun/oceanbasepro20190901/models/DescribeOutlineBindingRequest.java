// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOutlineBindingRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The ID of the OceanBase cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <ul>
     * <li>When the value is set to True, the throttling information in the database is queried based on the SQL ID.   </li>
     * <li>When the value is set to False, the bound index or execution plan in the database is queried based on the SQL ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsConcurrentLimit")
    public Boolean isConcurrentLimit;

    /**
     * <p>SQLID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8D6E84<strong><strong>0B8FB1823D199E2CA1</strong></strong></p>
     */
    @NameInMap("SQLId")
    public String SQLId;

    /**
     * <p>The name of the tenant.<br>It must start with a letter or an underscore (<em>), and contain 2 to 20 characters, which can be uppercase letters, lowercase letters, digits, and underscores (</em>). It cannot be set to SYS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pay_online</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t2mr3oae0****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeOutlineBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutlineBindingRequest self = new DescribeOutlineBindingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOutlineBindingRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public DescribeOutlineBindingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeOutlineBindingRequest setIsConcurrentLimit(Boolean isConcurrentLimit) {
        this.isConcurrentLimit = isConcurrentLimit;
        return this;
    }
    public Boolean getIsConcurrentLimit() {
        return this.isConcurrentLimit;
    }

    public DescribeOutlineBindingRequest setSQLId(String SQLId) {
        this.SQLId = SQLId;
        return this;
    }
    public String getSQLId() {
        return this.SQLId;
    }

    public DescribeOutlineBindingRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public DescribeOutlineBindingRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
