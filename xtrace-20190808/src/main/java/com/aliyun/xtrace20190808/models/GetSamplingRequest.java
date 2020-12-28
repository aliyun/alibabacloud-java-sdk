// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class GetSamplingRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    public static GetSamplingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSamplingRequest self = new GetSamplingRequest();
        return TeaModel.build(map, self);
    }

    public GetSamplingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetSamplingRequest setProxyUserId(String proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public String getProxyUserId() {
        return this.proxyUserId;
    }

}
