// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetFolderRequest extends TeaModel {
    @NameInMap("FolderId")
    public String folderId;

    public static GetFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFolderRequest self = new GetFolderRequest();
        return TeaModel.build(map, self);
    }

    public GetFolderRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

}
