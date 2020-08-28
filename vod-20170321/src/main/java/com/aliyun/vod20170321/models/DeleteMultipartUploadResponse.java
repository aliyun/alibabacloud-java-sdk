// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMultipartUploadResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteMultipartUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultipartUploadResponse self = new DeleteMultipartUploadResponse();
        return TeaModel.build(map, self);
    }

}
