// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class CreateFolderRequest extends TeaModel {
    @NameInMap("FolderName")
    public String folderName;

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
