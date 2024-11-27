// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class VerifyInstanceADAuthServerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8F1085E3-F048-5F34-B650-F145216E4AA5</p>
     */
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
