// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class BatchSetVodDomainConfigsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BatchSetVodDomainConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSetVodDomainConfigsResponseBody self = new BatchSetVodDomainConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSetVodDomainConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
