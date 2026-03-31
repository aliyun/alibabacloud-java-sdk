// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateProfileShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm_bfaf7e110b6d4359977d1686a3f8</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AttributesOperations")
    public String attributesOperationsShrink;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>10b6d435</p>
     */
    @NameInMap("UserDefinedId")
    public String userDefinedId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-jb5sabg80b4ts71g</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateProfileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProfileShrinkRequest self = new UpdateProfileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProfileShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateProfileShrinkRequest setAttributesOperationsShrink(String attributesOperationsShrink) {
        this.attributesOperationsShrink = attributesOperationsShrink;
        return this;
    }
    public String getAttributesOperationsShrink() {
        return this.attributesOperationsShrink;
    }

    public UpdateProfileShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProfileShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateProfileShrinkRequest setUserDefinedId(String userDefinedId) {
        this.userDefinedId = userDefinedId;
        return this;
    }
    public String getUserDefinedId() {
        return this.userDefinedId;
    }

    public UpdateProfileShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
