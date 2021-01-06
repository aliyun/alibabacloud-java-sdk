// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CancelCreateCloudAccountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CancelCreateCloudAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelCreateCloudAccountResponse self = new CancelCreateCloudAccountResponse();
        return TeaModel.build(map, self);
    }

    public CancelCreateCloudAccountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
