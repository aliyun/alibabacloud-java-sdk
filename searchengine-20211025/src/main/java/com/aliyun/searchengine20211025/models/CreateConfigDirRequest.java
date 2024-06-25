// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateConfigDirRequest extends TeaModel {
    /**
     * <p>The name of the directory</p>
     * 
     * <strong>example:</strong>
     * <p>/clusters</p>
     */
    @NameInMap("dirName")
    public String dirName;

    /**
     * <p>Parent file path</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("parentFullPath")
    public String parentFullPath;

    public static CreateConfigDirRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigDirRequest self = new CreateConfigDirRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigDirRequest setDirName(String dirName) {
        this.dirName = dirName;
        return this;
    }
    public String getDirName() {
        return this.dirName;
    }

    public CreateConfigDirRequest setParentFullPath(String parentFullPath) {
        this.parentFullPath = parentFullPath;
        return this;
    }
    public String getParentFullPath() {
        return this.parentFullPath;
    }

}
