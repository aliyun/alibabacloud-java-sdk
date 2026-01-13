// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteRecallManagementTableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRecallManagementTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecallManagementTableResponseBody self = new DeleteRecallManagementTableResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRecallManagementTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
