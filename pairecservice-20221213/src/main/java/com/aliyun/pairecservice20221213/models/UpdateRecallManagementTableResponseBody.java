// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateRecallManagementTableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRecallManagementTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecallManagementTableResponseBody self = new UpdateRecallManagementTableResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRecallManagementTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
