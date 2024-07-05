// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateFileInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f-16713accddtgtj6340jgnclhwsg1813f718db2f7</p>
     */
    @NameInMap("FileId")
    public String fileId;

    public static UpdateFileInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileInfoRequest self = new UpdateFileInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateFileInfoRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
