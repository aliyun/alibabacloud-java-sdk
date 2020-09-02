// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteCommonBandwidthPackageRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Force")
    public String force;

    @NameInMap("BandwidthPackageId")
    @Validation(required = true)
    public String bandwidthPackageId;

    public static DeleteCommonBandwidthPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommonBandwidthPackageRequest self = new DeleteCommonBandwidthPackageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCommonBandwidthPackageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteCommonBandwidthPackageRequest setForce(String force) {
        this.force = force;
        return this;
    }
    public String getForce() {
        return this.force;
    }

    public DeleteCommonBandwidthPackageRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

}
