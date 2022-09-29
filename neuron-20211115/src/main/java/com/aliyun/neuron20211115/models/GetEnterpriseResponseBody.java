// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetEnterpriseResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Enterprise result;

    public static GetEnterpriseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseResponseBody self = new GetEnterpriseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEnterpriseResponseBody setResult(Enterprise result) {
        this.result = result;
        return this;
    }
    public Enterprise getResult() {
        return this.result;
    }

}
