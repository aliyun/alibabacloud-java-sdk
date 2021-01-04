// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateQosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("QosId")
    public String qosId;

    public static CreateQosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQosResponseBody self = new CreateQosResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateQosResponseBody setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

}
