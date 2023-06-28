// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateDomainExtensionResponseBody extends TeaModel {
    @NameInMap("DomainExtensionId")
    public String domainExtensionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The ID of the created domain name extension.</p>
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
