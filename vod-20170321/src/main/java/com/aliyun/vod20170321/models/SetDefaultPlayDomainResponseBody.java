// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultPlayDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetDefaultPlayDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultPlayDomainResponseBody self = new SetDefaultPlayDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDefaultPlayDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
