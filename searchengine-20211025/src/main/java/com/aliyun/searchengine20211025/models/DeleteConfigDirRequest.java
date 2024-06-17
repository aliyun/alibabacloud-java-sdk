// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class DeleteConfigDirRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/clusters</p>
     */
    @NameInMap("dirName")
    public String dirName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("parentFullPath")
    public String parentFullPath;

    public static DeleteConfigDirRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigDirRequest self = new DeleteConfigDirRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConfigDirRequest setDirName(String dirName) {
        this.dirName = dirName;
        return this;
    }
    public String getDirName() {
        return this.dirName;
    }

    public DeleteConfigDirRequest setParentFullPath(String parentFullPath) {
        this.parentFullPath = parentFullPath;
        return this;
    }
    public String getParentFullPath() {
        return this.parentFullPath;
    }

}
