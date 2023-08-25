// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOutlineBindingRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The ID of the OceanBase cluster.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>- When the value is set to True, the throttling information in the database is queried based on the SQL ID.   </p>
     * <p>- When the value is set to False, the bound index or execution plan in the database is queried based on the SQL ID.</p>
     */
    @NameInMap("IsConcurrentLimit")
    public Boolean isConcurrentLimit;

    /**
     * <p>SQLID.</p>
     */
    @NameInMap("SQLId")
    public String SQLId;

    /**
     * <p>The name of the tenant.    </p>
     * <p>It must start with a letter or an underscore (_), and contain 2 to 20 characters, which can be uppercase letters, lowercase letters, digits, and underscores (_). It cannot be set to SYS.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the tenant.</p>
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
