// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class VerifyInstanceADAuthServerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyInstanceADAuthServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyInstanceADAuthServerResponseBody self = new VerifyInstanceADAuthServerResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyInstanceADAuthServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
