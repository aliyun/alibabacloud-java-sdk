// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class RemoveCloudAccountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RemoveCloudAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveCloudAccountResponse self = new RemoveCloudAccountResponse();
        return TeaModel.build(map, self);
    }

    public RemoveCloudAccountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
