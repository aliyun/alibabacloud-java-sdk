// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeletePdpConfigResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static DeletePdpConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePdpConfigResponseBody self = new DeletePdpConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePdpConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
