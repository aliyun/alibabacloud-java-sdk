// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateIstioGatewayDomainsRequest extends TeaModel {
    /**
     * <p>The name of the secret that contains the Transport Layer Security (TLS) certificate and certificate authority (CA) certificate.</p>
     */
    @NameInMap("Credential")
    public String credential;

    /**
     * <p>Specifies whether to forcibly use TLS to protect connection security.</p>
     * <br>
     * <p>*   `true`: forcibly uses TLS to protect connection security.</p>
     * <p>*   `false`: does not forcibly use TLS to protect connection security.</p>
     */
    @NameInMap("ForceHttps")
    public Boolean forceHttps;

    /**
     * <p>The domain names of the one or more hosts that are exposed by the ASM gateway. Separate multiple domain names with commas (,).</p>
     */
    @NameInMap("Hosts")
    public String hosts;

    /**
     * <p>The name of the ASM gateway.</p>
     */
    @NameInMap("IstioGatewayName")
    public String istioGatewayName;

    /**
     * <p>The maximum number of ASM gateways to query.</p>
     */
    @NameInMap("Limit")
    public String limit;

    /**
     * <p>The name of the namespace.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The port that is provided by the ASM gateway.</p>
     */
    @NameInMap("Number")
    public Integer number;

    /**
     * <p>The name of the port.</p>
     */
    @NameInMap("PortName")
    public String portName;

    /**
     * <p>The type of the protocol. Valid values: `HTTP`, `HTTPS`, `GRPC`, `HTTP2`, `MONGO`, `TCP`, and `TLS`.</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The ID of the ASM instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static CreateIstioGatewayDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIstioGatewayDomainsRequest self = new CreateIstioGatewayDomainsRequest();
        return TeaModel.build(map, self);
    }

    public CreateIstioGatewayDomainsRequest setCredential(String credential) {
        this.credential = credential;
        return this;
    }
    public String getCredential() {
        return this.credential;
    }

    public CreateIstioGatewayDomainsRequest setForceHttps(Boolean forceHttps) {
        this.forceHttps = forceHttps;
        return this;
    }
    public Boolean getForceHttps() {
        return this.forceHttps;
    }

    public CreateIstioGatewayDomainsRequest setHosts(String hosts) {
        this.hosts = hosts;
        return this;
    }
    public String getHosts() {
        return this.hosts;
    }

    public CreateIstioGatewayDomainsRequest setIstioGatewayName(String istioGatewayName) {
        this.istioGatewayName = istioGatewayName;
        return this;
    }
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    public CreateIstioGatewayDomainsRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public CreateIstioGatewayDomainsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateIstioGatewayDomainsRequest setNumber(Integer number) {
        this.number = number;
        return this;
    }
    public Integer getNumber() {
        return this.number;
    }

    public CreateIstioGatewayDomainsRequest setPortName(String portName) {
        this.portName = portName;
        return this;
    }
    public String getPortName() {
        return this.portName;
    }

    public CreateIstioGatewayDomainsRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateIstioGatewayDomainsRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
