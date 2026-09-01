// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DeleteComponentAssetResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique ID for each request. You can use the request ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>39C38A34-8532-5D44-B88A-7263B435C316</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteComponentAssetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteComponentAssetResponseBody self = new DeleteComponentAssetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteComponentAssetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
