// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class ExportExperimentTreeRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    public static ExportExperimentTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportExperimentTreeRequest self = new ExportExperimentTreeRequest();
        return TeaModel.build(map, self);
    }

    public ExportExperimentTreeRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
