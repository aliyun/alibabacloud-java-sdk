// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentFolderChildrenRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OnlyFolder")
    public Boolean onlyFolder;

    /**
     * <strong>example:</strong>
     * <p>PaiStudio</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <strong>example:</strong>
     * <p>12345******13324</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
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
