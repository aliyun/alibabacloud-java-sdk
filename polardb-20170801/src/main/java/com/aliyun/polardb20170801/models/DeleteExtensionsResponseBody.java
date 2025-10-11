// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteExtensionsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>11EB8492-C17F-5FC2-9E27-1440A5C2F583</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteExtensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteExtensionsResponseBody self = new DeleteExtensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteExtensionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
