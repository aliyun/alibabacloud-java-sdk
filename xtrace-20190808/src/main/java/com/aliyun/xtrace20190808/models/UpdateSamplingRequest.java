// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class UpdateSamplingRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("Sampling")
    public String sampling;

    public static UpdateSamplingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSamplingRequest self = new UpdateSamplingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSamplingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSamplingRequest setProxyUserId(String proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public String getProxyUserId() {
        return this.proxyUserId;
    }

    public UpdateSamplingRequest setSampling(String sampling) {
        this.sampling = sampling;
        return this;
    }
    public String getSampling() {
        return this.sampling;
    }

}
