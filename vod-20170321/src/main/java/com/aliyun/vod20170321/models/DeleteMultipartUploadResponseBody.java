// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMultipartUploadResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMultipartUploadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultipartUploadResponseBody self = new DeleteMultipartUploadResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMultipartUploadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
