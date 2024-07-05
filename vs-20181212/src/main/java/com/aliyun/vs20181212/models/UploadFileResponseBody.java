// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UploadFileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f-1671330gr7934d4771813f7141d28db2f7</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UploadFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadFileResponseBody self = new UploadFileResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadFileResponseBody setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UploadFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
