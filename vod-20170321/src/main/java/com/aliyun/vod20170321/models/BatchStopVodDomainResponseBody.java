// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class BatchStopVodDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BatchStopVodDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchStopVodDomainResponseBody self = new BatchStopVodDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchStopVodDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
