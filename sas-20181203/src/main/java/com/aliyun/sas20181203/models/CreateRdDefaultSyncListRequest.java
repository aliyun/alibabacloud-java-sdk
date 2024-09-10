// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateRdDefaultSyncListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>fd-BwoXuf****,fd-CFamY7****</p>
     */
    @NameInMap("FolderIds")
    public String folderIds;

    public static CreateRdDefaultSyncListRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRdDefaultSyncListRequest self = new CreateRdDefaultSyncListRequest();
        return TeaModel.build(map, self);
    }

    public CreateRdDefaultSyncListRequest setFolderIds(String folderIds) {
        this.folderIds = folderIds;
        return this;
    }
    public String getFolderIds() {
        return this.folderIds;
    }

}
