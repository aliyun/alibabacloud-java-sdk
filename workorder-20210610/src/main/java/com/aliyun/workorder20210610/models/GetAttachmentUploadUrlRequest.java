// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class GetAttachmentUploadUrlRequest extends TeaModel {
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
