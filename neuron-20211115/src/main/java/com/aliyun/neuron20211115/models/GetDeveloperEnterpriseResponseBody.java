// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetDeveloperEnterpriseResponseBody extends TeaModel {
    @NameInMap("enterprise")
    public Enterprise enterprise;

    @NameInMap("requestId")
    public String requestId;

    public static GetDeveloperEnterpriseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeveloperEnterpriseResponseBody self = new GetDeveloperEnterpriseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeveloperEnterpriseResponseBody setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
        return this;
    }
    public Enterprise getEnterprise() {
        return this.enterprise;
    }

    public GetDeveloperEnterpriseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
