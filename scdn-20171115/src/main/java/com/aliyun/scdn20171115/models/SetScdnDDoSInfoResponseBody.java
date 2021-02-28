// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class SetScdnDDoSInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetScdnDDoSInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetScdnDDoSInfoResponseBody self = new SetScdnDDoSInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SetScdnDDoSInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
