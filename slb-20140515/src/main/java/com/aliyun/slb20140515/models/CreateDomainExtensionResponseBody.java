// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateDomainExtensionResponseBody extends TeaModel {
    /**
     * <p>The ID of the additional domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>de-bp1rp7ta19******</p>
     */
    @NameInMap("DomainExtensionId")
    public String domainExtensionId;

    /**
     * <p>The frontend port that is used by the SLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A6E7EFC9-0938-40CA-877D-9BEDBD21D357</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDomainExtensionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainExtensionResponseBody self = new CreateDomainExtensionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDomainExtensionResponseBody setDomainExtensionId(String domainExtensionId) {
        this.domainExtensionId = domainExtensionId;
        return this;
    }
    public String getDomainExtensionId() {
        return this.domainExtensionId;
    }

    public CreateDomainExtensionResponseBody setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public CreateDomainExtensionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
