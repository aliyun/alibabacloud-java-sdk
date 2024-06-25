// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteInstanceResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7D59453C-48AA-5FC5-8848-2D373BD1A17F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInstanceResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceResourceResponseBody self = new DeleteInstanceResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
