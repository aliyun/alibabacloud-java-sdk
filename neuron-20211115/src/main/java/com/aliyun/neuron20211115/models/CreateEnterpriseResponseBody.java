// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateEnterpriseResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Enterprise result;

    public static CreateEnterpriseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnterpriseResponseBody self = new CreateEnterpriseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnterpriseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEnterpriseResponseBody setResult(Enterprise result) {
        this.result = result;
        return this;
    }
    public Enterprise getResult() {
        return this.result;
    }

}
