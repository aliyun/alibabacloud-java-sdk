// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class UploadPartCopyRequest extends TeaModel {
    @NameInMap("partNumber")
    public String partNumber;

    @NameInMap("uploadId")
    public String uploadId;

    public static UploadPartCopyRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadPartCopyRequest self = new UploadPartCopyRequest();
        return TeaModel.build(map, self);
    }

    public UploadPartCopyRequest setPartNumber(String partNumber) {
        this.partNumber = partNumber;
        return this;
    }
    public String getPartNumber() {
        return this.partNumber;
    }

    public UploadPartCopyRequest setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

}
