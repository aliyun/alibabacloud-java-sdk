// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteApplicationGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteApplicationGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationGroupResponseBody self = new DeleteApplicationGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
