// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class MigrateExperimentFoldersRequest extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("IsOwner")
    public Boolean isOwner;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static MigrateExperimentFoldersRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateExperimentFoldersRequest self = new MigrateExperimentFoldersRequest();
        return TeaModel.build(map, self);
    }

    public MigrateExperimentFoldersRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public MigrateExperimentFoldersRequest setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
        return this;
    }
    public Boolean getIsOwner() {
        return this.isOwner;
    }

    public MigrateExperimentFoldersRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
