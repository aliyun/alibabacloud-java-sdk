// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayDnsForwardsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SagInsId")
    public String sagInsId;

    @NameInMap("SagSn")
    public String sagSn;

    public static ViewSmartAccessGatewayDnsForwardsRequest build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayDnsForwardsRequest self = new ViewSmartAccessGatewayDnsForwardsRequest();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayDnsForwardsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ViewSmartAccessGatewayDnsForwardsRequest setSagInsId(String sagInsId) {
        this.sagInsId = sagInsId;
        return this;
    }
    public String getSagInsId() {
        return this.sagInsId;
    }

    public ViewSmartAccessGatewayDnsForwardsRequest setSagSn(String sagSn) {
        this.sagSn = sagSn;
        return this;
    }
    public String getSagSn() {
        return this.sagSn;
    }

}
