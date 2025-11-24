// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateASMGatewayRequest extends TeaModel {
    /**
     * <p>The new YAML content of the ASM gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;apiVersion&quot;:&quot;istio.alibabacloud.com/v1beta1&quot;,&quot;kind&quot;:&quot;IstioGateway&quot;,&quot;metadata&quot;:{&quot;name&quot;:&quot;ingressgateway&quot;,&quot;namespace&quot;:&quot;istio-system&quot;},&quot;spec&quot;:{&quot;gatewayType&quot;:&quot;ingress&quot;,&quot;clusterIds&quot;:[&quot;xxxxx&quot;],&quot;ports&quot;:[{&quot;name&quot;:&quot;http-0&quot;,&quot;port&quot;:80,&quot;targetPort&quot;:80,&quot;protocol&quot;:&quot;TCP&quot;},{&quot;name&quot;:&quot;https-1&quot;,&quot;port&quot;:443,&quot;targetPort&quot;:443,&quot;protocol&quot;:&quot;TCP&quot;}],&quot;serviceAnnotations&quot;:{&quot;service.beta.kubernetes.io/alicloud-loadbalancer-address-type&quot;:&quot;internet&quot;,&quot;service.beta.kubernetes.io/alibaba-cloud-loadbalancer-spec&quot;:&quot;slb.s1.small&quot;},&quot;replicaCount&quot;:2,&quot;resources&quot;:{&quot;limits&quot;:{&quot;cpu&quot;:&quot;2&quot;,&quot;memory&quot;:&quot;4G&quot;},&quot;requests&quot;:{&quot;cpu&quot;:&quot;200m&quot;,&quot;memory&quot;:&quot;256Mi&quot;}},&quot;serviceType&quot;:&quot;LoadBalancer&quot;,&quot;maxReplicas&quot;:2,&quot;minReplicas&quot;:2}}</p>
     */
    @NameInMap("Body")
    public String body;

    /**
     * <p>The name of the ASM gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ingressgateway</p>
     */
    @NameInMap("IstioGatewayName")
    public String istioGatewayName;

    /**
     * <p>The ASM instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cb8963379255149cb98c8686f274x****</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static UpdateASMGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateASMGatewayRequest self = new UpdateASMGatewayRequest();
        return TeaModel.build(map, self);
    }

    public UpdateASMGatewayRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdateASMGatewayRequest setIstioGatewayName(String istioGatewayName) {
        this.istioGatewayName = istioGatewayName;
        return this;
    }
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    public UpdateASMGatewayRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
