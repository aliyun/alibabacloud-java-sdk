// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteStreamResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A7U43F6-D7393642****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStreamResponseBody self = new DeleteStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
