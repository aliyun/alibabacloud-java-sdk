// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteLayerResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLayerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLayerResponseBody self = new DeleteLayerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLayerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
