// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DeleteUisNetworkInterfaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUisNetworkInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUisNetworkInterfaceResponseBody self = new DeleteUisNetworkInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUisNetworkInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
