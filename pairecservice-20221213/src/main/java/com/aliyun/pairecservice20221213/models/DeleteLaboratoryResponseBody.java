// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteLaboratoryResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
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
