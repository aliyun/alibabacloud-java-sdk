// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200805.models;

import com.aliyun.tea.*;

public class DeleteRowLevelByTagRequest extends TeaModel {
    @NameInMap("DatasetId")
    public String datasetId;

    @NameInMap("ColumnIds")
    public String columnIds;

    public static DeleteRowLevelByTagRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRowLevelByTagRequest self = new DeleteRowLevelByTagRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRowLevelByTagRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public DeleteRowLevelByTagRequest setColumnIds(String columnIds) {
        this.columnIds = columnIds;
        return this;
    }
    public String getColumnIds() {
        return this.columnIds;
    }

}
