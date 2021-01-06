// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DestroyResourceDirectoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DestroyResourceDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DestroyResourceDirectoryResponse self = new DestroyResourceDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public DestroyResourceDirectoryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
