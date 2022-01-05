// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class ExportExperimentRequest extends TeaModel {
    @NameInMap("ExperimentId")
    public Long experimentId;

    public static ExportExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportExperimentRequest self = new ExportExperimentRequest();
        return TeaModel.build(map, self);
    }

    public ExportExperimentRequest setExperimentId(Long experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public Long getExperimentId() {
        return this.experimentId;
    }

}
