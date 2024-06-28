// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNatIpResponseBody extends TeaModel {
    /**
     * <p>The NAT IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.34</p>
     */
    @NameInMap("NatIp")
    public String natIp;

    /**
     * <p>The ID of the NAT IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>vpcnatip-gw8y7q3cpk3fggs8****</p>
     */
    @NameInMap("NatIpId")
    public String natIpId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E9AD97A0-5338-43F8-8A80-5E274CCBA11B</p>
     */
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
