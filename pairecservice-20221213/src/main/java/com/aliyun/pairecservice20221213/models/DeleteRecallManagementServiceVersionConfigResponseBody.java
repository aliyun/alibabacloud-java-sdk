// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteRecallManagementServiceVersionConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRecallManagementServiceVersionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecallManagementServiceVersionConfigResponseBody self = new DeleteRecallManagementServiceVersionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRecallManagementServiceVersionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
