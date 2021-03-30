// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200805.models;

import com.aliyun.tea.*;

public class SwitchRowLevelTypeRequest extends TeaModel {
    @NameInMap("DatasetId")
    public String datasetId;

    @NameInMap("Type")
    public Integer type;

    public static SwitchRowLevelTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchRowLevelTypeRequest self = new SwitchRowLevelTypeRequest();
        return TeaModel.build(map, self);
    }

    public SwitchRowLevelTypeRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public SwitchRowLevelTypeRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
