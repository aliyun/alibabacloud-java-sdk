// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNatIpResponseBody extends TeaModel {
    @NameInMap("NatIp")
    public String natIp;

    @NameInMap("NatIpId")
    public String natIpId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateNatIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNatIpResponseBody self = new CreateNatIpResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNatIpResponseBody setNatIp(String natIp) {
        this.natIp = natIp;
        return this;
    }
    public String getNatIp() {
        return this.natIp;
    }

    public CreateNatIpResponseBody setNatIpId(String natIpId) {
        this.natIpId = natIpId;
        return this;
    }
    public String getNatIpId() {
        return this.natIpId;
    }

    public CreateNatIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
