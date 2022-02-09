// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteOmsMigrationProjectRequest extends TeaModel {
    @NameInMap("PrecheckTaskId")
    public String precheckTaskId;

    @NameInMap("ProjectId")
    public String projectId;

    public static DeleteOmsMigrationProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOmsMigrationProjectRequest self = new DeleteOmsMigrationProjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOmsMigrationProjectRequest setPrecheckTaskId(String precheckTaskId) {
        this.precheckTaskId = precheckTaskId;
        return this;
    }
    public String getPrecheckTaskId() {
        return this.precheckTaskId;
    }

    public DeleteOmsMigrationProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
