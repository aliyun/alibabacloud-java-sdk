// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class StartVodDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartVodDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartVodDomainResponseBody self = new StartVodDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public StartVodDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
