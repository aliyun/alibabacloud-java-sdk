// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeletePdpServiceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static DeletePdpServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePdpServiceResponseBody self = new DeletePdpServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePdpServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
