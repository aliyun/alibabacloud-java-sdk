// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200805.models;

import com.aliyun.tea.*;

public class AddRowLevelPermissionRequest extends TeaModel {
    @NameInMap("DatasetId")
    public String datasetId;

    @NameInMap("TargetIds")
    public String targetIds;

    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("ColumnIds")
    public String columnIds;

    @NameInMap("ColumnValues")
    public String columnValues;

    public static AddRowLevelPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRowLevelPermissionRequest self = new AddRowLevelPermissionRequest();
        return TeaModel.build(map, self);
    }

    public AddRowLevelPermissionRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public AddRowLevelPermissionRequest setTargetIds(String targetIds) {
        this.targetIds = targetIds;
        return this;
    }
    public String getTargetIds() {
        return this.targetIds;
    }

    public AddRowLevelPermissionRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public AddRowLevelPermissionRequest setColumnIds(String columnIds) {
        this.columnIds = columnIds;
        return this;
    }
    public String getColumnIds() {
        return this.columnIds;
    }

    public AddRowLevelPermissionRequest setColumnValues(String columnValues) {
        this.columnValues = columnValues;
        return this;
    }
    public String getColumnValues() {
        return this.columnValues;
    }

}
