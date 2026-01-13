// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateRecallManagementServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRecallManagementServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecallManagementServiceResponseBody self = new UpdateRecallManagementServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRecallManagementServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
