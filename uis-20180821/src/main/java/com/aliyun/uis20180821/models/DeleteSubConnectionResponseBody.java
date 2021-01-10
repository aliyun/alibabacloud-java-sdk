// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DeleteSubConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSubConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubConnectionResponseBody self = new DeleteSubConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSubConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
