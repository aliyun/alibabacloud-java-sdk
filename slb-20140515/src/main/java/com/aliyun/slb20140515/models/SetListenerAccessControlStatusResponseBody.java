// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetListenerAccessControlStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetListenerAccessControlStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetListenerAccessControlStatusResponseBody self = new SetListenerAccessControlStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetListenerAccessControlStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
