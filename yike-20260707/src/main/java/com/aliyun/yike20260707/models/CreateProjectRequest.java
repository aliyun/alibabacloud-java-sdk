// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    /**
     * <p>The name of the project. The name can be up to 50 characters in length and cannot contain single quotation marks, semicolons, less than signs, greater than signs, equal signs, vertical lines, or parentheses.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Product Demo</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The ID of the workspace to which the project belongs. If this parameter is not specified, the default workspace of the current account is used.</p>
     * 
     * <strong>example:</strong>
     * <p>ws_zna577pdximv***</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRequest self = new CreateProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateProjectRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
