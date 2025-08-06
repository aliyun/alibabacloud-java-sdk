// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class PublishVodStagingConfigToProductionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PublishVodStagingConfigToProductionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishVodStagingConfigToProductionResponseBody self = new PublishVodStagingConfigToProductionResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishVodStagingConfigToProductionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
