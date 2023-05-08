// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeCrTemplatesRequest extends TeaModel {
    /**
     * <p>The Istio version used in ASM.</p>
     */
    @NameInMap("IstioVersion")
    public String istioVersion;

    /**
     * <p>The type of Istio resource whose common YAML templates you want to query. Valid values:</p>
     * <br>
     * <p>*   AuthorizationPolicy</p>
     * <p>*   RequestAuthentication</p>
     * <p>*   PeerAuthentication</p>
     * <p>*   WorkloadGroup</p>
     * <p>*   WorkloadEntry</p>
     * <p>*   Sidecar</p>
     * <p>*   EnvoyFilter</p>
     * <p>*   ServiceEntry</p>
     * <p>*   Gateway</p>
     * <p>*   DestinationRule</p>
     * <p>*   VirtualService</p>
     */
    @NameInMap("Kind")
    public String kind;

    public static DescribeCrTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrTemplatesRequest self = new DescribeCrTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCrTemplatesRequest setIstioVersion(String istioVersion) {
        this.istioVersion = istioVersion;
        return this;
    }
    public String getIstioVersion() {
        return this.istioVersion;
    }

    public DescribeCrTemplatesRequest setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

}
