// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyBandwidthPackageSpecRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("BandwidthPackageId")
    @Validation(required = true)
    public String bandwidthPackageId;

    @NameInMap("Bandwidth")
    @Validation(required = true)
    public String bandwidth;

    public static ModifyBandwidthPackageSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBandwidthPackageSpecRequest self = new ModifyBandwidthPackageSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBandwidthPackageSpecRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyBandwidthPackageSpecRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public ModifyBandwidthPackageSpecRequest setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

}
