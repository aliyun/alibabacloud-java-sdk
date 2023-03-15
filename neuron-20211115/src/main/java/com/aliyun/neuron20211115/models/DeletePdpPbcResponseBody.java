// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeletePdpPbcResponseBody extends TeaModel {
    @NameInMap("data")
    public Boolean data;

    @NameInMap("requestId")
    public String requestId;

    public static DeletePdpPbcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePdpPbcResponseBody self = new DeletePdpPbcResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePdpPbcResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeletePdpPbcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
