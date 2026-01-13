// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteRecallManagementServiceVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRecallManagementServiceVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecallManagementServiceVersionResponseBody self = new DeleteRecallManagementServiceVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRecallManagementServiceVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
