// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteEngineConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F7AC05FF-EDE7-5C2B-B9AE-33D6DF4178BA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEngineConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEngineConfigResponseBody self = new DeleteEngineConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEngineConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
