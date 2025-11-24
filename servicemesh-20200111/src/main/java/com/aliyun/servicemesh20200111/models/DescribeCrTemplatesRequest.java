// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeCrTemplatesRequest extends TeaModel {
    /**
     * <p>The version of Istio used by the ASM instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1.9.7.31-g24cdcb43-aliyun</p>
     */
    @NameInMap("IstioVersion")
    public String istioVersion;

    /**
     * <p>The type of Istio resource whose common YAML templates you want to query. Valid values:</p>
     * <ul>
     * <li>AuthorizationPolicy</li>
     * <li>RequestAuthentication</li>
     * <li>PeerAuthentication</li>
     * <li>WorkloadGroup</li>
     * <li>WorkloadEntry</li>
     * <li>Sidecar</li>
     * <li>EnvoyFilter</li>
     * <li>ServiceEntry</li>
     * <li>Gateway</li>
     * <li>DestinationRule</li>
     * <li>VirtualService</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VirtualService</p>
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
