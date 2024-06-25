// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteParamResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F0AB6527-093F-5C44-B3BD-42C8C210C619</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteParamResponseBody self = new DeleteParamResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
