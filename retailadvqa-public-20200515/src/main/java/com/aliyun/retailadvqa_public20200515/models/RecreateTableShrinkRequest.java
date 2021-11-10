// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class RecreateTableShrinkRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("OssPath")
    public String ossPath;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("TableSchema")
    public String tableSchemaShrink;

    @NameInMap("TenantId")
    public String tenantId;

    public static RecreateTableShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RecreateTableShrinkRequest self = new RecreateTableShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RecreateTableShrinkRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public RecreateTableShrinkRequest setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public RecreateTableShrinkRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public RecreateTableShrinkRequest setTableSchemaShrink(String tableSchemaShrink) {
        this.tableSchemaShrink = tableSchemaShrink;
        return this;
    }
    public String getTableSchemaShrink() {
        return this.tableSchemaShrink;
    }

    public RecreateTableShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
