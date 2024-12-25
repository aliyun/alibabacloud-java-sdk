// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeDomainExtensionAttributeResponseBody extends TeaModel {
    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the additional certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>de-bp1rp7ta1****</p>
     */
    @NameInMap("DomainExtensionId")
    public String domainExtensionId;

    /**
     * <p>The frontend port of the HTTPS listener that is configured for the SLB instance. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>443</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The ID of the SLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-bp1o94dp5i6*****earr9g6d1l</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>48C1B671-C6DB-4DDE-9B30-10557E36CDE0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the server certificate used by the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>231579085529123_166f82******_1714763408_709981430</p>
     */
    @NameInMap("ServerCertificateId")
    public String serverCertificateId;

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

    public DescribeDomainExtensionAttributeResponseBody setDomainExtensionId(String domainExtensionId) {
        this.domainExtensionId = domainExtensionId;
        return this;
    }
    public String getDomainExtensionId() {
        return this.domainExtensionId;
    }

    public DescribeDomainExtensionAttributeResponseBody setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public DescribeDomainExtensionAttributeResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeDomainExtensionAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainExtensionAttributeResponseBody setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
        return this;
    }
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

}
