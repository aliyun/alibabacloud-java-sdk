// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpShelfPbcVersionResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Boolean result;

    public static UpShelfPbcVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpShelfPbcVersionResponseBody self = new UpShelfPbcVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpShelfPbcVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpShelfPbcVersionResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
