// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class GetAttachmentUploadUrlRequest extends TeaModel {
    /**
     * <p>Name of the uploaded file</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>81A0D93D-54D7-4529-ABFA-633ED63223BA.jpg</p>
     */
    @NameInMap("FileName")
    public String fileName;

    public static GetAttachmentUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAttachmentUploadUrlRequest self = new GetAttachmentUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetAttachmentUploadUrlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
