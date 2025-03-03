// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateFolderRequest extends TeaModel {
    /**
     * <p>The name of the folder.</p>
     * <p>The name must be 1 to 24 characters in length and can contain letters, digits, underscores (_), periods (.),and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rdFolder</p>
     */
    @NameInMap("FolderName")
    public String folderName;

    /**
     * <p>The ID of the parent folder.</p>
     * 
     * <strong>example:</strong>
     * <p>r-b1****</p>
     */
    @NameInMap("ParentFolderId")
    public String parentFolderId;

    public static CreateFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFolderRequest self = new CreateFolderRequest();
        return TeaModel.build(map, self);
    }

    public CreateFolderRequest setFolderName(String folderName) {
        this.folderName = folderName;
        return this;
    }
    public String getFolderName() {
        return this.folderName;
    }

    public CreateFolderRequest setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public String getParentFolderId() {
        return this.parentFolderId;
    }

}
