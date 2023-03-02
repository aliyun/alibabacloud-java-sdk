// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVideoInfoResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateVideoInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoInfoResponseBody self = new UpdateVideoInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVideoInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
