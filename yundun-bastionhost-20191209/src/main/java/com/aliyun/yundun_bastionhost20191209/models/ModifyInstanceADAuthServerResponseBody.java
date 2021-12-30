// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceADAuthServerResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceADAuthServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceADAuthServerResponseBody self = new ModifyInstanceADAuthServerResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceADAuthServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
