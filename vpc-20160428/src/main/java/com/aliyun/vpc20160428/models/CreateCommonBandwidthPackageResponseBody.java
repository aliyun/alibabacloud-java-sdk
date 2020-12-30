// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateCommonBandwidthPackageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    public static CreateCommonBandwidthPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCommonBandwidthPackageResponseBody self = new CreateCommonBandwidthPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCommonBandwidthPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCommonBandwidthPackageResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateCommonBandwidthPackageResponseBody setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

}
