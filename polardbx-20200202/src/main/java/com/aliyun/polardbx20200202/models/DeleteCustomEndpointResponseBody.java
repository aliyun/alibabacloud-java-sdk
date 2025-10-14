// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteCustomEndpointResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9B2F3840-****-475C-B269-2D5C3A31797C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCustomEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomEndpointResponseBody self = new DeleteCustomEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
