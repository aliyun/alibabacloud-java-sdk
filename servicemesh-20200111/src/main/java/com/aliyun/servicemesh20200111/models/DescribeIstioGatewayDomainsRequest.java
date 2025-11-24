// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeIstioGatewayDomainsRequest extends TeaModel {
    /**
     * <p>The name of the ASM gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ingressgateway</p>
     */
    @NameInMap("IstioGatewayName")
    public String istioGatewayName;

    /**
     * <p>The maximum number of Istio gateways to query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public String limit;

    /**
     * <p>The namespace in which the ASM gateway resides.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The ASM instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c08ba3fd1e6484b0f8cc1ad8fe10d****</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeIstioGatewayDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIstioGatewayDomainsRequest self = new DescribeIstioGatewayDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIstioGatewayDomainsRequest setIstioGatewayName(String istioGatewayName) {
        this.istioGatewayName = istioGatewayName;
        return this;
    }
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    public DescribeIstioGatewayDomainsRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public DescribeIstioGatewayDomainsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeIstioGatewayDomainsRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
