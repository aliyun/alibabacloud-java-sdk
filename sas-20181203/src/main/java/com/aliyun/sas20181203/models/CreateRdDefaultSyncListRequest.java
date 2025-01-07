// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateRdDefaultSyncListRequest extends TeaModel {
    /**
     * <p>The IDs of the folders in the resource directory.</p>
     * <blockquote>
     * <p> You can call the <a href="~~GetRdTree~~">GetRdTree</a> operation to obtain the IDs of the folders. Separate multiple folder IDs with commas (,). If you do not specify a value for this parameter, the existing member list is cleared.</p>
     * </blockquote>
     * 
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
