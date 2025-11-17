// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CreateWorkspaceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowPublish")
    public Boolean allowPublish;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowShare")
    public Boolean allowShare;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowViewAll")
    public Boolean allowViewAll;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DefaultShareToAll")
    public Boolean defaultShareToAll;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OnlyAdminCreateDatasource")
    public Boolean onlyAdminCreateDatasource;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseComment")
    public Boolean useComment;

    @NameInMap("WorkspaceDescription")
    public String workspaceDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static CreateWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceRequest self = new CreateWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceRequest setAllowPublish(Boolean allowPublish) {
        this.allowPublish = allowPublish;
        return this;
    }
    public Boolean getAllowPublish() {
        return this.allowPublish;
    }

    public CreateWorkspaceRequest setAllowShare(Boolean allowShare) {
        this.allowShare = allowShare;
        return this;
    }
    public Boolean getAllowShare() {
        return this.allowShare;
    }

    public CreateWorkspaceRequest setAllowViewAll(Boolean allowViewAll) {
        this.allowViewAll = allowViewAll;
        return this;
    }
    public Boolean getAllowViewAll() {
        return this.allowViewAll;
    }

    public CreateWorkspaceRequest setDefaultShareToAll(Boolean defaultShareToAll) {
        this.defaultShareToAll = defaultShareToAll;
        return this;
    }
    public Boolean getDefaultShareToAll() {
        return this.defaultShareToAll;
    }

    public CreateWorkspaceRequest setOnlyAdminCreateDatasource(Boolean onlyAdminCreateDatasource) {
        this.onlyAdminCreateDatasource = onlyAdminCreateDatasource;
        return this;
    }
    public Boolean getOnlyAdminCreateDatasource() {
        return this.onlyAdminCreateDatasource;
    }

    public CreateWorkspaceRequest setUseComment(Boolean useComment) {
        this.useComment = useComment;
        return this;
    }
    public Boolean getUseComment() {
        return this.useComment;
    }

    public CreateWorkspaceRequest setWorkspaceDescription(String workspaceDescription) {
        this.workspaceDescription = workspaceDescription;
        return this;
    }
    public String getWorkspaceDescription() {
        return this.workspaceDescription;
    }

    public CreateWorkspaceRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
