// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateExtensionsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateExtensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExtensionsResponseBody self = new CreateExtensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExtensionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
