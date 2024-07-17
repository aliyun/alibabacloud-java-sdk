// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class DeleteConfigFileRequest extends TeaModel {
    /**
     * <p>The file name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/schemas/automobile_vector_schema.json</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>The path of the parent directory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("parentFullPath")
    public String parentFullPath;

    public static DeleteConfigFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigFileRequest self = new DeleteConfigFileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConfigFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DeleteConfigFileRequest setParentFullPath(String parentFullPath) {
        this.parentFullPath = parentFullPath;
        return this;
    }
    public String getParentFullPath() {
        return this.parentFullPath;
    }

}
