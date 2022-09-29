// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePbcVersionResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcVersion result;

    public static UpdatePbcVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePbcVersionResponseBody self = new UpdatePbcVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePbcVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePbcVersionResponseBody setResult(PbcVersion result) {
        this.result = result;
        return this;
    }
    public PbcVersion getResult() {
        return this.result;
    }

}
