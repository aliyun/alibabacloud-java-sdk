// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppDatabaseTableSchemasRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>default.ai_advertising_material_rec_train_v1103</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static GetAppDatabaseTableSchemasRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppDatabaseTableSchemasRequest self = new GetAppDatabaseTableSchemasRequest();
        return TeaModel.build(map, self);
    }

    public GetAppDatabaseTableSchemasRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetAppDatabaseTableSchemasRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
