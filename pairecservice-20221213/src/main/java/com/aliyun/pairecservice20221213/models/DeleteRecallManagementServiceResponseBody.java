// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteRecallManagementServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRecallManagementServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecallManagementServiceResponseBody self = new DeleteRecallManagementServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRecallManagementServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
