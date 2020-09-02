// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CancelCommonBandwidthPackageIpBandwidthRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("BandwidthPackageId")
    @Validation(required = true)
    public String bandwidthPackageId;

    @NameInMap("EipId")
    @Validation(required = true)
    public String eipId;

    public static CancelCommonBandwidthPackageIpBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelCommonBandwidthPackageIpBandwidthRequest self = new CancelCommonBandwidthPackageIpBandwidthRequest();
        return TeaModel.build(map, self);
    }

    public CancelCommonBandwidthPackageIpBandwidthRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelCommonBandwidthPackageIpBandwidthRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public CancelCommonBandwidthPackageIpBandwidthRequest setEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }
    public String getEipId() {
        return this.eipId;
    }

}
