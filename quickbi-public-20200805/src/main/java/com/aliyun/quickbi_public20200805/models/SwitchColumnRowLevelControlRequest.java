// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200805.models;

import com.aliyun.tea.*;

public class SwitchColumnRowLevelControlRequest extends TeaModel {
    @NameInMap("DatasetId")
    public String datasetId;

    @NameInMap("ColumnIds")
    public String columnIds;

    @NameInMap("Open")
    public Boolean open;

    public static SwitchColumnRowLevelControlRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchColumnRowLevelControlRequest self = new SwitchColumnRowLevelControlRequest();
        return TeaModel.build(map, self);
    }

    public SwitchColumnRowLevelControlRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public SwitchColumnRowLevelControlRequest setColumnIds(String columnIds) {
        this.columnIds = columnIds;
        return this;
    }
    public String getColumnIds() {
        return this.columnIds;
    }

    public SwitchColumnRowLevelControlRequest setOpen(Boolean open) {
        this.open = open;
        return this;
    }
    public Boolean getOpen() {
        return this.open;
    }

}
