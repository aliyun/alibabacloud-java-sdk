// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class BatchStartVodDomainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static BatchStartVodDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchStartVodDomainResponse self = new BatchStartVodDomainResponse();
        return TeaModel.build(map, self);
    }

}
