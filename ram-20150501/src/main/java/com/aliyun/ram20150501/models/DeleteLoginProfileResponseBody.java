// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DeleteLoginProfileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLoginProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoginProfileResponseBody self = new DeleteLoginProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLoginProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
