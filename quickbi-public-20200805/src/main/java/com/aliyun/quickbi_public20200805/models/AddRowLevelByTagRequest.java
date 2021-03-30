// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200805.models;

import com.aliyun.tea.*;

public class AddRowLevelByTagRequest extends TeaModel {
    @NameInMap("DatasetId")
    public String datasetId;

    @NameInMap("ColumnIds")
    public String columnIds;

    @NameInMap("Tags")
    public String tags;

    public static AddRowLevelByTagRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRowLevelByTagRequest self = new AddRowLevelByTagRequest();
        return TeaModel.build(map, self);
    }

    public AddRowLevelByTagRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public AddRowLevelByTagRequest setColumnIds(String columnIds) {
        this.columnIds = columnIds;
        return this;
    }
    public String getColumnIds() {
        return this.columnIds;
    }

    public AddRowLevelByTagRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
