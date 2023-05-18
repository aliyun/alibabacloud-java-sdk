// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateFolderRequest extends TeaModel {
    /**
     * <p>The ID of the folder.</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>The new name of the folder.</p>
     * <br>
     * <p>The name must be 1 to 24 characters in length and can contain letters, digits, underscores (\_), periods (.), and hyphens (-).</p>
     */
    @NameInMap("NewFolderName")
    public String newFolderName;

    public static UpdateFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFolderRequest self = new UpdateFolderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFolderRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public UpdateFolderRequest setNewFolderName(String newFolderName) {
        this.newFolderName = newFolderName;
        return this;
    }
    public String getNewFolderName() {
        return this.newFolderName;
    }

}
