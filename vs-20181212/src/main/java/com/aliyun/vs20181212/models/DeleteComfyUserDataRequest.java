// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteComfyUserDataRequest extends TeaModel {
    /**
     * <p>The name of the file or directory to delete. If a path is passed, it is treated as a directory and must end with a forward slash (/).
     * File name.</p>
     * 
     * <strong>example:</strong>
     * <p>mytest</p>
     */
    @NameInMap("FileName")
    public String fileName;

    public static DeleteComfyUserDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteComfyUserDataRequest self = new DeleteComfyUserDataRequest();
        return TeaModel.build(map, self);
    }

    public DeleteComfyUserDataRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
