// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteLaboratoryResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1C0898E5-9220-5443-B2D9-445FF0688215</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLaboratoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLaboratoryResponseBody self = new DeleteLaboratoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLaboratoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
