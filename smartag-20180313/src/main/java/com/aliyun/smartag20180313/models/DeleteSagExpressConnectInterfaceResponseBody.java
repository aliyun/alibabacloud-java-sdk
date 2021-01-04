// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteSagExpressConnectInterfaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSagExpressConnectInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSagExpressConnectInterfaceResponseBody self = new DeleteSagExpressConnectInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSagExpressConnectInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
