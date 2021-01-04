// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteFlowLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFlowLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowLogResponseBody self = new DeleteFlowLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFlowLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
