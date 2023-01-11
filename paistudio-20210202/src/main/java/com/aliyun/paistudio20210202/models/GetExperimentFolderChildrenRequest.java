// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentFolderChildrenRequest extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("OnlyFolder")
    public Boolean onlyFolder;

    @NameInMap("Source")
    public String source;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetExperimentFolderChildrenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentFolderChildrenRequest self = new GetExperimentFolderChildrenRequest();
        return TeaModel.build(map, self);
    }

    public GetExperimentFolderChildrenRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetExperimentFolderChildrenRequest setOnlyFolder(Boolean onlyFolder) {
        this.onlyFolder = onlyFolder;
        return this;
    }
    public Boolean getOnlyFolder() {
        return this.onlyFolder;
    }

    public GetExperimentFolderChildrenRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetExperimentFolderChildrenRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetExperimentFolderChildrenRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
