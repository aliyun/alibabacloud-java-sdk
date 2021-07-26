// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentFolderChildrenRequest extends TeaModel {
    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("OnlyFolder")
    public Boolean onlyFolder;

    public static GetExperimentFolderChildrenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentFolderChildrenRequest self = new GetExperimentFolderChildrenRequest();
        return TeaModel.build(map, self);
    }

    public GetExperimentFolderChildrenRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetExperimentFolderChildrenRequest setOnlyFolder(Boolean onlyFolder) {
        this.onlyFolder = onlyFolder;
        return this;
    }
    public Boolean getOnlyFolder() {
        return this.onlyFolder;
    }

}
