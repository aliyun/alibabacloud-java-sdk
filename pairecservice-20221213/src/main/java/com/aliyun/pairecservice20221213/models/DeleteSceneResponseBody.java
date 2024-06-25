// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteSceneResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D75C43DC-3D3A-5CC8-9AAC-8C77306C433B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSceneResponseBody self = new DeleteSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
