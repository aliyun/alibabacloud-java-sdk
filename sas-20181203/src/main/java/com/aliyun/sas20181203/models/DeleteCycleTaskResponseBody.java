// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteCycleTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCycleTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCycleTaskResponseBody self = new DeleteCycleTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCycleTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
