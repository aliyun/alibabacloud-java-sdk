// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class RecreateTableRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("TableSchema")
    public java.util.Map<String, ?> tableSchema;

    @NameInMap("OssPath")
    public String ossPath;

    @NameInMap("TableName")
    public String tableName;

    public static RecreateTableRequest build(java.util.Map<String, ?> map) throws Exception {
        RecreateTableRequest self = new RecreateTableRequest();
        return TeaModel.build(map, self);
    }

    public RecreateTableRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public RecreateTableRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public RecreateTableRequest setTableSchema(java.util.Map<String, ?> tableSchema) {
        this.tableSchema = tableSchema;
        return this;
    }
    public java.util.Map<String, ?> getTableSchema() {
        return this.tableSchema;
    }

    public RecreateTableRequest setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public RecreateTableRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
