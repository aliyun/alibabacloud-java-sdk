// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class BatchStartVodDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BatchStartVodDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchStartVodDomainResponseBody self = new BatchStartVodDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchStartVodDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
