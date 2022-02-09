// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOutlineBindingRequest extends TeaModel {
    // 数据库名称
    @NameInMap("DatabaseName")
    public String databaseName;

    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 当值为True时，查询SQLID在数据库中的限流信息
    @NameInMap("IsConcurrentLimit")
    public Boolean isConcurrentLimit;

    // SQLID
    @NameInMap("SQLId")
    public String SQLId;

    // 租户名称。 长度为2~20 个字符，支持英文字母、数字和下划线，区分大小写，必须以字母或下划线开头。 不可设置为 sys。
    @NameInMap("TableName")
    public String tableName;

    // 租户ID。
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
