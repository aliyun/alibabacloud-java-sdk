// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteIstioGatewayDomainsRequest extends TeaModel {
    @NameInMap("Hosts")
    public String hosts;

    @NameInMap("IstioGatewayName")
    public String istioGatewayName;

    @NameInMap("Limit")
    public String limit;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PortName")
    public String portName;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DeleteIstioGatewayDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIstioGatewayDomainsRequest self = new DeleteIstioGatewayDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIstioGatewayDomainsRequest setHosts(String hosts) {
        this.hosts = hosts;
        return this;
    }
    public String getHosts() {
        return this.hosts;
    }

    public DeleteIstioGatewayDomainsRequest setIstioGatewayName(String istioGatewayName) {
        this.istioGatewayName = istioGatewayName;
        return this;
    }
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    public DeleteIstioGatewayDomainsRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public DeleteIstioGatewayDomainsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteIstioGatewayDomainsRequest setPortName(String portName) {
        this.portName = portName;
        return this;
    }
    public String getPortName() {
        return this.portName;
    }

    public DeleteIstioGatewayDomainsRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
