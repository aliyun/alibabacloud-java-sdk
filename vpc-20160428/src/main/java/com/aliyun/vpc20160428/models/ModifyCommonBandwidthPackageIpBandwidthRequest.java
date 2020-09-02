// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCommonBandwidthPackageIpBandwidthRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("BandwidthPackageId")
    @Validation(required = true)
    public String bandwidthPackageId;

    @NameInMap("EipId")
    @Validation(required = true)
    public String eipId;

    @NameInMap("Bandwidth")
    @Validation(required = true)
    public String bandwidth;

    public static ModifyCommonBandwidthPackageIpBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommonBandwidthPackageIpBandwidthRequest self = new ModifyCommonBandwidthPackageIpBandwidthRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCommonBandwidthPackageIpBandwidthRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCommonBandwidthPackageIpBandwidthRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public ModifyCommonBandwidthPackageIpBandwidthRequest setEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }
    public String getEipId() {
        return this.eipId;
    }

    public ModifyCommonBandwidthPackageIpBandwidthRequest setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

}
