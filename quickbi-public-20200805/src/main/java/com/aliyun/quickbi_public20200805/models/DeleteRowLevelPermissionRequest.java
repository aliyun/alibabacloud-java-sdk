// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200805.models;

import com.aliyun.tea.*;

public class DeleteRowLevelPermissionRequest extends TeaModel {
    @NameInMap("DatasetId")
    public String datasetId;

    @NameInMap("ColumnIds")
    public String columnIds;

    @NameInMap("TargetIds")
    public String targetIds;

    @NameInMap("TargetTypes")
    public String targetTypes;

    @NameInMap("DeleteType")
    public Integer deleteType;

    public static DeleteRowLevelPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRowLevelPermissionRequest self = new DeleteRowLevelPermissionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRowLevelPermissionRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public DeleteRowLevelPermissionRequest setColumnIds(String columnIds) {
        this.columnIds = columnIds;
        return this;
    }
    public String getColumnIds() {
        return this.columnIds;
    }

    public DeleteRowLevelPermissionRequest setTargetIds(String targetIds) {
        this.targetIds = targetIds;
        return this;
    }
    public String getTargetIds() {
        return this.targetIds;
    }

    public DeleteRowLevelPermissionRequest setTargetTypes(String targetTypes) {
        this.targetTypes = targetTypes;
        return this;
    }
    public String getTargetTypes() {
        return this.targetTypes;
    }

    public DeleteRowLevelPermissionRequest setDeleteType(Integer deleteType) {
        this.deleteType = deleteType;
        return this;
    }
    public Integer getDeleteType() {
        return this.deleteType;
    }

}
