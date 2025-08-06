// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateStreamInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateStreamInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateStreamInfoResponseBody self = new UpdateStreamInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateStreamInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
