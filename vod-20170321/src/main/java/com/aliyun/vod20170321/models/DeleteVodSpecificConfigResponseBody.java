// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodSpecificConfigResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVodSpecificConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodSpecificConfigResponseBody self = new DeleteVodSpecificConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVodSpecificConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
