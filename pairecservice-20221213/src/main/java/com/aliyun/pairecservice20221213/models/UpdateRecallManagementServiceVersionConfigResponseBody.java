// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateRecallManagementServiceVersionConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRecallManagementServiceVersionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecallManagementServiceVersionConfigResponseBody self = new UpdateRecallManagementServiceVersionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRecallManagementServiceVersionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
