// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class CreateDownloadUrlRequest extends TeaModel {
    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>073f092da0a847b9bf76eb88b5931c7a</p>
     */
    @NameInMap("DownloadTaskId")
    public String downloadTaskId;

    /**
     * <p>The ID of the file. You can call the <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> operation to query the file ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22626c39603744f5a08d4d715315561a</p>
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
