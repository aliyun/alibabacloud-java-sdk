// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateIstioGatewayDomainsRequest extends TeaModel {
    @NameInMap("Credential")
    public String credential;

    @NameInMap("ForceHttps")
    public Boolean forceHttps;

    @NameInMap("Hosts")
    public String hosts;

    @NameInMap("IstioGatewayName")
    public String istioGatewayName;

    @NameInMap("Limit")
    public String limit;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Number")
    public Integer number;

    @NameInMap("PortName")
    public String portName;

    @NameInMap("Protocol")
    public String protocol;

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
