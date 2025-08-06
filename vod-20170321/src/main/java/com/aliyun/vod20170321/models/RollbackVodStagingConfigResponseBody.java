// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RollbackVodStagingConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RollbackVodStagingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackVodStagingConfigResponseBody self = new RollbackVodStagingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackVodStagingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
