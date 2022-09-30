// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOutlineBindingRequest extends TeaModel {
    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsConcurrentLimit")
    public Boolean isConcurrentLimit;

    @NameInMap("SQLId")
    public String SQLId;

    @NameInMap("TableName")
    public String tableName;

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
