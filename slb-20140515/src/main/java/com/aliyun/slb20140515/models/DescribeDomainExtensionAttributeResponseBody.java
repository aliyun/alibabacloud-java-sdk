// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeDomainExtensionAttributeResponseBody extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("ListenerPort")
    public Integer listenerPort;

    @NameInMap("ServerCertificateId")
    public String serverCertificateId;

    @NameInMap("DomainExtensionId")
    public String domainExtensionId;

    public static DescribeDomainExtensionAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainExtensionAttributeResponseBody self = new DescribeDomainExtensionAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainExtensionAttributeResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDomainExtensionAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainExtensionAttributeResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeDomainExtensionAttributeResponseBody setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public DescribeDomainExtensionAttributeResponseBody setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
        return this;
    }
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

    public DescribeDomainExtensionAttributeResponseBody setDomainExtensionId(String domainExtensionId) {
        this.domainExtensionId = domainExtensionId;
        return this;
    }
    public String getDomainExtensionId() {
        return this.domainExtensionId;
    }

}
