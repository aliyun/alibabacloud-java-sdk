// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class SetScdnCcInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetScdnCcInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetScdnCcInfoResponseBody self = new SetScdnCcInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SetScdnCcInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
