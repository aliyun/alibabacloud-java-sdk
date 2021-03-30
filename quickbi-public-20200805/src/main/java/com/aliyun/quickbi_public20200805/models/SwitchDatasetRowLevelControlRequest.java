// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200805.models;

import com.aliyun.tea.*;

public class SwitchDatasetRowLevelControlRequest extends TeaModel {
    @NameInMap("DatasetId")
    public String datasetId;

    @NameInMap("Open")
    public Boolean open;

    public static SwitchDatasetRowLevelControlRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchDatasetRowLevelControlRequest self = new SwitchDatasetRowLevelControlRequest();
        return TeaModel.build(map, self);
    }

    public SwitchDatasetRowLevelControlRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public SwitchDatasetRowLevelControlRequest setOpen(Boolean open) {
        this.open = open;
        return this;
    }
    public Boolean getOpen() {
        return this.open;
    }

}
