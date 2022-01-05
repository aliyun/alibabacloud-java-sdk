// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class ExportExperimentTreeByProjectOwnerRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TreeOwnerId")
    public String treeOwnerId;

    public static ExportExperimentTreeByProjectOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportExperimentTreeByProjectOwnerRequest self = new ExportExperimentTreeByProjectOwnerRequest();
        return TeaModel.build(map, self);
    }

    public ExportExperimentTreeByProjectOwnerRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ExportExperimentTreeByProjectOwnerRequest setTreeOwnerId(String treeOwnerId) {
        this.treeOwnerId = treeOwnerId;
        return this;
    }
    public String getTreeOwnerId() {
        return this.treeOwnerId;
    }

}
