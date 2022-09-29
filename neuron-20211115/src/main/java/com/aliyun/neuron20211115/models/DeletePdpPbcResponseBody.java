// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeletePdpPbcResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Boolean result;

    public static DeletePdpPbcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePdpPbcResponseBody self = new DeletePdpPbcResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePdpPbcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePdpPbcResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
