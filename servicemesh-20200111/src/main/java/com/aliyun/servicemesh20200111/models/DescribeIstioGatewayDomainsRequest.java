// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeIstioGatewayDomainsRequest extends TeaModel {
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
     * <p>The namespace in which the ASM gateway resides.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The ID of the ASM instance.</p>
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
