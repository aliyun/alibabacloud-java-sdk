// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class StopVodDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopVodDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopVodDomainResponseBody self = new StopVodDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public StopVodDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
