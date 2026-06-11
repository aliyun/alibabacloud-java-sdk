// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CreateWorkspaceRequest extends TeaModel {
    /**
     * <p>Specifies whether reports in the workspace can be made public. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowPublish")
    public Boolean allowPublish;

    /**
     * <p>Specifies whether reports in the workspace can be shared. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowShare")
    public Boolean allowShare;

    /**
     * <p>Specifies whether the workspace is in collaboration mode. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowViewAll")
    public Boolean allowViewAll;

    /**
     * <p>Specifies whether to grant read permissions on the works in the workspace to all workspace members by default. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DefaultShareToAll")
    public Boolean defaultShareToAll;

    /**
     * <p>Specifies whether only administrators can create data sources in the workspace. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OnlyAdminCreateDatasource")
    public Boolean onlyAdminCreateDatasource;

    /**
     * <p>Specifies whether to use table remarks when you create a dataset in the workspace. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseComment")
    public Boolean useComment;

    /**
     * <p>The description of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("WorkspaceDescription")
    public String workspaceDescription;

    /**
     * <p>The name of the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
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
