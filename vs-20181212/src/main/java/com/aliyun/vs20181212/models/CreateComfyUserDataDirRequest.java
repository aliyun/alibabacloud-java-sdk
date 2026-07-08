// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateComfyUserDataDirRequest extends TeaModel {
    /**
     * <p>The path of the directory to create. Use /dir1/ for a single-level directory, or /dir1/dir2/ for a multi-level directory.</p>
     * 
     * <strong>example:</strong>
     * <p>/userdir1</p>
     */
    @NameInMap("Path")
    public String path;

    public static CreateComfyUserDataDirRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComfyUserDataDirRequest self = new CreateComfyUserDataDirRequest();
        return TeaModel.build(map, self);
    }

    public CreateComfyUserDataDirRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
