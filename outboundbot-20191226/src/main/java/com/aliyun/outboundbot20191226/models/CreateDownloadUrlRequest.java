// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateDownloadUrlRequest extends TeaModel {
    /**
     * <p>The ID of the download task.</p>
     * <blockquote>
     * <p>This parameter is obtained from the TaskId response parameter of the ListDownloadTasks operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>137da36b41304bcd999a0a7895dc6881</p>
     */
    @NameInMap("DownloadTaskId")
    public String downloadTaskId;

    /**
     * <p>The ID of the file.</p>
     * <blockquote>
     * <p>This parameter is obtained from the FileId response parameter of the ListDownloadTasks operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6f91885fa24b4c408d8f4eb392fd8ae6</p>
     */
    @NameInMap("FileId")
    public String fileId;

    public static CreateDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDownloadUrlRequest self = new CreateDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public CreateDownloadUrlRequest setDownloadTaskId(String downloadTaskId) {
        this.downloadTaskId = downloadTaskId;
        return this;
    }
    public String getDownloadTaskId() {
        return this.downloadTaskId;
    }

    public CreateDownloadUrlRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
