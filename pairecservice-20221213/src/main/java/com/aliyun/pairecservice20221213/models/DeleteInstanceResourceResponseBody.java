// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteInstanceResourceResponseBody extends TeaModel {
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
